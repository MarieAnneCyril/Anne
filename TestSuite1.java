package com.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses
({
	AssertTest1.class,DivTest.class,CalculateTest.class

})
public class TestSuite1{}