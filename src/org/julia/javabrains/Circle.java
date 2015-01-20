package org.julia.javabrains;

public class Circle implements Shape {

	protected Point center;

	public Point getCenter() {
		return center;
	}

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
