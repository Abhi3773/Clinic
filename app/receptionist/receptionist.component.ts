import { Component, OnInit } from '@angular/core';
import { AuthService } from '../shared/auth.service';import { Router } from '@angular/router';

@Component({
  selector: 'app-receptionist',
  templateUrl: './receptionist.component.html',
  styleUrls: ['./receptionist.component.scss']
})
export class ReceptionistComponent implements OnInit {

    //declare variables
    userName:string='';

    constructor(private authService:AuthService, private router:Router) { }
  
    ngOnInit(): void {
      this.userName=localStorage.getItem('userName');
    }
  
    //call logout from service
    logout(){
      this.authService.logOut();
      this.router.navigateByUrl("../login");
    }
  
  }
  