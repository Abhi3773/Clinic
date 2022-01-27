import { Component, OnInit } from '@angular/core';
import { Appoinment } from 'src/app/shared/appoinment';
import {AppoinmentService} from 'src/app/shared/appoinment.service';

@Component({
  selector: 'app-appoinment-list',
  templateUrl: './appoinment-list.component.html',
  styleUrls: ['./appoinment-list.component.scss']
})
export class AppoinmentListComponent implements OnInit {

  constructor(public appoinmentService:AppoinmentService) { }

  ngOnInit(): void {
    this.appoinmentService.getAllAppoinments();
  }

  populateForm(appoinment:Appoinment){
    console.log(appoinment);
    this.appoinmentService.formData=Object.assign({},appoinment);
  } 

  //particular Appoinment
  getAppoinment(appoinmentId:number){
    console.log(appoinmentId);
  }
 
  updateAppoinment(appoinment:Appoinment){
    this.appoinmentService.formData=Object.assign({},appoinment);
    this.appoinmentService.updateAppoinment(appoinment);
    console.log(appoinment);
  }

  //delete
  deleteAppoinment(appoinmentId:number){
    console.log(appoinmentId);
  }

  key:string='appoinmentId';
  reverse:boolean=false;
  sort(key){
    this.key=key;
    this.reverse=!this.reverse;
  }



}
