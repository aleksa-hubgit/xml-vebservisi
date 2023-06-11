import { Component } from '@angular/core';
import { Location } from '@angular/common';
import { ZigService } from 'src/app/z1/zig.service';


import { parseString } from 'xml2js';


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

  constructor(private service : ZigService,private location: Location) {}
  
  tableData: TableData[] = [
    { ime: 'John', prezime: 'Doe', tip_ziga: 'Work 1', opis_znaka: 'Type A', sifraZahteva:"1" },
    { ime: 'Jane', prezime: 'Smith', tip_ziga: 'Work 2', opis_znaka: 'Type B' , sifraZahteva: "2"},
    // Add more data as needed
  ];

  displayedColumns: string[] = ['ime', 'prezime', 'tip_ziga', 'opis_znaka', 'detalji','prihvati' ,'odbi', 'preuzmi'];
  
  public viewDetails(a:string){
    alert(a)
  }
  
  ngOnInit(): void {
    this.service.getZahtevi().subscribe({
    next: async (xml) => {
    parseString(xml, (err, result) => {
    if (err) {
      console.error(err);
      return;
    }
  
    // Access the converted TypeScript objects
    const items: Item[] = result.item;
    console.log(items);
  });
  }});}


  
  public Accept(id : string){

    this.service.AcceptRequest(id,"").subscribe();
    this.Refresh();
  }

  public Decline(id : string){
    this.service.DeclineRequest(id,"").subscribe();
    this.Refresh();
  }

  

  public Print(id : Number){
    this.service.Print(id).subscribe();

    
  }
  public Refresh(): void {
    this.location.go(this.location.path());
  }

  
}


class Adresa {
  ulica?: string;
  broj?: string;
  postanskiBroj?: string;
  mesto?: string;
  drzava?: string;
}

class Kontakt {
  brojTelefona?: string;
  brojFaksa?: string;
  eposta?: string;
}

class PodnosilacPrijave {
  adresa?: Adresa;
  kontakt?: Kontakt;
  naziv?: string;
}

class Punomocnik {
  adresa?: Adresa;
  kontakt?: Kontakt;
  naziv?: string;
}

class ZajednickiPredstavnik {
  adresa?: Adresa;
  kontakt?: Kontakt;
  naziv?: string;
}

class InformacijeOZigu {
  tipZiga?: string;
  tipZnaka?: string;
  izgledZnaka?: string;
  bojeZnaka?: string;
  transliteracijaZnaka?: string;
  prevodZnaka?: string;
  opisZnaka?: string;
  nicanskaKlasifikacija?: string;
}

class PravoPrvenstva {
  zatrazenoPravo?: string;
  osnov?: string;
}

class KlasnaTaksa {
  brojKlasa?: number;
  iznos?: number;
}

class Takse {
  osnovnaTaksa?: number;
  klasnaTaksa?: KlasnaTaksa;
  taksaZaGrafickoResenje?: number;
  ukupnaTaksa?: number;
}

class Prilozi {
  primerakZnaka?: boolean;
  spisakRobeIUsluga?: boolean;
  punomocje?: boolean;
  naknadnoDostavljenoPunomocje?: boolean;
  generalnoPunomocje?: boolean;
  opstiAkt?: boolean;
  dokazOPravuPrvenstva?: boolean;
  dokazOUplatiTakse?: boolean;
}

class InformacijaZavoda {
  brojPrijave?: number;
  datumPodnosenja?: number;
  prilozi?: Prilozi;
}

class Item {
  podnosilacPrijave?: PodnosilacPrijave;
  punomocnik?: Punomocnik;
  zajednickiPredstavnik?: ZajednickiPredstavnik;
  informacijeOZigu?: InformacijeOZigu;
  pravoPrvenstva?: PravoPrvenstva;
  takse?: Takse;
  informacijaZavoda?: InformacijaZavoda;
}