package com.admin.service;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admin.entity.Customer;


@Repository(value = "customerRepository")
@Scope("singleton")
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	void deleteById(Integer cid);

	//void deleteById(Integer id);

	//Customer findByAdminemailandpass(String email, String password);

	//Customer findByAdminemailandpass(String email, String password);

}
