import { Component, OnInit } from '@angular/core';
import { Patient } from '../shared/patient';
import { PatientService } from '../shared/patient.service';

@Component({
  selector: 'app-patients',
  templateUrl: './patients.component.html',
  styleUrls: ['./patients.component.scss']
})
export class PatientsComponent implements OnInit {

  fPatients:Patient[];
  patientSelected:Number;
  listPatients:Patient[];

  constructor(public patientService :PatientService) { }

  ngOnInit(): void {
    // this.patientService.getAllPatients().subscribe(data=>{
    //   this.fPatients=data;
    // })
  } 

  onpatientSelected(patientId:any):void{
    this.patientService.getListOfSelectedPatient(patientId).subscribe(data=>{
      this.listPatients=data;
    })
  }

  populateForm(pat:Patient){
    console.log(pat);
    this.patientService.formData=Object.assign({},pat);
  } 

  //particular patient
  getPatient(patientId:number){
    this.patientService.getPatient(patientId);
    console.log(patientId);
  }

  //update
  // updatePatient(patientId:number){
  //   console.log(patientId);
  // }
 
  updatePatient(pat:Patient){
    this.patientService.formData=Object.assign({},pat);
    this.patientService.updatePatient(pat);
    console.log(pat);
  }

  //delete
  deletePatient(patientId:number){
    this.patientService.deletePatient(patientId);
    console.log(patientId);
  }

}
