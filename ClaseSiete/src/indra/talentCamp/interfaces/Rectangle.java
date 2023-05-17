package indra.talentCamp.interfaces;

public class Rectangle extends Shape {
	
	private double base;
	private double heigth;
	
	public Rectangle(double base, double heigth) {
		super();
		this.base = base;
		this.heigth = heigth;
	}

	public double getBase() {
		return base;
	}

	public double getHeigth() {
		return heigth;
	}
	
	@Override
	public double calculateArea() {
		return this.getHeigth() * this.getBase();
	}

	@Override
	public double calculatePerimeter() {		
		return 2 * (this.getHeigth() + this.getBase());
	}
}
