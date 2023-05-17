package indra.talentCamp.interfaces;

public class Triangle extends Shape {
	
	private double height;
	private double base;
	private double side1;
	private double side2;

	public Triangle(double height, double base, double side1, double side2) {
		this.height = height;
		this.base = base;
		this.side1 = side1;
		this.side2 = side2;
	}

	public double getHeight() {
		return height;
	}

	public double getBase() {
		return base;
	}
	
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	@Override
	public double calculateArea() {
		return  (this.getBase() * this.getHeight()) / 2;
	}

	@Override
	public double calculatePerimeter() {
		return this.getSide1() + this.getSide2() + this.getBase();
	}
}
