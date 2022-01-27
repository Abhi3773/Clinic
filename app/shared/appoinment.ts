import { DatePipe } from "@angular/common";
import { Doctor } from "./doctor";
import { Patient } from "./patient";
import { User } from "./user";


export class Appoinment {

    appoinmentId:number;
    patientId:number;
    doctorId:number;
    receptionistId:number;
    date:Date=new Date();
    tokenNo:number;
    status:string; 

    patient:Patient;
    doctor:Doctor;
    receptionist:User;
    
}
