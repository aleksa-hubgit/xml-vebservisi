package com.example.autorska.dto;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PodaciOAutorimaDTO {

    public TLiceDTO autor;
    public AutoriDTO autori;
    public boolean anonimno;

    @Override
    public String toString() {
        return "PodaciOAutorimaDTO{" +
                "autor=" + autor +
                ", autori=" + autori +
                ", anonimno=" + anonimno +
                '}';
    }
}
