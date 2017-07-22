package com.sikhi.api.repository;

import com.sikhi.api.entity.Gurdwara;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GurdwaraRepository extends CrudRepository<Gurdwara,String> {
}
