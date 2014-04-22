package de.konstanz.htwg.spray.petrinet.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.web.example.CustomBaseDao;
import de.konstanz.htwg.spray.petrinet.OutputArc;
import de.konstanz.htwg.spray.petrinet.PetriNetModelPackage;

/**
 * The Dao implementation for the model object '<em><b>OutputArc</b></em>'.
 * 
 * @generated
 */
public class OutputArcDao extends CustomBaseDao<OutputArc> {

	/**
	 * @generated
	 */
	@Override
	public Class<OutputArc> getEntityClass() {
		return OutputArc.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return PetriNetModelPackage.INSTANCE.getOutputArcEClass();
	}
}
