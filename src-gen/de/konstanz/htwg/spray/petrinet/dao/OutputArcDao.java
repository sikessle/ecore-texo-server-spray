package de.konstanz.htwg.spray.petrinet.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import de.konstanz.htwg.spray.petrinet.OutputArc;
import de.konstanz.htwg.spray.petrinet.PetriNetModelPackage;

/**
 * The Dao implementation for the model object '<em><b>OutputArc</b></em>'.
 * 
 * @generated
 */
public class OutputArcDao extends BaseDao<OutputArc> {

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
