package com.example.zig.dto;


import com.example.zig.model.TPrilozi;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TPriloziDTO {

    public boolean primerakZnaka;
    public boolean spisakRobeIUsluga;
    public boolean punomocje;
    public boolean naknadnoDostavljenoPunomocje;
    public boolean generalnoPunomocje;
    public boolean opstiAkt;
    public boolean dokazOPravuPrvenstva;
    public boolean dokazOUplatiTakse;

    public TPriloziDTO(TPrilozi prilozi) {
        this.primerakZnaka = prilozi.getPrimerakZnaka();
        this.spisakRobeIUsluga = prilozi.getSpisakRobeIUsluga();
        this.punomocje = prilozi.getPunomocje();
        this.naknadnoDostavljenoPunomocje = prilozi.isNaknadnoDostavljenoPunomocje();
        this.generalnoPunomocje = prilozi.getGeneralnoPunomocje();
        this.opstiAkt = prilozi.getOpstiAkt();
        this.dokazOPravuPrvenstva = prilozi.getDokazOPravuPrvenstva();
        this.dokazOUplatiTakse = prilozi.getDokazOUplatiTakse();

    }

    @Override
    public String toString() {
        return "TPriloziDTO{" +
                "primerakZnaka=" + primerakZnaka +
                ", spisakRobeIUsluga=" + spisakRobeIUsluga +
                ", punomocje=" + punomocje +
                ", naknadnoDostavljenoPunomocje=" + naknadnoDostavljenoPunomocje +
                ", generalnoPunomocje=" + generalnoPunomocje +
                ", opstiAkt=" + opstiAkt +
                ", dokazOPravuPrvenstva=" + dokazOPravuPrvenstva +
                ", dokazOUplatiTakse=" + dokazOUplatiTakse +
                '}';
    }
}
