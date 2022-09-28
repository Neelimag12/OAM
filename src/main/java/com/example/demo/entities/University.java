package com.example.demo.entities;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class University {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer universityId;
		private String unversityname;
		private String address;
		private List<College> colleges=new ArrayList<College>();
		public University() {
			super();
			// TODO Auto-generated constructor stub
		}
		public University(Integer universityId, String unversityname, String address, List<College> colleges) {
			super();
			this.universityId = universityId;
			this.unversityname = unversityname;
			this.address = address;
			this.colleges = colleges;
		}
		public Integer getUniversityId() {
			return universityId;
		}
		public void setUniversityId(Integer universityId) {
			this.universityId = universityId;
		}
		public String getUnversityname() {
			return unversityname;
		}
		public void setUnversityname(String unversityname) {
			this.unversityname = unversityname;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public List<College> getColleges() {
			return colleges;
		}
		public void setColleges(List<College> colleges) {
			this.colleges = colleges;
		}
}