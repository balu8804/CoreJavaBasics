package com.java.objects;

public class FactoryMethod {

	public static void main(String[] args) {
		ShapeFactory shapefactory = new ShapeFactory();
		Shape circle = shapefactory.getShape("Circle");
		circle.findTheArea();
		Shape rectangle = shapefactory.getShape("Rectangle");
		rectangle.findTheArea();
		Shape square = shapefactory.getShape("Square");
		square.findTheArea();

	}

}
