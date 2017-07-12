package com.sikhi.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gurdwara {

    private String id;

    private String name;

    private String city;

    private String state;

    private String country;

    private String historySummary;

    private boolean isTakht;

}
