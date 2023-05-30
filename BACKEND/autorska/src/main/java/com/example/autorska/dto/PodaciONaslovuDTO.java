package com.example.autorska.dto;


import com.example.autorska.model.Autorska;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PodaciONaslovuDTO {

    public String naslov;
    public String alternativniNaslov;

    public PodaciONaslovuDTO(Autorska.PodaciONaslovu podaciONaslovu) {
        this.naslov = podaciONaslovu.getNaslov();
        this.alternativniNaslov = podaciONaslovu.getAlternativniNaslov();
    }

    @Override
    public String toString() {
        return "PodaciONaslovuDTO{" +
                "naslov='" + naslov + '\'' +
                ", alternativniNaslov='" + alternativniNaslov + '\'' +
                '}';
    }
}
