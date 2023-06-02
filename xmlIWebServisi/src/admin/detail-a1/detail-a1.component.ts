import { Component } from '@angular/core';
import { Prijava } from 'src/app/model/Prijava';
import { CopyrightRequestDTO } from 'src/app/model/a1/CopyrightRequestDTO';

@Component({
  selector: 'app-detail-a1',
  templateUrl: './detail-a1.component.html',
  styleUrls: ['./detail-a1.component.css']
})
export class DetailA1Component {

  prijava:CopyrightRequestDTO = new CopyrightRequestDTO();

}
