package indra.talentCamp.jpa.models;

public class BusinessException extends Exception {

	private static final long serialVersionUID = 1L;

	public BusinessException(String message) {
		super(message);
	}		
}