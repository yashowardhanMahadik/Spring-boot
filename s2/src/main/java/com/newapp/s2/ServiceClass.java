package com.newapp.s2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

//import net.guides.springboot2.springboot2jpacrudexample.model.Employee;

@Service
public class ServiceClass implements ServiceInterface{
	
	@Autowired
	EmplozzRepo emplozzRepo;
	
	public List<Employzz> employeeNames()
	{
		
		
		List<Employzz> li = new ArrayList<>();
		li.add(new Employzz(31, "ys", "ymail"));
		
		

		return li;
	}
	public List<Employzz> getAllEmployees() {
		
		//System.err.println(emplozzRepo.findAll());
		return emplozzRepo.findAll() ;
		
	}

	public Employzz getEmployee() {
		// TODO Auto-generated method stub
		return emplozzRepo.getOne(0);
	}

	
	public Employzz createEmp(Employzz empl1) {
		// TODO Auto-generated method stub
		System.out.println(empl1+" In THE SERVICE CLASS %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		
		System.out.println(emplozzRepo.findAll());
		//System.err.println(emplozzRepo.save(empl1).toString());
		return emplozzRepo.save(empl1);
	}
	
	}


