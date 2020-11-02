package com.project.controller;

import java.util.List;

import com.project.model.Post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
@CrossOrigin("http://localhost:4200")
public interface PostRepository extends JpaRepository<Post, Integer> {
    public List<Post> findAll();
    public Post findById(@RequestParam("id") int postId);
    public Post findByPostedBy(@RequestParam("posted_by") String postedBy);
}
