package com.example.zig.dto;

import com.example.zig.model.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TLiceDTO {

    private TKontaktInformacije kontakt;
    private TAdresa adresa;
    private String naziv;
    private String ime;
    private String prezime;


    public TLiceDTO(TLice podnosilacPrijave) {
        if (podnosilacPrijave.getClass().getName().equals("TFizickoLice")){
            this.ime = ((TFizickoLice)podnosilacPrijave).getIme();
            this.prezime = ((TFizickoLice)podnosilacPrijave).getPrezime();
        }
        else{
            this.naziv = ((TPravnoLice) podnosilacPrijave).getNaziv();
        }
        this.adresa = podnosilacPrijave.getAdresa();
        this.kontakt = podnosilacPrijave.getKontakt();


    }
}
