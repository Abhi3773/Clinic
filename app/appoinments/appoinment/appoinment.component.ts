import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AppoinmentService } from 'src/app/shared/appoinment.service';
//import {MatSnackBar} from '@angular/material';

@Component({
  selector: 'app-appoinment',
  templateUrl: './appoinment.component.html',
  styleUrls: ['./appoinment.component.scss']
})
export class AppoinmentComponent implements OnInit {

  constructor(public appoinmentService:AppoinmentService) { }

  public listItems:Array<string>=[];
  public listDocItems:Array<string>=[];
  public listRecepItems:Array<string>=[];

  ngOnInit(): void {
    this.dropDownRefresh();
    this.dropDownRefreshDoct();
    this.dropDownRefreshRecep();
  } 

  dropDownRefresh(){
    this.appoinmentService.getAppoiDropdownValues().subscribe(data=>{
      
      data.forEach(element => {
        this.listItems.push(element["patientId"]);
      });
    })
  }

  dropDownRefreshDoct(){
    this.appoinmentService.getAppoiDoctorDropdownValues().subscribe(data=>{
      
      data.forEach(element => {
        this.listDocItems.push(element["doctorId"]);
      });
    })
  }

  dropDownRefreshRecep(){
    this.appoinmentService.getAppoiReceptionistDropdownValues().subscribe(data=>{
      
      data.forEach(element => {
        this.listRecepItems.push(element["userId"]);
      });
    })
  }
  
  onSubmit(form:NgForm){
    console.log(form.value);

    let addId=this.appoinmentService.formData.appoinmentId;

    if(addId==0 || addId==null){
      this.insertAppoinment(form);
    }else{
      this.updateAppoinment(form);
    }
  }

  //insert method
  insertAppoinment(form?:NgForm){
    console.log("Inserting a record!!!!");
    this.appoinmentService.insertAppoinment(form.value).subscribe(
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
  updateAppoinment(form?:NgForm){
    console.log("Updating a record!!!!");
    this.appoinmentService.updateAppoinment(form.value).subscribe(
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


