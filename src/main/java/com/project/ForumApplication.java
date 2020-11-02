package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ForumApplication {
	public static void main(String[] args) {
		SpringApplication.run(ForumApplication.class, args);
	}

	/*
	@Bean
	CommandLineRunner demo(UserRepository urepo, PostRepository prepo) {
		return (args) -> {
			for(User user: urepo.findAll())
				System.out.println(user);

			for(Post post: prepo.findAll())
				System.out.println(post);
		};
	}
	*/
}
