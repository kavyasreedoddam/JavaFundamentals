package GeometricProject;

import java.util.ArrayList;

class Shape {
	public void displayArea() {
		System.out.println("This is the parent class.");
	}
}

class Rectangle extends Shape {
	private double length;
	private double width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public void calculateArea() {
		double area = length * width;
		System.out.println("Area of Rectangle: " + area);
	}
}

class Circle extends Shape {
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public void calculateArea() {
		double area = Math.PI * radius * radius;
		System.out.println("Area of Circle: " + area);
	}
}
public class PracticeProject {
	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();
		Rectangle rectangle = new Rectangle(4, 6);
		shapes.add(rectangle);
		Circle circle = new Circle(5);
		shapes.add(circle);
		for (Shape shape : shapes) {
			try {
					shape.displayArea();
					if (shape instanceof Rectangle) {
						Rectangle rect = (Rectangle) shape;
						rect.calculateArea();
					} else if (shape instanceof Circle) {
						Circle cir = (Circle) shape;
						cir.calculateArea();
					}
			} catch (Exception e) {
				System.out.println("An error occurred: "+e.getMessage());
			} finally {
				System.out.println("Area calculation completed ");
			}
		}
	}
}	
			
