import { Component } from '@angular/core';
import { Prijava } from 'src/app/model/Prijava';

@Component({
  selector: 'app-detail-z1',
  templateUrl: './detail-z1.component.html',
  styleUrls: ['./detail-z1.component.css']
})
export class DetailZ1Component {

  prijava:Prijava = new Prijava();

}
