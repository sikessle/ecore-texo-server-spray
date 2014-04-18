package de.konstanz.htwg.spray.petrinet;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>Net</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "petriNet_Net")
public class Net extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	private List<Place> place = new ArrayList<Place>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	private List<Token> token = new ArrayList<Token>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	private List<InputArc> inputArc = new ArrayList<InputArc>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	private List<OutputArc> outputArc = new ArrayList<OutputArc>();

	/**
	 * Returns the value of '<em><b>place</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>place</b></em>' feature
	 * @generated
	 */
	public List<Place> getPlace() {
		return place;
	}

	/**
	 * Adds to the <em>place</em> feature.
	 * 
	 * @param placeValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToPlace(Place placeValue) {
		if (!place.contains(placeValue)) {
			boolean result = place.add(placeValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>place</em> feature.
	 * 
	 * @param placeValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 * 
	 * @generated
	 */
	public boolean removeFromPlace(Place placeValue) {
		if (place.contains(placeValue)) {
			boolean result = place.remove(placeValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>place</em> feature.
	 * 
	 * @generated
	 */
	public void clearPlace() {
		while (!place.isEmpty()) {
			removeFromPlace(place.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Net#getPlace() <em>place</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newPlace
	 *            the new value of the '{@link Net#getPlace() place}' feature.
	 * @generated
	 */
	public void setPlace(List<Place> newPlace) {
		place = newPlace;
	}

	/**
	 * Returns the value of '<em><b>token</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>token</b></em>' feature
	 * @generated
	 */
	public List<Token> getToken() {
		return token;
	}

	/**
	 * Adds to the <em>token</em> feature.
	 * 
	 * @param tokenValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToToken(Token tokenValue) {
		if (!token.contains(tokenValue)) {
			boolean result = token.add(tokenValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>token</em> feature.
	 * 
	 * @param tokenValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 * 
	 * @generated
	 */
	public boolean removeFromToken(Token tokenValue) {
		if (token.contains(tokenValue)) {
			boolean result = token.remove(tokenValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>token</em> feature.
	 * 
	 * @generated
	 */
	public void clearToken() {
		while (!token.isEmpty()) {
			removeFromToken(token.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Net#getToken() <em>token</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newToken
	 *            the new value of the '{@link Net#getToken() token}' feature.
	 * @generated
	 */
	public void setToken(List<Token> newToken) {
		token = newToken;
	}

	/**
	 * Returns the value of '<em><b>inputArc</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>inputArc</b></em>' feature
	 * @generated
	 */
	public List<InputArc> getInputArc() {
		return inputArc;
	}

	/**
	 * Adds to the <em>inputArc</em> feature.
	 * 
	 * @param inputArcValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToInputArc(InputArc inputArcValue) {
		if (!inputArc.contains(inputArcValue)) {
			boolean result = inputArc.add(inputArcValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>inputArc</em> feature.
	 * 
	 * @param inputArcValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 * 
	 * @generated
	 */
	public boolean removeFromInputArc(InputArc inputArcValue) {
		if (inputArc.contains(inputArcValue)) {
			boolean result = inputArc.remove(inputArcValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>inputArc</em> feature.
	 * 
	 * @generated
	 */
	public void clearInputArc() {
		while (!inputArc.isEmpty()) {
			removeFromInputArc(inputArc.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Net#getInputArc() <em>inputArc</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newInputArc
	 *            the new value of the '{@link Net#getInputArc() inputArc}'
	 *            feature.
	 * @generated
	 */
	public void setInputArc(List<InputArc> newInputArc) {
		inputArc = newInputArc;
	}

	/**
	 * Returns the value of '<em><b>outputArc</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>outputArc</b></em>' feature
	 * @generated
	 */
	public List<OutputArc> getOutputArc() {
		return outputArc;
	}

	/**
	 * Adds to the <em>outputArc</em> feature.
	 * 
	 * @param outputArcValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToOutputArc(OutputArc outputArcValue) {
		if (!outputArc.contains(outputArcValue)) {
			boolean result = outputArc.add(outputArcValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>outputArc</em> feature.
	 * 
	 * @param outputArcValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 * 
	 * @generated
	 */
	public boolean removeFromOutputArc(OutputArc outputArcValue) {
		if (outputArc.contains(outputArcValue)) {
			boolean result = outputArc.remove(outputArcValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>outputArc</em> feature.
	 * 
	 * @generated
	 */
	public void clearOutputArc() {
		while (!outputArc.isEmpty()) {
			removeFromOutputArc(outputArc.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Net#getOutputArc() <em>outputArc</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newOutputArc
	 *            the new value of the '{@link Net#getOutputArc() outputArc}'
	 *            feature.
	 * @generated
	 */
	public void setOutputArc(List<OutputArc> newOutputArc) {
		outputArc = newOutputArc;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Net ";
	}
}
