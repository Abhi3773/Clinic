import { HttpClient,HttpParams} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Patient } from './patient';


@Injectable({
  providedIn: 'root'
})
export class PatientService {

  formData:Patient=new Patient();
  patients:Patient[];
  
  constructor(private httpClient:HttpClient) { }

  //get all patients
  // getAllPatients(){
  //   this.httpClient.get(environment.apiUrl+"/api/patients").toPromise().then(
  //     response=>
  //     this.patients=response as Patient[]
  //   );
  // }
 url:string="http://localhost:9091/api/patients";
  getAllPatients():Observable<any>{
    return this.httpClient.get(this.url);
  }

  getListOfSelectedPatient(patientId:string):Observable<any>{
    let param1=new HttpParams().set('patientId',patientId);
    return this.httpClient.get(this.url,{params:param1});
  }

  //get particular patient
  getPatient(patientId:number):Observable<any>{
    return this.httpClient.get(environment.apiUrl+"/api/patients"+patientId);
  }

  //insert
  insertPatient(patient:Patient):Observable<any>{
    return this.httpClient.post(environment.apiUrl+"/api/patients",patient);
  }

  updatePatient(patient:Patient):Observable<any>{
    return this.httpClient.put(environment.apiUrl+"/api/patients",patient);
  }

  deletePatient(patientId){
    // const deleteEndPoint="http://localhost:9091/api/patients/"+patientId;
    // return this.httpClient.delete(deleteEndPoint);
    return this.httpClient.delete(environment.apiUrl+"/api/patients/"+patientId);
  }


}
