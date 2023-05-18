package indra.talentCamp.generics;

public abstract class GenericShape<T extends Number> {	// Restringimos el tipo generico
														// para que sea numerico
	
	public abstract T calculateArea();
	public abstract T calculatePerimeter();
}
