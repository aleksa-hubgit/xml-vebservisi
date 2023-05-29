import { AutoriDTO } from "./AutoriDTO";
import { TLice } from "../TLice";


export class PodaciOAutorimaDTO{


    constructor(
        public autor:TLice = new TLice(),
        public autori:AutoriDTO = new AutoriDTO(),
        public anonimno:boolean = false
    ){}
}