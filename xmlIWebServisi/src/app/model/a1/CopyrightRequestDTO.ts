
import { TPodnosilacPrijaveDTO } from "./TPodnosilacPrijaveDTO";
export class CopyrightRequestDTO{
    constructor(
        public podnosilacPrijave:TPodnosilacPrijaveDTO = new TPodnosilacPrijaveDTO(),
        public pseudonim:String = "",
        public punomocnik:PunomocnikDTO = new PunomocnikDTO(),
        public podaciONaslovu:PodaciONaslovuDTO = new PodaciONaslovuDTO(),
        public podaciOPreradi:PodaciOPreradiDTO = new PodaciOPreradiDTO(),
        public vrstaDela:String = "",
        public podaciOAutorima:PodaciOAutorimaDTO = new PodaciOAutorimaDTO(),
        public radnomOdnosu:boolean = false,
        public namenaDela:String = "",
        public potpis:String = "",
    ){}
}