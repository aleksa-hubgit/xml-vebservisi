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
    let prijave:  Prijava[] = [];
    let result:string= Parser.xml2json(xml, { compact: true });
  
    let res = JSON.parse(result);
    for (let user of res.List.item){
      let p: Prijava = new Prijava();
      if(user['podnosilacPrijave']['ime'] === undefined){ 
         p.podnosilacPrijave.ime = user['podnosilacPrijave']['naziv']['_text']
      }
      else{
      p.podnosilacPrijave.ime = user['podnosilacPrijave']['ime']['_text'];
      p.podnosilacPrijave.prezime = user['podnosilacPrijave']['prezime']['_text'];
      }
      p.informacijeOZigu.tipZiga = user['informacijeOZigu']['tipZiga']['_text'];
      p.informacijeOZigu.opisZnaka= user['informacijeOZigu']['opisZnaka']['_text'];
      p.sifraZahteva = user['informacijaZavoda']['brojPrijave']['_text'];
      if(p.podnosilacPrijave.ime === ''){
        p.podnosilacPrijave.ime = user['podnosilacPrijave']['naziv']['_text']
      }
      prijave.push(p);
    }
    
    return prijave;
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
    return this._http.get(this.url + 'getAllUnanswered', {
      headers: new HttpHeaders().set('Content-Type', 'application/xml'),
      responseType: 'text',
    });
  }
}

