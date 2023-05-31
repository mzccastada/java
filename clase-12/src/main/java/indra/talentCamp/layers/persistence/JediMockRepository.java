/**
 * 
 */
package indra.talentCamp.layers.persistence;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.lang3.NotImplementedException;
import indra.talentCamp.layers.models.*;
import indra.talentCamp.layers.persistence.interfaces.Repository;

public class JediMockRepository implements Repository<Jedi> {
	
	private List<Jedi> jedis = new LinkedList<Jedi>();
	
	private int ultimoId() {
		return this.jedis.stream().mapToInt(j -> j.getId()).max().orElse(0);
	}
	
	public List<Jedi> findAll() {
		return Collections.unmodifiableList(this.jedis);
	}
	
	public Jedi findById(int id) throws NotFoundException {
		return this.jedis.stream()
				.filter(j -> j.getId() == id)
				.findFirst()
				.orElseThrow(() -> new NotFoundException());
	}
	
	public void save(Jedi jedi) {
		jedi.setId(this.ultimoId() + 1);
		this.jedis.add(jedi);
	}
	
	public void update(Jedi jedi) {
		//El update no hace nada
	}
	
	public void delete(int id) throws NotFoundException {
		Jedi j = this.findById(id);
		this.jedis.remove(j);
	}
}