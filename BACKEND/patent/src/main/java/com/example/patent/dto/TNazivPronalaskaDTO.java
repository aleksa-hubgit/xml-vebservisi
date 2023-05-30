package com.example.patent.dto;


import com.example.patent.model.TNazivPronalaska;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TNazivPronalaskaDTO {

    public String srpskiNaziv;

    public String engleskiNaziv;

    public TNazivPronalaskaDTO(TNazivPronalaska nazivPronalaska) {
        this.srpskiNaziv = nazivPronalaska.getSrpskiNaziv();
        this.engleskiNaziv = nazivPronalaska.getEngleskiNaziv();
    }

    @Override
    public String toString() {
        return "TNazivPronalaskaDTO{" +
                "srpskiNaziv='" + srpskiNaziv + '\'' +
                ", engleskiNaziv='" + engleskiNaziv + '\'' +
                '}';
    }
}
