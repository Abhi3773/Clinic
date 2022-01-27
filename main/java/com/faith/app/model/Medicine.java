package com.faith.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Medicine")
public class Medicine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer medicineId;
	private String medicineName;
	private double medicinePrice;
	
//	private Integer prescribedMedicineId;
	private Integer prescriptionId; //remove
	
	
	
//	@JoinColumn(name = "prescribedMedicineId",insertable = false,updatable = false)
	@OneToOne
	private PrescribedMedicines pMedicine;
	
	@ManyToOne
	@JoinColumn(name = "prescriptionId",insertable = false,updatable = false)
	private Prescription prescription;
	

	public Medicine() {

	}

	public Medicine(Integer medicineId, String medicineName, double medicinePrice) {
		super();
		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.medicinePrice = medicinePrice;
		
	}

	public Integer getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(Integer medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public double getMedicinePrice() {
		return medicinePrice;
	}

	public void setMedicinePrice(double medicinePrice) {
		this.medicinePrice = medicinePrice;
	}

//	public Integer getPrescribedMedicineId() {
//		return prescribedMedicineId;
//	}
//
//	public void setPrescribedMedicineId(Integer prescribedMedicineId) {
//		this.prescribedMedicineId = prescribedMedicineId;
//	}

	@JsonIgnore
	public Integer getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(Integer prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	@JsonBackReference
	public PrescribedMedicines getpMedicine() {
		return pMedicine;
	}

	public void setpMedicine(PrescribedMedicines pMedicine) {
		this.pMedicine = pMedicine;
	}

	@JsonBackReference(value = "pres")
	public Prescription getPrescription() {
		return prescription;
	}

	public void setPrescription(Prescription prescription) {
		this.prescription = prescription;
	}

	
	
	

}
