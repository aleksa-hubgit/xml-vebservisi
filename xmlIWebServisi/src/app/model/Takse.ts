import { KlasnaTaksa } from "./KlasnaTaksa";

export class Takse{
    constructor(
        public osnovnaTaksa:number=0,
        public taksaZaGrafickoResenje:number=0,
        public ukupnaTaksa:number = 0,
        public klasnaTaksa:KlasnaTaksa = new KlasnaTaksa()
    ){}

}