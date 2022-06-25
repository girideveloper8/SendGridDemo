package com.test;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SendApplicationTest {
	
	public static Logger log = LoggerFactory.getLogger(SendApplicationTest.class);
	
	@Test
	public void contextLoad() {
		log.info("testcase executing....");
		assertEquals(true, true);
	}

}
