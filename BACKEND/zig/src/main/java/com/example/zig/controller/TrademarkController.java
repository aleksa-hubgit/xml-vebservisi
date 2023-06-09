package com.example.zig.controller;


import com.example.zig.dto.DecisionDTO;
import com.example.zig.dto.TrademarkRequestDTO;
import com.example.zig.model.Prijava;
import com.example.zig.service.TrademarkService;
import com.itextpdf.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.xmldb.api.base.XMLDBException;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="trademark")
public class TrademarkController {

    @Autowired
    private TrademarkService trademarkService;


    @PostMapping(value ="createRequest", consumes = MediaType.APPLICATION_XML_VALUE)
    public void createRequest(@RequestBody TrademarkRequestDTO request) throws JAXBException, XMLDBException {

        System.out.println(request);
        trademarkService.createRequest(request);

    }

    @PostMapping(value ="handleRequest", consumes = "application/xml")
    public void handleRequest(@RequestBody DecisionDTO decisionDTO) throws DatatypeConfigurationException, JAXBException, XMLDBException {
        System.out.println(decisionDTO);
        trademarkService.createDecision(decisionDTO);

    }

    @GetMapping(value="getAll", produces= "application/xml")
    public ResponseEntity<List<Prijava>> getAll(){
        List<Prijava> trademarks = trademarkService.getAll();


        return new ResponseEntity<>(trademarks, HttpStatus.OK);

    }

    @GetMapping(value="getAllApproved", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<List<TrademarkRequestDTO>> getAllApproved(){
        List<Prijava> trademarks = trademarkService.getAllApproved();
        List<TrademarkRequestDTO> trademarksDTOs= new ArrayList<>();
        for (Prijava prijava:trademarks){
            trademarksDTOs.add(new TrademarkRequestDTO(prijava));
        }
        return new ResponseEntity<>(trademarksDTOs, HttpStatus.OK);
    }

    @GetMapping(value="getAllUnanswered", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<List<TrademarkRequestDTO>> getAllUnanswered(){
        List<Prijava> trademarks = trademarkService.getAllUnanswered();
        List<TrademarkRequestDTO> trademarksDTOs= new ArrayList<>();
        for (Prijava prijava:trademarks){
            trademarksDTOs.add(new TrademarkRequestDTO(prijava));
        }

        return new ResponseEntity<>(trademarksDTOs, HttpStatus.OK);
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
