package org.julia.javabrains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;


@Controller
public class Circle implements Shape {

	protected Point center;
	@Autowired
	private MessageSource messageSource;

	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@Override
	public void draw() {
		System.out.println(this.messageSource.getMessage("drawing.circle", null, "Default Drawing Message", null));
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {center.getX(), center.getY()}, "Default Point Message", null));
	/*	System.out.println("Circle : Point is : " + center.getX() + ", "
				+ center.getY());*/
		//System.out.println(this.messageSource.getMessage("greeting", null, "Default Greeting", null));
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
