package com.ipm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ipm.TodaysDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public class Policy {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long pid;
		@Column(nullable = false)
		private String policyname;

		@Column(nullable = false)
		private String policycatagory;

		private String addDateOfPolicy = TodaysDate.todayDate();

		public Long getPid() {
			return pid;
		}

		public void setPid(Long pid) {
			this.pid = pid;
		}

		public String getPolicyname() {
			return policyname;
		}

		public void setPolicyname(String policyname) {
			this.policyname = policyname;
		}

		public String getPolicycatagory() {
			return policycatagory;
		}

		public void setPolicycatagory(String policycatagory) {
			this.policycatagory = policycatagory;
		}

		public String getAddDateOfPolicy() {
			return addDateOfPolicy;
		}

		public void setAddDateOfPolicy(String addDateOfPolicy) {
			this.addDateOfPolicy = addDateOfPolicy;
		}

		public Policy(Long pid, String policyname, String policycatagory, String addDateOfPolicy) {
			super();
			this.pid = pid;
			this.policyname = policyname;
			this.policycatagory = policycatagory;
			this.addDateOfPolicy = TodaysDate.todayDate();
		}

		

	

		public Policy() {
			super();
		}

		@Override
		public String toString() {
			return "Policy [pid=" + pid + ", policyname=" + policyname + ", policycatagory=" + policycatagory
					+ ", addDateOfPolicy=" + addDateOfPolicy + "]";
		}

		
}
