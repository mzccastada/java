package indra.talentCamp.dependencyInjection;

import indra.talentCamp.dependencyInjection.constructor.ConstructorInjectionDemo;
import indra.talentCamp.dependencyInjection.field.FieldInjectionDemo;
import indra.talentCamp.dependencyInjection.ioc.IoCInjectionDemo;
import indra.talentCamp.dependencyInjection.reflection.ReflectionInjectionDemo;

public class Program {

	public static void main(String[] args) {
		System.out.println("Constructor Injection Demo");
		ConstructorInjectionDemo.aTodoGas();
		System.out.println();
		
		System.out.println("Field/setter Injection Demo");
		FieldInjectionDemo.aTodoGas();
		System.out.println();
		
		System.out.println("Reflection Injection Demo");
		ReflectionInjectionDemo.aTodoGas();
		System.out.println();
		
		System.out.println("Ejemplo con IoC Container");
		IoCInjectionDemo.aTodoGas();
		System.out.println();
	}
}