package com.sikhi.api.repository;

import com.sikhi.api.model.Gurdwara;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GurdwaraRepository extends MongoRepository<Gurdwara,String> {
}
