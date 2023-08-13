package com.bank.bank.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.bank.user.entity.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

}
