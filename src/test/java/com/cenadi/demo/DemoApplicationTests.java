package com.cenadi.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

    public static Logger logger=LoggerFactory.getLoger(DemoApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test case execution");
		assertEquals(true,true);
	}

}
