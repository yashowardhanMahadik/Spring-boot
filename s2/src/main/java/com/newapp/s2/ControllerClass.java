package com.newapp.s2;

import java.util.List;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import net.guides.springboot2.springboot2jpacrudexample.model.Employee;

@RequestMapping("/api/v1")
@RestController
public class ControllerClass {

	@Autowired
	ServiceInterface sc;
	
	@Autowired
	EmplozzRepo employeeRepository;
	
	
	
	
	@GetMapping(path = "/")
	@ResponseBody
	private String helloWorld() {
		// TODO Auto-generated method stub
		return sc.employeeNames().toString();

	}
	
	
	@PostMapping(path="/create")
	private Employzz enterEmp(@RequestBody Employzz emp)
	{
		System.out.println(emp.toString()+"  IN THE COntroller ^^^^^^^^^^^^^^^^^^^^^^^^^%%%%%%%%%%%%%%%%%%%%%%");
		return sc.createEmp(emp);
	}
	
	@GetMapping(path="/emps")
	private @ResponseBody List<Employzz> getallEmps()
	{
		System.err.println(sc.getAllEmployees());
		return sc.getAllEmployees();
	}
	

	@GetMapping("/employees")
	public List<Employzz> getAllEmployees() {
		return employeeRepository.findAll();
	}


	@PostMapping("/employees")
	public Employzz createEmployee( @RequestBody Employzz employee) {
		return employeeRepository.save(employee);
	}
	
	
}

