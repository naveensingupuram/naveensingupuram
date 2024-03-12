package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class User {
	@Id
	@GeneratedValue
	private int id;
	private long student_regd_no;
	private String student_dept;
	private String student_Name;
	private String student_Email;
	private String student_No;
	private String student_Branch;
	private String password;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public long getStudent_regd_no() {
		return student_regd_no;
	}
	public void setStudent_regd_no(int student_regd_no) {
		this.student_regd_no = student_regd_no;
	}
	public String getStudent_dept() {
		return student_dept;
	}
	public void setStudent_dept(String student_dept) {
		this.student_dept = student_dept;
	}
	public String getStudent_Name() {
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public String getStudent_Email() {
		return student_Email;
	}
	public void setStudent_Email(String student_Email) {
		this.student_Email = student_Email;
	}
	public String getStudent_No() {
		return student_No;
	}
	public void setStudent_No(String student_No) {
		this.student_No = student_No;
	}
	public String getStudent_Branch() {
		return student_Branch;
	}
	public void setStudent_Branch(String student_Branch) {
		this.student_Branch = student_Branch;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
