package com.sikhi.api.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
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
