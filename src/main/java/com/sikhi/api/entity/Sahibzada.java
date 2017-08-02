package com.sikhi.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Sahibzada {

    @Id
    private String id;
    private String name;

}
