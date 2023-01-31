package com.examples;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.examples.beans.Point;
import com.examples.beans.Triangle;

@Configuration
@ComponentScan(basePackages = "com.examples")
public class AppConfig {
	@Bean
	public Triangle triangle() {
		Triangle t = new Triangle("Equilateral",20);
//		t.setPointA(pointA());
//		t.setPointB(pointB());
//		t.setPointC(pointC());
		List<Point> points = new ArrayList<Point>();
		points.add(pointA());
		points.add(pointB());
		points.add(pointC());
		t.setPoints(points);
		return t;
	}
	
	@Bean
	public Point pointA() {
		return new Point(0,0);
	}
	
	@Bean
	public Point pointB() {
		return new Point(1,0);
	}
	
	@Bean
	public Point pointC() {
		return new Point(0,1);
	}
	
	
	
//	@Bean
//	public Triangle triangle2() {
//		return new Triangle("Isosceles",30, null, null, null);
//	}
}
