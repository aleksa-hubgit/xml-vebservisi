class Prijava{
    constructor(
        public podnosilacPrijave:TLice = new TLice(),
        public punomocnik:TLice = new TLice(),
        public zajednickiPredstavnik:TLice = new TLice(),
        public informacijeOZigu:InformacijeOZigu = new InformacijeOZigu(),
        public pravoPrvenstva:PravoPrvenstva = new PravoPrvenstva(),
        public takse:Takse = new Takse(),
        public prilozi:TPrilozi = new TPrilozi()

    ){}


}