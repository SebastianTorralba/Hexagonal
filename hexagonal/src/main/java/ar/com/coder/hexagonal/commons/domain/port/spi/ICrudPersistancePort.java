package ar.com.coder.hexagonal.commons.domain.port.spi;

import java.util.List;

public interface ICrudPersistancePort<T,ID> {

	T create(T entity);
	List<T> createAll(Iterable<T> entityList);
	
	T read(ID id);
	
	T update(T entity);
	
	List<T> search();
	
	int delete(ID id);



}
