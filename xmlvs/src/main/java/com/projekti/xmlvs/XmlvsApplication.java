package com.projekti.xmlvs;

import com.projekti.xmlvs.z1.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.bind.JAXBException;

@SpringBootApplication
public class XmlvsApplication {

	public static void main(String[] args) throws JAXBException {
		Test test = new Test();

		test.doMarshalingAndUnmarshalind();
	}

}
