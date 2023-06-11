import { Component } from '@angular/core';
import { AService } from 'src/app/a1/a1-create-form/a.service';
import { Location } from '@angular/common';
import { CopyrightRequestDTO } from 'src/app/model/a1/CopyrightRequestDTO';





@Component({
  selector: 'app-view-all-a1-requests',
  templateUrl: './view-all-a1-requests.component.html',
  styleUrls: ['./view-all-a1-requests.component.css']
})


export class ViewAllA1RequestsComponent {

  constructor(private service : AService,private location: Location) {}
  tableData: CopyrightRequestDTO[] = [];

  displayedColumns: string[] = [
    'ime',
    'prezime',
    'naziv_dela',
    'vrsta_dela',
    'detalji',
    'prihvati',
    'odbi',
    'preuzmi',
  ];

  public viewDetails(a: string) {
    alert(a);
  }

  ngOnInit(): void {
    this.service.getZahtevi().subscribe({
      next: async (xml) => {
        this.tableData = this.service.parseString(xml);
        console.log(this.tableData[0].namenaDela)
      },
    });
    
  }

  public Accept(id: string) {
    this.service.AcceptRequest(id, '').subscribe();
  }

  public Decline(id: string) {
    this.service.DeclineRequest(id, '').subscribe();
    this.Refresh();
  }

  public Print(id: string) {
    this.service.Print(id).subscribe();
  }
  public Refresh(): void {
    this.location.go(this.location.path());
  }
}