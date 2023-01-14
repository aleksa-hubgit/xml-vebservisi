package com.projekti.xmlvs.parsers;

import com.projekti.xmlvs.patent.Prijava;
import com.projekti.xmlvs.patent.TPodnosilacPrijave;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;


public class PatentParser extends OurParser {
    @Override
    public void doJob() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance("com.projekti.xmlvs.patent", PatentParser.class.getClassLoader());
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Prijava prijava = (Prijava) unmarshaller.unmarshal(new File("C:\\Users\\Aleksa\\Desktop\\xml\\xml-vebservisi\\xmlvs\\src\\main\\java\\com\\projekti\\xmlvs\\patent\\p1.xml"));
        System.out.println(prijava);


        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(prijava,  System.out);
        doUpdate(prijava);
        marshaller.marshal(prijava,  System.out);

    }

    private void doUpdate(Prijava prijava) {
        TPodnosilacPrijave podnosilacPrijave = (TPodnosilacPrijave) prijava.getZahtev().getPodnosilacPrijave();
        podnosilacPrijave.setDrzavljanstvo("Srpsko");

        prijava.getZahtev().getPodnosilacPrijave().getAdresa().setUlica("Alekse Santica");

        prijava.getZahtev().getPodnosilacPrijave().getKontakt().setBrojTelefona("061777777");
    }
}
