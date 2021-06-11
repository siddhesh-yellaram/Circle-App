package com.techlab.model;

public class Circle {
	private final double PI = 3.14;
	private final int defRadius = 10;
	private final String defColor = "yellow";
	private double area,peri;
	private int radius;
	private String color;
	
	public Circle(int radius, String color) {
		this.radius = validateRadius(radius);
		this.color = validateColor(color);
	}
	
	public int getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public double calculateArea() {
		area = PI * radius * radius;
		return area;
	}
	
	public double calculatePeri() {
		peri = 2 * PI * radius;
		return peri;
	}
	
	private int validateRadius(int obj) {
		if(obj >= 10 && obj <= 50) {
			return obj;
		}else {
			return defRadius;
		}
	}
	
	public String validateColor(String obj) {
		if(obj.equals("red") || obj.equals("green") || obj.equals("blue")) {
			return obj;
		}else {
			return defColor;
		}
	}
}
