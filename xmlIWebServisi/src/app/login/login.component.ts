import { Component } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent {
  email: string;
  password: string;
  constructor() {
    this.email = '';
    this.password = '';
  }

  login() {
    // You can add your login logic here
    console.log(`Username: ${this.email}, Password: ${this.password}`);
  }
}
