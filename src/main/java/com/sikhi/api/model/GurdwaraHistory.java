package com.sikhi.api.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class GurdwaraHistory {

    @Id
    private String id;
    private String gurdwaraId;
    private String history;
    private String guruId;

}
