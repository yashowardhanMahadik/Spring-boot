package com.newapp.s2;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface ServiceInterface {

	public List<Employzz> employeeNames();
	
	public List<Employzz> getAllEmployees();
	
	public Employzz getEmployee();
	
	public Employzz createEmp(Employzz employzz);
	
	
	
}
