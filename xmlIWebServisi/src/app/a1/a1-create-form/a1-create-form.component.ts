import { Component } from '@angular/core';
import {Prijava} from '../../model/Prijava';
import { ZigService } from 'src/app/z1/zig.service';
import { CopyrightRequestDTO } from 'src/app/model/a1/CopyrightRequestDTO';
import * as JsonToXML from 'js2xmlparser';
import { AService } from './a.service';
import { PodaciOAutorimaDTO } from 'src/app/model/a1/PodaciOAutorimaDTO';
import { AutoriDTO } from 'src/app/model/a1/AutoriDTO';
import { AutorDTO } from 'src/app/model/a1/AutorDTO';

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
    this.prijava.podaciOAutorima = new PodaciOAutorimaDTO();
    this.prijava.podaciOAutorima.autori = new AutoriDTO();
    this.prijava.podaciOAutorima.autori.autor.push(new AutorDTO("pusa","pusic"));

    this.service.sendRequest(this.prijava).subscribe();

  }

}

