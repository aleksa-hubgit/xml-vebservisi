package com.example.autorska.dto;


import com.example.autorska.model.Autorska;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.xml.datatype.XMLGregorianCalendar;

@AllArgsConstructor
@NoArgsConstructor
public class AutorDTO {

    public String ime;
    public String prezime;

    public XMLGregorianCalendar godinaSmrti;


    public AutorDTO(Autorska.PodaciOAutorima.Autori.Autor autor) {
        this.ime = autor.getIme();
        this.prezime = autor.getPrezime();
        this.godinaSmrti = autor.getGodinaSmrti();
    }
}
