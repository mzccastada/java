
public class Program {

	public static void main(String[] args) {		
		System.out.println("Hola Mundo");
		
		//Tipos De Datos Primitivos
		int numero = 20;
		System.out.println(numero);
		
		double medio = 0.5;
		System.out.println(medio);
		
		boolean verdadero = true;
		System.out.println(verdadero);
		
		
		//Tipos de Datos Objetos (son los que hay que pedir memoria con new) 
		String nombre = "Maryny";	//Como es tan comun se omite el new --> String nombre = new String("Hola");		
		System.out.println(nombre);
		
		@SuppressWarnings("removal")
		Integer num = new Integer(2);	
		System.out.println(num);
		
		
		//Conversion de tipos
		//numero = medio; No compila, asignacion invalida (Type missmatch)
		
		medio = numero; //Conversion implicita
		
		String enLetras = Integer.toString(numero);  //Conversion explicita 
		System.out.println("El número en letras es " + enLetras);		
		System.out.printf("El número en letras es %s", enLetras);
		System.out.println();
		System.out.printf("El número es %d", numero);
		System.out.println();
		
		enLetras = "22";
		numero = Integer.parseInt(enLetras);	//Conversion explicita de String a int
		System.out.println(enLetras);
		
		
		//Captura de excepciones
		try {
			enLetras = "22dos";
			numero = Integer.parseInt(enLetras);		
		} catch(NumberFormatException ex) {	
			System.out.println("No se puedo hacer la conversión de " + enLetras + " a int");
		} catch(Exception ex) {
			System.out.println("Ocurrió un error inesperado");
		}
		
		
		//Convertir un String con un número decimal en una variable float
		 String numFloat = "14.37";
		 float stringToFloat = Float.parseFloat(numFloat);
		 System.out.println("String a float: " + stringToFloat);			
	}		
}