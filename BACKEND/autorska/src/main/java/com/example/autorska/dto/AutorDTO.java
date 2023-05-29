package com.example.autorska.dto;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.xml.datatype.XMLGregorianCalendar;

@AllArgsConstructor
@NoArgsConstructor
public class AutorDTO {

    public String ime;
    public String prezime;

    public XMLGregorianCalendar godinaSmrti;

}
