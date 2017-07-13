package com.javaex.problem04;

public class Rectangle extends Shape implements Resizeable {
 
	private double width;
	private double height;
	
	Rectangle(double width, double height){
		
		this.width =width;
		this.height = height;
		
	}
	
	public void resize(double s) {

		this.width = width * s;
		this.height = height * s;
		
	}

	public double getArea() {
		
		return width * height;
		
	}

	public double getPerimeter() {
		return (width + height) * 2;
	}

}
