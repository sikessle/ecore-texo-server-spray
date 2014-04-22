package de.konstanz.htwg.spray.petrinet;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>Transition</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "petriNet_Transition")
public class Transition extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String name = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	private List<InputArc> inputArc = new ArrayList<InputArc>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
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
	 * Sets the '{@link Transition#getName() <em>name</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newName
	 *            the new value of the '{@link Transition#getName() name}'
	 *            feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
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
	 * Sets the '{@link Transition#getInputArc() <em>inputArc</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newInputArc
	 *            the new value of the '{@link Transition#getInputArc()
	 *            inputArc}' feature.
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
	 * Sets the '{@link Transition#getOutputArc() <em>outputArc</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newOutputArc
	 *            the new value of the '{@link Transition#getOutputArc()
	 *            outputArc}' feature.
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
		return "Transition " + " [name: " + getName() + "]";
	}
}
