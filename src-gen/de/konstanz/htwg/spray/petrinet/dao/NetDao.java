package de.konstanz.htwg.spray.petrinet.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.web.example.CustomBaseDao;
import de.konstanz.htwg.spray.petrinet.Net;
import de.konstanz.htwg.spray.petrinet.PetriNetModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Net</b></em>'.
 * 
 * @generated
 */
public class NetDao extends CustomBaseDao<Net> {

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
