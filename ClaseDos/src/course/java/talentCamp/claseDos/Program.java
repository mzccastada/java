package course.java.talentCamp.claseDos;

import java.util.*;

public class Program {
	
	public static void cambiarValor(int n) {
		n = 20;
	}
	
	public static void cambiarRectangulo(Rectangulo rec){
		rec.base = 30;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenidos a la Clase Dos");
		
		int number = 10;
		int b = 20;
		
		number = b;
		
		System.out.println("Valor de number: " + number);
		
		
		Rectangulo r = new Rectangulo();
		r.base = 10;
		r.altura = 20;
		System.out.println("Base de r: " + r.base);
		
		Rectangulo r2 = null;
//		System.out.println(r2.altura);  //<<< NullPointerException
		r2 = new Rectangulo();
		r2.altura = 40;
		r2.base = 100;
		System.out.println("Altura de r2: " + r2.altura);
				
		r = r2;
		r2.base = 444;
		System.out.println(r.base);
		
		int a = 555;
		cambiarValor(a);
		System.out.println("Valor a: " + a);
		
		r.base = 888;
		cambiarRectangulo(r);
		System.out.println("Valor base r: " + r.base);		
		System.out.println();
			
		List<String> jedisDeJava = new ArrayList<String>();
		jedisDeJava.add("Marcos");
		jedisDeJava.add("Javier");
		jedisDeJava.add("Borja");
		jedisDeJava.add("Angello");
		jedisDeJava.add("Jean");
		
		String jediActual = null;
		
		System.out.println();
		System.out.println("======== Jedis de Java ==========");
		
		for(int i = 0; i < jedisDeJava.size(); i++) {
			jediActual = jedisDeJava.get(i);
			System.out.println(jediActual);
		}
		
		
	}
}
