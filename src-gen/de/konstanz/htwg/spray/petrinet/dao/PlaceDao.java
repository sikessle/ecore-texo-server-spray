package de.konstanz.htwg.spray.petrinet.dao;

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
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return PetriNetModelPackage.INSTANCE.getPlaceEClass();
	}
}
