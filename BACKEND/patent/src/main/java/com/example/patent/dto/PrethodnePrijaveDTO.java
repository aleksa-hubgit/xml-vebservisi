package com.example.patent.dto;


import com.example.patent.model.TDetaljiPrijaveOznaka;
import com.example.patent.model.TZahtev;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class PrethodnePrijaveDTO {

    public List<TDetaljiPrijaveOznakaDTO> detaljiPrijaveOznaka;

    public PrethodnePrijaveDTO(TZahtev.PrethodnePrijave prethodnePrijave) {
        for (TDetaljiPrijaveOznaka detaljiPrijaveOznaka : prethodnePrijave.getPrethodnaPrijava()) {
            this.detaljiPrijaveOznaka.add(new TDetaljiPrijaveOznakaDTO(detaljiPrijaveOznaka));
        }
    }

    @Override
    public String toString() {
        return "PrethodnePrijaveDTO{" +
                "detaljiPrijaveOznaka=" + detaljiPrijaveOznaka +
                '}';
    }
}
