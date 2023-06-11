import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { CopyrightRequestDTO } from 'src/app/model/a1/CopyrightRequestDTO';
import * as JsonToXML from 'js2xmlparser';
import { Decision } from 'src/app/model/Decision';

@Injectable({
  providedIn: 'root',
})
export class AService {
  constructor(private _http: HttpClient) {}

  url = 'http://localhost:9001/copyright/';

  sendRequest(prijava: CopyrightRequestDTO) {
    const xml = JsonToXML.parse('autorskaPrijava', prijava);
    const url = this.url + 'createRequest';
    return this._http.post<any>(url, xml, {
      headers: new HttpHeaders({
        'Content-Type': 'application/xml',
        'Access-Control-Allow-Origin': '*',
        responseType: 'text',
      }),
    });
  }

  Print(id: string) {
    const xml = JsonToXML.parse('broj', id);
    const url = this.url + 'print';
    return this._http.post<any>(url, xml, {
      headers: new HttpHeaders({
        'Content-Type': 'application/xml',
        'Access-Control-Allow-Origin': '*',
        responseType: 'text',
      }),
    });
  }
  DeclineRequest(id: string, obrazlozenje: string) {
    let d: Decision = new Decision(id, obrazlozenje, true);
    const xml = JsonToXML.parse('decision', d);
    const url = this.url + 'declineRequest';
    return this._http.post<any>(url, xml, {
      headers: new HttpHeaders({
        'Content-Type': 'application/xml',
        'Access-Control-Allow-Origin': '*',
        responseType: 'text',
      }),
    });
  }
  AcceptRequest(id: string, obrazlozenje: string) {
    let d: Decision = new Decision(id, obrazlozenje, true);
    const xml = JsonToXML.parse('decision', d);
    const url = this.url + 'acceptRequest';
    return this._http.post<any>(url, xml, {
      headers: new HttpHeaders({
        'Content-Type': 'application/xml',
        'Access-Control-Allow-Origin': '*',
        responseType: 'text',
      }),
    });
  }
}
