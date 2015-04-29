package com.prabin.practice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prabin.practice.entity.Blog;
import com.prabin.practice.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

	List<Item> findByBlog(Blog blog);

}
