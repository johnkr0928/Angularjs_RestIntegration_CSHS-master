package com.java.cshs.dao;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;

import com.java.cshs.controller.CSHSRestController;
import com.java.cshs.model.SubmissionAnalytics;

public class CSHSDaoImpl implements CSHSDao {

	private Logger log = Logger.getLogger(CSHSRestController.class);

	Session session = null;
	@Autowired
	SessionFactory sessionFactory;
	Transaction txn = null;
	HttpSession httpSession=null;

	/**
	 * @method This method will called when Client Submit his Request
	 */
	public SubmissionAnalytics submitClientRequest(SubmissionAnalytics submissionAnalytics) {
		log.info("Inside submitClientRequest()");
		try{
			Date systemDate = new Date();
			SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
			LocalDate localDate = systemDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

			int year  = localDate.getYear();
			int monthInNumber = localDate.getMonthValue();
			int dateInNumber   = localDate.getDayOfMonth();

			/*In Database, Day, Date and Month are Declared as String. So, Converting int into String.*/

			String day = simpleDateformat.format(systemDate); 
			String date = Integer.toString(dateInNumber);
			String month = Integer.toString(monthInNumber);

			String submissionNo = submissionNoGenerator();
			submissionAnalytics.setSubmissionNo(submissionNo);

			session = sessionFactory.openSession();
			txn = session.beginTransaction();

			submissionAnalytics.setReceivedDay(day);
			submissionAnalytics.setReceivedDate(date);
			submissionAnalytics.setReceivedMonth(month);
			submissionAnalytics.setReceivedYear(year);

			session.save(submissionAnalytics);
			txn.commit();
			log.info("Transaction Commited and Object Saved"); 
			session.close();
			return submissionAnalytics;
		}catch(Exception e){
			log.info("Exception in submitClientRequest() ::"+e);
			return null;
		}
	}

	/**
	 * @method This method will fetch Single Client's Request on the Basis of Id
	 */
	public SubmissionAnalytics viewClientRequestById(int id) {
		log.info("Inside viewClientRequestById()");
		try {
			session = sessionFactory.openSession();
			txn = session.beginTransaction();
			log.info("Id :: "+id);
			SubmissionAnalytics submissionAnalyticsDetails = (SubmissionAnalytics) session.get(SubmissionAnalytics.class, id);

			if (submissionAnalyticsDetails != null) {
				log.info("Employee Details Fetched");
				txn = session.getTransaction();
				txn.commit();
				session.close();
				return submissionAnalyticsDetails;
			}
		} catch (Exception e) {
			log.info("Exception in viewClientRequestById() ::"+e);
		}
		return null;
	}

	/**
	 * @method This method will fetch All Client's Request.
	 */
	public List<SubmissionAnalytics> viewAllClientRequest() {
		log.info("Inside viewAllClientRequest()");
		try {
			session = sessionFactory.openSession();
			txn = session.beginTransaction();
			List<SubmissionAnalytics> submissionAnalytics = session.createQuery("FROM SubmissionAnalytics").list();
			return submissionAnalytics;
		} catch (Exception e) {
			log.info("Exception in viewAllClientRequest() ::"+e);
		}
		return null;
	}

	/**
	 * @method This method will fetch Multiple Client's Request on the Basis of Status.
	 */
	public List<SubmissionAnalytics> viewAllClientRequestByStatus(String status) {
		log.info("Inside viewAllClientRequestByStatus()");
		try {
			session = sessionFactory.openSession();
			txn = session.beginTransaction();
			Query query=session.createQuery("FROM SubmissionAnalytics where status =:i");
			query.setParameter("i",status);
			List<SubmissionAnalytics> submissionAnalytics=query.list();
			return submissionAnalytics;
		} catch (Exception e) {
			log.info("Exception in viewAllClientRequestByStatus()::"+e);
		}
		return null;
	}

	/**
	 * @method This method will Update Clents's Request on the Basis of Id.
	 */
	public SubmissionAnalytics updateSubmittedClientRequest(SubmissionAnalytics submissionAnalytics, int id) {
		log.info("Inside updateSubmittedClientRequest()");
		try{
			session = sessionFactory.openSession();
			txn = session.beginTransaction();
			log.info("Id :: "+id);
			
			SubmissionAnalytics submissionAnalyticsDB = (SubmissionAnalytics) session.get(SubmissionAnalytics.class, id);
			if (submissionAnalyticsDB != null) {
				log.info("Employee Details Fetched");
				log.info("Id ::"+submissionAnalyticsDB.getId());
			}

			log.info("Id :: "+id);
			log.info("Ratings ::"+submissionAnalytics.getRating());
			log.info("Quoted Rates ::"+submissionAnalytics.getQuoted());
			log.info("Status ::"+submissionAnalytics.getStatus());

			if(id >0)
			{
				submissionAnalyticsDB.setId(id);
			}
			if(submissionAnalytics.getRating() != null)
			{
				submissionAnalyticsDB.setRating(submissionAnalytics.getRating());
			}
			if(submissionAnalytics.getQuoted() != null)
			{
				submissionAnalyticsDB.setQuoted(submissionAnalytics.getQuoted());
			}
			if(submissionAnalytics.getStatus() != null)
			{
				Date systemDate = new Date();
				SimpleDateFormat simpleDayformat = new SimpleDateFormat("EEEE");
				String simpleDateformat = new SimpleDateFormat("MM-dd-yyyy").format(systemDate);
				LocalDate localDate = systemDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

				int year  = localDate.getYear();
				int monthInNumber = localDate.getMonthValue();
				int dateInNumber   = localDate.getDayOfMonth();

				

				/*In Database, Day, Date and Month are Declared as String. So, Converting int intr String.*/

				String day = simpleDayformat.format(systemDate); 
				String date = Integer.toString(dateInNumber);
				String month = Integer.toString(monthInNumber);

				if(submissionAnalytics.getStatus().equalsIgnoreCase("UNREVIEWED"))
				{
					submissionAnalyticsDB.setReceivedDay(day);
					submissionAnalyticsDB.setReceivedDate(date);
					submissionAnalyticsDB.setReceivedMonth(month);
					submissionAnalyticsDB.setReceivedYear(year);
				}
				if(submissionAnalytics.getStatus().equalsIgnoreCase("QUOTED"))
				{
					submissionAnalyticsDB.setQuotedDay(day);
					submissionAnalyticsDB.setQuotedDate(date);
					submissionAnalyticsDB.setQuotedMonth(month);
					submissionAnalyticsDB.setQuotedYear(year);
				}
				if(submissionAnalytics.getStatus().equalsIgnoreCase("BINDED"))
				{
					submissionAnalyticsDB.setIssueDt(simpleDateformat);
					String generatedPolicyNuber = policyNoGenerator();
					submissionAnalyticsDB.setPolNum(generatedPolicyNuber);
					
				}
				if(submissionAnalytics.getStatus().equalsIgnoreCase("REJECTED"))
				{
					submissionAnalyticsDB.setRejectedDate(simpleDateformat);
				}
				submissionAnalyticsDB.setStatus(submissionAnalytics.getStatus());
			
			session.update(submissionAnalyticsDB);
			txn.commit();
			session.close();
			return submissionAnalyticsDB;
			}
		}catch(Exception e){
			log.info("Exception in updateSubmittedClientRequest () ::"+e.getMessage());
			return null;
		}
		return null;
	}
	
	public String submissionNoGenerator(){
		try{
			session = sessionFactory.openSession();
			txn = session.beginTransaction();
			String generatedId = null;
			String prefix = "SUB";
			String suffix = "1";
			Criteria criteria = session
					.createCriteria(SubmissionAnalytics.class)
					.setProjection(Projections.count("submissionNo"));

			if(criteria != null){
				suffix= criteria.uniqueResult().toString();

				generatedId = prefix + suffix;

				return generatedId;
			}else{
				return prefix+suffix;
			}

		}catch(Exception e){
			log.info("Exception :: "+e);
			return null;
		}
		finally{
			txn.commit();
			session.close();    
		}
	}
	
	public String policyNoGenerator(){
		Session session1 = sessionFactory.openSession();
		Transaction txn1 = session1.beginTransaction();
		try{
			String generatedId = null;
			String prefix = "POL";
			String suffix = "1";
			Criteria criteria = session1
					.createCriteria(SubmissionAnalytics.class)
					.setProjection(Projections.count("polNum"));

			if(criteria != null){
				suffix= criteria.uniqueResult().toString();

				generatedId = prefix + suffix;
				return generatedId;
			}else{
				
				generatedId = prefix+suffix;
				return generatedId;
			}

		}catch(Exception e){
			log.info("Exception :: "+e);
			return null;
		}
		finally{
			txn1.commit();
			session1.close();    
		}
	}

	
}
