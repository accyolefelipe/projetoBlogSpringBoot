package com.projeto.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.blog.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
