package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
	List<Post> findByUser(User user);
}
