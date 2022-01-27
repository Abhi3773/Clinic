package com.faith.app.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="bills")
public class Bill {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer billId;
	private Integer prescriptionId;
	private Integer testResultId;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate billDate;
	private double totalAmount;
	
	@OneToOne
	@JoinColumn(name="prescriptionId" ,insertable = false ,updatable = false)
	private Prescription prescription;
	
//	@OneToMany(mappedBy = "bill", cascade = CascadeType.ALL)
//	private List<Test> tests;
	
	@OneToOne
	@JoinColumn(name = "testResultId",insertable = false ,updatable = false)
	private TestResult testResult;

	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bill(Integer billId, Integer prescriptionId, LocalDate billDate, double totalAmount, Prescription prescription) {
		super();
		this.billId = billId;
		this.prescriptionId = prescriptionId;
		this.billDate = billDate;
		this.totalAmount = totalAmount;
		this.prescription = prescription;
		//this.tests = tests;
	}

	public Integer getBillId() {
		return billId;
	}

	public void setBillId(Integer billId) {
		this.billId = billId;
	}

	public Integer getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(Integer prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public LocalDate getBillDate() {
		return billDate;
	}

	public void setBillDate(LocalDate billDate) {
		this.billDate = billDate;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	//@JsonBackReference
	public Prescription getPrescription() {
		return prescription;
	}

	public void setPrescription(Prescription prescription) {
		this.prescription = prescription;
	}

//	@JsonManagedReference
//	public List<Test> getTests() {
//		return tests;
//	}
//
//	public void setTests(List<Test> tests) {
//		this.tests = tests;
//	}
	

	public Integer getTestResultId() {
		return testResultId;
	}

	public void setTestResultId(Integer testResultId) {
		this.testResultId = testResultId;
	}

	//@JsonBackReference(value = "tr")
	public TestResult getTestResult() {
		return testResult;
	}

	public void setTestResult(TestResult testResult) {
		this.testResult = testResult;
	}
	

	
	
	
	 
	
}
