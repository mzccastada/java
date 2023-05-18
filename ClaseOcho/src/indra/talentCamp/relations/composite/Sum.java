package indra.talentCamp.relations.composite;

public class Sum extends BinaryOperation {
		
	public Sum(Operation leftOperator, Operation rightOperator) {
		super(leftOperator, rightOperator);
	}	

	public Sum(double leftOperator, double rightOperator) {
		super(leftOperator, rightOperator);
		// TODO Auto-generated constructor stub
	}



	public Sum(double leftOperator, Operation rightOperator) {
		super(leftOperator, rightOperator);
		// TODO Auto-generated constructor stub
	}



	public Sum(Operation leftOperator, double rightOperator) {
		super(leftOperator, rightOperator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate() {
		return this.leftOperator.calculate() + this.rightOperator.calculate();
	}

}
