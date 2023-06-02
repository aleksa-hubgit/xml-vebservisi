import { Component } from '@angular/core';
import { AService } from 'src/app/a1/a1-create-form/a.service';
import { Location } from '@angular/common';


export interface TableData {
  ime: string;
  prezime: string;
  tip_ziga: string;
  opis_znaka: string;
  sifraZahteva:string;
}

@Component({
  selector: 'app-view-all-z1-requests',
  templateUrl: './view-all-z1-requests.component.html',
  styleUrls: ['./view-all-z1-requests.component.css']
})


export class ViewAllZ1RequestsComponent {

  constructor(private service : AService,private location: Location) {}
  
  tableData: TableData[] = [
    { ime: 'John', prezime: 'Doe', tip_ziga: 'Work 1', opis_znaka: 'Type A', sifraZahteva:"1" },
    { ime: 'Jane', prezime: 'Smith', tip_ziga: 'Work 2', opis_znaka: 'Type B' , sifraZahteva: "2"},
    // Add more data as needed
  ];

  displayedColumns: string[] = ['ime', 'prezime', 'tip_ziga', 'opis_znaka', 'detalji','prihvati' ,'odbi', 'preuzmi'];
  
  public viewDetails(a:string){
    alert(a)
  }

  
  public Accept(id : string){

    this.service.AcceptRequest(id,"").subscribe();
    this.Refresh();
  }

  public Decline(id : string){
    this.service.DeclineRequest(id,'').subscribe();
    this.Refresh();
  }

  
  public Print(id : string){
    this.service.Print(id).subscribe();
    this.Refresh();
    
  }
  public Refresh(): void {
    this.location.go(this.location.path());
  }
}


