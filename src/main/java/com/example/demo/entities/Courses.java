package com.example.demo.entities;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Courses {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer courseId;
		private String courseName;
		private String eligibility;
		private College college;
		private List<Branch> branches=new ArrayList<Branch>();
		public Courses() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Courses(Integer courseId, String courseName, String eligibility, College college,
				List<Branch> branches) {
			super();
			this.courseId = courseId;
			this.courseName = courseName;
			this.eligibility = eligibility;
			this.college = college;
			this.branches = branches;
		}
		public Integer getCourseId() {
			return courseId;
		}
		public void setCourseId(Integer courseId) {
			this.courseId = courseId;
		}
		public String getCourseName() {
			return courseName;
		}
		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}
		public String getEligibility() {
			return eligibility;
		}
		public void setEligibility(String eligibility) {
			this.eligibility = eligibility;
		}
		public College getCollege() {
			return college;
		}
		public void setCollege(College college) {
			this.college = college;
		}
		public List<Branch> getBranches() {
			return branches;
		}
		public void setBranches(List<Branch> branches) {
			this.branches = branches;
		}
}
