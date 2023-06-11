import { AdresaDTO } from './AdresaDTO';
import { NacinDostavljanjaDTO } from './NacinDostavljanjaDTO';
import { PrethodnePrijaveDTO } from './PrethodnePrijaveDTO';
import { TDetaljiPrijaveDTO } from './TDetaljiPrijaveDTO';
import { TLiceDTO } from './TLiceDTO';
import { TNazivPronalaskaDTO } from './TNazivPronalaskaDTO';

export class PatentRequestDTO {
  public potpis: string = '';
  public nazivPronalaska: TNazivPronalaskaDTO = new TNazivPronalaskaDTO();
  public podnosilacPrijave: TLiceDTO = new TLiceDTO();
  public pronalazac: TLiceDTO = new TLiceDTO();
  public punomocnik: TLiceDTO = new TLiceDTO();
  public adresaZaDostavljanje: AdresaDTO = new AdresaDTO();
  public nacinDostavljanja: NacinDostavljanjaDTO = new NacinDostavljanjaDTO();
  public tipPrijave: string = '';
  public prvobitnaPrijava: TDetaljiPrijaveDTO = new TDetaljiPrijaveDTO();
  public prethodnePrijave: PrethodnePrijaveDTO = new PrethodnePrijaveDTO();
  public dodatniPodaci: boolean = false;
}
