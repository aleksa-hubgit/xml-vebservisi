package com.projekti.xmlvs.parsers;

import jakarta.xml.bind.JAXBException;
public abstract class OurParser {
    private String filePath;
    public abstract void doJob() throws JAXBException;
}
