import { TLice } from './TLice';

export class TFizickoLice extends TLice {
    constructor(public ime: string, public prezime: string) {
        super();
    }
}
