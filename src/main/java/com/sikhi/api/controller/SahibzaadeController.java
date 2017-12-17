package com.sikhi.api.controller;

import com.sikhi.api.entity.Sahibzaade;
import com.sikhi.api.exception.ResultNotFoundException;
import com.sikhi.api.service.SahibzaadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SahibzaadeController {

    private final SahibzaadeService sahibzaadeService;

    @Autowired
    public SahibzaadeController(SahibzaadeService sahibzaadeService) {
        this.sahibzaadeService = sahibzaadeService;
    }

    @RequestMapping(
            path = "/sahibzaade/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET)
    @ResponseStatus(code = HttpStatus.OK)
    public Sahibzaade read(@PathVariable long id)
            throws ResultNotFoundException {
        return sahibzaadeService.read(id);
    }

    @RequestMapping(
            path = "/sahibzaade",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET)
    @ResponseStatus(code = HttpStatus.OK)
    public List<Sahibzaade> list() {
        return sahibzaadeService.list();
    }
}
