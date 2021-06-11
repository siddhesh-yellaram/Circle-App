package com.techlab.circle;

import com.techlab.model.Circle;

public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(12,"red");
		Circle c2 = new Circle(25,"blue");
		Circle c3 = new Circle(19,"orange");
		Circle c[] = new Circle[3];
		c[0] = c1;
		c[1] = c2;
		c[2] = c3;
		System.out.println("\nCircle 1 Details: ");
		createCircle(c1);
		System.out.println("\nCircle 2 Details: ");
		createCircle(c2);
		System.out.println("\nCircle 3 Details: ");
		createCircle(c3);
		findBiggestCircle(c);
	}
	
	public static void createCircle(Circle obj) {
		System.out.println("\nCircle Radius: "+obj.getRadius());
		System.out.println("Circle Color: "+obj.getColor());
		System.out.println("Area of Circle: "+obj.calculateArea());
		System.out.println("Perimeter of Circle: "+obj.calculatePeri());
	}
	
	public static void findBiggestCircle(Circle obj[]) {
		double max_area = 0;
		for(int i = 0; i < obj.length; i++) {
			if(obj[i].calculateArea() > max_area) {
				max_area = obj[i].calculateArea();
			}
		}
		System.out.println("\nArea with biggest circle is: "+max_area);
	}
}
