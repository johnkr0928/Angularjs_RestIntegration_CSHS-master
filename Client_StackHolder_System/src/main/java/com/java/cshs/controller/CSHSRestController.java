package com.java.cshs.controller;


import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.java.cshs.model.Status;
import com.java.cshs.model.SubmissionAnalytics;
import com.java.cshs.service.CSHSService;

@RestController
@RequestMapping("/cshs")
public class CSHSRestController {

	private Logger log = Logger.getLogger(CSHSRestController.class);

	@Autowired
	CSHSService cshsService;

	/**
	 * @method Submit Client Form
	 */

	@RequestMapping(value = "/submitClientRequest", method = RequestMethod.POST, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status submitClientRequest(@RequestBody SubmissionAnalytics submissionAnalytics){
		try{
			log.info("Inside submitClientRequest()");
			cshsService.submitClientRequest(submissionAnalytics);
			return new Status("Registered Successfully! ");
		}catch(Exception e){
			log.info("Exception in submitClientRequest() ::"+e);
			return new Status("Wrong Inputs! ");	
		}
	}

	/**
	 * @method View Clents's Form to Review on the Basis of Id
	 */
	@RequestMapping(value = "/viewClientRequestById/{id}", method = RequestMethod.GET)
	public @ResponseBody SubmissionAnalytics viewClientRequestById(@PathVariable("id") int id) {
		log.info("Inside viewClientRequestById()");
		SubmissionAnalytics submissionAnalytics = null;
		try {
			log.info("ID ::" +id);
			submissionAnalytics = cshsService.viewClientRequestById(id);
			log.info("ID ::" +submissionAnalytics.getId());
			log.info("Agent Name :: "+submissionAnalytics.getAgentName());
			log.info("Submission No:: "+submissionAnalytics.getSubmissionNo());
			return submissionAnalytics;
		} catch (Exception e) {
			log.info("Exception in viewClientRequestById() ::" +e);
		}
		return null;
	}

	/**
	 * @method View All Clents's Request
	 */
	@RequestMapping(value = "/viewAllClientRequest", method = RequestMethod.GET)
	public @ResponseBody List<SubmissionAnalytics> viewAllClientRequest(){
		log.info("Inside viewAllClientRequest()");
		try{
			List<SubmissionAnalytics> submissionAnalyticsDetails =cshsService.viewAllClientRequest();
			if(submissionAnalyticsDetails.size() > 0){
				return submissionAnalyticsDetails;
			}
			return null;
		}catch(Exception e){
			log.info("Exception in viewAllClientRequest() ::" +e);
			return null;
		}
	}

	/**
	 * @method View All Clents's Request on the Basis of Status
	 */
	@RequestMapping(value = "/viewAllClientRequestByStatus/{status}", method = RequestMethod.GET)
	public @ResponseBody List<SubmissionAnalytics> viewAllClientRequestByStatus(@PathVariable("status") String status){
		log.info("Inside viewAllClientRequestByStatus()");
		try{
			log.info("Status :: " + status);
			List<SubmissionAnalytics> submissionAnalyticsDetails =cshsService.viewAllClientRequestByStatus(status);
			if(submissionAnalyticsDetails.size() > 0){
				return submissionAnalyticsDetails;
			}
			return null;
		}catch(Exception e){
			log.info("Exception in viewAllClientRequestByStatus() ::" +e);
			return null;
		}
	}

	/**
	 * @method Update Clents's Request on the Basis of Id
	 */
	@RequestMapping(value = "/updateSubmittedClientRequest/{id}", method = RequestMethod.PUT, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status updateSubmittedClientRequest(@RequestBody SubmissionAnalytics submissionAnalytics,@PathVariable("id") int id){
		log.info("Inside updateSubmittedClientRequest()");
		try{
			log.info("Inside registration()");
			cshsService.updateSubmittedClientRequest(submissionAnalytics,id);
			return new Status("Updated Successfully! ");
		}catch(Exception e){
			log.info("Exception in updateSubmittedClientRequest() ::" +e);
			return new Status("Wrong Inputs! ");	
		}
	}
}
