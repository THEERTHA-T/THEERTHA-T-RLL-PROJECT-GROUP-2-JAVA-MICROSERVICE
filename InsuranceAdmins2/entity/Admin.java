package com.admin.entity;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jetbrains.annotations.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "admin")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@NotNull
	@Column(name = "adminname")
	private String adminname;

	@Column(name = "adminemain")
	private String adminemail;

	@Column(name ="adminpassword")
	private String adminpassword;
	
	@Column(name="adminphonenumber")
	private int adminphno;
	
	@Column(name = "adminage")
	private int adminage;
	

	@Column(name = "admngender")
	private String admingender;
	

	@Column(name = "adminadress")
	private String adminadress;
	
	@Column(name = "seniormanageremail")
	private String seniormanageremail;
	

	@Column(name = "adminjoindate")
	private String adminjoindate;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public String getAdminemail() {
		return adminemail;
	}

	public void setAdminemail(String adminemail) {
		this.adminemail = adminemail;
	}

	public String getAdminpassword() {
		return adminpassword;
	}

	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}

	public int getAdminphno() {
		return adminphno;
	}

	public void setAdminphno(int adminphno) {
		this.adminphno = adminphno;
	}

	public int getAdminage() {
		return adminage;
	}

	public void setAdminage(int adminage) {
		this.adminage = adminage;
	}

	public String getAdmingender() {
		return admingender;
	}

	public void setAdmingender(String admingender) {
		this.admingender = admingender;
	}

	public String getAdminadress() {
		return adminadress;
	}

	public void setAdminadress(String adminadress) {
		this.adminadress = adminadress;
	}

	public String getSeniormanageremail() {
		return seniormanageremail;
	}

	public void setSeniormanageremail(String seniormanageremail) {
		this.seniormanageremail = seniormanageremail;
	}

	public String getAdminjoindate() {
		return adminjoindate;
	}

	public void setAdminjoindate(String adminjoindate) {
		this.adminjoindate = adminjoindate;
	}

	
	
	public Admin(Integer id, String adminname, String adminemail, String adminpassword, int adminphno, int adminage,
			String admingender, String adminadress, String seniormanageremail, String adminjoindate ) {
		super();
		this.id = id;
		this.adminname = adminname;
		this.adminemail = adminemail;
		this.adminpassword = adminpassword;
		this.adminphno = adminphno;
		this.adminage = adminage;
		this.admingender = admingender;
		this.adminadress = adminadress;
		this.seniormanageremail = seniormanageremail;
		this.adminjoindate = adminjoindate;
	}

	public Admin() {
		
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", adminname=" + adminname + ", adminemail=" + adminemail + ", adminpassword="
				+ adminpassword + ", adminphno=" + adminphno + ", adminage=" + adminage + ", admingender=" + admingender
				+ ", adminadress=" + adminadress + ", seniormanageremail=" + seniormanageremail + ", adminjoindate="
				+ adminjoindate + "]";
	}

	}
