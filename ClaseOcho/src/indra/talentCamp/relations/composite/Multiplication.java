package indra.talentCamp.relations.composite;

public class Multiplication extends BinaryOperation {

	public Multiplication(Operation leftOperator, Operation rightOperator) {
		super(leftOperator, rightOperator);
	}
	
	

	public Multiplication(double leftOperator, double rightOperator) {
		super(leftOperator, rightOperator);
		// TODO Auto-generated constructor stub
	}



	public Multiplication(double leftOperator, Operation rightOperator) {
		super(leftOperator, rightOperator);
		// TODO Auto-generated constructor stub
	}



	public Multiplication(Operation leftOperator, double rightOperator) {
		super(leftOperator, rightOperator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate() {
		return this.leftOperator.calculate() * this.rightOperator.calculate();
	}	
	
	
}