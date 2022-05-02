package br.com.appnovo.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.appnovo.controller.interfaces.ICustomController;

@RestController
public abstract class CustomClassController<S,T,I> implements ICustomController<T, I> {
	
    @SuppressWarnings("unchecked")
	private String getGenericName(){      	
        return ((Class<S>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0]).getTypeName();
    }	
	
	protected abstract S getService();
	
	@SuppressWarnings("unchecked")
	@Override
	public ResponseEntity<List<T>> Listar() {			
		java.lang.reflect.Method method = null;
		try {
			
			S service = getService();
			method = service.getClass().getMethod("Listar");
			Object o = method.invoke(service);
			System.out.println(o.toString());
			
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

	@Override
	public ResponseEntity<T> Item(I id) {
		// TODO Auto-generated method stub
		return null;
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
	public boolean deletar(I id) {
		// TODO Auto-generated method stub
		return false;
	}
}
