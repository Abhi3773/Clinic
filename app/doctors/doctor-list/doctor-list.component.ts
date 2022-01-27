import { Component, OnInit } from '@angular/core';
import { Doctor } from 'src/app/shared/doctor';
import {DoctorService} from 'src/app/shared/doctor.service';
import { User } from 'src/app/shared/user';

@Component({
  selector: 'app-doctor-list',
  templateUrl: './doctor-list.component.html',
  styleUrls: ['./doctor-list.component.scss']
})
export class DoctorListComponent implements OnInit {

  doctors:User[]=[];
  patientNam:string;
  p:number=1;

  constructor(public doctorService:DoctorService) { }

  ngOnInit(): void {
    this.doctorService.getAllDoctors().subscribe((response)=>{
      this.doctors=response;
    });

  }

  Search(){
    if(this.patientNam!=""){
      this.doctors=this.doctors.filter(res=>{
        return res.userName.toLocaleLowerCase().match(this.patientNam.toLocaleLowerCase());
      });
    }else if(this.patientNam ==""){
      this.ngOnInit();
    }
  
  }
}
 