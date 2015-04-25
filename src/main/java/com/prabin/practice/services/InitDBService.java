package com.prabin.practice.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prabin.practice.entity.Blog;
import com.prabin.practice.entity.Item;
import com.prabin.practice.entity.Role;
import com.prabin.practice.entity.User;
import com.prabin.practice.repositories.BlogRepository;
import com.prabin.practice.repositories.ItemRepository;
import com.prabin.practice.repositories.RoleRepository;
import com.prabin.practice.repositories.UserRepository;

@Service
@Transactional
public class InitDBService {

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BlogRepository blogRepository;

	@Autowired
	private ItemRepository itemRepository;

	@PostConstruct
	public void init() {
		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);

		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);

		User userAdmin = new User();
		userAdmin.setName("admin");
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleAdmin);
		roles.add(roleUser);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);

		Blog blog = new Blog();
		blog.setName("Java_Blog");
		blog.setUrl("http://feedUrl.com");
		blog.setUser(userAdmin);
		blogRepository.save(blog);
		
		Item item1 = new Item();
		item1.setBlog(blog);
		item1.setTitle("first");
		item1.setLink("testLink");
		item1.setPublishedDate(new Date());
		itemRepository.save(item1);
		
		Item item2 = new Item();
		item2.setBlog(blog);
		item2.setTitle("second");
		item2.setLink("testLink");
		item2.setPublishedDate(new Date());
		itemRepository.save(item2);
	}

}
