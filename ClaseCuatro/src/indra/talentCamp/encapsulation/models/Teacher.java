package indra.talentCamp.encapsulation.models;

public class Teacher extends Person {
	
	private String preferedLanguage;
	
	public Teacher(String name, int document, String address) {
		super(name, document, address);	
		this.preferedLanguage = "Java";
	}
	
	public Teacher(String name, int document, String address, String preferedLanguage) {
		super(name, document, address);
		this.preferedLanguage = preferedLanguage;
	}
	
	
	/* setters */	
	public void setPreferedLanguage(String preferedLanguage) {
		this.preferedLanguage = preferedLanguage;
	}
		
	
	/* getters */	
	public String getPreferedLanguage() {
		return preferedLanguage;
	}	
	
	@Override
	public String toString() {
		return this.getName() + " (Documento: " + this.getDocument() + ")" + "\n" + 
				"[" + this.getAddress() + "]\n" + 
				"Especialista en " + this.getPreferedLanguage();
	}
}