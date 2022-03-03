package com.progs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestClass2 {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@BeforeAll
	static void setUpBeforeClass() throws Exception{
		System.out.println("test class started");
	}
	@AfterAll
	static void tearDownClass() throws Exception{
		System.out.println("test class started");
	}
	

}
