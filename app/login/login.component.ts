import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import {User} from 'src/app/shared/user';
import{AuthService} from '../shared/auth.service'

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  //declare variable for Formgroup
  loginForm:FormGroup;

  //declare variable for submit
  isSubmitted:boolean=false;

  //declare variable for error
  error:any='';

  //create a variable for user
  loginUser:User;
  uName:string;

  //DI
  constructor(private formBuilder:FormBuilder, private authService:AuthService, private router:Router) { }

  ngOnInit(): void {

    //create Reactive Form
    //userName & password
    this.loginForm=this.formBuilder.group(
      //UserName
      //Password
      //FormControl Fields
      {
        userName: ['',[Validators.required]],
        password: ['',[Validators.required]]
      }
    );
  }

  //get control for validation
  get formControls(){
    return this.loginForm.controls;
  }

  //login verify method
  loginCredentials(){
    this.isSubmitted=true;

    //form is valid
    if(this.loginForm.valid){
      //calling method from service
      this.authService.loginVerify(this.loginForm.value).subscribe(
        data=>{
          //success data
          console.log(data);
          this.uName=data.userName;

          localStorage.setItem('userName', data.userName);
          sessionStorage.setItem('userName', data.userName);
          localStorage.setItem('ACCESS_ROLE', data.roleId.toString());

          //Form-level Role-based authentication
          //checking roleBased authorization
          if(data.roleId===3){
            //for memory storage
            this.router.navigateByUrl("/admin")
          }else if(data.roleId===2){
            this.router.navigateByUrl("/receptionist")
          }else if(data.roleId===1){
            this.router.navigateByUrl("/home")
          }else{
            this.router.navigateByUrl("/login")
            //this.error="Sorry...This role cannot access this data....";
          }
        },
        error=>{
          this.error="Invalid UserName and password";
        }
      )
    }
  }
}
