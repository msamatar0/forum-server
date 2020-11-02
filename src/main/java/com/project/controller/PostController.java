package com.project.controller;

import java.util.List;

import com.project.model.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
public class PostController {
    @Autowired
    private PostRepository repo;

    @GetMapping("/posts")
    public List<Post> getUsers() {
        return repo.findAll();
    }

    @GetMapping("/{post_id}")
    public Post getPost(@PathVariable("id") int postId) {
        return repo.findById(postId);
    }

    @PostMapping("/posts")
    public void addUser(@RequestBody Post post) {
        repo.save(post);
    }
}
