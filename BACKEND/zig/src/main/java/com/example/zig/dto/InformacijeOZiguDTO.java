package com.example.zig.dto;


import com.example.zig.model.Prijava;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;


@AllArgsConstructor
@NoArgsConstructor
public class InformacijeOZiguDTO {

    public String tipZiga;
    public String tipZnaka;
    public String izgledZnaka;
    public ArrayList<String> bojeZnaka;
    public String transliteracijaZnaka;
    public String prevodZnaka;
    public String opisZnaka;
    public ArrayList<Integer> nicanskaKlasifikacija;

    public InformacijeOZiguDTO(Prijava.InformacijeOZigu informacijeOZigu) {

            this.tipZiga = String.valueOf(informacijeOZigu.getTipZiga());
            this.tipZnaka = String.valueOf(informacijeOZigu.getTipZnaka());
            this.izgledZnaka = informacijeOZigu.getIzgledZnaka();

            this.bojeZnaka = new ArrayList<>();

            for (String boja:informacijeOZigu.getBojeZnaka().getBoja()){
                this.bojeZnaka.add(boja);
            }

            this.transliteracijaZnaka = informacijeOZigu.getTransliteracijaZnaka();
            this.prevodZnaka = informacijeOZigu.getPrevodZnaka();
            this.opisZnaka = informacijeOZigu.getOpisZnaka();


            this.nicanskaKlasifikacija = new ArrayList<>();
            for (Integer i:informacijeOZigu.getNicanskaKlasifikacija().getKlasa()){
                this.nicanskaKlasifikacija.add(i);
            }
    }

    @Override
    public String toString() {
        return "InformacijeOZiguDTO{" +
                "tipZiga=" + tipZiga +
                ", tipZnaka=" + tipZnaka +
                ", izgledZnaka='" + izgledZnaka + '\'' +
                ", bojeZnaka=" + bojeZnaka +
                ", transliteracijaZnaka='" + transliteracijaZnaka + '\'' +
                ", prevodZnaka='" + prevodZnaka + '\'' +
                ", opisZnaka='" + opisZnaka + '\'' +
                ", nicanskaKlasifikacija=" + nicanskaKlasifikacija +
                '}';
    }
}
