package com.admin.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.admin.entity.Customer;

@Service(value = "customerService")
@Scope("singleton")
@Transactional
public class CustomerService implements ICustomerservice {
	
	@Autowired
	@Qualifier("customerRepository")
	private CustomerRepository customerRepository;


	@Override
	public List<Customer> showCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.findAll() ;
	}


	@Override
	public Object saveCustomer(Customer cc) {
		// TODO Auto-generated method stub
		return customerRepository.save(cc);
	}


	@Override
	public void deletCustomerById(Integer cid) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(cid);
	
	}


	@Override
	public Customer updateAdmin(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}



}
