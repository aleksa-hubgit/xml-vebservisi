package com.example.zig.dto;

import com.example.zig.model.Prijava;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class KlasnaTaksaDTO {

    public int brojKlasa;
    public double iznos;

    public KlasnaTaksaDTO(Prijava.Takse.KlasnaTaksa klasnaTaksa) {
        this.brojKlasa = klasnaTaksa.getBrojKlasa();
        this.iznos = klasnaTaksa.getIznos();
    }

    @Override
    public String toString() {
        return "KlasnaTaksaDTO{" +
                "brojKlasa=" + brojKlasa +
                ", iznos=" + iznos +
                '}';
    }
}
