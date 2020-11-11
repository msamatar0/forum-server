package com.project.controller;

import java.util.List;

import com.project.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
@CrossOrigin("http://localhost:4200")
public interface UserRepository extends JpaRepository<User, Integer>{
    public List<User> findAll();
    public User findById(@RequestParam("id") int id);
    public User findByUsername(@RequestParam("username") String username);
    public User findByUsernameContainingIgnoreCase(@RequestParam("username") String username);
    @Query(value = "select max(id) from user", nativeQuery = true)
    public int findMaxId();
}
