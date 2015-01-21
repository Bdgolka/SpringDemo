package org.julia.javabrains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

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
