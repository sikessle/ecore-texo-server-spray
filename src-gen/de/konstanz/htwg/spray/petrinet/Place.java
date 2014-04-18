package de.konstanz.htwg.spray.petrinet;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>Place</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "petriNet_Place")
@Table(name = "petriNet_Place")
public class Place extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Column(name = "name")
	private String name = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumns({ @JoinColumn(name = "petriNet_Place_id") })
	private List<Token> token = new ArrayList<Token>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	@JoinTable(joinColumns = { @JoinColumn(name = "petriNet_Place_id") }, inverseJoinColumns = { @JoinColumn(name = "petriNet_InputArc_id") }, name = "petriNet_Place_inputArc")
	private List<InputArc> inputArc = new ArrayList<InputArc>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	@JoinTable(joinColumns = { @JoinColumn(name = "petriNet_Place_id") }, inverseJoinColumns = { @JoinColumn(name = "petriNet_OutputArc_id") }, name = "petriNet_Place_outputArc")
	private List<OutputArc> outputArc = new ArrayList<OutputArc>();

	/**
	 * Returns the value of '<em><b>name</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>name</b></em>' feature
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the '{@link Place#getName() <em>name</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newName
	 *            the new value of the '{@link Place#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
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
	 * Sets the '{@link Place#getToken() <em>token</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newToken
	 *            the new value of the '{@link Place#getToken() token}' feature.
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
	 * Sets the '{@link Place#getInputArc() <em>inputArc</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newInputArc
	 *            the new value of the '{@link Place#getInputArc() inputArc}'
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
	 * Sets the '{@link Place#getOutputArc() <em>outputArc</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newOutputArc
	 *            the new value of the '{@link Place#getOutputArc() outputArc}'
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
		return "Place " + " [name: " + getName() + "]";
	}
}
