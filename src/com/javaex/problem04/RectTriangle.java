package com.javaex.problem04;

public class RectTriangle extends Shape {
	int width;
	int height;

	public RectTriangle(int width, int height) {

		this.width = width;
		this.height = height;

	}

	public double getArea() {
		return width * height * 0.5;
	}

	public double getPerimeter() {
		return width + height + Math.sqrt((width*width)+(height*height));
	}

}
