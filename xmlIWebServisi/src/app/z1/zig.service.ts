import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Prijava } from '../model/Prijava';
import * as JsonToXML from 'js2xmlparser';

@Injectable({
  providedIn: 'root'
})
export class ZigService {
  constructor(private _http: HttpClient) {}
  endPoint = 'http://localhost:8080/trademark/';

  sendRequest(prijava: Prijava) {
    const xml = JsonToXML.parse('prijavaZaZig', prijava);
    const url = this.endPoint + 'createRequest';
    return this._http.post<any>(url, xml, {
      headers: new HttpHeaders({
        'Content-Type': 'application/xml',
        'Access-Control-Allow-Origin': '*',
        responseType: 'text',
      }),
    });
  }
}
