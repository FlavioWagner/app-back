package br.com.appnovo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ICustomRepository<T,ID> extends JpaRepository<T, ID>{
	@Query("select t from T t where id = :id")
	T getById(ID id);
	
	/*
	private String getGenericName() { 
		return ((Class) ((ParameterizedType) getClass() .getGenericSuperclass()).getActualTypeArguments()[0]).getTypeName(); 
	}	
	*/
}
