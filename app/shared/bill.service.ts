import { HttpClient,HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Bill } from './bill';
import { Prescription } from './prescription';
import { TestResult } from './test-result';

@Injectable({
  providedIn: 'root'
})
export class BillService {

  formData:Bill=new Bill();
  bills:Bill[];

  constructor(private httpClient:HttpClient) { }

  url:string="http://localhost:9091/api/bills";
  getAllBills():Observable<any>{
    return this.httpClient.get(this.url);
  }

  getListOfSelectedBill(billId:string):Observable<any>{
    let param1=new HttpParams().set('billId',billId);
    return this.httpClient.get(this.url,{params:param1});
  }

  //get particular Bill
  getBill(billId:number):Observable<any>{
    return this.httpClient.get(environment.apiUrl+"/api/bills"+billId);
  }

  //insert
  insertBill(billId:Bill):Observable<any>{
    return this.httpClient.post(environment.apiUrl+"/api/bills",billId);
  }

  updateBill(billId:Bill):Observable<any>{
    return this.httpClient.put(environment.apiUrl+"/api/bills",billId);
  }

  deleteBill(billId){
    // const deleteEndPoint="http://localhost:9091/api/patients/"+patientId;
    // return this.httpClient.delete(deleteEndPoint);
    return this.httpClient.delete(environment.apiUrl+"/api/bills/"+billId);
  }

  getPrescriptionDropdownValues():Observable<any>{
    return this.httpClient.get<Prescription[]>(environment.apiUrl+"/api/prescriptions");
  }

  getTestResultDropdownValues():Observable<any>{
    return this.httpClient.get<TestResult[]>(environment.apiUrl+"/api/testresults");
  }


}

