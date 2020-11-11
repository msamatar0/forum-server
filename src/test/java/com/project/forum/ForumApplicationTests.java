package com.project.forum;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.project.controller.PostController;
import com.project.controller.UserController;
import com.project.model.Post;
import com.project.model.User;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ForumApplicationTests {

	@Test
	void testGetUsers() {
		UserController uc = new UserController();
		uc.addUser(new User(99, "email@email.com",
			"person", "pass"));
		User u = uc.getUser(99);
		assertTrue(u.getUsername().equals("person"));
	}

	@Test
	void testGetPosts() {
		PostController pc = new PostController();
		Post p = pc.getPost(1);
		assertTrue(p.getSubject().equals("The First Post ever Made, Ever"));
	}
}
