import { Component } from '@angular/core';
import {Prijava} from '../../model/Prijava';
import { ZigService } from 'src/app/z1/zig.service';

@Component({
  selector: 'app-z1-create-form',
  templateUrl: './a1-create-form.component.html',
  styleUrls: ['./a1-create-form.component.css']
})
export class A1CreateFormComponent {
  constructor(private service : ZigService) {}

  prijava: Prijava = new Prijava();
  podnosilacLice: string = 'Fizicko lice';
  punomocnikLice: string = 'Fizicko lice';
  treceLice: string = 'Fizicko lice';
  ostalo:string = '';
  boje:string ='';
  nicanska:string =''


  sendRequest(){
    this.prijava.informacijeOZigu.nicanskaKlasifikacija.klasa = this.nicanska.split(",").map(Number);
    this.prijava.informacijeOZigu.bojeZnaka.boja = this.boje.split(",");
    if (this.ostalo !== ""){
      this.prijava.informacijeOZigu.tipZnaka = this.ostalo;
    }

    this.service.sendRequest(this.prijava).subscribe();

  }

}

