package org.julia.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		context.registerShutdownHook();// in the end will destroy all the beans
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		
	}
}
