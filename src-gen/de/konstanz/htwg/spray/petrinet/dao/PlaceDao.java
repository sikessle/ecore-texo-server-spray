package de.konstanz.htwg.spray.petrinet.dao;

import java.lang.reflect.Method;
import java.util.List;

import org.eclipse.emf.common.util.Reflect;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;

import de.konstanz.htwg.spray.petrinet.PetriNetModelPackage;
import de.konstanz.htwg.spray.petrinet.Place;
/**
 * The Dao implementation for the model object '<em><b>Place</b></em>'.
 * 
 * @generated
 */
public class PlaceDao extends BaseDao<Place> {

	/**
	 * @generated
	 */
	@Override
	public Class<Place> getEntityClass() {
		return Place.class;
	}

	/**
	 * Clears all the references on an object before deleting it.
	 * Uses reflection to be as generic as possible/easy to generate
	 */
	@Override
	public void remove(Place objectToDelete) {
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

	@Override
	public void remove(List<Place> t) {
		for (Place p : t) {
			this.remove(p);
		}
		return;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return PetriNetModelPackage.INSTANCE.getPlaceEClass();
	}
}
