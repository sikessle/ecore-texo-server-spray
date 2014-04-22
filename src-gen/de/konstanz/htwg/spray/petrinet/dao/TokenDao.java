package de.konstanz.htwg.spray.petrinet.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.web.example.CustomBaseDao;
import de.konstanz.htwg.spray.petrinet.PetriNetModelPackage;
import de.konstanz.htwg.spray.petrinet.Token;

/**
 * The Dao implementation for the model object '<em><b>Token</b></em>'.
 * 
 * @generated
 */
public class TokenDao extends CustomBaseDao<Token> {

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
