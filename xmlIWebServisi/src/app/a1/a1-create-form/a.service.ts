import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { CopyrightRequestDTO } from 'src/app/model/a1/CopyrightRequestDTO';
import * as JsonToXML from 'js2xmlparser';

@Injectable({
  providedIn: 'root'
})
export class AService {
  constructor(private _http: HttpClient) {}

  url = 'http://localhost:9001/copyright/';


  sendRequest(prijava: CopyrightRequestDTO) {
    const xml = JsonToXML.parse('prijavaZaAutorskaPrava', prijava);
    const url = this.url + 'createRequest';
    return this._http.post<any>(url, xml, {
      headers: new HttpHeaders({
        'Content-Type': 'application/xml',
        'Access-Control-Allow-Origin': '*',
        responseType: 'text',
      }),
    });
  }
}