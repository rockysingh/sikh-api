package com.sikhi.api.repository;

import com.sikhi.api.model.GurdwaraHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GurdwaraHistoryRepository extends MongoRepository<GurdwaraHistory,String> {
}
