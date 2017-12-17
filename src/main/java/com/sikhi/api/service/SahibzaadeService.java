package com.sikhi.api.service;

import com.sikhi.api.entity.Sahibzaade;
import com.sikhi.api.exception.ResultNotFoundException;
import com.sikhi.api.repository.SahibzaadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SahibzaadeService {

    private final SahibzaadeRepository sahibzaadeRepository;

    @Autowired
    public SahibzaadeService(SahibzaadeRepository sahibzaadeRepository) {
        this.sahibzaadeRepository = sahibzaadeRepository;
    }


    public Sahibzaade read(long id) throws ResultNotFoundException {
        Sahibzaade sahibzaada = sahibzaadeRepository.findById(id);
        if (sahibzaada == null) {
            throw new ResultNotFoundException("sahibzaada not found with id:" + id);
        }
        return sahibzaada;
    }

    public List<Sahibzaade> list(){
        List<Sahibzaade> sahibzaadeList = new ArrayList<>();
        sahibzaadeRepository.findAll().forEach(sahibzaadeList::add);
        return sahibzaadeList;
    }

}
