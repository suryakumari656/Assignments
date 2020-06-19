package com.capgemini.eempwebapp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.empwebapp.services.EmployeeServiceImpl;
import com.capgemini.empwebapp.services.EmployeeServices;

public class DeleteController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String id=req.getParameter("id1");
		EmployeeServices service=new EmployeeServiceImpl();
		service.deleteEmployeeInfo(Integer.parseInt(id));
}


}
