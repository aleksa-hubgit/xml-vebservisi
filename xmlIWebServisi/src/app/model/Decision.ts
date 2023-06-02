export class Decision {

    constructor(
        public  datumRazresenja: Date = new Date(),
        public  sifraZahteva:string = '',
        public obrazlozenje:string = '',
        public  odobren: boolean = false,

    ){}
    }