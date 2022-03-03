package com.progs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class program1Test {

	@Test
	public void test1() {
		try {
			int res=new program1().solution("a#n90");
		}catch (BugException e) {
			assertEquals("invalid character",e.getMessage());
		}
	}
	@Test
	public void test2() {
		try {
			int res=new program1().solution("a123");
			assertEquals(6,res);
		}catch (BugException e) {
	        fail();
		}
	}

}
