import { Prescription } from "./prescription";
import { TestResult } from "./test-result";
import{Test} from 'src/app/shared/test';

export class Bill {

    billId:number;
    prescriptionId:number;
    testResultId:number;
    billDate:string;
    totalAmount:number;

    prescription:Prescription;
    testResult:TestResult;
    test:Test;

  
}
