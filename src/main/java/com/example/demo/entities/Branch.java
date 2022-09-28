package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Branch {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer branchId;
	private String branchName;
	private String branchDescription;
	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Branch(Integer branchId, String branchName, String branchDescription) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchDescription = branchDescription;
	}
	public Integer getBranchId() {
		return branchId;
	}
	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchDescription() {
		return branchDescription;
	}
	public void setBranchDescription(String branchDescription) {
		this.branchDescription = branchDescription;
	}
	
}
