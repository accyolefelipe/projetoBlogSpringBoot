package com.projeto.blog.service;

import java.util.List;

import com.projeto.blog.model.Post;



public interface BlogService {
	
	List<Post> findAll();
	Post findById(Long id);
	Post save(Post post);

}
