package com.sikhi.api.repository;

import com.sikhi.api.entity.Guru;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuruRepository extends CrudRepository<Guru, String> {
}