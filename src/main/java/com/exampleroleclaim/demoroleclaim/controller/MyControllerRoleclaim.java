package com.exampleroleclaim.demoroleclaim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.exampleroleclaim.demoroleclaim.entities.Details;
import com.exampleroleclaim.demoroleclaim.services.RoleServices;

@RestController
public class MyControllerRoleclaim {
	
	@Autowired
	private RoleServices roleservices;
	
	@GetMapping("/home")
	public String home()
	{
		return "this is home page for role claim";
	}
	
	
	
	@GetMapping("/details")
	public List<Details> getDetails()
	{
		return this.roleservices.getDetails();
	}
	
	
	
	/*@GetMapping("/onedetail{roleId}")
	public Details getDetail(@PathVariable String roleId)
	{
		return this.roleservices.getDetail(Long.parseLong(roleId));
	}*/
	
	@PostMapping("/adddetails")
	public Details addDetails(@RequestBody Details details)
	{
		return this.roleservices.addDetails(details);
	}
	

}
