package indra.talentCamp.relations;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import indra.talentCamp.relations.composite.*;
import org.mozilla.javascript.*;

public class Program {

	public static void main(String[] args) {
		// Vamos a realizar el siguiente calculo: 2+2*3
		Operation calculation = new Sum(
				new Value(2),
				new Multiplication(new Value(2), new Value(3))
				);
		
		System.out.println("2+2*3 = " + calculation.calculate());
		
		//6*5+3*8
		Operation calculation2 = new Sum(
				new Multiplication(new Value(6), new Value(5)),
				new Multiplication(new Value(3), new Value(8))
				);
		
		System.out.println("6*5+3*8 = " + calculation2.calculate());
		
		//5+3*8+4*3
		Operation calculation3 = new Sum(
				5, 
				new Sum(new Multiplication(3, 8), 
						new Multiplication(4, 3)));
		
		System.out.println("5+3*8+4*3 = " + calculation3.calculate());
		
		
		String expression = "5+3*8+4*3";
		
		/* El siguiente codigo no funciona (deprecated) */
		/*
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("javascript");
		
		try {
			var result = engine.eval(expression);
			System.out.println("El resultado es " + result);
		} catch(Exception ex) {
			System.err.println("Error al ejectuar la expresion " + expression);
			System.err.println(ex.getMessage());
		}
		*/
		
		Context jsContext = Context.enter();	//Context es una libreria de JavaScript
		try {
			var res = jsContext.evaluateString(jsContext.initSafeStandardObjects(), 
					expression, 
					"Calculo", 1, 
					null);
			
			System.out.println("El resultado es " + expression + " = " + res);
		} finally {
			Context.exit();
		}		
	}
}