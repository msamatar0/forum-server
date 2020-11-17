package com.project.forum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.project.controller.PostController;
import com.project.controller.UserController;
import com.project.model.Post;
import com.project.model.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ForumApplicationTests {
	private UserController uc;
	private PostController pc;

	@Autowired
	public void setup(UserController uc, PostController pc){
		this.uc = uc;
		this.pc = pc;
	}

	@Test
	void testGetUsers() {
		User u = uc.getUser(2);
		assertEquals("msamatar0", u.getUsername());
	}

	@Test
	void testGetPosts() {
		Post p = pc.getPost(1);
		assertEquals("hi", p.getContent());
	}
}
