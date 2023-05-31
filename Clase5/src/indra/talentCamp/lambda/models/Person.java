package indra.talentCamp.lambda.models;

public class Person {
	
	private String name;
	private int heightInCentimeters;
	
	public Person(String name, int heightInCentimeters) {
		super();
		this.name = name;
		this.setHeightInCentimeters(heightInCentimeters);
	}

	public int getHeightInCentimeters() {
		return heightInCentimeters;
	}

	public void setHeightInCentimeters(int heightInCentimeters) {
		//Uso Error para no estar obligado a capturar la excepción o poner throws
		if(heightInCentimeters > 300) throw new Error("No se puede medir más de 300 cm");
		if(heightInCentimeters < 0) throw new Error("No se puede medir menos que cero");
		
		//Otra alternativa para el manejo de datos incorrectos
		//assert(heightInCentimeters < 300);
		//assert(heightInCentimeters >= 0);
		
		this.heightInCentimeters = heightInCentimeters;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return this.getName();
	}
}
