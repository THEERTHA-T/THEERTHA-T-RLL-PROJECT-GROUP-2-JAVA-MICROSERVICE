package com.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.lang.Integer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int cid;
	@Column(name = "cemail")
	private String cemail;
	@Column(name = "cname")
	private String cname;
	@Column(name = "cpassword")
	private String cpassword;
	@Column(name = "cphno")
	private String cphno;
	@Column(name = "cage")
	private String cage;
	@Column(name = "cgender")
	private String cgender;
	@Column(name = "caddress")
	private String caddress;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	public String getCphno() {
		return cphno;
	}

	public void setCphno(String cphno) {
		this.cphno = cphno;
	}

	public String getCage() {
		return cage;
	}


	public void setCage(String cage) {
		this.cage = cage;
	}

	public String getCgender() {
		return cgender;
	}

	public void setCgender(String cgender) {
		this.cgender = cgender;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public Customer(int cid, String cemail, String cname, String cpassword, String cphno, String cage, String cgender,
			String caddress) {
		super();
		this.cid = cid;
		this.cemail = cemail;
		this.cname = cname;
		this.cpassword = cpassword;
		this.cphno = cphno;
		this.cage = cage;
		this.cgender = cgender;
		this.caddress = caddress;
	}
public Customer() {
	
}
	@Override
	public String toString() {
		return String.format(
				"Customer [cid=%s, cemail=%s, cname=%s, cpassword=%s, cphno=%s, cage=%s, cgender=%s, caddress=%s]", cid,
				cemail, cname, cpassword, cphno, cage, cgender, caddress);
	}
}
