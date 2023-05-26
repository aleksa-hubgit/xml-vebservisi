import { TAdresaDTO } from './TAdresaDTO';

export class TPodnosilacPrijaveDTO{

    constructor(
        public adresa:TAdresaDTO = new TAdresaDTO(),
        public kontaktInformacije:TKontaktInformacijeDTO = new TKontaktInformacijeDTO(),
        public drzavljanstvo:String = "",


    ){

    }

}