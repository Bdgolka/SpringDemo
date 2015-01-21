package org.julia.javabrains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component //declaring class as a bean and no need to declare it in spring.xml
//@Service
//@Repository
@Controller
public class Circle implements Shape {

	protected Point center;

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle : Point is : " + center.getX() + ", "
				+ center.getY());
	}

	public Point getCenter() {
		return center;
	}

	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	@PostConstruct
	public void intializeXircle() {
		System.out.println("Init of circle");
	}

	@PreDestroy
	public void destroyXircle() {
		System.out.println("Destroy of circle");
	}

}
