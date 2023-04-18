package com.example.zig.controller;


import com.example.zig.dto.TrademarkRequestDTO;
import com.example.zig.model.Prijava;
import com.example.zig.service.TrademarkService;
import com.itextpdf.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.xmldb.api.base.XMLDBException;

import javax.xml.bind.JAXBException;
import java.io.IOException;

@RestController
@RequestMapping(path="trademark")
public class TrademarkController {

    @Autowired
    private TrademarkService trademarkService;


    @PostMapping(produces = "application/xml", consumes = "application/xml")
    public void createRequest(@RequestBody TrademarkRequestDTO request) throws JAXBException, XMLDBException {

        trademarkService.createRequest(request);

    }

    @GetMapping(value="createPDF")
    public void createPdfDocument() throws DocumentException, IOException {
        trademarkService.createPdfDocument();

    }

    @GetMapping(value = "createHTML", produces ="application/xml", consumes="application/xml")
    public ResponseEntity<String> createHtmlDocument() throws DocumentException, IOException {
        return new ResponseEntity<>(trademarkService.createHtmlDocument(), HttpStatus.OK);
    }
}
