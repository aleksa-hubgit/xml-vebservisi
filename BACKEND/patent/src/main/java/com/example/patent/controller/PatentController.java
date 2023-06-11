package com.example.patent.controller;


import com.example.patent.dto.DecisionDTO;
import com.example.patent.dto.PatentRequestDTO;
import com.example.patent.model.Prijava;
import com.example.patent.service.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.xmldb.api.base.XMLDBException;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.ArrayList;
import java.util.List;

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

    @PostMapping(value ="handleRequest", consumes = "application/xml")
    public void handleRequest(@RequestBody DecisionDTO decisionDTO) throws DatatypeConfigurationException, JAXBException, XMLDBException {
        System.out.println(decisionDTO);
        patentService.createDecision(decisionDTO);

    }

    @GetMapping(value="getAll", produces= "application/xml")
    public ResponseEntity<List<Prijava>> getAll(){
        List<Prijava> trademarks = patentService.getAll();


        return new ResponseEntity<>(trademarks, HttpStatus.OK);

    }

    @GetMapping(value="getOne/{id}", produces = "application/xml")
    public ResponseEntity<Prijava> getOneById(@PathVariable String id){
        Prijava prijava = patentService.getOneById(id);
        return new ResponseEntity<>(prijava, HttpStatus.OK);
    }

    @GetMapping(value="getAllApproved", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<List<PatentRequestDTO>> getAllApproved(){
        List<Prijava> trademarks = patentService.getAllApproved();
        List<PatentRequestDTO> trademarksDTOs= new ArrayList<>();
        for (Prijava prijava:trademarks){
            trademarksDTOs.add(new PatentRequestDTO(prijava));
        }
        return new ResponseEntity<>(trademarksDTOs, HttpStatus.OK);
    }

    @GetMapping(value="getAllUnanswered", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<List<PatentRequestDTO>> getAllUnanswered(){
        List<Prijava> trademarks = patentService.getAllUnanswered();
        List<PatentRequestDTO> trademarksDTOs= new ArrayList<>();
        for (Prijava prijava:trademarks){
            trademarksDTOs.add(new PatentRequestDTO(prijava));
        }

        return new ResponseEntity<>(trademarksDTOs, HttpStatus.OK);
    }
}
