package org.julia.javabrains;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {

	protected Point center;

	public Point getCenter() {
		return center;
	}

	@Required // tells to spring that this is a required 
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle : Point is : " + center.getX() + ", "
				+ center.getY());
	}
}
