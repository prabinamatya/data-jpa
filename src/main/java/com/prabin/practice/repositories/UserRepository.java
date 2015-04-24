package com.prabin.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prabin.practice.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
