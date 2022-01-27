import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

//import { MatSnackBarModule } from "@angular/material/snack-bar";
//import {MatDatepickerModule} from '@angular/material/datepicker';
//import { MatNativeDateModule } from '@angular/material/core'; 

import{Ng2SearchPipeModule} from "ng2-search-filter";
import { Ng2OrderModule } from 'ng2-order-pipe';
import { NgxPaginationModule } from 'ngx-pagination';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RolesComponent } from './roles/roles.component';
import { RoleComponent } from './roles/role/role.component';
import { RoleListComponent } from './roles/role-list/role-list.component';
import { UsersComponent } from './users/users.component';
import { UserComponent } from './users/user/user.component';
import { UserListComponent } from './users/user-list/user-list.component';
import { SpecializationsComponent } from './specializations/specializations.component';
import { SpecializationComponent } from './specializations/specialization/specialization.component';
import { SpecializationListComponent } from './specializations/specialization-list/specialization-list.component';
import { DoctorsComponent } from './doctors/doctors.component';
import { DoctorComponent } from './doctors/doctor/doctor.component';
import { DoctorListComponent } from './doctors/doctor-list/doctor-list.component';
import { MedicinesComponent } from './medicines/medicines.component';
import { MedicineComponent } from './medicines/medicine/medicine.component';
import { MedicineListComponent } from './medicines/medicine-list/medicine-list.component';
import { PrescriptionsComponent } from './prescriptions/prescriptions.component';
import { PrescriptionComponent } from './prescriptions/prescription/prescription.component';
import { PrescriptionListComponent } from './prescriptions/prescription-list/prescription-list.component';
import { PrescribedMedicinesComponent } from './prescribed-medicines/prescribed-medicines.component';
import { PrescribedMedicineComponent } from './prescribedMedicines/prescribed-medicine/prescribed-medicine.component';
import { PrescribedMedicineListComponent } from './prescribedMedicines/prescribed-medicine-list/prescribed-medicine-list.component';
import { AppoinmentsComponent } from './appoinments/appoinments.component';
import { AppoinmentComponent } from './appoinments/appoinment/appoinment.component';
import { AppoinmentListComponent } from './appoinments/appoinment-list/appoinment-list.component';
import { TestsComponent } from './tests/tests.component';
import { TestComponent } from './tests/test/test.component';
import { TestListComponent } from './tests/test-list/test-list.component';
import { TestResultsComponent } from './test-results/test-results.component';
import { TestResultComponent } from './test-results/test-result/test-result.component';
import { TestResultListComponent } from './test-results/test-result-list/test-result-list.component';
import { PatientsComponent } from './patients/patients.component';
import { PatientComponent } from './patients/patient/patient.component';
import { PatientListComponent } from './patients/patient-list/patient-list.component';
import { BillsComponent } from './bills/bills.component';
import { BillComponent } from './bills/bill/bill.component';
import { BillListComponent } from './bills/bill-list/bill-list.component';

import { ReceptionistComponent } from './receptionist/receptionist.component';
import { LoginComponent } from './login/login.component';
import { PatientService } from './shared/patient.service';


@NgModule({
  declarations: [
    AppComponent,
    RolesComponent,
    RoleComponent,
    RoleListComponent,
    UsersComponent,
    UserComponent,
    UserListComponent,
    SpecializationsComponent,
    SpecializationComponent,
    SpecializationListComponent,
    DoctorsComponent,
    DoctorComponent,
    DoctorListComponent,
    MedicinesComponent,
    MedicineComponent,
    MedicineListComponent,
    PrescriptionsComponent,
    PrescriptionComponent,
    PrescriptionListComponent,
    PrescribedMedicinesComponent,
    PrescribedMedicineComponent,
    PrescribedMedicineListComponent,
    AppoinmentsComponent,
    AppoinmentComponent,
    AppoinmentListComponent,
    TestsComponent,
    TestComponent,
    TestListComponent,
    TestResultsComponent,
    TestResultComponent,
    TestResultListComponent,
    PatientsComponent,
    PatientComponent,
    PatientListComponent,
    BillsComponent,
    BillComponent,
    BillListComponent,
    
    ReceptionistComponent,
    
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,ReactiveFormsModule,
    Ng2SearchPipeModule,Ng2OrderModule,NgxPaginationModule
    //MatSnackBarModule,MatDatepickerModule,MatNativeDateModule
  ],
  providers: [PatientService],
  bootstrap: [AppComponent]
})
export class AppModule { }
