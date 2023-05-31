
import java.io.*;
import java.util.Random;
import java.util.Scanner;
import indra.utils.Consola;

public class Program {
		
	public static void ejemploBufferedReaderConThrows() throws IOException {
		BufferedReader reader = new BufferedReader( new InputStreamReader(System.in) );
		
		try {
			System.out.println("Introduzca su nombre: ");
			String nombre = reader.readLine();
			
			System.out.println("Introduzca su edad: ");			
			String edadAsString = reader.readLine();			
			int edad = Integer.parseInt(edadAsString);
			
			System.out.println("Hola " + nombre + " de " + edad + " años");
			
//		} catch (IOException e) {			
//			System.err.println(e.getMessage());
//		}
		
		} finally {
			System.out.println("Cerrando el BufferedReader");
			reader.close();
		}
	}
	
	public static void ejemploBufferedReaderSinThrows() {
		BufferedReader reader = new BufferedReader( new InputStreamReader(System.in) );
		
		try {
			try {
			System.out.println("Introduzca su nombre: ");
			String nombre = reader.readLine();
			
			System.out.println("Introduzca su edad: ");			
			String edadAsString = reader.readLine();			
			int edad = Integer.parseInt(edadAsString);
			
			System.out.println("Hola " + nombre + " de " + edad + " años");
			
			} catch (IOException e) {			
				System.err.println(e.getMessage());				
			} 
		} finally {
			System.out.println("Cerrando el BufferedReader");
			try {
				reader.close();
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}		
	}
	
	public static void ejemploScanner() {
		try (Scanner in = new Scanner(System.in)) {		// Es lo mismo que hacer un try...finally con un close
			System.out.println("Su nombre es: ");
			String nombre = in.nextLine();
			System.out.println("Su edad es: ");
			int edad = in.nextInt();
			System.out.println("Hola " + nombre + " de " + edad + " años");
		}	// Se hace solo el close
	}
		
	public static void main(String[] args) {
				
		Consola c = new Consola();
		c.esPrimo();
	}		
}