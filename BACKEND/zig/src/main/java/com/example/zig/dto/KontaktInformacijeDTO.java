package com.example.zig.dto;


import com.example.zig.model.TKontaktInformacije;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class KontaktInformacijeDTO {

    public String brojTelefona;
    public String brojFaksa;
    public String ePosta;

    public KontaktInformacijeDTO(TKontaktInformacije kontakt) {
        this.brojTelefona = kontakt.getBrojTelefona();
        this.brojFaksa = kontakt.getBrojFaksa();
        this.ePosta = kontakt.getEPosta();
    }

    @Override
    public String toString() {
        return "KontaktInformacijeDTO{" +
                "brojTelefona='" + brojTelefona + '\'' +
                ", brojFaksa='" + brojFaksa + '\'' +
                ", ePosta='" + ePosta + '\'' +
                '}';
    }
}
