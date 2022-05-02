package br.com.appnovo.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.appnovo.controller.interfaces.ICustomController;

@RestController
public abstract class CustomClassController<S,T,I> implements ICustomController<T, I> {
	
	protected abstract S getService();
	
	@SuppressWarnings({ "unchecked", "unused" })
	private String getGenericName(){      	
        return ((Class<S>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0]).getTypeName();
    }
	
	@SuppressWarnings({"unchecked"} )
	private String getGenericNamePK(){      	
        return ((Class<I>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[2]).getTypeName();
    }	
	
	@SuppressWarnings("unchecked")
	@Override
	public ResponseEntity<List<T>> Listar() {			
		
		try {
			S service = getService();
			Method method = service.getClass().getMethod("Listar");
			Object o = method.invoke(service);
			
			return ResponseEntity.ok((List<T>)o);
			
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return ResponseEntity.noContent().build();
	}

	@SuppressWarnings("unchecked")
	@Override
	public ResponseEntity<T> Item(I id) {
		
		try {		
			S service = getService();
			Method method = service.getClass().getMethod("Item",Class.forName(getGenericNamePK()));	
			Object o = method.invoke(service,id);
			
			return ResponseEntity.ok((T)o);
			
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ResponseEntity.noContent().build();
	}

	@Override
	public ResponseEntity<T> Inserir(T item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<T> atualizar(T item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Deletar(I id) {
		try {
			S service = getService();
			Method method = service.getClass().getMethod("Deletar",Class.forName(getGenericNamePK()));	
			method.invoke(service,id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
