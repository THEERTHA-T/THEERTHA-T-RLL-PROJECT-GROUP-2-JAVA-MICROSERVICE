package com.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.admin.entity.Customer;
import com.admin.service.ICustomerservice;
import com.ipm.api.exceptions.ProjectExecption;


@RestController
@Scope("request")
public class Customercontroller {
	

	@Autowired
	@Qualifier("customerService")
	private ICustomerservice customerService;

	@GetMapping("/showcustomers")

	public List<Customer> showallCustomers() {
		return customerService.showCustomers();
	}
	@PostMapping("/addcustomer")

	public ResponseEntity<Object> addCustomer(@RequestBody Customer cc) {
		return ResponseEntity.ok(customerService.saveCustomer(cc));
	}	

	@DeleteMapping(value = "/customer/{cid}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteCustomerById(@PathVariable("cid")Integer cid) {
		
		customerService.deletCustomerById(cid);
	}
//	public String deleteUser(@PathVariable("id") Long id) {
//		try {
//			customerService.deletecustomer(id);
//			return id + "  this Id of Customer Deleted";
//		} catch (Exception e) {
//			throw new ProjectExecption("Your  " + id + " Not foud");
//
//		}
	
	@PutMapping(value = "/customerupdate", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(code = HttpStatus.OK)
	public Customer updateBook(@RequestBody Customer customer) {

		return customerService.updateAdmin(customer);

	}
	@GetMapping("/countcustomer")
	public int countCustomer() {
		List<Customer> cl = customerService.showCustomers();

		return cl.size();
	}

	}
	

