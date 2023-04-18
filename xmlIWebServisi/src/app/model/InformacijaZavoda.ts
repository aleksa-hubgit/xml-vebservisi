class InformacijaZavoda{

    constructor(
        public brojPrijave:string='',
        public datumPodnosenja:Date= new Date(),
        public prilozi:TPrilozi = new TPrilozi()
    ){}
}