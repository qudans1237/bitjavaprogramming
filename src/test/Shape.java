package test;

public abstract class Shape {
	public Shape() {
	}

	protected double area ;
	private String name ;

	public Shape(String name) {
		this.name = name;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public abstract void calculationArea();

	public void print() {
		System.out.println(name + "의 면적은 " + area);
	}
}
