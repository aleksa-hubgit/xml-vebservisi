package com.projekti.xmlvs.parsers;

import com.projekti.xmlvs.trademark.Prijava;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class TrademarkParser extends OurParser {
    @Override
    public void doJob() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance("com.projekti.xmlvs.trademark", TrademarkParser.class.getClassLoader());
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Prijava prijava = (Prijava) unmarshaller.unmarshal(new File("C:\\Users\\stefa\\Desktop\\XML Projekat\\xml-vebservisi\\xmlvs\\src\\main\\java\\com\\projekti\\xmlvs\\trademark\\z1.xml"));
        System.out.println(prijava);


        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(prijava,  System.out);
        marshaller.marshal(prijava,  System.out);
    }


}
