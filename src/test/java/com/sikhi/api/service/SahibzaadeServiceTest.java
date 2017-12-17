package com.sikhi.api.service;

import com.sikhi.api.UnitBaseTest;
import com.sikhi.api.entity.Sahibzaade;
import com.sikhi.api.exception.ResultNotFoundException;
import com.sikhi.api.repository.SahibzaadeRepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.when;

public class SahibzaadeServiceTest extends UnitBaseTest {

    private SahibzaadeService sahibzaadeService;

    @MockBean
    public SahibzaadeRepository sahibzaadeRepository;

    @Before
    public void setUp(){
        sahibzaadeService = new SahibzaadeService(sahibzaadeRepository);
    }

    @Test
    public void read_success() throws Exception {
        when(sahibzaadeRepository.findById(anyLong())).thenReturn(getSahibzaada());
        Sahibzaade sahibzaada = sahibzaadeService.read(1);
        assertEquals(getSahibzaada(),sahibzaada);
    }

    @Test(expected = ResultNotFoundException.class)
    public void read_throws_result_not_found_exception() throws Exception {
        when(sahibzaadeRepository.findById(anyLong())).thenReturn(null);
        Sahibzaade sahibzaada = sahibzaadeService.read(6);
    }

    @Test
    public void list() throws Exception {
        when(sahibzaadeRepository.findAll()).thenReturn(getSahibzaade());
        List<Sahibzaade> sahibzaade = sahibzaadeService.list();
        assertEquals(getSahibzaade(),sahibzaade);
    }

}