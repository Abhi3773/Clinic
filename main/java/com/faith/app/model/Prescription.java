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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="Prescriptions")
public class Prescription {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer prescriptionId;
	//private Integer medicineId;
	private String prescriptionNote;
	//private Integer doctorId;
	
	private Integer prescribedMedID;
	private Integer appoinmentId;
	
	//private Integer patientId;
	
	@OneToOne
	@JoinColumn(name = "appoinmentId",insertable = false,updatable = false)
	private Appoinment appoinment;
	
	@OneToMany(mappedBy = "prescription",cascade = CascadeType.ALL)
    private List<Medicine> medicines;
	
	@OneToOne
	@JoinColumn(name = "prescribedMedID",insertable = false,updatable = false)
	private PrescribedMedicines prescribedMedicines;
	
//	@OneToOne
//	private Bill bill;
	
//	@ManyToOne
//	@JoinColumn(name = "doctorId",insertable = false,updatable = false)
//	private Doctor doctor;
//	
//	@ManyToOne
//	@JoinColumn(name = "patientId",insertable = false,updatable = false)
//	private Patient patient;

	public Prescription() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Prescription(Integer prescriptionId, String prescriptionNote,
			List<Medicine> medicines) {
		super();
		this.prescriptionId = prescriptionId;
		//this.medicineId = medicineId;
		this.prescriptionNote = prescriptionNote;
		//this.doctorId = doctorId;
		this.medicines = medicines;
		
	}

	public Integer getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(Integer prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

//	public Integer getMedicineId() {
//		return medicineId;
//	}
//
//	public void setMedicineId(Integer medicineId) {
//		this.medicineId = medicineId;
//	}

	public String getPrescriptionNote() {
		return prescriptionNote;
	}

	public void setPrescriptionNote(String prescriptionNote) {
		this.prescriptionNote = prescriptionNote;
	}

//	public Integer getDoctorId() {
//		return doctorId;
//	}
//
//	public void setDoctorId(Integer doctorId) {
//		this.doctorId = doctorId;
//	}

	@JsonIgnore
	@JsonManagedReference
	public List<Medicine> getMedicines() {
		return medicines;
	}

	public void setMedicines(List<Medicine> medicines) {
		this.medicines = medicines;
	}

	

//	@JsonBackReference(value = "do")
//	public Doctor getDoctor() {
//		return doctor;
//	}
//
//	
//	public void setDoctor(Doctor doctor) {
//		this.doctor = doctor;
//	}
//	public Integer getPatientId() {
//		return patientId;
//	}
//
//	public void setPatientId(Integer patientId) {
//		this.patientId = patientId;
//	}
//
//	@JsonBackReference(value = "pa")
//	public Patient getPatient() {
//		return patient;
//	}
//
//	public void setPatient(Patient patient) {
//		this.patient = patient;
//	}
	

	public Integer getPrescribedMedID() {
		return prescribedMedID;
	}

	public void setPrescribedMedID(Integer prescribedMedID) {
		this.prescribedMedID = prescribedMedID;
	}

	//@JsonBackReference
	public PrescribedMedicines getPrescribedMedicines() {
		return prescribedMedicines;
	}

	public void setPrescribedMedicines(PrescribedMedicines prescribedMedicines) {
		this.prescribedMedicines = prescribedMedicines;
	}
	

	

	public Integer getAppoinmentId() {
		return appoinmentId;
	}

	public void setAppoinmentId(Integer appoinmentId) {
		this.appoinmentId = appoinmentId;
	}

	@JsonBackReference(value = "appn")
	public Appoinment getAppoinment() {
		return appoinment;
	}

	public void setAppoinment(Appoinment appoinment) {
		this.appoinment = appoinment;
	}
	
	

}
