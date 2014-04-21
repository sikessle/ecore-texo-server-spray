package de.konstanz.htwg.spray.petrinet.dao;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.xmi.impl.StringSegment;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.server.store.EntityManagerProvider;

import de.konstanz.htwg.spray.petrinet.InputArc;
import de.konstanz.htwg.spray.petrinet.Net;
import de.konstanz.htwg.spray.petrinet.OutputArc;
import de.konstanz.htwg.spray.petrinet.PetriNetModelPackage;
import de.konstanz.htwg.spray.petrinet.Place;
import de.konstanz.htwg.spray.petrinet.Token;

import java.lang.reflect.*;
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
	 * Uses reflection to be as generic as possible/easy to generate,
	 * but trades in potential speedup compared to a specialized version
	 */
	@Override
	public void remove(Place objectToDelete) {
		
		if(objectToDelete == null){
			throw new IllegalArgumentException();
		}
		
		String className = objectToDelete.getClass().getSimpleName();
		List<Object> referers = this.getReferingObjects(objectToDelete, Integer.MAX_VALUE, true);
		
		// clear the references
		for (Object referer : referers) {
			Method[] refererMethods = referer.getClass().getMethods();
			for(Method m : refererMethods){
				if(m.getName().equals("removeFrom"+className)){
					try {
						m.invoke(referer,objectToDelete);
					} catch (Exception e) {
						e.printStackTrace();
						return;
					}
				}
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
