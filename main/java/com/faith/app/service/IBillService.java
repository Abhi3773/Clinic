package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.model.Bill;





public interface IBillService {
  //list all
	public List<Bill>getAllBills();
	//get user by id
	public Optional<Bill>getBillById(Integer billId);
	
	//insert
	public void addBill(Bill bill);
	
	//update
	public void updateBill(Bill bill);
	
	//delete
	public void deleteBill(Integer billId);
}
