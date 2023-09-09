package com.ipm.admin.reply.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ipm.admin.reply.TodysDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class AdminReply {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long answerid;
	private String qanswer;
	private long qid;
	private String qanswerdate = TodysDate.todayDate();
	public Long getAnswerid() {
		return answerid;
	}
	public void setAnswerid(Long answerid) {
		this.answerid = answerid;
	}
	public String getQanswer() {
		return qanswer;
	}
	public void setQanswer(String qanswer) {
		this.qanswer = qanswer;
	}
	public long getQid() {
		return qid;
	}
	public void setQid(long qid) {
		this.qid = qid;
	}
	public String getQanswerdate() {
		return qanswerdate;
	}
	public void setQanswerdate(String qanswerdate) {
		this.qanswerdate = qanswerdate;
	}
	public AdminReply(Long answerid, String qanswer, long qid, String qanswerdate) {
		super();
		this.answerid = answerid;
		this.qanswer = qanswer;
		this.qid = qid;
		this.qanswerdate = qanswerdate;
	}
	@Override
	public String toString() {
		return "AdminReply [answerid=" + answerid + ", qanswer=" + qanswer + ", qid=" + qid + ", qanswerdate="
				+ qanswerdate + "]";
	}
	public AdminReply() {super();}

}
