package de.konstanz.htwg.spray.petrinet.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.web.example.CustomBaseDao;
import de.konstanz.htwg.spray.petrinet.InputArc;
import de.konstanz.htwg.spray.petrinet.PetriNetModelPackage;

/**
 * The Dao implementation for the model object '<em><b>InputArc</b></em>'.
 * 
 * @generated
 */
public class InputArcDao extends CustomBaseDao<InputArc> {

	/**
	 * @generated
	 */
	@Override
	public Class<InputArc> getEntityClass() {
		return InputArc.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return PetriNetModelPackage.INSTANCE.getInputArcEClass();
	}
}
