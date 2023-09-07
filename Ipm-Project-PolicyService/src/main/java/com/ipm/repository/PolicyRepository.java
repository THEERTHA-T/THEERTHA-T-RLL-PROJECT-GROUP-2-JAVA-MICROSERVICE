package com.ipm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ipm.entity.Policy;

@Repository
public interface  PolicyRepository extends JpaRepository<Policy, Long> {

	public Policy findByPid(Long id);


}
