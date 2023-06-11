import { AdresaDTO } from './AdresaDTO';
import { KontaktInformacijeDTO } from './KontaktInformacijeDTO';

export class TLiceDTO {
  public kontakt: KontaktInformacijeDTO = new KontaktInformacijeDTO();
  public adresa: AdresaDTO = new AdresaDTO();
  public naziv: string = '';
  public ime: string = '';
  public prezime: string = '';
}
