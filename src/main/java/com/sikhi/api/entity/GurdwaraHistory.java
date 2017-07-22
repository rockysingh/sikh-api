package com.sikhi.api.entity;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class GurdwaraHistory {

    @Id
    private String id;

    @NotNull
    private String gurdwaraId;

    @NotNull
    private String history;

    @NotNull
    private String guruId;

}
