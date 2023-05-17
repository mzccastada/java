package indra.talentCamp.interfaces;

public class Circle extends Shape {
	
	private double radius;
		
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * Math.pow(getRadius(), 2);
	}

	@Override
	public double calculatePerimeter() {
		return Math.PI * 2 * this.radius;
	}
}
