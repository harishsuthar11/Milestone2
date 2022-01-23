package com.example.milestone2.service;

import com.example.milestone2.model.Transcation;
import com.example.milestone2.repository.TranscationRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TranscationService {

    @Autowired
    private TranscationRepository transcationRepository;

    public void createTranscation(Transcation transcation){
        transcationRepository.save(transcation);
    }

}
