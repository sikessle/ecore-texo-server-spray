package de.konstanz.htwg.spray.petrinet.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import de.konstanz.htwg.spray.petrinet.PetriNetModelPackage;
import de.konstanz.htwg.spray.petrinet.Transition;
import java.util.*;
/* * The Dao implementation for the model object '<em><b>Transition</b></em>'.
 * 
 * @generated
 */
public class TransitionDao extends BaseDao<Transition> {

	/**
	 * @generated
	 */
	@Override
	public Class<Transition> getEntityClass() {
		return Transition.class;
	}

	@Override
	public void remove(Transition t){
		t.setName("hahahahahaha");
		return;
	}
	
	@Override
	public void remove(List<Transition> t){
		
		return;
	}
	
	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return PetriNetModelPackage.INSTANCE.getTransitionEClass();
	}
}
