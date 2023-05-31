package indra.talentCamp.interfaces;

public abstract class Shape implements AreaCalculable, PerimeterCalculable, Comparable<Shape> {
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
	
	@Override
	public int compareTo(Shape o) {
		return (int) this.calculateArea() - (int) o.calculateArea();
	}
	
}