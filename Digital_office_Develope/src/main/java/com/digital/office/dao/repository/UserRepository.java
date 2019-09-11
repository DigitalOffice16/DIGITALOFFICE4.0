package com.digital.office.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.digital.office.model.dao.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>,CrudRepository<User, Long> {
  public User findByEmailId(String emailId);
}
