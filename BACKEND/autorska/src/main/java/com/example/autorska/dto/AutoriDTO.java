package com.example.autorska.dto;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class AutoriDTO {

    public List<AutorDTO> autor;

    @Override
    public String toString() {

        String r = "";
        if (autor == null) {
            return r;
        }

        for (AutorDTO a : autor) {
            if (a == null) {
                continue;
            }
            r += a.toString() + "\n";
        }
        return r;
    }
}
