package com.sikhi.api.service;

import com.sikhi.api.entity.Guru;
import com.sikhi.api.exception.ResultNotFoundException;
import com.sikhi.api.repository.GuruRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GuruService {

    private final GuruRepository guruRepository;

    @Autowired
    public GuruService(GuruRepository guruRepository) {
        this.guruRepository = guruRepository;
    }

    public Guru read(String id) throws ResultNotFoundException {
        Guru guru = guruRepository.findOne(id);
        if (guru == null) {
            throw new ResultNotFoundException("guru not found with id:" + id);
        }
        return guru;
    }

    public List<Guru> list(){
        List<Guru> gurus = new ArrayList<>();
        guruRepository.findAll().forEach(gurus::add);
        return gurus;
    }
}
