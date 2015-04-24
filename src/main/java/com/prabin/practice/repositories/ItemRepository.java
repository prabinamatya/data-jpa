package com.prabin.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prabin.practice.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
