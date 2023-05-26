package com.example.zig.dto;

import com.example.zig.model.Prijava;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
public class NicanskaKlasifikacijaDTO {
    public List<Integer> klasa;

    public NicanskaKlasifikacijaDTO(Prijava.InformacijeOZigu.NicanskaKlasifikacija nicanskaKlasifikacija) {
        this.klasa = nicanskaKlasifikacija.getKlasa();
    }

    @Override
    public String toString() {

        String returnString = "NicanskaKlasifikacijaDTO{";
        for (Integer i : klasa) {
            returnString += i.toString() + ", ";
        }
        return returnString;
    }
}
