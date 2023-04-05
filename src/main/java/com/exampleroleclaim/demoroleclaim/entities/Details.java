package com.exampleroleclaim.demoroleclaim.entities;

public class Details {
	private long id;
	private long RoleId;
	private String ClaimType;
	private String ClaimValue;
	public Details(long id, long roleId, String claimType, String claimValue) {
		super();
		this.id = id;
		RoleId = roleId;
		ClaimType = claimType;
		ClaimValue = claimValue;
	}
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Details [id=" + id + ", RoleId=" + RoleId + ", ClaimType=" + ClaimType + ", ClaimValue=" + ClaimValue
				+ "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getRoleId() {
		return RoleId;
	}
	public void setRoleId(long roleId) {
		RoleId = roleId;
	}
	public String getClaimType() {
		return ClaimType;
	}
	public void setClaimType(String claimType) {
		ClaimType = claimType;
	}
	public String getClaimValue() {
		return ClaimValue;
	}
	public void setClaimValue(String claimValue) {
		ClaimValue = claimValue;
	}
	
}
