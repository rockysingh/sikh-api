package com.sikhi.api.repository;

import com.sikhi.api.entity.PanjPyare;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PanjPyareRepository extends CrudRepository<PanjPyare, String> {
    PanjPyare findById(long id);
}
