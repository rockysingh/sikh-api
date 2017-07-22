package com.sikhi.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Gurdwara {

    @Id
    private String id;
    private String name;
    private String city;
    private String state;
    private String country;
    private String historySummary;
    private boolean isTakht;

}
