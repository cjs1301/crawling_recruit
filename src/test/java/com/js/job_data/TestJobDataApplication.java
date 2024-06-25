package com.js.job_data;

import org.springframework.boot.SpringApplication;

public class TestJobDataApplication {

	public static void main(String[] args) {
		SpringApplication.from(JobDataApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
