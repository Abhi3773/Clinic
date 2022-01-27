package com.faith.app.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity 
public class TestResult {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer testResultId;
	private Integer appoinmentId; 
	private  Integer testId;
	private Date testResult;
	private Date testDate;
	
	@ManyToOne
	@JoinColumn(name = "testId",insertable = false,updatable = false)
	private Test test;
	
	@OneToOne
	private Bill bill;
	
	
	public Integer getTestResultId() {
		return testResultId;
	}
	public void setTestResultId(Integer testResultId) {
		this.testResultId = testResultId;
	}
	public Integer getAppoinmentId() {
		return appoinmentId;
	}
	public void setAppoinmentId(Integer appoinmentId) {
		this.appoinmentId = appoinmentId;
	}
	public Integer getTestId() {
		return testId;
	}
	public void setTestId(Integer testId) {
		this.testId = testId;
	}
	public Date getTestResult() {
		return testResult;
	}
	public void setTestResult(Date testResult) {
		this.testResult = testResult;
	}
	public Date getTestDate() {
		return testDate;
	}
	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}
	
	//@JsonBackReference
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	
	@JsonIgnore
	@JsonBackReference(value = "fsd")
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	

}
