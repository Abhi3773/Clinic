package com.faith.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.core.sym.Name;

@Entity
public class PrescribedMedicines {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer prescribedMedicineId;
	private Integer medicineID;
	private double medicinePrice;
	
	@OneToOne
	@JoinColumn(name = "medicineID",insertable = false,updatable = false)
	private Medicine medicine;
	
//	@OneToMany(mappedBy = "pMedicine" ,cascade = CascadeType.ALL)
//	private List<Medicine> medicines;
	
	@OneToOne
	private Prescription prescription;

	
	
	
	

	public PrescribedMedicines() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PrescribedMedicines(Integer prescribedMedicineId, double medicinePrice) {
		super();
		this.prescribedMedicineId = prescribedMedicineId;
		
		this.medicinePrice = medicinePrice;
	}


	public Integer getPrescribedMedicineId() {
		return prescribedMedicineId;
	}


	public void setPrescribedMedicineId(Integer prescribedMedicineId) {
		this.prescribedMedicineId = prescribedMedicineId;
	}


//	public Integer getMedicineID() {
//		return medicineID;
//	}
//
//
//	public void setMedicineID(Integer medicineID) {
//		this.medicineID = medicineID;
//	}


	public double getMedicinePrice() {
		return medicinePrice;
	}


	public void setMedicinePrice(double medicinePrice) {
		this.medicinePrice = medicinePrice;
	}

//
//	@JsonIgnore
//	//@JsonManagedReference
//	public List<Medicine> getMedicine() {
//		return medicines;
//	}
//
//
//	public void setMedicine(List<Medicine> medicines) {
//		this.medicines = medicines;
//	}
//	
	public Integer getMedicineID() {
		return medicineID;
	}


	public void setMedicineID(Integer medicineID) {
		this.medicineID = medicineID;
	}

	@JsonBackReference
	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}


	
	
	
}
