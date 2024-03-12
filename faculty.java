package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class faculty {
	
	@Id
	public int faculty_id;
	public String faculty_dept;
	public String faculty_name;
	public String faculty_email;
	public String faculty_no;
	public String password;
	public int getFaculty_id() {
		return faculty_id;
	}
	public void setFaculty_id(int faculty_id) {
		this.faculty_id = faculty_id;
	}
	public String getFaculty_dept() {
		return faculty_dept;
	}
	public void setFaculty_dept(String faculty_dept) {
		this.faculty_dept = faculty_dept;
	}
	public String getFaculty_name() {
		return faculty_name;
	}
	public void setFaculty_name(String faculty_name) {
		this.faculty_name = faculty_name;
	}
	public String getFaculty_email() {
		return faculty_email;
	}
	public void setFaculty_email(String faculty_email) {
		this.faculty_email = faculty_email;
	}
	public String getFaculty_no() {
		return faculty_no;
	}
	public void setFaculty_no(String faculty_no) {
		this.faculty_no = faculty_no;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
