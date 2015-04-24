package com.prabin.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prabin.practice.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

}
