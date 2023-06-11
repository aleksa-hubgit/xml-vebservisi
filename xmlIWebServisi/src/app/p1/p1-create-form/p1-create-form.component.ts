import { Component } from '@angular/core';
import { PatentRequestDTO } from 'src/app/model/p1/PatentRequestDTO';
import { TDetaljiPrijaveOznakaDTO } from 'src/app/model/p1/TDetaljiPrijaveOznakaDTO';
import { TLiceDTO } from 'src/app/model/p1/TLiceDTO';

@Component({
  selector: 'app-p1-create-form',
  templateUrl: './p1-create-form.component.html',
  styleUrls: ['./p1-create-form.component.css'],
})
export class P1CreateFormComponent {
  patentRequest: PatentRequestDTO = new PatentRequestDTO();
  podnosilacPronalazac: boolean = false;
  punomocnikZaZastupanje: boolean = false;
  punomocnikZaPrijem: boolean = false;
  zajednickiPredstavnik: boolean = false;

  constructor() {
    this.patentRequest.prethodnePrijave.detaljiPrijaveOznaka.push(
      new TDetaljiPrijaveOznakaDTO()
    );
  }
  togglePronalazac() {
    this.podnosilacPronalazac = !this.podnosilacPronalazac;
    if (this.podnosilacPronalazac) {
      this.patentRequest.pronalazac = this.patentRequest.podnosilacPrijave;
    } else {
      this.patentRequest.pronalazac = new TLiceDTO();
    }
  }
  dodajPrethodnuPrijavu() {
    this.patentRequest.prethodnePrijave.detaljiPrijaveOznaka.push(
      new TDetaljiPrijaveOznakaDTO()
    );
  }
  izbaciPrethodnuPrijavu() {
    this.patentRequest.prethodnePrijave.detaljiPrijaveOznaka.pop();
  }

  submitRequest() {
    console.log(this.patentRequest);
  }
}
