package com.sikhi.api;

import com.sikhi.api.entity.Guru;
import com.sikhi.api.entity.PanjPyare;
import com.sikhi.api.entity.Sahibzaade;

import java.util.ArrayList;
import java.util.List;

public class BaseTest {

    protected Guru getGuru(){
        return new Guru(1, "Shri Guru Nanak Dev Ji", "1469", "-", "1469","1539","70","70");
    }

    protected List<Guru> getGurus() {
        ArrayList<Guru> gurus = new ArrayList<>();
        gurus.add(getGuru());
        return gurus;
    }

    protected PanjPyare getPanjPyara() {
        return new PanjPyare(1, "Bhai Daya Singh","", 1661, "Lahore, Pakistan", "Daya Ram", "Suddha", "Mai Dayali", "Nanded", 1708, 47 );
    }

    protected Sahibzaade getSahibzaada(){
        return new Sahibzaade(1, "Baba Ajit Singh Ji", "11th Febuary", 1687,"Poanta Sahib","Gurdwara Katalgarh Sahib in Chamkaur Sahib",1705,18);
    }

    protected List<PanjPyare> getPanjPyare(){
        ArrayList<PanjPyare> panjPyare = new ArrayList<>();
        panjPyare.add(getPanjPyara());
        return panjPyare;
    }

    protected List<Sahibzaade> getSahibzaade(){
        ArrayList<Sahibzaade> sahibzaade = new ArrayList<>();
        sahibzaade.add(getSahibzaada());
        return sahibzaade;
    }
}



