package com.sikhi.api.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode
public class Guru {

    @Id
    private long id;

    @NotNull
    private String name;

    @NotNull
    private String born;

    @NotNull
    @Column(name = "guruatage")
    private String guruAtAge;

    @NotNull
    @Column(name = "gurushipfrom")
    private String gurushipFrom;

    @NotNull
    @Column(name = "gurushipto")
    private String gurushipTo;

    @NotNull
    @Column(name = "lengthofguruship")
    private String lengthOfGuruship;

    @NotNull
    @Column(name = "mergedwitheternity")
    private String mergedWithEternity;

}
