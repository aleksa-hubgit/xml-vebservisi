import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Prijava } from '../model/Prijava';
import * as JsonToXML from 'js2xmlparser';
import { Decision } from '../model/Decision';

import * as Parser from 'xml-js';

@Injectable({
  providedIn: 'root',
})
export class ZigService {
  constructor(private _http: HttpClient) {}

  parseString(xml: string): Prijava[] {
    xml = `<note>
    <to>Tove</to>
    <from>Jani</from>
    <heading>Reminder</heading>
    <body>Don't forget me this weekend!</body>
    </note>`;
    const result = Parser.xml2js(xml, { compact: true });
    console.log(result);
    return [new Prijava()];
  }

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

  Print(id: Number) {
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
    let d: Decision = new Decision(id, obrazlozenje, false);
    const xml = JsonToXML.parse('decision', d);
    const url = this.url + 'handleRequest';
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
    const url = this.url + 'handleRequest';
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
