package com.sikhi.api.repository;

import com.sikhi.api.entity.Sahibzaade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SahibzaadeRepository extends CrudRepository<Sahibzaade,String> {
    Sahibzaade findById(long id);
}
