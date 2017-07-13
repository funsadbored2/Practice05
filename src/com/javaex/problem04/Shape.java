package com.javaex.problem04;

public abstract class Shape {
	
	int countSide;
	double width;
	double height;
	
	public Shape() {}
	
	public Shape(int countSide) {
		
		this.countSide = countSide;	
	}
	

	public double getCountS() {
		return countSide;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
}
