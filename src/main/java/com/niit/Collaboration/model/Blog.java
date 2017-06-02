package com.niit.Collaboration.model;

import java.math.BigDecimal;
import java.sql.Clob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.type.ClobType;
import org.springframework.stereotype.Component;


@Entity
@Table(name="C_BLOG")
@Component
public class Blog extends BaseDomain {

	@Id
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getUserid() {
		return Userid;
	}
	public void setUserid(String userid) {
		Userid = userid;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Clob getDescription() {
		return description;
	}
	public void setDescription(Clob description) {
		this.description = description;
	}
	private String Title;
	
	@Column(name="User_id")
	private String Userid;
	@Column(name="date_time")
	private String datetime;
	private char status;
	private String reason;
	private Clob description;
	public void setDescription(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setErrorCode(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setErrorMessage(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setDatetime(Date date) {
		// TODO Auto-generated method stub
		
	}
	public void setId(BigDecimal blogID) {
		// TODO Auto-generated method stub
		
	}
}
