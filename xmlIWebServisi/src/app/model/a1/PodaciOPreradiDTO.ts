
import { AutorDTO } from "./AutorDTO";

export class PodaciOPreradiDTO{


    constructor(
        public naslov:String = "",
        public autor:AutorDTO = new AutorDTO(),
    ){


    }
}