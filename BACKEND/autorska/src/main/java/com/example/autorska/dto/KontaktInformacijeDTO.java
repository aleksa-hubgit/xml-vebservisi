package com.example.autorska.dto;


import com.example.autorska.model.TKontaktInformacije;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class KontaktInformacijeDTO {

    public String brojTelefona;
    public String ePosta;

    public KontaktInformacijeDTO(TKontaktInformacije kontakt) {
        this.brojTelefona = kontakt.getBrojTelefona();
        this.ePosta = kontakt.getEPosta();
    }

    @Override
    public String toString() {
        return "KontaktInformacijeDTO{" +
                "brojTelefona='" + brojTelefona + '\'' +
                ", ePosta='" + ePosta + '\'' +
                '}';
    }
}
