package com.example.autorska.util;

import com.example.autorska.model.Autorska;
import com.example.autorska.model.decision.Decision;
import org.w3c.dom.Node;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;

public class MarshallingUtils {
    private final JAXBContext context;

    public MarshallingUtils() throws JAXBException {
        this.context = JAXBContext.newInstance("com.example.autorska.model");
    }

    public OutputStream marshall(Autorska prijava) throws JAXBException {
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        OutputStream os = new ByteArrayOutputStream();
        marshaller.marshal(prijava, os);
        return os;
    }

    public OutputStream marshall(Decision resenje) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance("com.example.autorska.model.decision");
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        OutputStream os = new ByteArrayOutputStream();
        marshaller.marshal(resenje, os);
        return os;
    }


    public Autorska unmarshall(String filepath) throws JAXBException {
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (Autorska) unmarshaller.unmarshal(new File(filepath));
    }

    public Autorska unmarshallFromNode(Node node) throws JAXBException {
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (Autorska) unmarshaller.unmarshal(node);
    }

    public Decision unmarshallFromNodeDecision(Node contentAsDOM) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance("com.example.autorska.model.decision");
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (Decision) unmarshaller.unmarshal(contentAsDOM);
    }
}
