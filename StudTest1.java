package com.test;

import static org.junit.Assert.*;


import org.junit.Test;

public class StudTest1 {
Strudent s1=new Strudent();
	@Test
	public void test() {
		s1.setSid(1001);
		s1.setName("Kitty");
		assertEquals(1001,s1.getSid());
		assertEquals("Kitty",s1.getName());
		
	}

}
