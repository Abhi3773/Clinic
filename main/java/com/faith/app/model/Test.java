package com.faith.app.model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="Tests")
public class Test {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer testId;
	private String testName;
	private double testPrice;
//	private Date testDate;
	
	//private Integer billId;
	
	@OneToMany(mappedBy = "test",cascade = CascadeType.ALL)
	private List<TestResult>testResults;
	
	
//	@ManyToOne
//	@JoinColumn(name = "billId",insertable = false,updatable =false)
//	private Bill bill;


	public Integer getTestId() {
		return testId;
	}


	public void setTestId(Integer testId) {
		this.testId = testId;
	}


	public String getTestName() {
		return testName;
	}


	public void setTestName(String testName) {
		this.testName = testName;
	}


	public double getTestPrice() {
		return testPrice;
	}


	public void setTestPrice(double testPrice) {
		this.testPrice = testPrice;
	}
//	public Integer getBillId() {
//		return billId;
//	}
//
//
//	public void setBillId(Integer billId) {
//		this.billId = billId;
//	}
//
//
//
//	@JsonBackReference
//	public Bill getBill() {
//		return bill;
//	}
//
//
//	public void setBill(Bill bill) {
//		this.bill = bill;
//	}
	
	@JsonIgnore
	@JsonManagedReference
	public List<TestResult> getTestResults() {
		return testResults;
	}


	public void setTestResults(List<TestResult> testResults) {
		this.testResults = testResults;
	}
	
	

}
