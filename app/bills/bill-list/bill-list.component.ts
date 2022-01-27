import { Component, OnInit } from '@angular/core';
import{Bill} from 'src/app/shared/bill';
import{BillService} from 'src/app/shared/bill.service';

@Component({
  selector: 'app-bill-list',
  templateUrl: './bill-list.component.html',
  styleUrls: ['./bill-list.component.scss']
})
export class BillListComponent implements OnInit {

  bills:Bill[]=[];
  billNam:string;
  p:number=1;

  constructor(public billService :BillService) { }

  ngOnInit(): void {
    this.billService.getAllBills().subscribe((response)=>{
      this.bills=response;
    })
    
    //this.patientService.getAllPatients();
  }

  Search(){
    if(this.billNam!=""){
      this.bills=this.bills.filter(res=>{
        return res.billDate.toLocaleLowerCase().match(this.billNam.toLocaleLowerCase());
      });
    }else if(this.billNam ==""){
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

  populateForm(bill:Bill){
    console.log(bill);
    this.billService.formData=Object.assign({},bill);
  } 

  //particular patient
  getBill(billId:number){
    this.billService.getBill(billId);
    console.log(billId);
  }

  //update
  // updatePatient(patientId:number){
  //   console.log(patientId);
  // }
 
  updateBill(bill:Bill){
    this.billService.formData=Object.assign({},bill);
    this.billService.updateBill(bill);
    console.log(bill);
    this.ngOnInit();
  }

  //delete
  deleteBill(billId){
    if(window.confirm('Are sure you want to delete this item ?')){
    this.billService.deleteBill(billId).subscribe(data=>{
      console.log("deletingggg!!!");
      console.log(data);
      this.ngOnInit();
    },(err)=>{
      console.log(" not deletingggg!!!"+err);
      
    }
    );
    //console.log(patientId);
  }}

  key:string='billId';
  reverse:boolean=false;
  sort(key){
    this.key=key;
    this.reverse=!this.reverse;
  }

}
