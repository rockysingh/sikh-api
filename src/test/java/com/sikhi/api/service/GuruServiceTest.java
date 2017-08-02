package com.sikhi.api.service;

import com.sikhi.api.UnitBaseTest;
import com.sikhi.api.entity.Guru;
import com.sikhi.api.exception.ResultNotFoundException;
import com.sikhi.api.repository.GuruRepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class GuruServiceTest extends UnitBaseTest {

    private GuruService guruService;

    @MockBean
    public GuruRepository guruRepository;

    @Before
    public void setUp(){
        guruService = new GuruService(guruRepository);
    }

    @Test
    public void read_success() throws Exception {
        when(guruRepository.findOne(anyString())).thenReturn(getGuru());
        Guru guru = guruService.read(1);
        assertEquals(getGuru(),guru);

    }

    @Test(expected = ResultNotFoundException.class)
    public void read_throws_result_not_found_exception() throws Exception {
        when(guruRepository.findOne(anyString())).thenReturn(null);
        Guru guru = guruService.read(12);
    }

    @Test
    public void list() throws Exception {
        when(guruRepository.findAll()).thenReturn(getGurus());
        List<Guru> gurus = guruService.list();
        assertEquals(getGurus(),gurus);
    }

}