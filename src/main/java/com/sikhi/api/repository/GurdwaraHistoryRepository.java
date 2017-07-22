package com.sikhi.api.repository;

import com.sikhi.api.entity.GurdwaraHistory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GurdwaraHistoryRepository extends CrudRepository<GurdwaraHistory,String> {
}
