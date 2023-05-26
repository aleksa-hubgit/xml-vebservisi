import { TPodnosilacPrijaveDTO } from "./TPodnosilacPrijaveDTO";
import { AutoriDTO } from "./AutoriDTO";


export class PodaciOAutorimaDTO{


    constructor(
        public autor:TPodnosilacPrijaveDTO = new TPodnosilacPrijaveDTO(),
        public autori:AutoriDTO = new AutoriDTO(),
        public anonimno:boolean = false
    ){}
}