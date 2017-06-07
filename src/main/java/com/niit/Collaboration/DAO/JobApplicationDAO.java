package com.niit.Collaboration.DAO;

import java.util.List;

import com.niit.Collaboration.model.JobApplication;

public interface JobApplicationDAO {
	
	public List<JobApplication> list();
	
	public List<JobApplication> getList(String user_id);
	
	public boolean save(JobApplication jobApplication);
	
	public JobApplication getApplicationById(Integer id);
	public boolean saveOrupdate(JobApplication jobApplication);
}