import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Prijava } from '../model/Prijava';
import * as JsonToXML from 'js2xmlparser';

@Injectable({
  providedIn: 'root'
})
export class ZigService {
  constructor(private _http: HttpClient) {}

  url = 'http://localhost:9000/trademark/';


  sendRequest(prijava: Prijava) {
    const xml = JsonToXML.parse('prijavaZaZig', prijava);
    const url = this.url + 'createRequest';
    return this._http.post<any>(url, xml, {
      headers: new HttpHeaders({
        'Content-Type': 'application/xml',
        'Access-Control-Allow-Origin': '*',
        responseType: 'text',
      }),
    });
  }

  Print(id: Number) { const xml = JsonToXML.parse('broj', id);
  const url = this.url + 'print';
  return this._http.post<any>(url, xml, {
    headers: new HttpHeaders({
      'Content-Type': 'application/xml',
      'Access-Control-Allow-Origin': '*',
      responseType: 'text',
    }),
  });
  }
  DeclineRequest(id: Number) {
    const xml = JsonToXML.parse('broj', id);
    const url = this.url + 'declineRequest';
    return this._http.post<any>(url, xml, {
      headers: new HttpHeaders({
        'Content-Type': 'application/xml',
        'Access-Control-Allow-Origin': '*',
        responseType: 'text',
      }),
    });
  }
  AcceptRequest(id: Number) {
    const xml = JsonToXML.parse('broj', id);
    const url = this.url + 'acceptRequest';
    return this._http.post<any>(url, xml, {
      headers: new HttpHeaders({
        'Content-Type': 'application/xml',
        'Access-Control-Allow-Origin': '*',
        responseType: 'text',
      }),
    });
}

getZahtevi() {
  return this._http.get(this.url + 'getAll', {
    headers: new HttpHeaders().set('Content-Type', 'application/xml'),
    responseType: 'text',
  });
}

}
