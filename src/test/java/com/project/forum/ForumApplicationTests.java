package com.project.forum;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.project.controller.PostController;
import com.project.controller.UserController;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ForumApplicationTests {

	@Test
	void testGetUsers() {
		UserController uc = new UserController();
		System.out.println(uc.getUser(0).toString());
		assertTrue(true);
	}

	void testGetPosts() {
		PostController pc = new PostController();
		System.out.println(pc.getPost(0).toString());
		assertTrue(true);
	}
}
