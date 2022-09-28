package com.example.demo.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Courses;
import com.example.demo.exceptions.CoursesException;
import com.example.demo.services.CoursesService;


@RestController
@RequestMapping("/demo")

public class CoursesController {

		@Autowired
		private CoursesService coursesService;
		
		@GetMapping("/courses")
		public List<Courses> getAllCourses(){
			return this.coursesService.showAllCourses();
		}
		
//		@PostMapping("addmobileitems")
//		public Courses createCart(@PathVariable  mobile) throws CoursesException{
//			return this.cartService.addMobileItems(mobile);
//		}
//		
		@DeleteMapping("/cancelcourses/{id}")
		public String cancelCourse(@PathVariable("id") Integer id) throws CoursesException {
			return this.coursesService.deleteCourse(id);
		}
		
//		@PutMapping("updateMobileitems")
//		public Cart updateMobileItems(@RequestBody Mobile mobile, CartDTO cartDTO) throws CartException, MobileException {
//			return this.cartService.updateMobileItems(mobile,cartDTO);
//		}
		
		@PostMapping("/addCourses")
		public Courses createCourses(@RequestBody Courses courses) throws CoursesException {
			return this.coursesService.addCourse(courses);
		}
		
		@PutMapping("/updateCourses")
		public Courses updateCourses(@RequestBody Courses courses) throws CoursesException {
			return this.coursesService.updateCourses(courses);
		}
		
		@PostMapping("/cart/{id}")
		public Courses showCourseById(@PathVariable("id") Integer id)throws CoursesException {
			return this.coursesService.showCourseById(id);
		}
//		@PutMapping("updateMobileitems1")
//		public Cart updateMobileItems1(@RequestBody Mobile mobile, CartDTO cartDTO) throws CartException, MobileException {
//			return this.cartService.updateMobileItems1(mobile,cartDTO);
//		}
//		@PostMapping("countOfmobiles")
//		public Integer placeOrder(@RequestBody CountOfMobiles countMobile) throws CartException{
//			return this.cartService.placeOrder(countMobile);
//		}
//		@PostMapping("addtomobiles")
//		public Mobile addMobileItems1(@RequestBody Mobile mobile)throws MobileException{
//			return this.cartService.addMobileItems1(mobile);
//		}

}
