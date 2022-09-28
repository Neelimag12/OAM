package com.example.demo.services;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Courses;
import com.example.demo.repositories.BranchRepository;
import com.example.demo.repositories.CollegeRepository;

@Service
public class CoursesServiceImpl implements CoursesService{
		@Autowired
		private BranchRepository branchRepo;
		@Autowired
		private CollegeRepository collegeRepo;
		
		
		@Override
		public List<Courses> showAllCourses() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public String deleteCourse(Integer id) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Courses addCourse(Courses courses) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Courses updateCourses(Courses courses) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Courses showCourseById(Integer id) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		public Cart addMobileItems(Mobile mobile) throws CartException{
//			return null;
//		}
//
//		@Override
//		public String deleteCart(Integer id) throws CartException {
//			this.cartRepo.deleteById(id);
//			return "Deleted mobile items in the cart";
//		}
//
//		@Override
//		public Cart updateMobileItems(Mobile mobile,CartDTO cartDTO) throws CartException, MobileException {
//			Optional<Cart>cartOpt=this.cartRepo.findById(cartDTO.getCart_Id());
//			if(cartOpt.isEmpty())
//				throw new CartException("Cart doesn't exist");
//			Cart cart=cartOpt.get();
////			if(cart.getMobiles().contains(mobile.getMobileId())==false)
////				cart.getMobiles().add(mobile);
//			if(cartOpt.get().getMobiles().contains(mobile))
//				throw new CartException("Mobile already added");
//			cart.getMobiles().add(mobile);
//			this.mobileRepo.insert(mobile);
//			return this.cartRepo.save(cart);
//		}
//
//		@Override
//		public List<Cart> showAllCarts() {
//			return cartRepo.findAll();
//		}
//
//		@Override
//		public Cart addCart(Cart cart) throws CartException {
//			Optional<Cart> newCart = this.cartRepo.findById(cart.getCartId());
//			if (newCart.isPresent())
//				throw new CartException("Already cart added");
//			return this.cartRepo.save(cart);
//		}
//
//		@Override
//		public Cart updateCart(Cart cart) {
//			return this.cartRepo.save(cart);
//		}
//
//		@Override
//		public Cart showCartById(Integer id) throws CartException{
//			Optional<Cart> cartOptional = this.cartRepo.findById(id);
//			if (cartOptional.isEmpty())
//				throw new CartException("Cart Id doesn't exist");
//			return cartOptional.get();
//		}
//		
//		@Override
//		public Cart updateMobileItems1(Mobile mobile,CartDTO cartDTO) throws CartException, MobileException {
//			Optional<Mobile>mobileOpt=this.mobileRepo.findById(mobile.getMobileId());
//			if(mobileOpt.isPresent()==false)
//				throw new MobileException("Mobile Id doesn't exist");
//			Optional<Cart>cartOpt=this.cartRepo.findById(cartDTO.getCart_Id());
//			if(cartOpt.isEmpty())
//				throw new CartException("Cart doesn't exist");
//			Cart cart=cartOpt.get();
//			cart.getMobiles().add(mobile);
//			return this.cartRepo.save(cart);
//		}
//
//		@Override
//		public int placeOrder(CountOfMobiles countMobile) throws CartException {
//			Optional<Cart>cartOpt=this.cartRepo.findById(countMobile.getCartId());
//			if(cartOpt.isEmpty())
//				throw new CartException("Cart id doesn't exist");
//			Cart cart=cartOpt.get();
//			Integer count=cart.getMobiles().size();
//			return count;
//		}
//		
//		@Override
//		public Mobile addMobileItems1(Mobile mobile)throws MobileException{
//			Optional<Mobile>mobileOpt=this.mobileRepo.findById(mobile.getMobileId());
//			if(mobileOpt.isPresent())
//				throw new MobileException("Mobile already added");
////			Optional<Cart>cartOpt=this.cartRepo.findById(cartDTO.getCart_Id());
////			if(cartOpt.isEmpty())
////				throw new CartException("Cart doesn't exist");
////			Cart cart=cartOpt.get();
////			cart.getMobiles().add(mobile);
//			return this.mobileRepo.save(mobile);
//		}
}
