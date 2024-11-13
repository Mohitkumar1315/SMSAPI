package com.subh.model;

public class StaffLogin 
{
	private int Staffid;
	private String staffname;
	private int stafflive;
	private int staffType;
	private int branchId;
	private String branchName;
	private int access;
//	private String branchId;
	public int getStaffid() {
		return Staffid;
	}
	public void setStaffid(int staffid) {
		Staffid = staffid;
	}
	public String getStaffname() {
		return staffname;
	}
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	public int getStafflive() {
		return stafflive;
	}
	public void setStafflive(int stafflive) {
		this.stafflive = stafflive;
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public int getAccess() {
		return access;
	}
	public void setAccess(int access) {
		this.access = access;
	}
	
	public int getStaffType() {
		return staffType;
	}
	public void setStaffType(int staffType) {
		this.staffType = staffType;
	}
	public StaffLogin() {}
	public StaffLogin(int staffid, String staffname, int stafflive, int branchId, String branchName) {
		super();
		Staffid = staffid;
		this.staffname = staffname;
		this.stafflive = stafflive;
		this.branchId = branchId;
		this.branchName = branchName;
	}
	@Override
	public String toString() {
		return "StaffLogin [Staffid=" + Staffid + ", staffname=" + staffname + ", stafflive=" + stafflive
				+ ", staffType=" + staffType + ", branchId=" + branchId + ", branchName=" + branchName + ", access="
				+ access + "]";
	}
	
	
}
