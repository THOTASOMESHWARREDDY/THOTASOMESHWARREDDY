package com.progs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyprogramTest {

	@Test
	void testFindSum1()
	{
		Myprogram prog=new Myprogram();
		int actual=prog.findSum(10, 5);
		assertEquals(15,actual);
		
	}
	@Test
	void testFindSum2()
	{
		Myprogram prog=new Myprogram();
		int actual=prog.findSum(-2, 2);
		assertEquals(0,actual);
		
	}


}
