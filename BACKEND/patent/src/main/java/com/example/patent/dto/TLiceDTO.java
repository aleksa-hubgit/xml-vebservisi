package com.example.patent.dto;


import com.example.patent.model.TFizickoLice;
import com.example.patent.model.TLice;
import com.example.patent.model.TPravnoLice;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TLiceDTO {

    private KontaktInformacijeDTO kontakt;
    private AdresaDTO adresa;
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

        this.adresa = new AdresaDTO(podnosilacPrijave.getAdresa());
        this.kontakt = new KontaktInformacijeDTO(podnosilacPrijave.getKontakt());


    }

    @Override
    public String toString() {
        return "TLiceDTO{" +
                "kontakt=" + kontakt +
                ", adresa=" + adresa +
                ", naziv='" + naziv + '\'' +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }
}
