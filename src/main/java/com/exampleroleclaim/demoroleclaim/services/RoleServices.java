package com.exampleroleclaim.demoroleclaim.services;

import java.util.List;

import com.exampleroleclaim.demoroleclaim.entities.Details;

public interface RoleServices {

	
	public List<Details> getDetails();
	
	//public Details getDetail(long roleId);
	
	public Details addDetails(Details details);
	
	
	
}
