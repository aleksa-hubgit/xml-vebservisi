import { Component } from '@angular/core';
import {Prijava} from '../../model/Prijava';
import { ZigService } from 'src/app/z1/zig.service';
import { CopyrightRequestDTO } from 'src/app/model/a1/CopyrightRequestDTO';
import * as JsonToXML from 'js2xmlparser';

@Component({
  selector: 'app-z1-create-form',
  templateUrl: './a1-create-form.component.html',
  styleUrls: ['./a1-create-form.component.css']
})
export class A1CreateFormComponent {
  constructor(private service : AService) {}

  prijava: CopyrightRequestDTO = new CopyrightRequestDTO();
  podnosilacLice: string = 'Fizicko lice';
  podnosiPunomocnik: boolean = false;
  podnosiAutor:boolean = true;
  prerada:boolean = false;
  ostalo:string = "";


  sendRequest(){
    if (this.prijava.vrstaDela === "OSTALO"){
      this.prijava.vrstaDela = this.ostalo;
    }
    if (this.prijava.vrstaDela === "OSTALO"){
      this.prijava.vrstaDela = this.ostalo;
    }

    this.service.sendRequest(this.prijava).subscribe();

  }

}

