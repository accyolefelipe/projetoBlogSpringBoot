package com.projeto.blog.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projeto.blog.model.Post;
import com.projeto.blog.repository.PostRepository;

@Component
public class DummyData {
	
	@Autowired
	PostRepository postRepository;
	
	@PostConstruct
	public void savePosts() {
		List<Post> postList = new ArrayList<>();
		Post post1 = new Post();
		post1.setAutor("Felipe");
		post1.setData(LocalDate.now());
		post1.setTitulo("Matematica");
		post1.setTexto("matematica não é legal. bla..bla..bla...");
		
		Post post2 = new Post();
		post2.setAutor("Ericke");
		post2.setData(LocalDate.now());
		post2.setTitulo("Fisica");
		post2.setTexto("fisica não é legal. bla..bla..bla...");
		
		postList.add(post1);
		postList.add(post2);
		
		for(Post post: postList) {
			Post postSaved = postRepository.save(post);
			System.out.println(postSaved.getId());
			System.out.println(postSaved.getTitulo());
		}
		
	}

}
