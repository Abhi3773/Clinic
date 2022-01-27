import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { BillService } from 'src/app/shared/bill.service';

@Component({
  selector: 'app-bill',
  templateUrl: './bill.component.html',
  styleUrls: ['./bill.component.scss']
})
export class BillComponent implements OnInit {

  constructor(public billService :BillService) { }

  public listItems:Array<string>=[];
  public listTestItems:Array<string>=[];

  ngOnInit(): void {
    this.dropDownRefreshPrescription();
    this.dropDownRefreshTestResult();
  }

  dropDownRefreshPrescription(){
    this.billService.getPrescriptionDropdownValues().subscribe(data=>{
      
      data.forEach(element => {
        this.listItems.push(element["prescriptionId"]);
      });
    })
  }

  dropDownRefreshTestResult(){
    this.billService.getTestResultDropdownValues().subscribe(data=>{
      
      data.forEach(element => {
        this.listTestItems.push(element["testResultId"]);
      });
    })
  }

  onSubmit(form:NgForm){
    console.log(form.value);

    let addId=this.billService.formData.billId;

    if(addId==0 || addId==null){
      this.insertBill(form);
    }else{
      this.updateBill(form);
    }
  }

  //insert method
  insertBill(form?:NgForm){
    console.log("Inserting a record!!!!");
    this.billService.insertBill(form.value).subscribe(
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
  updateBill(form?:NgForm){
    console.log("Updating a record!!!!");
    this.billService.updateBill(form.value).subscribe(
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
