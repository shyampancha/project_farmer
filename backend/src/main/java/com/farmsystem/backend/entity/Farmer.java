package com.farmsystem.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="farmers")
public class Farmer 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Fid")
	private int fid;
	
	@Column(name="Fname")
	private String fName;
	
	@Column(name="Lname")
	private String lName;
	
	@Column(name="contact")
	private String contact;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="address")
	private String address;
	
	@Column(name="userName")
	private String userName;
	
	public Farmer(int fid, String fName, String lName, String contact, String email, String password, String address,
			String userName) {
		super();
		this.fid = fid;
		this.fName = fName;
		this.lName = lName;
		this.contact = contact;
		this.email = email;
		this.password = password;
		this.address = address;
		this.userName = userName;
	}
	
	
	public Farmer() {
		
	}


	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}


	@Override
	public String toString() {
		return "Farmer [fid=" + fid + ", fName=" + fName + ", lName=" + lName + ", contact=" + contact + ", email="
				+ email + ", password=" + password + ", address=" + address + ", userName=" + userName + "]";
	}
	
	
}
