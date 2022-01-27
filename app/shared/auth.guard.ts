import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree,Router } from '@angular/router';
import { Observable } from 'rxjs';
import { AuthService } from './auth.service';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {
  //consrtuctor
  constructor(private authService:AuthService,
    public router:Router){

  }

  //home / admin / manager etc
  // true --- will display the 
  //false --- will be blocked
  canActivate(
    route: ActivatedRouteSnapshot):  boolean {

      //checking URL http://localhost:4200/manager
      const expectedRole=route.data.role;  //coming from app.aouting.module

      const currentRole=localStorage.getItem("ACCESS_ROLE");

      if(currentRole!=expectedRole){
        this.router.navigateByUrl('login');
      }

    return true;
  }
  
}