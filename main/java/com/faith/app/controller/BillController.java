package com.faith.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.model.Bill;

import com.faith.app.service.IBillService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class BillController {
	//get instnce ---IOC
	@Autowired
	private IBillService billService;
	// httpMethods 
		//get all bills
		@GetMapping("/bills")
		public List<Bill>getAllBills(){
			return billService.getAllBills();
			
		}
		
		//get bill by id
		@GetMapping("/bills/{billId}")
		public Optional<Bill> getBillById(@PathVariable Integer billId) {
			return billService.getBillById(billId);
		}
		
		
		
		//inserting bill
		@PostMapping("/bills")
		public void addBill(@RequestBody Bill bill) {
			billService.addBill(bill);
		}
		
		//updating bill
		@PutMapping("/bills")
		public void updateUser(@RequestBody Bill bill) {
			billService.updateBill(bill);
		}
		
		//delete a bill
		@DeleteMapping("/bills/{billId}")
		public void deleteBill(@PathVariable Integer billId) {
			billService.deleteBill(billId);
		}

}
