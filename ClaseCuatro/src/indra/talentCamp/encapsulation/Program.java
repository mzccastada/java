package indra.talentCamp.encapsulation;

import indra.talentCamp.encapsulation.models.*;
import indra.talentCamp.utils.Console;

public class Program {

	public static void main(String[] args) {
								
/*	
		Scanner in = new Scanner(System.in);
					
		try {
			Student student = new Student();
			System.out.println("=== Bienvenidos al Talent Camp de Java ===");
			
			student.setName(Console.readString("¿Cómo te llamas?"));		
			student.setDocument(Console.readInt("¿Cuál es tu documento?"));				
			student.setAddress(Console.readString("¿Cuál es tu dirección?"));
			
			String answer = Console.readString("¿Te gusta el frontend? (S/N)");			
			student.setPrefersFrontEnd((answer.equalsIgnoreCase("S")));
			
			System.out.println();
			
			System.out.println("Bienvenid@ " + student.getName() + " al Talent Camp de Java!");
			System.out.println("Su documento es " + student.getDocument() + " y vive en " + student.getAddress());
			
			if(student.isPrefersFrontEnd()) {
				System.out.println("Esperemos que luego se le asigne un proyecto de frontend");
			}
			else {
				System.out.println("Esperemos que luego se le asigne un proyecto de backend");
			}								
		} finally {
			in.close();
		}
*/
		System.out.println("==== Bienvenidos al Talent Camp de Java ====");
		System.out.println("¿Quién va a dictar al curso?");
		
		Teacher teacher = new Teacher(
				Console.readString("¿Cómo te llamas?"),
				Console.readInt("¿Cuál es tu documento?"),
				Console.readString("¿Cuál es tu dirección?"));
		
		System.out.println();
		
		System.out.println(teacher);
		System.out.println();
		
		
		System.out.println("¿Quién va a asistir al curso?");
		
		Student student = new Student(
				Console.readString("¿Cómo te llamas?"),
				Console.readInt("¿Cuál es tu documento?"),
				Console.readString("¿Cuál es tu dirección?"));
		
		
		String answer = Console.readString("¿Te gusta el frontend? (S/N)");			
		student.setPrefersFrontEnd((answer.equalsIgnoreCase("S")));
		
		System.out.println();
		
//		System.out.println("Bienvenid@ " + student.getName() + " al Talent Camp de Java!");
//		System.out.println("Su documento es " + student.getDocument() + " y vive en " + student.getAddress());
//		
//		if(student.isPrefersFrontEnd()) {
//			System.out.println("Esperemos que luego se le asigne un proyecto de frontend");
//		}
//		else {
//			System.out.println("Esperemos que luego se le asigne un proyecto de backend");
//		}
		
		System.out.println("--------------------------------------------");
		System.out.println("El Profesor es: ");
		System.out.println(teacher);
		System.out.println();
		System.out.println("Asisten al curso: ");
		System.out.println(student);				
	}
}