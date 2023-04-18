package com.example.patent.controller;


import com.example.patent.dto.PatentRequestDTO;
import com.example.patent.service.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="patent")
public class PatentController {

    @Autowired
    private PatentService patentService;

    public void createRequest(@RequestBody PatentRequestDTO request){
        this.patentService.createRequest(request);

    }
}
