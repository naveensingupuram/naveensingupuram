package com.example.demo.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="docs")
public class Doc {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String docName;
	private String docType;
	private String papertitle;
	private String authername;
	private String auther_mail;
	private String address;
	private String journelname;
	private String country;
	private String dept;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	public String getPapertitle() {
		return papertitle;
	}
	public void setPapertitle(String papertitle) {
		this.papertitle = papertitle;
	}
	public String getAuthername() {
		return authername;
	}
	public void setAuthername(String authername) {
		this.authername = authername;
	}
	public String getAuther_mail() {
		return auther_mail;
	}
	public void setAuther_mail(String auther_mail) {
		this.auther_mail = auther_mail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getJournelname() {
		return journelname;
	}
	public void setJournelname(String journelname) {
		this.journelname = journelname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Doc [id=" + id + ", docName=" + docName + ", docType=" + docType + ", papertitle=" + papertitle
				+ ", authername=" + authername + ", auther_mail=" + auther_mail + ", address=" + address
				+ ", journelname=" + journelname + ", country=" + country + ", dept=" + dept + "]";
	}
	
	@Lob
	private byte[] data;
	
	public Doc() {}

	public Doc(String docName, String docType, byte[] data) {
		super();
		this.docName = docName;
		this.docType = docType;
		this.data = data;
	}
	
	
	

	public Doc(String docName, String docType, String papertitle, String authername, String auther_mail,
			String address, String journelname, String country, byte[] data,String dept) {
		super();
		this.docName = docName;
		this.docType = docType;
		this.papertitle = papertitle;
		this.authername = authername;
		this.auther_mail = auther_mail;
		this.address = address;
		this.journelname = journelname;
		this.country = country;
		this.data = data;
		this.dept=dept;
		
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public void setFiles(MultipartFile[] files) {
		// TODO Auto-generated method stub
		
	}

	public void setFiles(String docname, String contentType, byte[] bytes) {
		// TODO Auto-generated method stub
		
	}
	
	

}