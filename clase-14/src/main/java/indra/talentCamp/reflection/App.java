package indra.talentCamp.reflection;

import java.util.*;
import java.lang.reflect.*;

public class App {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException {
		System.out.println("Bienvenidos a la clase de Reflection");
		
		try(Scanner in = new Scanner(System.in)) {
			Class<?> clazz = null;
			
			//Busco una clase a partir del nombre con Reflection
			boolean claseEncontrada = false;
			
			while(!claseEncontrada) {
				System.out.println("Ingrese el nombre completo de la clase para instanciar un objeto de la misma");
				//indra.talentCamp.reflection.models.SuperHeroe
				String className = in.nextLine();
				
				try {
					clazz = Class.forName(className);
					claseEncontrada = true;
				} catch (Exception ex) {
					System.out.println("Clase no encontrada. Vuelva a intentar");
				}
			}
			
			//Listo los campos de una clase con Reflection
			System.out.println("Los atributos de la clase son:");
			Field[] fields = clazz.getDeclaredFields();
			
			for(Field field : fields) {
				field.setAccessible(true);	//Rompo el encapsulamiento para poder usar los atributos privados
				System.out.format("\t%s %s : %s", 
						Modifier.toString(field.getModifiers()),
						field.getName(),
						field.getType().getName());
				System.out.println("");
			}
			System.out.println();
			
			//Listo los metodos de una clase con Reflection
			System.out.println("Los metodos son:");
			List<Method> metodos = Arrays.asList(clazz.getDeclaredMethods());
			metodos = metodos.stream()
					.filter(m -> !m.getName().startsWith("set") && !m.getName().startsWith("get"))
					.toList();
			
			for(Method method : metodos) {
				System.out.format("\t%s %s: %s", 
						Modifier.toString(method.getModifiers()),
						method.getName(),
						method.getReturnType().getName());
				System.out.println();
			}
			
			//Para instanciar objetos sin el constructor con Reflection
			System.out.println("Instanciando un objeto de ese tipo");
			Object objeto = clazz.getConstructors()[0].newInstance();
			System.out.println("Objetos instanciados");
			
			System.out.println("¿Desea modificar otro atributo?");
			String modificarAtributo = in.nextLine();
			
			while(modificarAtributo.equalsIgnoreCase("S")) {				
				boolean atributoEncontrado = false;
				
				while(!atributoEncontrado) {
					System.out.println("¿Qué atributo desea modificar?");
					String atributo = in.nextLine();
					
					try {
						Field f = clazz.getDeclaredField(atributo);
						System.out.println("¿Qué valor desea ponerle?");
						String valor = in.nextLine();
						f.setAccessible(true);	//Rompo el encapsulamiento con reflection y seteo atributos privados
						f.set(objeto, valor);
						atributoEncontrado = true;
					} catch (Exception e) {
						System.out.println("Atributo no econtrado no se puede setear vuelva a escribir "
								+ e.getMessage());
					}
				}
				
				System.out.println("¿Desea modificar otro atributo?");
				modificarAtributo = in.nextLine();
			}
			
			//Listo los atributos con sus valores con Reflection
			System.out.println("Los atributos quedan así:");
			
			for(Field field : fields) {
				System.out.format(" %s : %s",
						field.getName(),
						field.get(objeto));
				System.out.println();
			}
			
			System.out.println("¿Desea invocar un método?");
			String modificarMetodo = in.nextLine();
			
			while(modificarMetodo.equalsIgnoreCase("S")){
				boolean metodoEncontrado = false;
				
				while(!metodoEncontrado) {
					System.out.println("¿Qué método (Ojo sin parámetros)?");					
					String nombreMetodo = in.nextLine();	//decirSuFrase
					
					try {
						Method metodo = clazz.getDeclaredMethod(nombreMetodo);
						metodo.invoke(objeto);
						metodoEncontrado = true;
					} catch (Exception e) {
						System.out.println("Metodo no encontrado vuelva a intentarlo");
					}					
				}
				
				System.out.println("¿Desea invocar otro método?");
				modificarMetodo = in.nextLine();
			}
		}		
	}
}