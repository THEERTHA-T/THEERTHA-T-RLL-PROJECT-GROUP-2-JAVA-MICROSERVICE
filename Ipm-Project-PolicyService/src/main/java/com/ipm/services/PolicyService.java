package com.ipm.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.ipm.TodaysDate;
import com.ipm.entity.Policy;
import com.ipm.repository.PolicyRepository;

@Service(value = "policyService")
@Scope("singleton")
@Transactional
public class PolicyService {
	@Autowired
	PolicyRepository prepo;

	// Insert data in Database
	public Policy saveCustomer(Policy c) {

		return prepo.save(c);

	}
	public Policy getPolicyById(Long id) {
        return prepo.findById(id).orElse(null);
    }

	// Show all customer details
	public List<Policy> showPolicy() {

		return prepo.findAll();

	}

	// Update Policy--
	public Policy updatePolicyById(Long id, Policy p) {
		Policy fp = prepo.findByPid(id);
		if (fp != null) {
			fp.setAddDateOfPolicy(TodaysDate.todayDate());

			fp.setPolicycatagory(p.getPolicycatagory());
			fp.setPolicyname(p.getPolicyname());
			return prepo.save(fp);
		} else {
			return null;
		}
	}

	// Delete By Id
	public void deletebyid(Long id) {
		prepo.deleteById(id);
	}
}
