import { Specialization } from "./specialization";
import { User } from "./user";

export class Doctor {

    doctorFees:number;
    specialisationId:number;
    userName:string;

    specialisation:Specialization;
    user:User;
}
