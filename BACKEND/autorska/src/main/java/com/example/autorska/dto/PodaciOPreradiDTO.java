package com.example.autorska.dto;

import com.example.autorska.model.Autorska;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PodaciOPreradiDTO {

    public String naslov;
    public AutorDTO autor;

    public PodaciOPreradiDTO(Autorska.PodaciOPreradi podaciOPreradi) {
        this.naslov = podaciOPreradi.getNaslov();
        this.autor = new AutorDTO(podaciOPreradi.getAutor());
    }

    @Override
    public String toString() {
        return "PodaciOPreradiDTO{" +
                "naslov='" + naslov + '\'' +
                ", autor=" + autor +
                '}';
    }
}
