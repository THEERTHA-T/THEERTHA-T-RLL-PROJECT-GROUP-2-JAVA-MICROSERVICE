package com.admin.service;

import java.util.List;


import com.admin.entity.Customer;

public interface ICustomerservice {

	List<Customer> showCustomers();

	Object saveCustomer(Customer cc);

	//Customer showCustomerUsingLogin(String email, String password);

	//void deletecustomer(Long id);

	//void deletAdminById(int id);

//	void deletAdminById(Integer id);

	void deletCustomerById(Integer id);

	Customer updateAdmin(Customer customer);

}
