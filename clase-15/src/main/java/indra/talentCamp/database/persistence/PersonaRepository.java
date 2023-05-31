package indra.talentCamp.database.persistence;

import java.sql.*;
import java.util.*;
import indra.talentCamp.database.models.Persona;
import lombok.*;

public class PersonaRepository implements Repository<Persona>{
	
	@Getter @Setter
	private String connectionString;
	
	@Override
	public void save(Persona nuevo) throws SaveErrorException {
		throw new Error("Not Implemented Yet");		
	}

	@Override
	public void update(Persona existente) throws UpdateErrorException {
		throw new Error("Not Implemented Yet");		
	}

	@Override
	public void delete(int id) throws NotFoundException {
		throw new Error("Not Implemented Yet");		
	}

	@Override
	public List<Persona> findAll() {		
		Connection conn = null;
		List<Persona> result = new ArrayList<Persona>();

		try {
			try {			
//				conn = DriverManager.getConnection("jdbc:sqlite:indra.db");
				conn = DriverManager.getConnection(this.connectionString);
				
				Statement select = conn.createStatement();
				ResultSet resultSet = select.executeQuery("SELECT * FROM Personas");				

				while (resultSet.next()) {
					Persona p = new Persona();
					
					p.setId(resultSet.getInt("id"));
					p.setNombre(resultSet.getString("nombre"));
					p.setEdad(resultSet.getInt("edad"));
					result.add(p);
				}
			} finally {
				if (conn != null) {
					conn.close();					
				}			
			}
		} catch (Exception e) {
			throw new Error(e.getMessage());
		}
		return result;
	}

	@Override
	public Persona findById(int id) throws NotFoundException {
		throw new Error("Not Implemented Yet");
//		return null;
	}
}