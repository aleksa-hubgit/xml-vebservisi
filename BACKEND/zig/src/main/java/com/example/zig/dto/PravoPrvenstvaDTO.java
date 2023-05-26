package com.example.zig.dto;

import com.example.zig.model.Prijava;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
public class PravoPrvenstvaDTO {

    public String zatrazenoPravo;
    public String osnov;

    public PravoPrvenstvaDTO(Prijava.PravoPrvenstva pravoPrvenstva) {
        this.zatrazenoPravo = pravoPrvenstva.getZatrazenoPravo();
        this.osnov = pravoPrvenstva.getOsnov();
    }

    @Override
    public String toString() {
        return "PravoPrvenstvaDTO{" +
                "zatrazenoPravo='" + zatrazenoPravo + '\'' +
                ", osnov='" + osnov + '\'' +
                '}';
    }
}
