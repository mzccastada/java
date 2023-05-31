package indra.talentCamp.lambda;

import java.util.*;
import java.util.stream.Collectors;

import indra.talentCamp.lambda.models.*;

public class Program {

	public static void main(String[] args) {					

/* Usar StringBuilder es más eficiente para manejar Strings */
		StringBuilder builder = new StringBuilder();
		builder.append("Que la fuerza");
		builder.append(" te");
		builder.append(" acompañe");
		
		System.out.println(builder.toString() + "\n");
		
//		List<Person> jedis = new ArrayList<Person>();			
//		List<Person> jedis = new LinkedList<Person>();
//		jedis.add(new Person("Anakin", 178));
//		jedis.add(new Person("Yoda", 80));
//		jedis.add(new Person("Asoka", 165));
//		jedis.add(new Person("Luke", 165));
		
		//Otra alternativa de añadir elementos en List
		List<Person> people = Arrays.asList(
				new Person("Anakin", 178),
				new Person("Yoda", 80),
				new Person("Asoka", 165),
				new Person("Luke", 165));
		
		System.out.println("La lista de personas:");
		
		/* Iteraciones */

		//Iterando con un foreach
//		for(Person person : people) {
//			System.out.println("- " + person.getName());
//		}
//		
//		System.out.println();
		
		//Iterando con expresiones lambda
		// person -> System.out.println(person)
		// es lo mismo que hacer
		//
		// void mostrar(Person person) {
		//		System.out.println(person)
		// }		
		people.forEach( person -> System.out.println(person) );
		System.out.println();
		
		//Iterando con lambda de una manera particular...  ::
//		System.out.println("=== Iteracion con expresion lambda con :: ===");
//		people.forEach( System.out::println );
//		System.out.println();
		
		
		/* Devolver el valor maximo de un List */
		List<Integer> numeros = Arrays.asList(4, 5, 656, 232, 54, 657, 865, 23, 433);						
		
//		int max = 0;
//		
//		for(int numero : numeros) {
//			//if(numero > max)
//			if(Integer.compare(numero, max) > 0)
//				max = numero;
//		}
//		
//		System.out.println("Max: " + max);
//		System.out.println();
		
		//Alternativa usando expresiones Lambda
		int max = numeros.stream().max( (a,b) -> a-b ).orElse(0);
//		int max = numeros.stream().max( (a,b) -> a.compareTo(b) ).orElse(0);
//		int max = numeros.stream().max( (a,b) -> Integer.compare(a,b) ).orElse(0);
		System.out.println("Max: " + max);
		System.out.println();
		
		/* Obtener la persona más alta con una expresion lambda */
		System.out.println("La persona más alta es:");
		System.out.println(people.stream().max( (a,b) -> a.getHeightInCentimeters()- b.getHeightInCentimeters() ).orElse(null));
		System.out.println();
		
		//Otra forma, utilizando Comparator		
//		Person tallestPerson = people.stream().max(Comparator.comparingInt(Person::getHeightInCentimeters)).orElse(null);
//		System.out.println(tallestPerson);
//		System.out.println();

				
		/* Realizar la sumatoria */
		
		//Forma sin expresion lambda
//		int sumatorio = 0;
//		
//		for(int num: numeros)
//			sumatorio += num;
//		
//		System.out.println("Sumatorio: " + sumatorio);
		
		//Forma con expresion lambda				
		System.out.println("Sumatorio: " + numeros.stream().mapToInt(n->n).sum());
		
		
		/* Sumatoria de las alturas de las personas */
//		System.out.println("Sumatoria alturas: " + people.stream().mapToInt(person->person.getHeightInCentimeters()).sum());
		
		//Otra alternativa utilizando el operador de referencia ::
		System.out.println("Sumatoria alturas: " + people.stream().mapToInt(Person::getHeightInCentimeters).sum());

		
		/* Realizar la media */
		//Forma tradicional
//		int sumatorio = 0;
//		
//		for(int num : numeros)
//			sumatorio += num;
//			
//		double media = (double) sumatorio / (double) numeros.size();
//		System.out.format("Media: %.2f", media);		
		
		//Forma con lambda
		System.out.println("Media: " + numeros.stream().mapToDouble(n->(double)n).average().orElse(0));
//		System.out.format("Media: %.2f", numeros.stream().mapToDouble(n->(double)n).average().orElse(0));
//		System.out.printf("Media: %.2f", numeros.stream().mapToDouble(n->(double)n).average().orElse(0));
		
		
		/* Realizar la altura media de las personas */
		System.out.println("Altura media: " + people.stream().mapToDouble(Person::getHeightInCentimeters).average().orElse(0));
		System.out.println();
		
		/* Filtrar elementos que sean mayor a 100 */
//		numeros.stream().filter(n -> n > 100).forEach(System.out::println);
		
		List<Integer> numerosMayores100 = numeros.stream().filter(n -> n > 100).collect(Collectors.toList());
		System.out.println("Numeros mayores a 100: " + numerosMayores100);
		System.out.println();
		
		
		/* Lista de personas que midan mas de 100 */
		List<Person> personasAltas = people.stream().filter(person -> person.getHeightInCentimeters() > 100).collect(Collectors.toList());
		System.out.println("Personas que midan más de 100 cm:");
		personasAltas.forEach(System.out::println);
		System.out.println();
//		
//		/* Map */
		System.out.println("Multiplicar por 2 los numeros:");
		numeros.stream().map(n -> n*2).forEach(System.out::println);
		System.out.println();
//		
//		List<Integer> dobles = numeros.stream().map(n -> n*2).collect(Collectors.toList());
//		
//
//		/* Convertir la lista de personas en una lista de alturas(int). Luego mostrarla */
		System.out.println("Lista de personas que midan más de 100 cm (usando Map):");
		List<Integer> alturas = people.stream().map(person->person.getHeightInCentimeters()).collect(Collectors.toList());
		alturas.forEach(System.out::println);
		System.out.println();
//		
//		/* Reduce */
//		/* Sumatoria */
		System.out.println("Sumatoria alturas usando Reduce:");
		int sumatoria = numeros.stream().reduce(0, (acumulado, valorActual) -> acumulado+valorActual);
		System.out.println(sumatoria);
	}	
}
