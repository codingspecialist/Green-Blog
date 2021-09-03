package com.cos.blogapp.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

// DAO
//@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query(value = "insert into user (username, password, email) values (:username, :password, :email)", nativeQuery = true)
	void join(String username, String password, String email);
}



