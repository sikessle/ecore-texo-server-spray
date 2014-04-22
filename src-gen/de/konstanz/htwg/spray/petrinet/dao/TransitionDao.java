package de.konstanz.htwg.spray.petrinet.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.web.example.CustomBaseDao;
import de.konstanz.htwg.spray.petrinet.PetriNetModelPackage;
import de.konstanz.htwg.spray.petrinet.Transition;

/**
 * The Dao implementation for the model object '<em><b>Transition</b></em>'.
 * 
 * @generated
 */
public class TransitionDao extends CustomBaseDao<Transition> {

	/**
	 * @generated
	 */
	@Override
	public Class<Transition> getEntityClass() {
		return Transition.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return PetriNetModelPackage.INSTANCE.getTransitionEClass();
	}
}
