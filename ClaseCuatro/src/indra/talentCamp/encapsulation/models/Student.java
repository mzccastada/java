package indra.talentCamp.encapsulation.models;

public class Student extends Person {
	
//	private String name;
//	private int document;
//	private String address;
	private boolean prefersFrontEnd;
	
	public Student(String name, int document, String address) {
		super(name, document, address);
//		this.name = name;
//		this.document = document;
//		this.address = address;		
		this.prefersFrontEnd = false;
	}
	
	public Student(String name, int document, String address, boolean prefersFrontEnd) {
		super(name, document, address);
//		this.name = name;
//		this.document = document;
//		this.address = address;		
		this.prefersFrontEnd = prefersFrontEnd;
	}
	
	/* setters */
	
//	public void setName(String name) {	/* El nombre es read-only */		
//		this.name = name;
//	}	


//	public void setDocument(int document) {	/* El documento es read-only */
//		this.document = document;
//	}
	
//	public void setAddress(String address) {
//		this.address = address;
//	}
	
	public void setPrefersFrontEnd(boolean prefersFrontEnd) {
		this.prefersFrontEnd = prefersFrontEnd;
	}
		
	
	/* getters */
/*	
	public String getName() {
		return this.name;
	}
	
	public int getDocument() {
		return this.document;
	}
	
	public String getAddress() {
		return this.address;
	}
*/
	
	public boolean isPrefersFrontEnd() {
		return prefersFrontEnd;
	}	
	
	@Override
	public String toString() {
		return this.getName() + " (Documento: " + this.getDocument() + ")" + "\n" + 
				"[" + this.getAddress() + "]\n" + 
				(this.isPrefersFrontEnd() ? "Entusiasta del FrontEnd" : "Entusiasta del BackEnd");
	}
}
