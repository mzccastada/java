package indra.talentCamp.database.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Persona {
	
	@Getter @Setter @NonNull
	private int id;
	
	@Getter @Setter @NonNull
	private String nombre;
	
	@Getter @Setter
	private int edad;
		
/*	@Override
	public String toString() {
		return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
	}*/
}