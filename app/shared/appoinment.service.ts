import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Appoinment } from './appoinment';
import { Doctor } from './doctor';

import { Patient } from './patient';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class AppoinmentService {

  formData:Appoinment=new Appoinment();
  appoinments:Appoinment[];

  constructor(private httpClient:HttpClient) { }

  //get all
  getAllAppoinments(){
    this.httpClient.get(environment.apiUrl+"/api/appoinments").toPromise().then(
      response=>
      this.appoinments=response as Appoinment[]
    );
  }

  //get particular
  getAppoinment(appoinmentId:number):Observable<any>{
    return this.httpClient.get(environment.apiUrl+"/api/appoinments"+appoinmentId);
  }

  //insert
  insertAppoinment(appoinment:Appoinment):Observable<any>{
    return this.httpClient.post(environment.apiUrl+"/api/appoinments",appoinment);
  }

  //update
  updateAppoinment(appoinment:Appoinment):Observable<any>{
    return this.httpClient.put(environment.apiUrl+"/api/appoinments",appoinment);
  }

  //delete
  deleteAppoinment(appoinmentId:number):Observable<any>{
    return this.httpClient.delete(environment.apiUrl+"/api/appoinments"+appoinmentId);
  }

  getAppoiDropdownValues():Observable<any>{
    return this.httpClient.get<Patient[]>(environment.apiUrl+"/api/patients");
  }

  getAppoiDoctorDropdownValues():Observable<any>{
    return this.httpClient.get<Doctor[]>(environment.apiUrl+"/api/doctors");
  }

  getAppoiReceptionistDropdownValues():Observable<any>{
    return this.httpClient.get<User[]>(environment.apiUrl+"/api/users/role/2");
  }
}
