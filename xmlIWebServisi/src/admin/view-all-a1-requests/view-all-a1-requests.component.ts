import { Component } from '@angular/core';
import { AService } from 'src/app/a1/a1-create-form/a.service';
import { Location } from '@angular/common';



export interface TableData {
  ime: string;
  prezime: string;
  naziv_dela: string;
  vrsta_dela: string;
}

@Component({
  selector: 'app-view-all-a1-requests',
  templateUrl: './view-all-a1-requests.component.html',
  styleUrls: ['./view-all-a1-requests.component.css']
})


export class ViewAllA1RequestsComponent {

  constructor(private service : AService,private location: Location) {}
  
  tableData: TableData[] = [
    { ime: 'John', prezime: 'Doe', naziv_dela: 'Work 1', vrsta_dela: 'Type A' },
    { ime: 'Jane', prezime: 'Smith', naziv_dela: 'Work 2', vrsta_dela: 'Type B' },
    // Add more data as needed
  ];

  displayedColumns: string[] = ['ime', 'prezime', 'naziv_dela', 'vrsta_dela', 'detalji','prihvati' ,'odbi', 'preuzmi'];
  
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


