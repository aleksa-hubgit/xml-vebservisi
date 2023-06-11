import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { CopyrightRequestDTO } from 'src/app/model/a1/CopyrightRequestDTO';
import * as JsonToXML from 'js2xmlparser';
import { Decision } from 'src/app/model/Decision';

import * as Parser from 'xml-js';

@Injectable({
  providedIn: 'root',
})
export class AService {
  constructor(private _http: HttpClient) {}

  url = 'http://localhost:9001/copyright/';

  parseString(xml: string): CopyrightRequestDTO[] {
    let prijave:  CopyrightRequestDTO[] = [];
    let result:string= Parser.xml2json(xml, { compact: true });
  
    let res = JSON.parse(result);
    if (Array.isArray(res['List']['item'])){
    for (let user of res.List.item){
      let p: CopyrightRequestDTO = new CopyrightRequestDTO();
      if(user['podnosilacPrijave']['ime'] === undefined){ 
         p.podnosilacPrijave.ime = user['podnosilacPrijave']['naziv']['_text']
      }
      else{
      p.podnosilacPrijave.ime = user['podnosilacPrijave']['ime']['_text'];
      p.podnosilacPrijave.prezime = user['podnosilacPrijave']['prezime']['_text'];
      }
      p.podaciONaslovu.naslov = user['podaciONaslovu']['naslov']['_text'];
      p.vrstaDela= user['vrstaDela']['_text'];
      p.sifraZahteva = user['detaljiPrijave']['brojPrijave']['_text'];
      if(p.podnosilacPrijave.ime === ''){
        p.podnosilacPrijave.ime = user['podnosilacPrijave']['naziv']['_text']
      }
   
      prijave.push(p);
    }
  }
  else{
    let user = res['List']['item']
    let p: CopyrightRequestDTO = new CopyrightRequestDTO();
    if(user['podnosilacPrijave']['ime'] === undefined){ 
       p.podnosilacPrijave.ime = user['podnosilacPrijave']['naziv']['_text']
    }
    else{
      p.podnosilacPrijave.ime = user['podnosilacPrijave']['ime']['_text'];
      p.podnosilacPrijave.prezime = user['podnosilacPrijave']['prezime']['_text'];
      }
      p.podaciONaslovu.naslov = user['podaciONaslovu']['naslov']['_text'];
      p.vrstaDela= user['vrstaDela']['_text'];
      p.sifraZahteva = user['detaljiPrijave']['brojPrijave']['_text'];
      if(p.podnosilacPrijave.ime === ''){
        p.podnosilacPrijave.ime = user['podnosilacPrijave']['naziv']['_text']
      }

    prijave.push(p);
  }
    return prijave;
  }


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
