package com.japharr.spratz;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String args[]){
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("quartz-context.xml");
	}
}
