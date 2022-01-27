import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { environment } from 'src/environments/environment';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  constructor(private httpClient:HttpClient,
    private router:Router ) { }

//Verify Login
public loginVerify(user:User){
console.log(user.userName);
console.log(user.password);

//calling web service and passing username and password
return this.httpClient.get<User>(environment.apiUrl+"/api/users/namepassword/"+user.userName + "&" + user.password);

}

//LogOut
public logOut(){
sessionStorage.removeItem('userName');
localStorage.removeItem('userName');
localStorage.removeItem('ACCESS_ROLE');
}

}
