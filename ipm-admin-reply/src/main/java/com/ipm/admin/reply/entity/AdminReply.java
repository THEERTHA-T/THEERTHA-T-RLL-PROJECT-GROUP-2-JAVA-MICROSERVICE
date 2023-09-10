package com.ipm.admin.reply.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
	
	private Long qid;
	
	private String qanswerdate = TodysDate.todayDate();

}
