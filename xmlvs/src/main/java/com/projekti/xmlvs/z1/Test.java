package com.projekti.xmlvs.z1;

import org.w3c.dom.DocumentType;

import javax.xml.bind.*;
import java.io.File;

public class Test {
    static final String XML_FILE_PATH = "src/main/resources/xml_files/z1.xml";

    public void doMarshalingAndUnmarshalind() throws JAXBException {


        JAXBContext context = JAXBContext.newInstance(Submission.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Submission zahtev = (Submission) unmarshaller.unmarshal(new File(XML_FILE_PATH));


        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(zahtev, System.out);



    }


}
