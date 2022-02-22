package test;

public class Circle extends Shape {
	public Circle() {
	}

	private double radius;

	Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void calculationArea() {
		area = Math.PI * radius * radius;
	}
}
