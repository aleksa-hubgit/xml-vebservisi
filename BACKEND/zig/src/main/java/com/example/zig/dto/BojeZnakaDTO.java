package com.example.zig.dto;

import com.example.zig.model.Prijava;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
public class BojeZnakaDTO {
    public List<String> boja;

    public BojeZnakaDTO(Prijava.InformacijeOZigu.BojeZnaka bojeZnaka) {
        this.boja = bojeZnaka.getBoja();
    }

    @Override
    public String toString() {

        String returnString = "BojeZnakaDTO{";
        for (String boja : boja) {
            returnString += boja + ", ";
        }
        return returnString;
    }
}
