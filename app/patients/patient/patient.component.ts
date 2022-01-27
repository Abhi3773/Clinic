import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { PatientService } from 'src/app/shared/patient.service';

@Component({
  selector: 'app-patient',
  templateUrl: './patient.component.html',
  styleUrls: ['./patient.component.scss']
})
export class PatientComponent implements OnInit {

  constructor(public patientService:PatientService) { }

  ngOnInit(): void {
  }

  onSubmit(form:NgForm){
    console.log(form.value);

    let addId=this.patientService.formData.patientId;

    if(addId==0 || addId==null){
      this.insertPatient(form);
    }else{
      this.updatePatient(form);
    }
  }

  //insert method
  insertPatient(form?:NgForm){
    console.log("Inserting a record!!!!");
    this.patientService.insertPatient(form.value).subscribe(
      (result)=>{
        console.log(result);
        alert("Succesfully Inserted Record");
        window.location.reload();
      },
      (error)=>{

      }
    );
  
  }

  //update
  updatePatient(form?:NgForm){
    console.log("Updating a record!!!!");
    this.patientService.updatePatient(form.value).subscribe(
      (result)=>{
        console.log(result);
        alert("Succesfully Updated Record");
        window.location.reload();
      },
      (error)=>{

      }
    );
  }

}
