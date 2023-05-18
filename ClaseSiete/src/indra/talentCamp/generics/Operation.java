package indra.talentCamp.generics;

@FunctionalInterface
public interface Operation<T> {
	
	//En las interfaces funcionales solo debe haber un metodo
	T operate(T a, T b);
}