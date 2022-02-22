package test;

public class Rectangular extends Shape {
	public Rectangular() {
	}

	private double width;
	private double hight;

	Rectangular(String name, double width, double hight) {
		super(name);
		this.width = width;
		this.hight = hight;
	}

	public void calculationArea() {
		area = width * hight;
	}
}
