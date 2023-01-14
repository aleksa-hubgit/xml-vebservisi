package com.projekti.xmlvs.parsers;


import com.projekti.xmlvs.copyright.Autorksa;
import com.projekti.xmlvs.copyright.TPodnosilacPrijave;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class CopyrightParser extends OurParser {

    @Override
    public void doJob() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance("com.projekti.xmlvs.copyright", CopyrightParser.class.getClassLoader());
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Autorksa autorksa = (Autorksa) unmarshaller.unmarshal(new File("C:\\Users\\Aleksa\\Desktop\\xml\\xml-vebservisi\\xmlvs\\src\\main\\java\\com\\projekti\\xmlvs\\copyright\\a1.xml"));
        System.out.println(autorksa);


        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(autorksa,  System.out);
        doUpdate(autorksa);
        marshaller.marshal(autorksa,  System.out);

    }

    private void doUpdate(Autorksa autorksa) {
        TPodnosilacPrijave podnosilacPrijave = autorksa.getPodnosilacPrijave();
        podnosilacPrijave.setDrzavljanstvo("Spanac");

        autorksa.getPodnosilacPrijave().getAdresa().setUlica("Nikole Nikolica");

        autorksa.getPodnosilacPrijave().getKontakt().setBrojTelefona("061777777");
    }
}
