package com.sikhi.api.controller;

import com.sikhi.api.exception.ResultNotFoundException;
import com.sikhi.api.model.Guru;

import com.sikhi.api.service.GuruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/gurus")
public class GuruController {

    private final GuruService guruService;

    @Autowired
    public GuruController(GuruService guruService) {
        this.guruService = guruService;
    }

    @RequestMapping(
            path = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET)
    @ResponseStatus(code = HttpStatus.OK)
    public Guru read(@PathVariable String id)
    throws ResultNotFoundException {
        return guruService.read(id);
    }

    @RequestMapping(
            path = "",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET)
    @ResponseStatus(code = HttpStatus.OK)
    public List<Guru> list() {
        return guruService.list();
    }

}
