package org.julia.javabrains;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		//context.registerShutdownHook();// in the end will destroy all the beans
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
	}
}
