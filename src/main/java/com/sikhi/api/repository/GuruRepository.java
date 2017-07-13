package com.sikhi.api.repository;

import com.sikhi.api.model.Guru;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GuruRepository extends MongoRepository<Guru, String> {
}