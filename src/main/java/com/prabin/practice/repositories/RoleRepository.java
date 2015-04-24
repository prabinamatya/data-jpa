package com.prabin.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prabin.practice.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

}
