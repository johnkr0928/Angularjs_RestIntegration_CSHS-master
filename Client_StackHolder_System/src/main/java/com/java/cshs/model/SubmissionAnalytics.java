package com.java.cshs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "submissionanalytics", catalog = "eagertobp")
public class SubmissionAnalytics implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String agentName;
	private String agentCode;
	private String parentAgentCode;
	private String parentAgentName;
	private String businessUnitName;
	private String operatingUnitName;
	private String underwriterName;
	private String submissionNo;
	private String polNum;
	private String renewalFlag;
	private Integer receivedCount;
	private Integer quotedCount;
	private Integer boundCount;
	private Integer rejectCount;
	private String rejectAfterQuoteFlag;
	private Double recdtoquotetime;
	private String recdtoquotetimeBand;
	private Integer recdtorejecttime;
	private String recdtorejecttimeBand;
	private Integer recdtopendingtime;
	private Double quotetoboundtime;
	private String quotetoboundtimeBand;
	private String receivedDate;
	private String receivedMonth;
	private String receivedDay;
	private Integer receivedYear;
	private String rejectedDate;
	private String quotedDate;
	private String quotedMonth;
	private String quotedDay;
	private Integer quotedYear;
	private String boundDate;
	private String pendingDate;
	private Integer pendingAgingDays;
	private Integer policyPremium;
	private String rejectReason;
	private String subRejectReason;
	private String polEffDt;
	private String polExpDt;
	private String previousPolicyNum;
	private String bdpRenewFlag;
	private String program;
	private String premiumBand;
	private String claimCount;
	private String lossIncrd;
	private String lossPaid;
	private String expIncrd;
	private String expPaid;
	private Integer quotedPremium;
	private String userrole;
	private String insuredName;
	private String uwRegion;
	private String minimumPremiumFlag;
	private String minimumPremium;
	private String minimumOverridePremiumFlag;
	private String minimumOverridePremium;
	private String agentContact;
	private String issueDt;
	private String insuredState;
	private String endorsementPremium;
	private String underwriterAssistant;
	private String quoteStartDate;
	private Integer receivedToEffDay;
	private String quotedPremiumBand;
	private String status;
	private String rating;
	private String quoted;

	public SubmissionAnalytics() {
	}

	public SubmissionAnalytics(String agentName, String agentCode, String parentAgentCode, String parentAgentName,
			String businessUnitName, String operatingUnitName, String underwriterName, String submissionNo,
			String polNum, String renewalFlag, Integer receivedCount, Integer quotedCount, Integer boundCount,
			Integer rejectCount, String rejectAfterQuoteFlag, Double recdtoquotetime, String recdtoquotetimeBand,
			Integer recdtorejecttime, String recdtorejecttimeBand, Integer recdtopendingtime, Double quotetoboundtime,
			String quotetoboundtimeBand, String receivedDate, String receivedMonth, String receivedDay,
			Integer receivedYear, String rejectedDate, String quotedDate, String quotedMonth, String quotedDay,
			Integer quotedYear, String boundDate, String pendingDate, Integer pendingAgingDays, Integer policyPremium,
			String rejectReason, String subRejectReason, String polEffDt, String polExpDt, String previousPolicyNum,
			String bdpRenewFlag, String program, String premiumBand, String claimCount, String lossIncrd,
			String lossPaid, String expIncrd, String expPaid, Integer quotedPremium, String userrole,
			String insuredName, String uwRegion, String minimumPremiumFlag, String minimumPremium,
			String minimumOverridePremiumFlag, String minimumOverridePremium, String agentContact, String issueDt,
			String insuredState, String endorsementPremium, String underwriterAssistant, String quoteStartDate,
			Integer receivedToEffDay, String quotedPremiumBand, String status) {
		this.agentName = agentName;
		this.agentCode = agentCode;
		this.parentAgentCode = parentAgentCode;
		this.parentAgentName = parentAgentName;
		this.businessUnitName = businessUnitName;
		this.operatingUnitName = operatingUnitName;
		this.underwriterName = underwriterName;
		this.submissionNo = submissionNo;
		this.polNum = polNum;
		this.renewalFlag = renewalFlag;
		this.receivedCount = receivedCount;
		this.quotedCount = quotedCount;
		this.boundCount = boundCount;
		this.rejectCount = rejectCount;
		this.rejectAfterQuoteFlag = rejectAfterQuoteFlag;
		this.recdtoquotetime = recdtoquotetime;
		this.recdtoquotetimeBand = recdtoquotetimeBand;
		this.recdtorejecttime = recdtorejecttime;
		this.recdtorejecttimeBand = recdtorejecttimeBand;
		this.recdtopendingtime = recdtopendingtime;
		this.quotetoboundtime = quotetoboundtime;
		this.quotetoboundtimeBand = quotetoboundtimeBand;
		this.receivedDate = receivedDate;
		this.receivedMonth = receivedMonth;
		this.receivedDay = receivedDay;
		this.receivedYear = receivedYear;
		this.rejectedDate = rejectedDate;
		this.quotedDate = quotedDate;
		this.quotedMonth = quotedMonth;
		this.quotedDay = quotedDay;
		this.quotedYear = quotedYear;
		this.boundDate = boundDate;
		this.pendingDate = pendingDate;
		this.pendingAgingDays = pendingAgingDays;
		this.policyPremium = policyPremium;
		this.rejectReason = rejectReason;
		this.subRejectReason = subRejectReason;
		this.polEffDt = polEffDt;
		this.polExpDt = polExpDt;
		this.previousPolicyNum = previousPolicyNum;
		this.bdpRenewFlag = bdpRenewFlag;
		this.program = program;
		this.premiumBand = premiumBand;
		this.claimCount = claimCount;
		this.lossIncrd = lossIncrd;
		this.lossPaid = lossPaid;
		this.expIncrd = expIncrd;
		this.expPaid = expPaid;
		this.quotedPremium = quotedPremium;
		this.userrole = userrole;
		this.insuredName = insuredName;
		this.uwRegion = uwRegion;
		this.minimumPremiumFlag = minimumPremiumFlag;
		this.minimumPremium = minimumPremium;
		this.minimumOverridePremiumFlag = minimumOverridePremiumFlag;
		this.minimumOverridePremium = minimumOverridePremium;
		this.agentContact = agentContact;
		this.issueDt = issueDt;
		this.insuredState = insuredState;
		this.endorsementPremium = endorsementPremium;
		this.underwriterAssistant = underwriterAssistant;
		this.quoteStartDate = quoteStartDate;
		this.receivedToEffDay = receivedToEffDay;
		this.quotedPremiumBand = quotedPremiumBand;
		this.setStatus(status);
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "AGENT_NAME", length = 65535)
	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	@Column(name = "AGENT_CODE", length = 65535)
	public String getAgentCode() {
		return this.agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	@Column(name = "PARENT_AGENT_CODE", length = 65535)
	public String getParentAgentCode() {
		return this.parentAgentCode;
	}

	public void setParentAgentCode(String parentAgentCode) {
		this.parentAgentCode = parentAgentCode;
	}

	@Column(name = "PARENT_AGENT_NAME", length = 65535)
	public String getParentAgentName() {
		return this.parentAgentName;
	}

	public void setParentAgentName(String parentAgentName) {
		this.parentAgentName = parentAgentName;
	}

	@Column(name = "BUSINESS_UNIT_NAME", length = 65535)
	public String getBusinessUnitName() {
		return this.businessUnitName;
	}

	public void setBusinessUnitName(String businessUnitName) {
		this.businessUnitName = businessUnitName;
	}

	@Column(name = "OPERATING_UNIT_NAME", length = 65535)
	public String getOperatingUnitName() {
		return this.operatingUnitName;
	}

	public void setOperatingUnitName(String operatingUnitName) {
		this.operatingUnitName = operatingUnitName;
	}

	@Column(name = "UNDERWRITER_NAME", length = 65535)
	public String getUnderwriterName() {
		return this.underwriterName;
	}

	public void setUnderwriterName(String underwriterName) {
		this.underwriterName = underwriterName;
	}
	
	@Column(name = "SUBMISSION_NO",unique = true, length = 65535)
	public String getSubmissionNo() {
		return this.submissionNo;
	}

	public void setSubmissionNo(String submissionNo) {
		this.submissionNo = submissionNo;
	}

	@Column(name = "POL_NUM", length = 65535)
	public String getPolNum() {
		return this.polNum;
	}

	public void setPolNum(String polNum) {
		this.polNum = polNum;
	}

	@Column(name = "RENEWAL_FLAG", length = 65535)
	public String getRenewalFlag() {
		return this.renewalFlag;
	}

	public void setRenewalFlag(String renewalFlag) {
		this.renewalFlag = renewalFlag;
	}

	@Column(name = "RECEIVED_COUNT")
	public Integer getReceivedCount() {
		return this.receivedCount;
	}

	public void setReceivedCount(Integer receivedCount) {
		this.receivedCount = receivedCount;
	}

	@Column(name = "QUOTED_COUNT")
	public Integer getQuotedCount() {
		return this.quotedCount;
	}

	public void setQuotedCount(Integer quotedCount) {
		this.quotedCount = quotedCount;
	}

	@Column(name = "BOUND_COUNT")
	public Integer getBoundCount() {
		return this.boundCount;
	}

	public void setBoundCount(Integer boundCount) {
		this.boundCount = boundCount;
	}

	@Column(name = "REJECT_COUNT")
	public Integer getRejectCount() {
		return this.rejectCount;
	}

	public void setRejectCount(Integer rejectCount) {
		this.rejectCount = rejectCount;
	}

	@Column(name = "REJECT_AFTER_QUOTE_FLAG", length = 65535)
	public String getRejectAfterQuoteFlag() {
		return this.rejectAfterQuoteFlag;
	}

	public void setRejectAfterQuoteFlag(String rejectAfterQuoteFlag) {
		this.rejectAfterQuoteFlag = rejectAfterQuoteFlag;
	}

	@Column(name = "RECDTOQUOTETIME", precision = 22, scale = 0)
	public Double getRecdtoquotetime() {
		return this.recdtoquotetime;
	}

	public void setRecdtoquotetime(Double recdtoquotetime) {
		this.recdtoquotetime = recdtoquotetime;
	}

	@Column(name = "RECDTOQUOTETIME_BAND", length = 65535)
	public String getRecdtoquotetimeBand() {
		return this.recdtoquotetimeBand;
	}

	public void setRecdtoquotetimeBand(String recdtoquotetimeBand) {
		this.recdtoquotetimeBand = recdtoquotetimeBand;
	}

	@Column(name = "RECDTOREJECTTIME")
	public Integer getRecdtorejecttime() {
		return this.recdtorejecttime;
	}

	public void setRecdtorejecttime(Integer recdtorejecttime) {
		this.recdtorejecttime = recdtorejecttime;
	}

	@Column(name = "RECDTOREJECTTIME_BAND", length = 65535)
	public String getRecdtorejecttimeBand() {
		return this.recdtorejecttimeBand;
	}

	public void setRecdtorejecttimeBand(String recdtorejecttimeBand) {
		this.recdtorejecttimeBand = recdtorejecttimeBand;
	}

	@Column(name = "RECDTOPENDINGTIME")
	public Integer getRecdtopendingtime() {
		return this.recdtopendingtime;
	}

	public void setRecdtopendingtime(Integer recdtopendingtime) {
		this.recdtopendingtime = recdtopendingtime;
	}

	@Column(name = "QUOTETOBOUNDTIME", precision = 22, scale = 0)
	public Double getQuotetoboundtime() {
		return this.quotetoboundtime;
	}

	public void setQuotetoboundtime(Double quotetoboundtime) {
		this.quotetoboundtime = quotetoboundtime;
	}

	@Column(name = "QUOTETOBOUNDTIME_BAND", length = 65535)
	public String getQuotetoboundtimeBand() {
		return this.quotetoboundtimeBand;
	}

	public void setQuotetoboundtimeBand(String quotetoboundtimeBand) {
		this.quotetoboundtimeBand = quotetoboundtimeBand;
	}

	@Column(name = "RECEIVED_DATE", length = 65535)
	public String getReceivedDate() {
		return this.receivedDate;
	}

	public void setReceivedDate(String receivedDate) {
		this.receivedDate = receivedDate;
	}

	@Column(name = "RECEIVED_MONTH", length = 65535)
	public String getReceivedMonth() {
		return this.receivedMonth;
	}

	public void setReceivedMonth(String receivedMonth) {
		this.receivedMonth = receivedMonth;
	}

	@Column(name = "RECEIVED_DAY", length = 65535)
	public String getReceivedDay() {
		return this.receivedDay;
	}

	public void setReceivedDay(String receivedDay) {
		this.receivedDay = receivedDay;
	}

	@Column(name = "RECEIVED_YEAR")
	public Integer getReceivedYear() {
		return this.receivedYear;
	}

	public void setReceivedYear(Integer receivedYear) {
		this.receivedYear = receivedYear;
	}

	@Column(name = "REJECTED_DATE", length = 65535)
	public String getRejectedDate() {
		return this.rejectedDate;
	}

	public void setRejectedDate(String rejectedDate) {
		this.rejectedDate = rejectedDate;
	}

	@Column(name = "QUOTED_DATE", length = 65535)
	public String getQuotedDate() {
		return this.quotedDate;
	}

	public void setQuotedDate(String quotedDate) {
		this.quotedDate = quotedDate;
	}

	@Column(name = "QUOTED_MONTH", length = 65535)
	public String getQuotedMonth() {
		return this.quotedMonth;
	}

	public void setQuotedMonth(String quotedMonth) {
		this.quotedMonth = quotedMonth;
	}

	@Column(name = "QUOTED_DAY", length = 65535)
	public String getQuotedDay() {
		return this.quotedDay;
	}

	public void setQuotedDay(String quotedDay) {
		this.quotedDay = quotedDay;
	}

	@Column(name = "QUOTED_YEAR")
	public Integer getQuotedYear() {
		return this.quotedYear;
	}

	public void setQuotedYear(Integer quotedYear) {
		this.quotedYear = quotedYear;
	}

	@Column(name = "BOUND_DATE", length = 65535)
	public String getBoundDate() {
		return this.boundDate;
	}

	public void setBoundDate(String boundDate) {
		this.boundDate = boundDate;
	}

	@Column(name = "PENDING_DATE", length = 65535)
	public String getPendingDate() {
		return this.pendingDate;
	}

	public void setPendingDate(String pendingDate) {
		this.pendingDate = pendingDate;
	}

	@Column(name = "PENDING_AGING_DAYS")
	public Integer getPendingAgingDays() {
		return this.pendingAgingDays;
	}

	public void setPendingAgingDays(Integer pendingAgingDays) {
		this.pendingAgingDays = pendingAgingDays;
	}

	@Column(name = "POLICY_PREMIUM")
	public Integer getPolicyPremium() {
		return this.policyPremium;
	}

	public void setPolicyPremium(Integer policyPremium) {
		this.policyPremium = policyPremium;
	}

	@Column(name = "REJECT_REASON", length = 65535)
	public String getRejectReason() {
		return this.rejectReason;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	@Column(name = "SUB_REJECT_REASON", length = 65535)
	public String getSubRejectReason() {
		return this.subRejectReason;
	}

	public void setSubRejectReason(String subRejectReason) {
		this.subRejectReason = subRejectReason;
	}

	@Column(name = "POL_EFF_DT", length = 65535)
	public String getPolEffDt() {
		return this.polEffDt;
	}

	public void setPolEffDt(String polEffDt) {
		this.polEffDt = polEffDt;
	}

	@Column(name = "POL_EXP_DT", length = 65535)
	public String getPolExpDt() {
		return this.polExpDt;
	}

	public void setPolExpDt(String polExpDt) {
		this.polExpDt = polExpDt;
	}

	@Column(name = "PREVIOUS_POLICY_NUM", length = 65535)
	public String getPreviousPolicyNum() {
		return this.previousPolicyNum;
	}

	public void setPreviousPolicyNum(String previousPolicyNum) {
		this.previousPolicyNum = previousPolicyNum;
	}

	@Column(name = "BDP_RENEW_FLAG", length = 65535)
	public String getBdpRenewFlag() {
		return this.bdpRenewFlag;
	}

	public void setBdpRenewFlag(String bdpRenewFlag) {
		this.bdpRenewFlag = bdpRenewFlag;
	}

	@Column(name = "PROGRAM", length = 65535)
	public String getProgram() {
		return this.program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	@Column(name = "PREMIUM_BAND", length = 65535)
	public String getPremiumBand() {
		return this.premiumBand;
	}

	public void setPremiumBand(String premiumBand) {
		this.premiumBand = premiumBand;
	}

	@Column(name = "CLAIM_COUNT", length = 65535)
	public String getClaimCount() {
		return this.claimCount;
	}

	public void setClaimCount(String claimCount) {
		this.claimCount = claimCount;
	}

	@Column(name = "LOSS_INCRD", length = 65535)
	public String getLossIncrd() {
		return this.lossIncrd;
	}

	public void setLossIncrd(String lossIncrd) {
		this.lossIncrd = lossIncrd;
	}

	@Column(name = "LOSS_PAID", length = 65535)
	public String getLossPaid() {
		return this.lossPaid;
	}

	public void setLossPaid(String lossPaid) {
		this.lossPaid = lossPaid;
	}

	@Column(name = "EXP_INCRD", length = 65535)
	public String getExpIncrd() {
		return this.expIncrd;
	}

	public void setExpIncrd(String expIncrd) {
		this.expIncrd = expIncrd;
	}

	@Column(name = "EXP_PAID", length = 65535)
	public String getExpPaid() {
		return this.expPaid;
	}

	public void setExpPaid(String expPaid) {
		this.expPaid = expPaid;
	}

	@Column(name = "QUOTED_PREMIUM")
	public Integer getQuotedPremium() {
		return this.quotedPremium;
	}

	public void setQuotedPremium(Integer quotedPremium) {
		this.quotedPremium = quotedPremium;
	}

	@Column(name = "USERROLE", length = 65535)
	public String getUserrole() {
		return this.userrole;
	}

	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}

	@Column(name = "INSURED_NAME", length = 65535)
	public String getInsuredName() {
		return this.insuredName;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	@Column(name = "UW_REGION", length = 65535)
	public String getUwRegion() {
		return this.uwRegion;
	}

	public void setUwRegion(String uwRegion) {
		this.uwRegion = uwRegion;
	}

	@Column(name = "MINIMUM_PREMIUM_FLAG", length = 65535)
	public String getMinimumPremiumFlag() {
		return this.minimumPremiumFlag;
	}

	public void setMinimumPremiumFlag(String minimumPremiumFlag) {
		this.minimumPremiumFlag = minimumPremiumFlag;
	}

	@Column(name = "MINIMUM_PREMIUM", length = 65535)
	public String getMinimumPremium() {
		return this.minimumPremium;
	}

	public void setMinimumPremium(String minimumPremium) {
		this.minimumPremium = minimumPremium;
	}

	@Column(name = "MINIMUM_OVERRIDE_PREMIUM_FLAG", length = 65535)
	public String getMinimumOverridePremiumFlag() {
		return this.minimumOverridePremiumFlag;
	}

	public void setMinimumOverridePremiumFlag(String minimumOverridePremiumFlag) {
		this.minimumOverridePremiumFlag = minimumOverridePremiumFlag;
	}

	@Column(name = "MINIMUM_OVERRIDE_PREMIUM", length = 65535)
	public String getMinimumOverridePremium() {
		return this.minimumOverridePremium;
	}

	public void setMinimumOverridePremium(String minimumOverridePremium) {
		this.minimumOverridePremium = minimumOverridePremium;
	}

	@Column(name = "AGENT_CONTACT", length = 65535)
	public String getAgentContact() {
		return this.agentContact;
	}

	public void setAgentContact(String agentContact) {
		this.agentContact = agentContact;
	}

	@Column(name = "ISSUE_DT", length = 65535)
	public String getIssueDt() {
		return this.issueDt;
	}

	public void setIssueDt(String issueDt) {
		this.issueDt = issueDt;
	}

	@Column(name = "INSURED_STATE", length = 65535)
	public String getInsuredState() {
		return this.insuredState;
	}

	public void setInsuredState(String insuredState) {
		this.insuredState = insuredState;
	}

	@Column(name = "ENDORSEMENT_PREMIUM", length = 65535)
	public String getEndorsementPremium() {
		return this.endorsementPremium;
	}

	public void setEndorsementPremium(String endorsementPremium) {
		this.endorsementPremium = endorsementPremium;
	}

	@Column(name = "UNDERWRITER_ASSISTANT", length = 65535)
	public String getUnderwriterAssistant() {
		return this.underwriterAssistant;
	}

	public void setUnderwriterAssistant(String underwriterAssistant) {
		this.underwriterAssistant = underwriterAssistant;
	}

	@Column(name = "QUOTE_START_DATE", length = 65535)
	public String getQuoteStartDate() {
		return this.quoteStartDate;
	}

	public void setQuoteStartDate(String quoteStartDate) {
		this.quoteStartDate = quoteStartDate;
	}

	@Column(name = "RECEIVED_TO_EFF_DAY")
	public Integer getReceivedToEffDay() {
		return this.receivedToEffDay;
	}

	public void setReceivedToEffDay(Integer receivedToEffDay) {
		this.receivedToEffDay = receivedToEffDay;
	}

	@Column(name = "QUOTED_PREMIUM_BAND", length = 65535)
	public String getQuotedPremiumBand() {
		return this.quotedPremiumBand;
	}

	public void setQuotedPremiumBand(String quotedPremiumBand) {
		this.quotedPremiumBand = quotedPremiumBand;
	}

	@Column(name = "STATUS", length = 65535)
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "RATING", length = 65535)
	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Column(name = "QUOTED", length = 65535)
	public String getQuoted() {
		return quoted;
	}

	public void setQuoted(String quoted) {
		this.quoted = quoted;
	}
}
