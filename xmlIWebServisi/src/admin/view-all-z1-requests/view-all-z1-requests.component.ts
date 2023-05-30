import { Component } from '@angular/core';
import { AService } from 'src/app/a1/a1-create-form/a.service';
import { Location } from '@angular/common';


export interface TableData {
  ime: string;
  prezime: string;
  tip_ziga: string;
  opis_znaka: string;
}

@Component({
  selector: 'app-view-all-z1-requests',
  templateUrl: './view-all-z1-requests.component.html',
  styleUrls: ['./view-all-z1-requests.component.css']
})


export class ViewAllZ1RequestsComponent {

  constructor(private service : AService,private location: Location) {}
  
  tableData: TableData[] = [
    { ime: 'John', prezime: 'Doe', tip_ziga: 'Work 1', opis_znaka: 'Type A' },
    { ime: 'Jane', prezime: 'Smith', tip_ziga: 'Work 2', opis_znaka: 'Type B' },
    // Add more data as needed
  ];

  displayedColumns: string[] = ['ime', 'prezime', 'tip_ziga', 'opis_znaka', 'detalji','prihvati' ,'odbi', 'preuzmi'];
  
  public viewDetails(a:string){
    console.log(a)
  }

  
  public Accept(id : Number){
    this.service.AcceptRequest(id);
    this.Refresh();
  }

  public Decline(id : Number){
    this.service.DeclineRequest(id);
    this.Refresh();
  }

  
  public Print(id : Number){
    this.service.Print(id);
    this.Refresh();
    
  }
  public Refresh(): void {
    this.location.go(this.location.path());
  }
}


