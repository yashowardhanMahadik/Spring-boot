package com.yashow.restful.restful1.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworldcontroller {
//Get method (this controller will handle the get method)
//Map the get method 
//declare the class as the controller
	
	//@RequestMapping(method = RequestMethod.GET,path = "Hello-World")
	@GetMapping(path = "hello-world")
	public String helloWorld()
	{
		return "Hello Werld";
	}
	
	@GetMapping(path = "hello-bean")
	public HelloWorldBean helloworldbean()
	{
		return new HelloWorldBean("heheehehe");
	}
	//hello-bean/peth-variable/pappu
	@GetMapping(path = "hello-bean/peth-variable/{name}")
	public HelloWorldBean helloworldpathbean(@PathVariable String name)
	{
		return new HelloWorldBean(String.format("heheehehe, %s",name));
	}
}
