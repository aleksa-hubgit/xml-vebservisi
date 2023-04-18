import { BojeZnaka } from "./BojeZnaka";
import { NicanskaKlasifikacija } from "./NicanskaKlasifikacija";

export class InformacijeOZigu{

    constructor(
        public tipZiga:string='',
        public tipZnaka:string='',
        public izgledZnaka:string='',
        public bojeZnaka:BojeZnaka = new BojeZnaka(),
        public transliteracijaZnaka:string = '',
        public prevodZnaka:string = '',
        public opisZnaka:string = '',
        public nicanskaKlasifikacija:NicanskaKlasifikacija = new NicanskaKlasifikacija()


    ){}

}