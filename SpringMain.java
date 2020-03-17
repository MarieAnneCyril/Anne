package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.FirstBean;

public class SpringMain {
	
	public static void main(String args[]){
		ApplicationContext beanFactory=new ClassPathXmlApplicationContext("SpringConfig.xml");
	FirstBean myBean=(FirstBean)beanFactory.getBean("Bean1");  
	myBean.display();

}}
