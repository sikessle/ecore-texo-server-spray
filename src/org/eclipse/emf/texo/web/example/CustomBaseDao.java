package org.eclipse.emf.texo.web.example;

import java.lang.reflect.Method;
import java.util.List;

import org.eclipse.emf.texo.server.store.BaseDao;

/**
 * Custom DAO Superclass necessary for clean deletion of references on an object
 * before deleting the object itself.
 * Make sure the generated *Dao.java clases in src-gen inherit from this class in
 * stead of the standard BaseDao class
 */
public abstract class CustomBaseDao<T> extends BaseDao<T> {
	
	/**
	 * Clears all the references on an object before deleting it.
	 * Uses reflection to be as generic as possible/easy to generate
	 */
	@Override
	public void remove(T objectToDelete) {
		if(objectToDelete == null){
			throw new IllegalArgumentException();
		}
		
		final String objectClass = objectToDelete.getClass().getSimpleName();
		final List<Object> referers = this.getReferingObjects(objectToDelete, Integer.MAX_VALUE, true);
		
		// clear the references
		for (Object referer : referers) {
				try {
					Method removeFromMethod = referer.getClass().
							getMethod("removeFrom"+objectClass,objectToDelete.getClass());
					removeFromMethod.invoke(referer,objectToDelete);
				} catch (Exception e){
					System.out.println(e);
				}
		}
		super.remove(objectToDelete);
	}

}
