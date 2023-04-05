package com.exampleroleclaim.demoroleclaim.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.exampleroleclaim.demoroleclaim.entities.Details;


@Service

public class RoleServicesImpl implements RoleServices{
	
	
	
	List<Details> list;
	
	
	
	
	
	public RoleServicesImpl()
	{
		list = new ArrayList<>();
		list.add(new Details(23, 455, "claimvalue1", "claimtype1"));
		list.add(new Details(24, 466, "claimvalue2", "claimtype2"));
	}
	
	
	@Override
	public List<Details> getDetails() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public Details addDetails(Details details) {
		// TODO Auto-generated method stub
		
		list.add(details);
		return details;
	}


	/*@Override
	public Details getDetail(long roleId) {
		// TODO Auto-generated method stub
		
		Details d = null;
		for(Details i : list)
		{
			
			if(Details.getId()==roleId)
			{
				d = i;
				break;
			}
		}
		return d;
	}*/
	
	
	

}
