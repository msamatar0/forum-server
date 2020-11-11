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

    @GetMapping("/{id}")
    public Post getPost(@PathVariable("id") int id) {
        return repo.findById(id);
    }

    @PostMapping("/posts")
    public void addPost(@RequestBody Post post) {
        System.out.println("New Post: " + post);
        repo.save(post);
    }
}
