package com.examples;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.beans.Triangle;

public class DrawingApp {

	public static void main(String[] args) {
//		Triangle t = new Triangle();
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle t = context.getBean("Triangle",Triangle.class);
		t.draw();
		Triangle t2 = context.getBean("Triangle2",Triangle.class);
		t2.draw();
		context.registerShutdownHook();
		context.close();
	}

}
