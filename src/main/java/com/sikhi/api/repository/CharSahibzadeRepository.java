package com.sikhi.api.repository;

import com.sikhi.api.entity.Sahibzada;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharSahibzadeRepository extends CrudRepository<Sahibzada,String> {
}
