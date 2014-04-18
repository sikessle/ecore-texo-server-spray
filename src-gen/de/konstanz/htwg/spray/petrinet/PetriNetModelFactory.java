package de.konstanz.htwg.spray.petrinet;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelFactory;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: PetriNet. It
 * contains code to create instances {@link ModelObject} wrappers and instances
 * for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PetriNetModelFactory implements ModelFactory {

	/**
	 * Creates an instance for an {@link EClass} <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param eClass
	 *            creates a Object instance for this EClass
	 * @return an object representing the eClass
	 * @generated
	 */
	public Object create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PetriNetModelPackage.PLACE_CLASSIFIER_ID:
			return createPlace();
		case PetriNetModelPackage.TOKEN_CLASSIFIER_ID:
			return createToken();
		case PetriNetModelPackage.INPUTARC_CLASSIFIER_ID:
			return createInputArc();
		case PetriNetModelPackage.OUTPUTARC_CLASSIFIER_ID:
			return createOutputArc();
		case PetriNetModelPackage.TRANSITION_CLASSIFIER_ID:
			return createTransition();
		case PetriNetModelPackage.NET_CLASSIFIER_ID:
			return createNet();
		default:
			throw new IllegalArgumentException("The EClass '"
					+ eClass.getName()
					+ "' is not a valid EClass for this EPackage");
		}
	}

	/**
	 * Wraps an object in a {@link ModelObject}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param eClass
	 *            the EClass of the object
	 * @param adaptee
	 *            the object being wrapped/adapted
	 * @return the wrapper {@link ModelObject}
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ModelObject createModelObject(EClass eClass, Object adaptee) {
		ModelObject<Object> modelObject = null;
		switch (eClass.getClassifierID()) {
		case PetriNetModelPackage.PLACE_CLASSIFIER_ID:
			modelObject = new PlaceModelObject();
			break;
		case PetriNetModelPackage.TOKEN_CLASSIFIER_ID:
			modelObject = new TokenModelObject();
			break;
		case PetriNetModelPackage.INPUTARC_CLASSIFIER_ID:
			modelObject = new InputArcModelObject();
			break;
		case PetriNetModelPackage.OUTPUTARC_CLASSIFIER_ID:
			modelObject = new OutputArcModelObject();
			break;
		case PetriNetModelPackage.TRANSITION_CLASSIFIER_ID:
			modelObject = new TransitionModelObject();
			break;
		case PetriNetModelPackage.NET_CLASSIFIER_ID:
			modelObject = new NetModelObject();
			break;
		default:
			throw new IllegalArgumentException("The EClass '" + eClass
					+ "' is not defined in this EPackage");
		}
		modelObject.setTarget(adaptee);
		return modelObject;
	}

	/**
	 * Creates a feature map entry instance for a certain EStructuralFeature.
	 * 
	 * @param eFeature
	 *            the feature map feature
	 * @return the pojo feature map entry
	 * @generated
	 */
	public Object createFeatureMapEntry(EStructuralFeature eFeature) {
		throw new IllegalArgumentException("The EStructuralFeature '"
				+ eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}.
	 * If the feature map entry is null then a new one is created and <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eFeature
	 *            the feature map feature of the object
	 * @param adaptee
	 *            the pojo feature map entry being wrapped/adapted
	 * @return the wrapper {@link ModelFeatureMapEntry}
	 * @generated
	 */
	public ModelFeatureMapEntry<?> createModelFeatureMapEntry(
			EStructuralFeature eFeature, Object adaptee) {
		throw new IllegalArgumentException("The EStructuralFeature '"
				+ eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Place
	 * @generated
	 */
	public Place createPlace() {
		return new Place();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Token
	 * @generated
	 */
	public Token createToken() {
		return new Token();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass InputArc
	 * @generated
	 */
	public InputArc createInputArc() {
		return new InputArc();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass OutputArc
	 * @generated
	 */
	public OutputArc createOutputArc() {
		return new OutputArc();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         Transition
	 * @generated
	 */
	public Transition createTransition() {
		return new Transition();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Net
	 * @generated
	 */
	public Net createNet() {
		return new Net();
	}

	/**
	 * Converts an instance of an {@link EDataType} to a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eDataType
	 *            the {@link EDataType} defining the type
	 * @param value
	 *            the object to convert, if the value is null then null is
	 *            returned.
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String value) {
		switch (eDataType.getClassifierID()) {
		default:
			throw new IllegalArgumentException("The EDatatype '" + eDataType
					+ "' is not defined in this EPackage");
		}
	}

	/**
	 * Converts an instance of an {@link EDataType} to a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eDataType
	 *            the {@link EDataType} defining the type
	 * @param value
	 *            the object to convert, if value == null then null is returned
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object value) {
		switch (eDataType.getClassifierID()) {
		default:
			throw new IllegalArgumentException("The EDatatype '" + eDataType
					+ "' is not defined in this EPackage.");
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Place</b></em>'.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param <E>
	 *            the domain model java class
	 * 
	 * @generated
	 */
	public static class PlaceModelObject<E extends Place> extends
			IdentifiableModelFactory.IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return PetriNetModelPackage.INSTANCE.getPlaceEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return PetriNetModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PetriNetModelPackage.PLACE_DB_ID_FEATURE_ID:
				return getTarget().getDb_Id();
			case PetriNetModelPackage.PLACE_DB_VERSION_FEATURE_ID:
				return getTarget().getDb_version();
			case PetriNetModelPackage.PLACE_NAME_FEATURE_ID:
				return getTarget().getName();
			case PetriNetModelPackage.PLACE_TOKEN_FEATURE_ID:
				return getTarget().getToken();
			case PetriNetModelPackage.PLACE_INPUTARC_FEATURE_ID:
				return getTarget().getInputArc();
			case PetriNetModelPackage.PLACE_OUTPUTARC_FEATURE_ID:
				return getTarget().getOutputArc();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PetriNetModelPackage.PLACE_DB_ID_FEATURE_ID:
				getTarget().setDb_Id((Long) value);
				return;
			case PetriNetModelPackage.PLACE_DB_VERSION_FEATURE_ID:
				getTarget().setDb_version((Integer) value);
				return;
			case PetriNetModelPackage.PLACE_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			case PetriNetModelPackage.PLACE_TOKEN_FEATURE_ID:
				getTarget().setToken((List<Token>) value);
				return;
			case PetriNetModelPackage.PLACE_INPUTARC_FEATURE_ID:
				getTarget().setInputArc((List<InputArc>) value);
				return;
			case PetriNetModelPackage.PLACE_OUTPUTARC_FEATURE_ID:
				getTarget().setOutputArc((List<OutputArc>) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PetriNetModelPackage.PLACE_TOKEN_FEATURE_ID:
				return getTarget().addToToken((Token) value);

			case PetriNetModelPackage.PLACE_INPUTARC_FEATURE_ID:
				return getTarget().addToInputArc((InputArc) value);

			case PetriNetModelPackage.PLACE_OUTPUTARC_FEATURE_ID:
				return getTarget().addToOutputArc((OutputArc) value);
			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PetriNetModelPackage.PLACE_TOKEN_FEATURE_ID:
				return getTarget().removeFromToken((Token) value);

			case PetriNetModelPackage.PLACE_INPUTARC_FEATURE_ID:
				return getTarget().removeFromInputArc((InputArc) value);

			case PetriNetModelPackage.PLACE_OUTPUTARC_FEATURE_ID:
				return getTarget().removeFromOutputArc((OutputArc) value);
			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Token</b></em>'.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param <E>
	 *            the domain model java class
	 * 
	 * @generated
	 */
	public static class TokenModelObject<E extends Token> extends
			IdentifiableModelFactory.IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return PetriNetModelPackage.INSTANCE.getTokenEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return PetriNetModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PetriNetModelPackage.TOKEN_DB_ID_FEATURE_ID:
				return getTarget().getDb_Id();
			case PetriNetModelPackage.TOKEN_DB_VERSION_FEATURE_ID:
				return getTarget().getDb_version();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PetriNetModelPackage.TOKEN_DB_ID_FEATURE_ID:
				getTarget().setDb_Id((Long) value);
				return;
			case PetriNetModelPackage.TOKEN_DB_VERSION_FEATURE_ID:
				getTarget().setDb_version((Integer) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>InputArc</b></em>'.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param <E>
	 *            the domain model java class
	 * 
	 * @generated
	 */
	public static class InputArcModelObject<E extends InputArc> extends
			IdentifiableModelFactory.IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return PetriNetModelPackage.INSTANCE.getInputArcEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return PetriNetModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PetriNetModelPackage.INPUTARC_DB_ID_FEATURE_ID:
				return getTarget().getDb_Id();
			case PetriNetModelPackage.INPUTARC_DB_VERSION_FEATURE_ID:
				return getTarget().getDb_version();
			case PetriNetModelPackage.INPUTARC_PLACE_FEATURE_ID:
				return getTarget().getPlace();
			case PetriNetModelPackage.INPUTARC_TRANSITION_FEATURE_ID:
				return getTarget().getTransition();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PetriNetModelPackage.INPUTARC_DB_ID_FEATURE_ID:
				getTarget().setDb_Id((Long) value);
				return;
			case PetriNetModelPackage.INPUTARC_DB_VERSION_FEATURE_ID:
				getTarget().setDb_version((Integer) value);
				return;
			case PetriNetModelPackage.INPUTARC_PLACE_FEATURE_ID:
				getTarget().setPlace((List<Place>) value);
				return;
			case PetriNetModelPackage.INPUTARC_TRANSITION_FEATURE_ID:
				getTarget().setTransition((List<Transition>) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PetriNetModelPackage.INPUTARC_PLACE_FEATURE_ID:
				return getTarget().addToPlace((Place) value);

			case PetriNetModelPackage.INPUTARC_TRANSITION_FEATURE_ID:
				return getTarget().addToTransition((Transition) value);
			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PetriNetModelPackage.INPUTARC_PLACE_FEATURE_ID:
				return getTarget().removeFromPlace((Place) value);

			case PetriNetModelPackage.INPUTARC_TRANSITION_FEATURE_ID:
				return getTarget().removeFromTransition((Transition) value);
			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>OutputArc</b></em>'.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param <E>
	 *            the domain model java class
	 * 
	 * @generated
	 */
	public static class OutputArcModelObject<E extends OutputArc> extends
			IdentifiableModelFactory.IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return PetriNetModelPackage.INSTANCE.getOutputArcEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return PetriNetModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PetriNetModelPackage.OUTPUTARC_DB_ID_FEATURE_ID:
				return getTarget().getDb_Id();
			case PetriNetModelPackage.OUTPUTARC_DB_VERSION_FEATURE_ID:
				return getTarget().getDb_version();
			case PetriNetModelPackage.OUTPUTARC_PLACE_FEATURE_ID:
				return getTarget().getPlace();
			case PetriNetModelPackage.OUTPUTARC_TRANSITION_FEATURE_ID:
				return getTarget().getTransition();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PetriNetModelPackage.OUTPUTARC_DB_ID_FEATURE_ID:
				getTarget().setDb_Id((Long) value);
				return;
			case PetriNetModelPackage.OUTPUTARC_DB_VERSION_FEATURE_ID:
				getTarget().setDb_version((Integer) value);
				return;
			case PetriNetModelPackage.OUTPUTARC_PLACE_FEATURE_ID:
				getTarget().setPlace((List<Place>) value);
				return;
			case PetriNetModelPackage.OUTPUTARC_TRANSITION_FEATURE_ID:
				getTarget().setTransition((List<Transition>) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PetriNetModelPackage.OUTPUTARC_PLACE_FEATURE_ID:
				return getTarget().addToPlace((Place) value);

			case PetriNetModelPackage.OUTPUTARC_TRANSITION_FEATURE_ID:
				return getTarget().addToTransition((Transition) value);
			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PetriNetModelPackage.OUTPUTARC_PLACE_FEATURE_ID:
				return getTarget().removeFromPlace((Place) value);

			case PetriNetModelPackage.OUTPUTARC_TRANSITION_FEATURE_ID:
				return getTarget().removeFromTransition((Transition) value);
			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Transition</b></em>'.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param <E>
	 *            the domain model java class
	 * 
	 * @generated
	 */
	public static class TransitionModelObject<E extends Transition> extends
			IdentifiableModelFactory.IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return PetriNetModelPackage.INSTANCE.getTransitionEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return PetriNetModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PetriNetModelPackage.TRANSITION_DB_ID_FEATURE_ID:
				return getTarget().getDb_Id();
			case PetriNetModelPackage.TRANSITION_DB_VERSION_FEATURE_ID:
				return getTarget().getDb_version();
			case PetriNetModelPackage.TRANSITION_NAME_FEATURE_ID:
				return getTarget().getName();
			case PetriNetModelPackage.TRANSITION_INPUTARC_FEATURE_ID:
				return getTarget().getInputArc();
			case PetriNetModelPackage.TRANSITION_OUTPUTARC_FEATURE_ID:
				return getTarget().getOutputArc();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PetriNetModelPackage.TRANSITION_DB_ID_FEATURE_ID:
				getTarget().setDb_Id((Long) value);
				return;
			case PetriNetModelPackage.TRANSITION_DB_VERSION_FEATURE_ID:
				getTarget().setDb_version((Integer) value);
				return;
			case PetriNetModelPackage.TRANSITION_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			case PetriNetModelPackage.TRANSITION_INPUTARC_FEATURE_ID:
				getTarget().setInputArc((List<InputArc>) value);
				return;
			case PetriNetModelPackage.TRANSITION_OUTPUTARC_FEATURE_ID:
				getTarget().setOutputArc((List<OutputArc>) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PetriNetModelPackage.TRANSITION_INPUTARC_FEATURE_ID:
				return getTarget().addToInputArc((InputArc) value);

			case PetriNetModelPackage.TRANSITION_OUTPUTARC_FEATURE_ID:
				return getTarget().addToOutputArc((OutputArc) value);
			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PetriNetModelPackage.TRANSITION_INPUTARC_FEATURE_ID:
				return getTarget().removeFromInputArc((InputArc) value);

			case PetriNetModelPackage.TRANSITION_OUTPUTARC_FEATURE_ID:
				return getTarget().removeFromOutputArc((OutputArc) value);
			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Net</b></em>'.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param <E>
	 *            the domain model java class
	 * 
	 * @generated
	 */
	public static class NetModelObject<E extends Net> extends
			IdentifiableModelFactory.IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return PetriNetModelPackage.INSTANCE.getNetEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return PetriNetModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PetriNetModelPackage.NET_DB_ID_FEATURE_ID:
				return getTarget().getDb_Id();
			case PetriNetModelPackage.NET_DB_VERSION_FEATURE_ID:
				return getTarget().getDb_version();
			case PetriNetModelPackage.NET_PLACE_FEATURE_ID:
				return getTarget().getPlace();
			case PetriNetModelPackage.NET_TOKEN_FEATURE_ID:
				return getTarget().getToken();
			case PetriNetModelPackage.NET_INPUTARC_FEATURE_ID:
				return getTarget().getInputArc();
			case PetriNetModelPackage.NET_OUTPUTARC_FEATURE_ID:
				return getTarget().getOutputArc();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PetriNetModelPackage.NET_DB_ID_FEATURE_ID:
				getTarget().setDb_Id((Long) value);
				return;
			case PetriNetModelPackage.NET_DB_VERSION_FEATURE_ID:
				getTarget().setDb_version((Integer) value);
				return;
			case PetriNetModelPackage.NET_PLACE_FEATURE_ID:
				getTarget().setPlace((List<Place>) value);
				return;
			case PetriNetModelPackage.NET_TOKEN_FEATURE_ID:
				getTarget().setToken((List<Token>) value);
				return;
			case PetriNetModelPackage.NET_INPUTARC_FEATURE_ID:
				getTarget().setInputArc((List<InputArc>) value);
				return;
			case PetriNetModelPackage.NET_OUTPUTARC_FEATURE_ID:
				getTarget().setOutputArc((List<OutputArc>) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PetriNetModelPackage.NET_PLACE_FEATURE_ID:
				return getTarget().addToPlace((Place) value);

			case PetriNetModelPackage.NET_TOKEN_FEATURE_ID:
				return getTarget().addToToken((Token) value);

			case PetriNetModelPackage.NET_INPUTARC_FEATURE_ID:
				return getTarget().addToInputArc((InputArc) value);

			case PetriNetModelPackage.NET_OUTPUTARC_FEATURE_ID:
				return getTarget().addToOutputArc((OutputArc) value);
			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PetriNetModelPackage.NET_PLACE_FEATURE_ID:
				return getTarget().removeFromPlace((Place) value);

			case PetriNetModelPackage.NET_TOKEN_FEATURE_ID:
				return getTarget().removeFromToken((Token) value);

			case PetriNetModelPackage.NET_INPUTARC_FEATURE_ID:
				return getTarget().removeFromInputArc((InputArc) value);

			case PetriNetModelPackage.NET_OUTPUTARC_FEATURE_ID:
				return getTarget().removeFromOutputArc((OutputArc) value);
			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}
}