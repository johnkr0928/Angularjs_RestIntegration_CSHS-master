package com.java.cshs.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.java.cshs.dao.CSHSDao;
import com.java.cshs.model.SubmissionAnalytics;

public class CSHSServiceImpl implements CSHSService {

	@Autowired
	CSHSDao cshsDao ;
	
	public SubmissionAnalytics submitClientRequest(SubmissionAnalytics submissionAnalytics) {
		return cshsDao.submitClientRequest(submissionAnalytics);
	}
	public SubmissionAnalytics viewClientRequestById(int id) {
		return cshsDao.viewClientRequestById(id);
	}
	public List<SubmissionAnalytics> viewAllClientRequest() {
		return cshsDao.viewAllClientRequest();
	}
	public List<SubmissionAnalytics> viewAllClientRequestByStatus(String status) {
		return cshsDao.viewAllClientRequestByStatus(status);
	}
	public SubmissionAnalytics updateSubmittedClientRequest(SubmissionAnalytics submissionAnalytics,int id) {
		return cshsDao.updateSubmittedClientRequest(submissionAnalytics, id);
	}
}
