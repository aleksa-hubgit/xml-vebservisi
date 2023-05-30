package com.example.patent.dto;


import com.example.patent.model.TKontaktInformacije;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class KontaktInformacijeDTO {

    public String brojTelefona;
    public String ePosta;
    public String brojFaksa;

    public KontaktInformacijeDTO(TKontaktInformacije kontakt) {
        this.brojTelefona = kontakt.getBrojTelefona();
        this.ePosta = kontakt.getEPosta();
        this.brojFaksa = kontakt.getBrojFaksa();
    }

    @Override
    public String toString() {
        return "KontaktInformacijeDTO{" +
                "brojTelefona='" + brojTelefona + '\'' +
                ", ePosta='" + ePosta + '\'' +
                ", brojFaksa='" + brojFaksa + '\'' +
                '}';
    }
}
