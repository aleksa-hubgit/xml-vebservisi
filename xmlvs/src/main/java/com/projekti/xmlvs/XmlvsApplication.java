package com.projekti.xmlvs;

import com.projekti.xmlvs.parsers.CopyrightParser;
import com.projekti.xmlvs.parsers.PatentParser;
import jakarta.xml.bind.JAXBException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XmlvsApplication {

	public static void main(String[] args) throws JAXBException {

		SpringApplication.run(XmlvsApplication.class, args);

		CopyrightParser copyrightParser = new CopyrightParser();
		copyrightParser.doJob();
	}

}
