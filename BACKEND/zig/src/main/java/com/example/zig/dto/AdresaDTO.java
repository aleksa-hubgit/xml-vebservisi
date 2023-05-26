package com.example.zig.dto;

import com.example.zig.model.TAdresa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
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
