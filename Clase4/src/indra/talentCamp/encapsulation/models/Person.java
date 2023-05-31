package indra.talentCamp.encapsulation.models;

public class Person {
	
	protected String name;
	protected int document;
	protected String address;
	
	public Person(String name, int document, String address) {
		super();
		this.name = name;
		this.document = document;
		this.address = address;
	}

	/* setters */
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	/* getters */
	public String getAddress() {
		return address;
	}
	
	public String getName() {
		return name;
	}

	public int getDocument() {
		return document;
	}
	
	
}
