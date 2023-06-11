import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { LoginDTO } from './model/loginRegister/LoginDTO';
import * as JsonToXML from 'js2xmlparser';
import { RegisterDTO } from './model/loginRegister/RegisterDTO';
@Injectable({
  providedIn: 'root',
})
export class LoginRegisterService {
  constructor(private _http: HttpClient) {}
  url = 'http://localhost:9003/auth/';

  login(prijava: LoginDTO) {
    const xml = JsonToXML.parse('login', prijava);
    const url = this.url + 'login';
    return this._http.post<any>(url, xml, {
      headers: new HttpHeaders({
        'Content-Type': 'application/xml',
        'Access-Control-Allow-Origin': '*',
        responseType: 'text',
      }),
    });
  }
  register(registration: RegisterDTO) {
    const xml = JsonToXML.parse('register', registration);
    const url = this.url + 'register';
    return this._http.post<any>(url, xml, {
      headers: new HttpHeaders({
        'Content-Type': 'application/xml',
        'Access-Control-Allow-Origin': '*',
        responseType: 'text',
      }),
    });
  }
}
