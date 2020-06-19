package com.capgemini.empwebapp.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.capgemini.empwebapp.dao.EmployeeDao;
import com.capgemini.empwebapp.dao.EmployeeDaoImpl;
import com.capgemini.empwebapp.dto.EmployeeBean;


public class EmployeeServiceImpl implements EmployeeServices{
	EmployeeDao dao = new EmployeeDaoImpl();

	@Override
	public EmployeeBean getEmployeeDetailsByname(String name) {
		// TODO Auto-generated method stub
		return dao.getEmployeeDetailsByname(name);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployeeInfo(id);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return dao.updateEmployeeInfo(bean);
	}

	@Override
	public boolean createEmployeeInfo(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return dao.createEmployeeInfo(bean);
	}

	@Override
	public List<EmployeeBean> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return dao.getAllEmployeeDetails();
	}
	

	
	

	




	
	

}
