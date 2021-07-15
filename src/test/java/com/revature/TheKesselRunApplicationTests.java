package com.revature;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations="classpath:/src/test/resources/test.properties")
class TheKesselRunApplicationTests {

	@Test
	void contextLoads() {
	}

}
