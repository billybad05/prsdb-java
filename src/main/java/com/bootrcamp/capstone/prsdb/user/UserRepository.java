package com.bootrcamp.capstone.prsdb.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
	public User findUserByUsernameAndPassword(String username, String Password);
}
