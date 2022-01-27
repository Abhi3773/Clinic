package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.model.Bill;
import com.faith.app.repository.IBillRepository;
@Service
public class BillServiceImplementation implements IBillService {
    //IOC
	@Autowired
	private IBillRepository billRepository;
	//List All Bills
	@Override
	public List<Bill> getAllBills() {
		return(List<Bill>) billRepository.findAll();
	}
    //get Bills by Id
	@Override
	public Optional<Bill> getBillById(Integer billId) {
		return billRepository.findById(billId);
	}
    //insert
	@Override
	public void addBill(Bill bill) {
		billRepository.save(bill);
		
	}
    //update
	@Override
	public void updateBill(Bill bill) {
		billRepository.save(bill);
		
	}
    //delete
	@Override
	public void deleteBill(Integer billId) {
		billRepository.deleteById(billId);
		
	}

	
}
