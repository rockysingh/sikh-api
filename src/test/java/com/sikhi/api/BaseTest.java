package com.sikhi.api;

import com.sikhi.api.entity.Guru;

import java.util.ArrayList;
import java.util.List;

public class BaseTest {

    protected Guru getGuru(){
        return new Guru("1","Shri Guru Nanak Dev Ji");
    }

    protected List<Guru> getGurus() {
        ArrayList<Guru> gurus = new ArrayList<>();
        gurus.add(getGuru());
        return gurus;
    }

}



