package indra.talentCamp.interfaces;

import java.util.*;
import java.util.stream.Collectors;

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
		
		
	}
}