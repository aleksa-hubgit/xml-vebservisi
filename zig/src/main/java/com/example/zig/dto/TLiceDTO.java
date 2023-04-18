package com.example.zig.dto;

import com.example.zig.model.TAdresa;
import com.example.zig.model.TKontaktInformacije;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TLiceDTO {

    private TKontaktInformacije kontakt;
    private TAdresa adresa;
    private String naziv;
    private String ime;
    private String prezime;


}
