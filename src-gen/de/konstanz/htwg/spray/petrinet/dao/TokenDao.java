package de.konstanz.htwg.spray.petrinet.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import de.konstanz.htwg.spray.petrinet.PetriNetModelPackage;
import de.konstanz.htwg.spray.petrinet.Token;

/**
 * The Dao implementation for the model object '<em><b>Token</b></em>'.
 * 
 * @generated
 */
public class TokenDao extends BaseDao<Token> {

	/**
	 * @generated
	 */
	@Override
	public Class<Token> getEntityClass() {
		return Token.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return PetriNetModelPackage.INSTANCE.getTokenEClass();
	}
}
