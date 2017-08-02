package com.sikhi.api.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@AllArgsConstructor
@EqualsAndHashCode
public class PanjPyare {

    @Id
    private String id;

    @NotNull
    private String name;

    @NotNull
    @Column(name = "birthdate")
    private String birthDate;

    @NotNull
    @Column(name = "birthyear")
    private int birthYear;

    @NotNull
    @Column(name = "birthlocation")
    private String birthLocation;

    @NotNull
    @Column(name = "birthname")
    private String birthName;

    @NotNull
    @Column(name = "birthfather")
    private String birthFather;

    @NotNull
    @Column(name = "birthmother")
    private String birthMother;

    @NotNull
    @Column(name = "martyredlocation")
    private String martyredLocation;

    @NotNull
    @Column(name = "martyredyear")
    private int martyredYear;

    @NotNull
    @Column(name = "martyredage")
    private int martyredAge;

}
