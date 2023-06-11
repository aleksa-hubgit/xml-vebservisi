import { Component } from '@angular/core';
import { TLiceDTO } from 'src/app/model/p1/TLiceDTO';
import { TNazivPronalaskaDTO } from 'src/app/model/p1/TNazivPronalaskaDTO';

@Component({
  selector: 'app-p1-create-form',
  templateUrl: './p1-create-form.component.html',
  styleUrls: ['./p1-create-form.component.css'],
})
export class P1CreateFormComponent {
  pronalazak: TNazivPronalaskaDTO = new TNazivPronalaskaDTO();
  lice: TLiceDTO = new TLiceDTO();
  pronalazac: TLiceDTO = new TLiceDTO();
  podnosilacPronalazac: boolean = false;
  togglePronalazac() {
    this.podnosilacPronalazac = !this.podnosilacPronalazac;
    if (this.podnosilacPronalazac) {
      this.pronalazac = this.lice;
    } else {
      this.pronalazac = new TLiceDTO();
    }
  }
}
