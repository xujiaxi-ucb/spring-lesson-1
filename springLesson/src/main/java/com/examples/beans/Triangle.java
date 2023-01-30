package com.examples.beans;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Triangle {
	
	private static final Logger LOGGER =  LogManager.getLogger(Triangle.class);
	
	private String name;
	private int height;
	
	public Triangle(String name, int height) {
		super();
		LOGGER.debug("(name, height) constructor");
		this.name = name;
		this.height = height;
	}
	
	public Triangle() {
		super();
		LOGGER.debug("default constructor called");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		LOGGER.debug("triangle setName called");
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
		LOGGER.debug("triangle setName called");
	}

	public void draw() {
		System.out.println(this.getName()+ " triangle is drawn of height "+this.getHeight());
	}




}
