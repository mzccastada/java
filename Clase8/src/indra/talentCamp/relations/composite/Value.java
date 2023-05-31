package indra.talentCamp.relations.composite;

public class Value extends Operation {

	private double value;		
	
	public Value(double value) {
		super();
		this.value = value;
	}

	@Override
	public double calculate() {
		return this.value;
	}		
}