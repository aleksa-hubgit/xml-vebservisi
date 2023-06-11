import { Component } from '@angular/core';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css'],
})
export class RegistrationComponent {
  name: string;
  surname: string;
  email: string;
  password: string;
  constructor() {
    this.name = '';
    this.surname = '';
    this.email = '';
    this.password = '';
  }

  register() {
    // You can add your registration logic here
    console.log(
      `Name: ${this.name}, Surname: ${this.surname}, Email: ${this.email}, Password: ${this.password}`
    );
  }
}
