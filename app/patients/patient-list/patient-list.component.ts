import { Component, OnInit } from '@angular/core';
import{PatientService} from 'src/app/shared/patient.service';
import{Patient} from 'src/app/shared/patient';

@Component({
  selector: 'app-patient-list',
  templateUrl: './patient-list.component.html',
  styleUrls: ['./patient-list.component.scss']
})
export class PatientListComponent implements OnInit {

  patients:Patient[]=[];
  patientNam:string;
  p:number=1;

  constructor(public patientService :PatientService) { }

  ngOnInit(): void {
  //   this.patients=[
  //     {
  //       "patientId": 2,
  //       "patientName": "abcd",
  //       "phone": "563453",
  //       "address": "eryazs",
  //       "email": "awet",
  //       "bloodGroup": "t",
  //       "age": 4
  //   },
  //   {
  //     "patientId": 1,
  //     "patientName": "12341234",
  //     "phone": "4654645",
  //     "address": "ryery",
  //     "email": "awt1",
  //     "bloodGroup": "t",
  //     "age": 4
  // },
  // {
  //     "patientId": 4,
  //     "patientName": "Abhijith V",
  //     "phone": "7012182751",
  //     "address": "Kamukarakkal Veedu, Venkadambu",
  //     "email": "abhijithv121@gmail.com",
  //     "bloodGroup": "B+",
  //     "age": 25
  // },
  // {
  //     "patientId": 5,
  //     "patientName": "ARUN NARAYAN",
  //     "phone": "2222222222",
  //     "address": "Kamukarakkal Veedu",
  //     "email": "abhv121@gmail.com",
  //     "bloodGroup": "A+",
  //     "age": 33
  // }
  //   ];

    this.patientService.getAllPatients().subscribe((response)=>{
      this.patients=response;
    })
    
    //this.patientService.getAllPatients();
  }

  Search(){
    if(this.patientNam!=""){
      this.patients=this.patients.filter(res=>{
        return res.phone.toLocaleLowerCase().match(this.patientNam.toLocaleLowerCase());
      });
    }else if(this.patientNam ==""){
      this.ngOnInit();
    }
    
    

    // if(this.patientName==""){
    //   this.ngOnInit();
    // }else{
    //   this.patients=this.patients.filter(res=>{
    //     return res.patientName.toLocaleLowerCase().match(this.patientName.toLocaleLowerCase());
    //   });
    // }
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
    this.ngOnInit();
  }

  //delete
  deletePatient(patientId){
    if(window.confirm('Are sure you want to delete this item ?')){
    this.patientService.deletePatient(patientId).subscribe(data=>{
      console.log("deletingggg!!!");
      console.log(data);
      this.ngOnInit();
    },(err)=>{
      console.log(" not deletingggg!!!"+err);
      
    }
    );
    //console.log(patientId);
  }}

  key:string='patientId';
  reverse:boolean=false;
  sort(key){
    this.key=key;
    this.reverse=!this.reverse;
  }

}
