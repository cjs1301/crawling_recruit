package com.js.job_data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class JobDataApplicationTests {

	@Test
	void contextLoads() {
	}

}
