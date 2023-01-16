package com.example.zig.controller;


import com.example.zig.service.TrademarkService;
import com.itextpdf.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(path="trademark")
public class TrademarkController {

    @Autowired
    private TrademarkService trademarkService;


    @GetMapping(value="createPDF")
    public void createPdfDocument() throws DocumentException, IOException {
        trademarkService.createPdfDocument();

    }

    @GetMapping(value = "createHTML", produces ="application/xml", consumes="application/xml")
    public ResponseEntity<String> createHtmlDocument() throws DocumentException, IOException {
        return new ResponseEntity<>(trademarkService.createHtmlDocument(), HttpStatus.OK);
    }
}
