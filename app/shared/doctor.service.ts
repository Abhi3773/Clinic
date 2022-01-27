import { HttpClient,HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Doctor } from './doctor';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class DoctorService {

  formData:Doctor=new Doctor();
  doctors:Doctor[];


  

  constructor(private httpClient:HttpClient) { }

  //get all
  getAllDoctors():Observable<any>{
    return this.httpClient.get(environment.apiUrl+"/api/doctors");
    // this.httpClient.get(environment.apiUrl+"/api/doctors").toPromise().then(
    //   response=>
    //   this.doctors=response as Doctor[]
    // );

  }

  getListOfSelectedDoctors(doctorId:string):Observable<any>{
    let param1=new HttpParams().set('doctorId',doctorId);
    return this.httpClient.get(environment.apiUrl+"/api/doctors",{params:param1});
  }
}
