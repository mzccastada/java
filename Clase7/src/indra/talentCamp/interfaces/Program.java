package indra.talentCamp.interfaces;

import java.util.*;
import java.util.stream.Collectors;

import indra.talentCamp.generics.Operation;
import indra.talentCamp.generics.Safe;

public class Program {

	public static void main(String[] args) {

		List<AreaCalculable> scenario = Arrays.asList(
				new Circle(10.0),
				new Triangle(12.0, 15.0, 16.36, 16.36),
				new Rectangle(10, 10),
				new Plant());
		
		System.out.println("El area total de mi dibujo es...");
		System.out.println("Area total: " + scenario.stream().mapToDouble(n-> n.calculateArea()).sum());		
		
//		System.out.println("El perimetro total de mi dibujo es...");
//		System.out.println("Perimetro total: " + scenario.stream().mapToDouble(n-> n.calculatePerimeter()).sum());
	
	
		/* Casteo "clasico"	*/
		double totalPerimeter = 0.0;

/*		
		for(AreaCalculable c: scenario) {
//			if(c instanceof PerimeterCalculable) {
			if(PerimeterCalculable.class.isInstance(c)) {
				// Una de las formas de hacer el casting es la siguiente...
//				totalPerimeter += ((PerimeterCalculable) c).calculatePerimeter();

				// Otra forma es usando class.cast()...
				totalPerimeter += PerimeterCalculable.class.cast(c).calculatePerimeter();
			}
		}
						
		System.out.println("Perimetro Total: " + totalPerimeter);
*/		
		
		/* Casteo con empresion lambda	*/
		totalPerimeter = scenario.stream()
				.filter(PerimeterCalculable.class::isInstance)
				.map(PerimeterCalculable.class::cast)
				.mapToDouble(p -> p.calculatePerimeter()).sum();
		
		System.out.println("Perimetro Total: " + totalPerimeter);
		
		//Ejemplo de uso de interfaz existente
		List<Shape> shapes = scenario.stream()
				.filter(Shape.class::isInstance)
				.map(Shape.class::cast).collect(Collectors.toList());
		
//		System.out.println(shapes.getClass());
		
		Collections.sort(shapes);
		shapes.stream().forEach(System.out::println);
		
		/* Ejemplo de uso de una interfaz existente */
		OperationInteger sumaInt = (a,b)->(a+b);
		int resInt = sumaInt.operate(2, 2);
		System.out.println("Sumar 2+2 es " + resInt);
			
		
		/* Ejemplo de uso de una interfaz funcional */
		Operation<Integer> sum = (a,b) -> (a+b);
		Integer res = sum.operate(2,2);
		System.out.println("Sumar 2+2 es " + res);
		
		
		/* Ejemplo Caja Fuerte que almacena Strings */
		Safe<String, String> keyword = new Safe<>("Ábrete Sésamo");
		keyword.saveValue("La clave del home banking");
		String correctKey = keyword.readValue("Ábrete Sésamo");
		System.out.println("La clave es: " + correctKey);
		
		System.out.println("Intentando acceder con una clave inválida");
		try {
			String wrongKey = keyword.readValue("qwerty");
		} catch(Exception ex) {
			System.err.println(ex.getMessage());
		}
		
		/* Ejemplo Caja Fuerte que almacena Integers */
		Safe<Integer, String> keyNumber= new Safe<>("Ábrete Sésamo");
		keyNumber.saveValue(566);
		Integer correctNumber = keyNumber.readValue("Ábrete Sésamo");
		System.out.println("La clave es: " + correctNumber);
		
		System.out.println("Intentando acceder con una clave inválida");
		try {
			Integer wrongNumber = keyNumber.readValue("qwerty");
		} catch(Exception ex) {
			System.err.println(ex.getMessage());
		}		
	}
}