package com.ipm.services;

import java.util.List;

import com.ipm.entity.Policy;

public interface IPolicyService {
	
	// Insert data in Database
		public Policy saveCustomer(Policy c);
		public Policy getPolicyById(Long id);

		// Show all customer details
		public List<Policy> showPolicy();
		// Update Policy--
		public Policy updatePolicyById(Long id, Policy p);

		// Delete By Id
		public void deletebyid(Long id);
	}



