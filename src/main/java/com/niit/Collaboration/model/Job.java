package com.niit.Collaboration.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.niit.Collaboration.model.BaseDomain;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "C_JOB")
@Component
public class Job extends BaseDomain {

	@Id
	private String id;
	
	private String title;
	
	private String qualification;
	
	private String status;
	
	private String description;
	

	@Column(name="date_time")
	
	private Date dateTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date date) {
		// TODO Auto-generated method stub
		
	}
}