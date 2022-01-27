import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { ReceptionistComponent } from './receptionist/receptionist.component';
import {AuthGuard} from 'src/app/shared/auth.guard'
import { DoctorComponent } from './doctors/doctor/doctor.component';
import { PatientComponent } from './patients/patient/patient.component';
import { DoctorListComponent } from './doctors/doctor-list/doctor-list.component';
import { PatientListComponent } from './patients/patient-list/patient-list.component';
import { AppoinmentListComponent } from './appoinments/appoinment-list/appoinment-list.component';
import { BillComponent } from './bills/bill/bill.component';
import { AppoinmentComponent } from './appoinments/appoinment/appoinment.component';
import { PatientsComponent } from './patients/patients.component';
import { BillListComponent } from './bills/bill-list/bill-list.component';

const routes: Routes = [
  {path:'',redirectTo:'/login',pathMatch:'full'},
  {path:'login',component:LoginComponent},
  // {path:'home',component:HomeComponent},
  // {path:'admin',component:AdminComponent},
  {path:'receptionist',component:ReceptionistComponent, canActivate:[AuthGuard], data:{role:'2'}},
   {path:'patient-list',component:PatientListComponent},
   {path:'patient',component:PatientComponent},
   {path:'doctor-list',component:DoctorListComponent},
   {path:'appoinment-list',component:AppoinmentListComponent},
   {path:'appoinment',component:AppoinmentComponent},
   {path:'bill',component:BillComponent},
   {path:'bill-list',component:BillListComponent},
   {path:'patients',component:PatientsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
