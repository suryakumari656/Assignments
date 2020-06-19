package com.capgemini.empwebapp.dao;



import java.util.List;

import com.capgemini.empwebapp.dto.EmployeeBean;

public interface EmployeeDao {
	 public EmployeeBean getEmployeeDetailsByname(String name);
	  public boolean deleteEmployeeInfo(int id);
	  public boolean updateEmployeeInfo(EmployeeBean bean);
	  public boolean createEmployeeInfo(EmployeeBean bean);
	   public List<EmployeeBean> getAllEmployeeDetails();


	
	}
