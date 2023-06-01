package indra.talentCamp.jpa.models;

import java.util.Random;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@Entity
@Table(name="avengers")
public class SuperHeroe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="alias", length = 100, nullable = false, unique = true)
	private String nombreArtistico;
	
	@Column(name="strength", nullable = false)
	private int fuerza;
	
	@Column(name="superpower", nullable = false)
	private String superpoder;
	
	public void evaluarFuerza() {
		this.fuerza = (new Random().nextInt(10000000));
	}
	
	public void validate() throws BusinessException {
		if(this.nombreArtistico == null) {
			throw new BusinessException("Falta el nombre");			
		}
		
		if(this.nombreArtistico.length() < 2) {
			throw new BusinessException("El nombre es muy corto");
		}
	}
}