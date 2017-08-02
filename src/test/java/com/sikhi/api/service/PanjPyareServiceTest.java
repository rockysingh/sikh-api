package com.sikhi.api.service;

import com.sikhi.api.UnitBaseTest;
import com.sikhi.api.entity.PanjPyare;
import com.sikhi.api.exception.ResultNotFoundException;
import com.sikhi.api.repository.PanjPyareRepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class PanjPyareServiceTest extends UnitBaseTest {

    private PanjPyareService panjPyareService;

    @MockBean
    public PanjPyareRepository panjPyareRepository;

    @Before
    public void setUp(){
        panjPyareService = new PanjPyareService(panjPyareRepository);
    }

    @Test
    public void read_success() throws Exception {
        when(panjPyareRepository.findOne(anyString())).thenReturn(getPanjPyara());
        PanjPyare panjPyara = panjPyareService.read(1);
        assertEquals(getPanjPyara(), panjPyara);

    }

    @Test(expected = ResultNotFoundException.class)
    public void read_throws_result_not_found_exception() throws Exception {
        when(panjPyareRepository.findOne(anyString())).thenReturn(null);
        PanjPyare panjPyara = panjPyareService.read(6);
    }

    @Test
    public void list() throws Exception {
        when(panjPyareRepository.findAll()).thenReturn(getPanjPyare());
        List<PanjPyare> panjPyare = panjPyareService.list();
        assertEquals(getPanjPyare(),panjPyare);
    }

}