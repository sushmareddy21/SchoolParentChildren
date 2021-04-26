package com.cg.spc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int userId;
private String adminName;
private String adminContact;
public Admin(int userId, String adminName, String adminContact) {
	super();
	this.userId = userId;
	this.adminName = adminName;
	this.adminContact = adminContact;
}
public Admin() {
	super();
	// TODO Auto-generated constructor stub
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getAdminName() {
	return adminName;
}
public void setAdminName(String adminName) {
	this.adminName = adminName;
}
public String getAdminContact() {
	return adminContact;
}
public void setAdminContact(String adminContact) {
	this.adminContact = adminContact;
}
@Override
public String toString() {
	return "Admin [userId=" + userId + ", adminName=" + adminName + ", adminContact=" + adminContact + "]";
}

}
