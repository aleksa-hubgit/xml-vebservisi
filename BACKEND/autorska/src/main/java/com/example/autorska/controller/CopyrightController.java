package com.example.autorska.controller;

import com.example.autorska.dto.CopyrightRequestDTO;
import com.example.autorska.service.CopyrightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xmldb.api.base.XMLDBException;

import javax.xml.bind.JAXBException;

@RestController
@RequestMapping(path="copyright")
public class CopyrightController {

    @Autowired
    private CopyrightService copyrightService;


    @PostMapping(produces = "application/xml", consumes = "application/xml")
    public void createRequest(@RequestBody CopyrightRequestDTO request) throws JAXBException, XMLDBException {

        copyrightService.createRequest(request);

    }

}
