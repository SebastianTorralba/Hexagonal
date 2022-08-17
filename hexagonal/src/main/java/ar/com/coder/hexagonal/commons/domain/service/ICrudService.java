package ar.com.coder.hexagonal.commons.domain.service;

import java.util.List;

public interface ICrudService<T,ID> extends IBaseService {

	T create(T entity);
	List<T> createAll(Iterable<T> entityList);
	
	T read(ID id);
	
	T update(T entity);
	
	List<T> search();
	
	int delete(ID id);



}
