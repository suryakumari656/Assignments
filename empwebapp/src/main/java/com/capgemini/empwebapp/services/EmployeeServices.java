package com.capgemini.empwebapp.services;

import java.util.List;

import com.capgemini.empwebapp.dto.EmployeeBean;

public interface EmployeeServices {

	  public EmployeeBean getEmployeeDetailsByname(String name);
	  public boolean deleteEmployeeInfo(int id);
	  public boolean updateEmployeeInfo(EmployeeBean bean);
	  public boolean createEmployeeInfo(EmployeeBean bean);
	  public List<EmployeeBean> getAllEmployeeDetails();

	
	
}
