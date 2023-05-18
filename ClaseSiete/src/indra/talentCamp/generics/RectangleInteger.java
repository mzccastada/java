package indra.talentCamp.generics;

public class RectangleInteger extends GenericShape<Integer>{

	private int base;
	private int heigth;
				
	public RectangleInteger(int base, int heigth) {
		super();
		this.base = base;
		this.heigth = heigth;
	}

	public int getBase() {
		return base;
	}

	public int getHeigth() {
		return heigth;
	}

	@Override
	public Integer calculateArea() {
		// TODO Auto-generated method stub
		return this.base * this.heigth;
	}

	@Override
	public Integer calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2 * (this.base + this.heigth);
	}
}