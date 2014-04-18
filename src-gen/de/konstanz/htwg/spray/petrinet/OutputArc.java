package de.konstanz.htwg.spray.petrinet;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>OutputArc</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "petriNet_OutputArc")
public class OutputArc extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	@JoinTable(joinColumns = { @JoinColumn(name = "petriNet_OutputArc_id") }, inverseJoinColumns = { @JoinColumn(name = "petriNet_Place_id") }, name = "petriNet_OutputArc_place")
	private List<Place> place = new ArrayList<Place>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	@JoinTable(joinColumns = { @JoinColumn(name = "petriNet_OutputArc_id") }, inverseJoinColumns = { @JoinColumn(name = "petriNet_Transition_id") }, name = "petriNet_OutputArc_transition")
	private List<Transition> transition = new ArrayList<Transition>();

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
	 * Sets the '{@link OutputArc#getPlace() <em>place</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newPlace
	 *            the new value of the '{@link OutputArc#getPlace() place}'
	 *            feature.
	 * @generated
	 */
	public void setPlace(List<Place> newPlace) {
		place = newPlace;
	}

	/**
	 * Returns the value of '<em><b>transition</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>transition</b></em>' feature
	 * @generated
	 */
	public List<Transition> getTransition() {
		return transition;
	}

	/**
	 * Adds to the <em>transition</em> feature.
	 * 
	 * @param transitionValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToTransition(Transition transitionValue) {
		if (!transition.contains(transitionValue)) {
			boolean result = transition.add(transitionValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>transition</em> feature.
	 * 
	 * @param transitionValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 * 
	 * @generated
	 */
	public boolean removeFromTransition(Transition transitionValue) {
		if (transition.contains(transitionValue)) {
			boolean result = transition.remove(transitionValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>transition</em> feature.
	 * 
	 * @generated
	 */
	public void clearTransition() {
		while (!transition.isEmpty()) {
			removeFromTransition(transition.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OutputArc#getTransition() <em>transition</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTransition
	 *            the new value of the '{@link OutputArc#getTransition()
	 *            transition}' feature.
	 * @generated
	 */
	public void setTransition(List<Transition> newTransition) {
		transition = newTransition;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "OutputArc ";
	}
}
