package indra.talentCamp.generics;

public class Safe<T, S> {
	
	private S password;
	private T value;
	
	public Safe(S password) {
		this.password = password;
	}
	
	public void saveValue(T value) {
		this.value = value;
	}
	
	public T readValue(S password) {
		if(password.equals(this.password)) {
			return this.value;
		}
		
		//Es mejor usar una excepcion pero por pereza lo pongo asi...
		throw new Error("Acceso no autorizado");
	}
	
}
