package com.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.admin.entity.Customer;

import com.admin.service.CustomerRepository;

import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
@EnableEurekaClient
public class InsuranceadminApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceadminApplication.class, args);
	}
	
	@Autowired
	@Qualifier("customerRepository")
	private CustomerRepository customerRepository;
	
	@Override
	public void run(String... args) throws Exception {
	
		

		customerRepository.save(new Customer(1,"a@gmail.com","kanna","12345","56789909","23","Female","nellore"));
		customerRepository.save(new Customer(2,"anantha@gmail.com","kanna","12345","56789909","23","Female","nellore"));
		customerRepository.save(new Customer(3,"l@gmail.com","kanna","12345","56789909","23","Female","nellore"));
		customerRepository.save(new Customer(4,"v@gmail.com","kanna","12345","56789909","23","Female","nellore"));
		//		bookRepository.save(new Book(2,"Hindoo Holiday..", "34534",2569,19869,"c.Dickens"));
//    	bookRepository.save(new Book(3,"My Father and My self...", "44534-865-988",200,1897,"A.C.Doyle"));
//		bookRepository.save(new Book(4,"A Changed Man", "335-87789-9834",150,1913,"T.Hardly"));
//		bookRepository.save(new Book(5,"My man Teju", "789-988-63534",143,2021,"K.Kaveri"));

		
		
		System.out.println(customerRepository.findAll());
	}
//	@Autowired
//	@Qualifier("customerRepository")
//	private CustomerRepository customerRepository;
//	
//	@Override
//	public void run1(String... args) throws Exception {
//	
//		customerRepository.save(new Customer(1,"k@gmail.com","kanna","12345","56789909","")));
//		//adminRepository.save(new Admin(2,"teju","sai@gmail.com","kaveri123",987567899,23,"male","Admin","sai@gmail.com","4-9-2023"));
////		bookRepository.save(new Book(2,"Hindoo Holiday..", "34534",2569,19869,"c.Dickens"));
////    	bookRepository.save(new Book(3,"My Father and My self...", "44534-865-988",200,1897,"A.C.Doyle"));
////		bookRepository.save(new Book(4,"A Changed Man", "335-87789-9834",150,1913,"T.Hardly"));
////		bookRepository.save(new Book(5,"My man Teju", "789-988-63534",143,2021,"K.Kaveri"));
//
//		
//		System.out.println(adminRepository.findAll());
//	}

}
