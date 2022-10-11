package com.bootrcamp.capstone.prsdb.request;

import org.springframework.data.repository.CrudRepository;

public interface RequestRepository extends CrudRepository<Request, Integer> {
	Iterable<Request> findByStatusAndIdNot(String status, int id);
}
