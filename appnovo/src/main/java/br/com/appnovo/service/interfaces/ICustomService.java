package br.com.appnovo.service.interfaces;

import java.util.List;

public interface ICustomService<T,I> {
	public List<T> Listar();	
	public T Item(I id);	
	public T Inserir(T item);	
	public T Atualizar(T item);	
	public boolean Deletar(I id);
}
