package com.sikhi.api.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class CharSahibzade {

    @Id
    private String id;
    private String name;

}
