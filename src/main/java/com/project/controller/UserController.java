package com.project.controller;

import java.util.List;

import com.project.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
public class UserController {
    @Autowired
    private UserRepository repo;

    @GetMapping(path = "/users", produces = "application/json")
    public List<User> getUsers() {
        return repo.findAll();
    }

    @GetMapping(path = "/{user_id}", produces = "application/json")
    public User getUser(@PathVariable("id") int id) {
        return repo.findById(id);
    }

    @GetMapping("/{username}")
    public User getUserByName(@PathVariable("username") String username){
        return repo.findByUsername(username);
    }

    @PostMapping(path = "/users", consumes = "application/json", produces = "application/json")
    public User addUser(@RequestBody User user) {
        return repo.save(user);
    }
}
