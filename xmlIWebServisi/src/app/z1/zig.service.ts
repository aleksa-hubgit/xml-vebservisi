import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Prijava } from '../model/Prijava';
import * as JsonToXML from 'js2xmlparser';

@Injectable({
  providedIn: 'root'
})
export class ZigService {
  constructor(private _http: HttpClient) {}
  url = 'http://localhost:8080/trademark/';

  sendRequest(prijava: Prijava) {
    const xml = JsonToXML.parse('prijavaZaZig', prijava);
    const saveUrl = this.url + 'createRequest';
    return this._http.post<any>(saveUrl, xml, {
      headers: new HttpHeaders({
        'Content-Type': 'application/xml',
        'Access-Control-Allow-Origin': '*',
        responseType: 'text',
      }),
    });
  }
}
