package com.examples.beans;

import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

import org.apache.logging.log4j.LogManager;


@ComponentScan(basePackages = "com.examples")

public class Triangle {
	
	private static final Logger LOGGER =  LogManager.getLogger(Triangle.class);
	
	private String name;
	private int height;
//	private Point pointA;
//	private Point pointB;
//	private Point pointC;
	private List<Point> points;
	
	

	
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

//	public Point getPointA() {
//		return pointA;
//	}
//
//	public void setPointA(Point pointA) {
//		this.pointA = pointA;
//	}
//
//	public Point getPointB() {
//		return pointB;
//	}
//
//	public void setPointB(Point pointB) {
//		this.pointB = pointB;
//	}
//
//	public Point getPointC() {
//		return pointC;
//	}
//
//	public void setPointC(Point pointC) {
//		this.pointC = pointC;
//	}


	public void draw() {
		System.out.println(this.getName()+ " triangle is drawn of height "+this.getHeight());
		System.out.println("Point A = " + getPoints().get(0).getX()+" ," +getPoints().get(0).getY());
		System.out.println("Point A = " + getPoints().get(1).getX()+" ," +getPoints().get(1).getY());
		System.out.println("Point A = " + getPoints().get(2).getX()+" ," +getPoints().get(2).getY());
//		System.out.println("Point A = " + getPoints().getX()+" ," +getPointA().getY());
//		System.out.println("Point B = " + getPointB().getX()+" ," +getPointB().getY());
//		System.out.println("Point C = " + getPointC().getX()+" ," +getPointC().getY());
	}

	public Triangle(String name, int height) {
		super();
		this.name = name;
		this.height = height;
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

}
