import { Injectable } from '@angular/core';
import { PatentRequestDTO } from '../model/p1/PatentRequestDTO';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import * as JsonToXML from 'js2xmlparser';
@Injectable({
  providedIn: 'root',
})
export class P1Service {
  constructor(private _http: HttpClient) {}
  url = 'http://localhost:9002/patent/';

  sendRequest(prijava: PatentRequestDTO) {
    const xml = JsonToXML.parse('patentPrijava', prijava);
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
