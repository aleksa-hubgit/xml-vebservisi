import { Component } from '@angular/core';
import { LoginRegisterService } from '../login-register.service';
import { LoginDTO } from '../model/loginRegister/LoginDTO';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent {
  loginDTO: LoginDTO = new LoginDTO();
  constructor(private service: LoginRegisterService) {}

  login() {
    // You can add your login logic here
    console.log(
      `Username: ${this.loginDTO.email}, Password: ${this.loginDTO.password}`
    );

    this.service.login(this.loginDTO).subscribe();
  }
}
