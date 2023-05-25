package indra.talentCamp.layers.persistence.interfaces;

import java.util.List;
import indra.talentCamp.layers.persistence.NotFoundException;
import indra.talentCamp.layers.persistence.SaveErrorException;

public interface Repository<T> {	
	public T findById(int id) throws NotFoundException;
	public List<T> findAll();
	public void save(T newObject) throws SaveErrorException;
	public void update(T existingObject);
	public void delete(int id) throws NotFoundException;	
}