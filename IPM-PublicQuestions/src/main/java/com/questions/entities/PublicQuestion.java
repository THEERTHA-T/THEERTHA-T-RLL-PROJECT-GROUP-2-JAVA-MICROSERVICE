package com.questions.entities;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "question_details")
public class PublicQuestion {

	@Id
	@Column(name = "id")
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "sms")
	private String sms;
	
	
//public PublicQuestion(int i, String string, String string2) {
//		// TODO Auto-generated constructor stub
//	}
public PublicQuestion() {
	// TODO Auto-generated constructor stub
}
public void Question() {}
	 //Constructor with all fields
     public void Question(Long id, String email, String name, String sms) {
         this.id = id;
         this.email = email;
         this.name = name;
         this.sms = sms;
        
     }
    // Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getsms() {
		return sms;
	}
	public void setsms(String sms) {
		this.sms = sms;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", email=" + email + ", name=" + name + ", sms=" + sms + "]";
	}
	public PublicQuestion(long i, String email, String name, String sms) {
		super();
		this.id = i;
		this.email = email;
		this.name = name;
		this.sms = sms;
	}
	
    
	}
    
    
	
