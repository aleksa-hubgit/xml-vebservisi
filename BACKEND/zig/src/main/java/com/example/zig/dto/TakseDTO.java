package com.example.zig.dto;

import com.example.zig.model.Prijava;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class TakseDTO {
    public double osnovnaTaksa;
    public KlasnaTaksaDTO klasnaTaksa;
    public Double taksaZaGrafickoResenje;
    public double ukupnaTaksa;

    public TakseDTO(Prijava.Takse takse) {
        this.osnovnaTaksa = takse.getOsnovnaTaksa();
        this.klasnaTaksa = new KlasnaTaksaDTO(takse.getKlasnaTaksa());
        this.taksaZaGrafickoResenje = takse.getTaksaZaGrafickoResenje();
        this.ukupnaTaksa = takse.getUkupnaTaksa();
    }

    @Override
    public String toString() {
        return "TakseDTO{" +
                "osnovnaTaksa=" + osnovnaTaksa +
                ", klasnaTaksa=" + klasnaTaksa +
                ", taksaZaGrafickoResenje=" + taksaZaGrafickoResenje +
                ", ukupnaTaksa=" + ukupnaTaksa +
                '}';
    }
}
