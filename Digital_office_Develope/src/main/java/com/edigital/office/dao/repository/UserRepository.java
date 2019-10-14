package com.edigital.office.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edigital.office.model.dao.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUserName(String username);
	public User findByUserNameAndPassword(String username,String password);
}
