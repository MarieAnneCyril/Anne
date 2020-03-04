package com.test;

import static org.junit.Assert.*;


import org.junit.Test;

public class AssertTest1 {

	@Test
	public void test() {
		//fail("Not yet implemented");
		String obj1="junit";
		String obj2="junit";
		String obj3=new String("test");
		String obj4="test";
		String obj5=null;
		int var1=1;
		int var2=2;
		int[] arithmetic1={1,2,3,4};
		int[] arithmetic2={1,2,3,4};
		
		assertEquals(obj1, obj2);
		assertEquals(obj3, obj4);
		//assertSame(obj3,obj4);
		assertSame(obj1,obj2);
		
		//check if 2 obj references not point to same object
		assertNotSame(obj3,obj4);
		//check that obj is not null
		assertNotNull(obj1);
		
		assertNull(obj5);
		assertTrue(var1<var2);
		assertFalse(var1>var2);
		assertArrayEquals(arithmetic1,arithmetic2);
	}

}
