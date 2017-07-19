package com.sikhi.api.repository;

import com.sikhi.api.model.Guru;
import org.springframework.data.repository.CrudRepository;

public interface GuruRepository extends CrudRepository<Guru, String> {
}