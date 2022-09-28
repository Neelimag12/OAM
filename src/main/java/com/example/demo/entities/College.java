package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class College {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer collegeRegId;
	private String collegeName;
	//private Address address; refer the same written in Courses.java file;
    //private List<Program>programList=ArrayList<Program>(); refer the same written in Courses.java file;
	// same goes for courselist and branchlist
	
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(Integer collegeRegId, String collegeName) {
		super();
		this.collegeRegId = collegeRegId;
		this.collegeName = collegeName;
	}
	public Integer getCollegeRegId() {
		return collegeRegId;
	}
	public void setCollegeRegId(Integer collegeRegId) {
		this.collegeRegId = collegeRegId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
}
