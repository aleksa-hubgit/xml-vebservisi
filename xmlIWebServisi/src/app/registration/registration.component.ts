import { Component } from '@angular/core';
import { RegisterDTO } from '../model/loginRegister/RegisterDTO';
import { LoginRegisterService } from '../login-register.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css'],
})
export class RegistrationComponent {
  registerDto: RegisterDTO = new RegisterDTO();
  constructor(private service: LoginRegisterService) {}

  register() {}
}
