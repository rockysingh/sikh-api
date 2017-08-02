package com.sikhi.api.service;

import com.sikhi.api.entity.PanjPyare;
import com.sikhi.api.exception.ResultNotFoundException;
import com.sikhi.api.repository.PanjPyareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PanjPyareService {

    private final PanjPyareRepository panjPyareRepository;

    @Autowired
    public PanjPyareService(PanjPyareRepository panjPyareRepository) {
        this.panjPyareRepository = panjPyareRepository;
    }


    public PanjPyare read(String id) throws ResultNotFoundException {
        PanjPyare panjPyara = panjPyareRepository.findOne(id);
        if (panjPyara == null) {
            throw new ResultNotFoundException("panj pyara not found with id:" + id);
        }
        return panjPyara;
    }

    public List<PanjPyare> list(){
        List<PanjPyare> panjPyareList = new ArrayList<>();
        panjPyareRepository.findAll().forEach(panjPyareList::add);
        return panjPyareList;
    }
}

