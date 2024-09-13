package com.miniProject.miniProject;

import org.springframework.boot.SpringApplication;

public class TestMiniProjectApplication {

	public static void main(String[] args) {
		SpringApplication.from(MiniProjectApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
