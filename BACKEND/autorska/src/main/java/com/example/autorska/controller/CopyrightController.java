package com.example.autorska.controller;

import com.example.autorska.dto.CopyrightRequestDTO;
import com.example.autorska.dto.DecisionDTO;
import com.example.autorska.dto.ReportDTO;
import com.example.autorska.model.Autorska;
import com.example.autorska.service.CopyrightService;
import com.itextpdf.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.xmldb.api.base.XMLDBException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="copyright")
public class CopyrightController {

    @Autowired
    private CopyrightService copyrightService;


    @PostMapping(value = "createRequest",produces = "application/xml", consumes = "application/xml")
    public void createRequest(@RequestBody CopyrightRequestDTO request) throws JAXBException, XMLDBException, DatatypeConfigurationException {
        System.out.println(request);
        copyrightService.createRequest(request);

    }

    @PostMapping(value ="handleRequest", consumes = "application/xml")
    public void handleRequest(@RequestBody DecisionDTO decisionDTO) throws DatatypeConfigurationException, JAXBException, XMLDBException {
        System.out.println(decisionDTO);
        copyrightService.createDecision(decisionDTO);

    }

    @GetMapping(value="getAll", produces= "application/xml")
    public ResponseEntity<List<Autorska>> getAll(){
        List<Autorska> trademarks = copyrightService.getAll();


        return new ResponseEntity<>(trademarks, HttpStatus.OK);

    }

    @GetMapping(value="getOne/{id}", produces = "application/xml")
    public ResponseEntity<Autorska> getOneById(@PathVariable String id){
        Autorska prijava = copyrightService.getOneById(id);
        return new ResponseEntity<>(prijava, HttpStatus.OK);
    }

    @GetMapping(value="getAllApproved", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<List<CopyrightRequestDTO>> getAllApproved(){
        List<Autorska> trademarks = copyrightService.getAllApproved();
        List<CopyrightRequestDTO> trademarksDTOs= new ArrayList<>();
        for (Autorska prijava:trademarks){
            trademarksDTOs.add(new CopyrightRequestDTO(prijava));
        }
        return new ResponseEntity<>(trademarksDTOs, HttpStatus.OK);
    }

    @GetMapping(value="getAllUnanswered", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<List<CopyrightRequestDTO>> getAllUnanswered(){
        List<Autorska> trademarks = copyrightService.getAllUnanswered();
        List<CopyrightRequestDTO> trademarksDTOs= new ArrayList<>();
        for (Autorska prijava:trademarks){
            trademarksDTOs.add(new CopyrightRequestDTO(prijava));
        }

        return new ResponseEntity<>(trademarksDTOs, HttpStatus.OK);
    }


    @GetMapping(value = "createDocuments/{id}")
    public void createDocuments(@PathVariable String id) throws DocumentException, IOException {

        copyrightService.createDocuments(id);
    }


    @RequestMapping("/downloadPDF/{fileName}")
    public void downloadPDFResource(HttpServletRequest request, HttpServletResponse response, @PathVariable("fileName") String fileName) throws IOException {
        String path = "gen/" + fileName;
        File file = new File(path);
        if (file.exists()) {
            String mimeType = "application/pdf";
            response.setContentType(mimeType);
            response.setHeader("Content-Disposition", "inline; filename=\"" + file.getName() + "\"");
            response.setContentLength((int) file.length());
            InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
            FileCopyUtils.copy(inputStream, response.getOutputStream());
        }
    }

    @RequestMapping("/downloadHTML/{fileName}")
    public void downloadHTMLResource(HttpServletRequest request, HttpServletResponse response, @PathVariable("fileName") String fileName) throws IOException {
        String path = "src/main/resources/data/gen/" + fileName;
        File file = new File(path);
        if (file.exists()) {
            String mimeType = "application/html";
            response.setContentType(mimeType);
            response.setHeader("Content-Disposition", "inline; filename=\"" + file.getName() + "\"");
            response.setContentLength((int) file.length());
            InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
            FileCopyUtils.copy(inputStream, response.getOutputStream());
        }
    }
    @PostMapping(value="report", consumes = MediaType.APPLICATION_XML_VALUE)
    public void generateReport(@RequestBody ReportDTO reportDTO) throws JAXBException, XMLDBException, DocumentException, FileNotFoundException {
        copyrightService.generateReport(reportDTO);
    }
}
