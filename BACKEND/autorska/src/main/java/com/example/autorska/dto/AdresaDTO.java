package com.example.autorska.dto;


import com.example.autorska.model.TAdresa;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class AdresaDTO {

    public String ulica;
    public String broj;
    public int postanskiBroj;
    public String mesto;
    public String drzava;

    public AdresaDTO(TAdresa adresa) {
        this.ulica = adresa.getUlica();
        this.broj = adresa.getBroj();
        this.postanskiBroj = adresa.getPostanskiBroj();
        this.mesto = adresa.getMesto();
        this.drzava = adresa.getDrzava();

    }

    @Override
    public String toString() {
        return "AdresaDTO{" +
                "ulica='" + ulica + '\'' +
                ", broj='" + broj + '\'' +
                ", postanskiBroj=" + postanskiBroj +
                ", mesto='" + mesto + '\'' +
                ", drzava='" + drzava + '\'' +
                '}';
    }
}
