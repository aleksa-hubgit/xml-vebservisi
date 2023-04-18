package com.example.zig.dto;


import com.example.zig.model.Prijava;
import com.example.zig.model.TPrilozi;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TrademarkRequestDTO {

    private TLiceDTO podnosilacPrijave;
    private TLiceDTO punomocnik;
    private TLiceDTO zajednickiPredstavnik;
    private Prijava.InformacijeOZigu informacijeOZigu;
    private Prijava.PravoPrvenstva pravoPrvenstva;
    private Prijava.Takse takse;
    private TPrilozi prilozi;


}
