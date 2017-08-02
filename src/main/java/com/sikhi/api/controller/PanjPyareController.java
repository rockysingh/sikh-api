package com.sikhi.api.controller;

import com.sikhi.api.entity.PanjPyare;
import com.sikhi.api.exception.ResultNotFoundException;
import com.sikhi.api.service.PanjPyareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PanjPyareController {

    private final PanjPyareService panjPyareService;

    @Autowired
    public PanjPyareController(PanjPyareService panjPyareService) {
        this.panjPyareService = panjPyareService;
    }

    @RequestMapping(
            path = "/panjpyare/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET)
    @ResponseStatus(code = HttpStatus.OK)
    public PanjPyare read(@PathVariable String id)
            throws ResultNotFoundException {
        return panjPyareService.read(id);
    }

    @RequestMapping(
            path = "/panjpyare",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET)
    @ResponseStatus(code = HttpStatus.OK)
    public List<PanjPyare> list() {
        return panjPyareService.list();
    }

}
