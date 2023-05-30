package com.example.patent.controller;


import com.example.patent.dto.PatentRequestDTO;
import com.example.patent.service.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xmldb.api.base.XMLDBException;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

@RestController
@RequestMapping(path="patent")
public class PatentController {

    @Autowired
    private PatentService patentService;

    @PostMapping(value = "createRequest",produces = "application/xml", consumes = "application/xml")
    public void createRequest(@RequestBody PatentRequestDTO request) throws DatatypeConfigurationException, JAXBException, XMLDBException {
        System.out.println(request);
        this.patentService.createRequest(request);

    }
}
