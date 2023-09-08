package com.questions.entities;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "question_details")
public class Question {

	@Id
	@Column(name = "id")
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "sms")
	private String sms;
	
	
	public Question() {}
	// Constructor with all fields
    public Question(Integer id, String email, String name, String sms) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.sms = sms;
        
    }
    // Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
    
	}
    
    
	
