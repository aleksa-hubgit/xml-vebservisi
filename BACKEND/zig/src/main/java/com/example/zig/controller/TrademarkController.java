package com.example.zig.controller;


import com.example.zig.dto.TrademarkRequestDTO;
import com.example.zig.model.Prijava;
import com.example.zig.service.TrademarkService;
import com.itextpdf.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.xmldb.api.base.XMLDBException;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(path="trademark")
public class TrademarkController {

    @Autowired
    private TrademarkService trademarkService;


    @PostMapping(value ="createRequest",produces = "application/xml", consumes = "application/xml")
    public void createRequest(@RequestBody TrademarkRequestDTO request) throws JAXBException, XMLDBException {

        trademarkService.createRequest(request);

    }

    @GetMapping(value="getAll", produces= MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<List<TrademarkRequestDTO>> getAll(){
        List<TrademarkRequestDTO> trademarks = trademarkService.getAll();
        return new ResponseEntity<>(trademarks, HttpStatus.OK);

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
