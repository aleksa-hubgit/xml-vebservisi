package com.example.patent.dto;


import com.example.patent.model.TZahtev;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class NacinDostavljanjaDTO {
    public boolean elektronsko;
    public boolean papirno;

    public NacinDostavljanjaDTO(TZahtev.NacinDostavljanja nacin){
        this.elektronsko = nacin.isElektronsko();
        this.papirno = nacin.isPapirno();
    }


    @Override
    public String toString() {
        return "NacinDostavljanjaDTO{" +
                "elektronsko=" + elektronsko +
                ", papirno=" + papirno +
                '}';
    }
}
