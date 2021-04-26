package com.cg.spc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_tab")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int userId;
private String password;
private String role;
public User(int userId, String password, String role) {
	super();
	this.userId = userId;
	this.password = password;
	this.role = role;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", password=" + password + ", role=" + role + "]";
}

}
