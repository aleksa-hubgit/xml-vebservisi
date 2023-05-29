
import { PodaciONaslovuDTO } from "./PodaciONaslovuDTO";
import { PodaciOPreradiDTO } from "./PodaciOPreradiDTO";
import { PodaciOAutorimaDTO } from "./PodaciOAutorimaDTO";
import { TLice } from "../TLice";

export class CopyrightRequestDTO{
    constructor(
        public podnosilacPrijave:TLice = new TLice(),
        public pseudonim:String = "",
        public punomocnik:TLice = new TLice(),
        public podaciONaslovu:PodaciONaslovuDTO = new PodaciONaslovuDTO(),
        public podaciOPreradi:PodaciOPreradiDTO = new PodaciOPreradiDTO(),
        public vrstaDela:String = "",
        public podaciOAutorima:PodaciOAutorimaDTO = new PodaciOAutorimaDTO(),
        public radnomOdnosu:boolean = false,
        public namenaDela:String = "",
        public potpis:String = "",
    ){}
}