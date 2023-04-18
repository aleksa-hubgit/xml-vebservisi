import { TAdresa } from "./TAdresa";
import { TKontaktInformacije } from "./TKontaktInformacije";

export class TLice{constructor(
    public kontakt:TKontaktInformacije = new TKontaktInformacije(),
    public adresa:TAdresa = new TAdresa(),
    public naziv:string = '',
    public ime:string = '',
    public prezime:string = ''

){}}

