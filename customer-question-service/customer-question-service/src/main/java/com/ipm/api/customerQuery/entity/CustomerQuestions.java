package com.ipm.api.customerQuery.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ipm.api.customerQuery.TodysDate;


@Entity
public class CustomerQuestions {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long qid;
	@Column(nullable = false)

	private String customeremail;
	@Column(nullable = false)
	private String qtopic;
	@Column(nullable = false)
	private String qdetails;
	private String qdate = TodysDate.todayDate();
	private String qanswer;
	private String answerdate;

	public Long getQid() {
		return qid;
	}

	public void setQid(Long qid) {
		this.qid = qid;
	}

	public String getCustomeremail() {
		return customeremail;
	}

	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}

	public String getQtopic() {
		return qtopic;
	}

	public void setQtopic(String qtopic) {
		this.qtopic = qtopic;
	}

	public String getQdetails() {
		return qdetails;
	}

	public void setQdetails(String qdetails) {
		this.qdetails = qdetails;
	}

	public String getQdate() {
		return qdate;
	}

	public void setQdate(String qdate) {
		this.qdate = qdate;
	}

	public String getQanswer() {
		return qanswer;
	}

	public void setQanswer(String qanswer) {
		this.qanswer = qanswer;
	}

	public String getAnswerdate() {
		return answerdate;
	}

	public void setAnswerdate(String answerdate) {
		this.answerdate = answerdate;
	}
	
	public CustomerQuestions() {
		
	}
	
	public CustomerQuestions(Long qid, String customeremail, String qtopic, String qdetails, String qdate,
			String qanswer, String answerdate) {
		super();
		this.qid = qid;
		this.customeremail = customeremail;
		this.qtopic = qtopic;
		this.qdetails = qdetails;
		this.qdate = qdate;
		this.qanswer = qanswer;
		this.answerdate = answerdate;
	}

	@Override
	public String toString() {
		return "CustomerQuestions [qid=" + qid + ", customeremail=" + customeremail + ", qtopic=" + qtopic
				+ ", qdetails=" + qdetails + ", qdate=" + qdate + ", qanswer=" + qanswer + ", answerdate=" + answerdate
				+ "]";
	}

}