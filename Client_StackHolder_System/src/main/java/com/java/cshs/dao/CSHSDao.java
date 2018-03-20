package com.java.cshs.dao;

import java.util.List;
import com.java.cshs.model.SubmissionAnalytics;

public interface CSHSDao {
	public SubmissionAnalytics submitClientRequest(SubmissionAnalytics submissionAnalytics);
	public SubmissionAnalytics viewClientRequestById(int id);
	public List<SubmissionAnalytics> viewAllClientRequest();
	public SubmissionAnalytics updateSubmittedClientRequest(SubmissionAnalytics submissionAnalytics, int id);
	public List<SubmissionAnalytics> viewAllClientRequestByStatus(String status);
}
