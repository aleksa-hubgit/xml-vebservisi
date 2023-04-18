package com.example.patent.service;


import com.example.patent.dto.PatentRequestDTO;
import com.example.patent.model.Prijava;
import org.springframework.stereotype.Service;

@Service
public class PatentService {
    public void createRequest(PatentRequestDTO request) {

        Prijava prijava = this.createRequestFromDTO(request);

        this.save(prijava);
    }

    private void save(Prijava prijava) {


    }

    private Prijava createRequestFromDTO(PatentRequestDTO request) {

        return new Prijava();
    }
}
