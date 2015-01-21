package org.julia.javabrains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

@Controller
public class Circle implements Shape, ApplicationEventPublisherAware {

	protected Point center;
	private ApplicationEventPublisher publisher; //will publish application publish event
	
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
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[] { center.getX(), center.getY() }, "Default Point Message", null));
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
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

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
	this.publisher = publisher;
		
	}

}
