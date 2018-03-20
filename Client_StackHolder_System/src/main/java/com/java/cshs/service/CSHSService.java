package com.java.cshs.service;

import java.util.List;

import com.java.cshs.model.SubmissionAnalytics;

public interface CSHSService {
	public SubmissionAnalytics submitClientRequest(SubmissionAnalytics submissionAnalytics);
	public SubmissionAnalytics viewClientRequestById(int id);
	public List<SubmissionAnalytics> viewAllClientRequest();
	public List<SubmissionAnalytics> viewAllClientRequestByStatus(String status);
	public SubmissionAnalytics updateSubmittedClientRequest(SubmissionAnalytics submissionAnalytics, int id);
}
