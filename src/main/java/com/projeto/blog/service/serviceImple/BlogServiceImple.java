package com.projeto.blog.service.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.blog.model.Post;
import com.projeto.blog.repository.PostRepository;
import com.projeto.blog.service.BlogService;

@Service
public class BlogServiceImple implements BlogService {
	
	@Autowired
	PostRepository postRepository;

	@Override
	public List<Post> findAll() {
		return postRepository.findAll();
	}

	@Override
	public Post findById(Long id) {
		return postRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return postRepository.save(post);
	}

}
