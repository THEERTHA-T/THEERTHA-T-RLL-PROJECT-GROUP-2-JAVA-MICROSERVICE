package com.ipm.admin.reply.adminreply.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ipm.admin.reply.adminreply.TodysDate;

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

}
