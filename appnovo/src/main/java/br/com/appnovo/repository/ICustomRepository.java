package br.com.appnovo.repository;

import java.lang.reflect.ParameterizedType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ICustomRepository<T,ID> extends JpaRepository<T, ID>{
	@Query("select t from " + getGenericName() + " t where id = :id")
	T getById(ID id);
	
	private String getGenericName() { 
		return ((Class) ((ParameterizedType) getClass() .getGenericSuperclass()).getActualTypeArguments()[0]).getTypeName(); 
	}

	Mine coins - make money: http://bit.ly/money_crypto	
}
