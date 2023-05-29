import { TAdresaDTO } from './TAdresaDTO';
import { TKontaktInformacijeDTO } from './TKontaktInformacijeDTO';
export class TPodnosilacPrijaveDTO{

    constructor(
        public adresa:TAdresaDTO = new TAdresaDTO(),
        public kontaktInformacije:TKontaktInformacijeDTO = new TKontaktInformacijeDTO(),
        public drzavljanstvo:String = "",


    ){

    }

}