package indra.utils;

import java.util.Random;
import java.util.Scanner;

public class Consola {
	
	private boolean esNumerico(String numero) {
		// Capturar las excepciones
		// y que devuelva si el string introducido es numerico
		try {
			Integer.parseInt(numero);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public int readInt() {
		// Leer un entero de la entrada estandar
		// mientras que el usuario no introduzca un numero
		// volver a preguntar
		
		String numero = null;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
				
		while(!esNumerico(numero)) {			
			System.out.println("Introduce un numero: ");
			numero = in.nextLine();
		}
			
		return Integer.valueOf(numero);			
	}
	
	public int readInt(String prompt) {	// Sobrecarga
		String numero = null;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
				
		while(!esNumerico(numero)) {			
			System.out.println(prompt);
			numero = in.nextLine();
		}
			
		return Integer.valueOf(numero);			
	}
	
	//Juego de adivinar un numero 
	public void adivinarNumero() {
		int totalIntentos = 5;
		int maxValor = 101;
		Random r = new Random();				
		int numSecreto = r.nextInt(1, maxValor);
		boolean adivinado = false;
		
		Scanner in = new Scanner(System.in);
		int numero = -1;
		int intentos = 1;
		
		System.out.println("=== Bienvenido al juego de adivinar el número secreto ===");
		System.out.println("=== Tiene 5 intentos para adivinar el número secreto ===");
		System.out.println();
		
		while(!adivinado && (intentos < totalIntentos)) {
			numero = readInt("Introduzca un número: ");
					
			if(numero < numSecreto) {
				System.out.println("El número introducido es menor al secreto");
				System.out.println("Te quedan " + (totalIntentos - intentos) + " intentos");
			}
			else if(numero > numSecreto) {
				System.out.println("El número introducido es mayor al secreto");
				System.out.println("Te quedan " + (totalIntentos - intentos) + " intentos");
			}
			else {
				System.out.println("Genial! Lo has adivinado!");
				adivinado = true;
			}
			intentos++;
		}
		
		if(!adivinado) {
			System.err.println("Lo siento no has adivinado. El numero secreto era " + numSecreto);
		}
	}
	
	
	public void esPrimo() {
		boolean esPrimo = true;		
		int numero = readInt("Introduzca un número: ");
				
		for(int i = 2; i < numero / 2; i++) {
			if(numero % i == 0) {
				esPrimo = false;
				break;
			}
		}
		
		if(esPrimo)
			System.out.println("El número " + numero + " es primo");
		else
			System.out.println("El número " + numero + " no es primo");
	}
}
