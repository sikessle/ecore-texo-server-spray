package de.konstanz.htwg.spray.petrinet.dao;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;

import de.konstanz.htwg.spray.petrinet.Net;
import de.konstanz.htwg.spray.petrinet.PetriNetModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Net</b></em>'.
 * 
 * @generated
 */
public class NetDao extends BaseDao<Net> {

	/**
	 * @generated
	 */
	@Override
	public Class<Net> getEntityClass() {
		return Net.class;
	}
	
	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return PetriNetModelPackage.INSTANCE.getNetEClass();
	}
}
