package de.konstanz.htwg.spray.petrinet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.utils.ModelUtils;
import de.konstanz.htwg.spray.petrinet.dao.InputArcDao;
import de.konstanz.htwg.spray.petrinet.dao.NetDao;
import de.konstanz.htwg.spray.petrinet.dao.OutputArcDao;
import de.konstanz.htwg.spray.petrinet.dao.PlaceDao;
import de.konstanz.htwg.spray.petrinet.dao.TokenDao;
import de.konstanz.htwg.spray.petrinet.dao.TransitionDao;

/**
 * The <b>Package</b> for the model '<em><b>PetriNet</b></em>'. It contains
 * initialization code and access to the Factory to instantiate types of this
 * package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PetriNetModelPackage extends ModelPackage {

	/**
	 * Is set when the package has been initialized.
	 * 
	 * @generated
	 */
	private static boolean isInitialized = false;

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String NS_URI = "http://www.htwg-konstanz.de/spray/petriNet";

	/**
	 * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final PetriNetModelFactory MODELFACTORY = new PetriNetModelFactory();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PLACE_CLASSIFIER_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PLACE_DB_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PLACE_DB_VERSION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PLACE_NAME_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PLACE_TOKEN_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PLACE_INPUTARC_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PLACE_OUTPUTARC_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TOKEN_CLASSIFIER_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TOKEN_DB_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TOKEN_DB_VERSION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int INPUTARC_CLASSIFIER_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int INPUTARC_DB_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int INPUTARC_DB_VERSION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int INPUTARC_PLACE_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int INPUTARC_TRANSITION_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OUTPUTARC_CLASSIFIER_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OUTPUTARC_DB_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OUTPUTARC_DB_VERSION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OUTPUTARC_PLACE_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OUTPUTARC_TRANSITION_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSITION_CLASSIFIER_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSITION_DB_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSITION_DB_VERSION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSITION_NAME_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSITION_INPUTARC_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSITION_OUTPUTARC_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int NET_CLASSIFIER_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int NET_DB_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int NET_DB_VERSION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int NET_PLACE_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int NET_TOKEN_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int NET_INPUTARC_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int NET_OUTPUTARC_FEATURE_ID = 5;

	/**
	 * The static member with the instance of this {@link ModelPackage}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final PetriNetModelPackage INSTANCE = initialize();

	/**
	 * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an initialized instance of this class
	 * 
	 * @generated
	 */
	public static PetriNetModelPackage initialize() {

		if (isInitialized) {
			return (PetriNetModelPackage) ModelResolver.getInstance()
					.getModelPackage(NS_URI);
		}

		final PetriNetModelPackage modelPackage = new PetriNetModelPackage();

		ModelResolver.getInstance().registerModelPackage(modelPackage);

		// read the model from the ecore file, the EPackage is registered in the
		// EPackage.Registry
		// see the ModelResolver getEPackageRegistry method
		ModelUtils.readEPackagesFromFile(modelPackage);

		isInitialized = true;

		IdentifiableModelPackage.initialize();

		// force the initialization of the EFactory proxy
		modelPackage.getEPackage();

		// register the relation between a Class and its EClassifier
		ModelResolver.getInstance().registerClassModelMapping(Place.class,
				modelPackage.getPlaceEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Token.class,
				modelPackage.getTokenEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(InputArc.class,
				modelPackage.getInputArcEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(OutputArc.class,
				modelPackage.getOutputArcEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Transition.class,
				modelPackage.getTransitionEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Net.class,
				modelPackage.getNetEClass(), modelPackage);

		DaoRegistry.getInstance().registerDao(Place.class, PlaceDao.class);
		DaoRegistry.getInstance().registerDao(Token.class, TokenDao.class);
		DaoRegistry.getInstance()
				.registerDao(InputArc.class, InputArcDao.class);
		DaoRegistry.getInstance().registerDao(OutputArc.class,
				OutputArcDao.class);
		DaoRegistry.getInstance().registerDao(Transition.class,
				TransitionDao.class);
		DaoRegistry.getInstance().registerDao(Net.class, NetDao.class);

		// and return ourselves
		return modelPackage;
	}

	/**
	 * Returns the {@link ModelFactory} of this ModelPackage. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the {@link PetriNetModelFactory} instance.
	 * @generated
	 */
	@Override
	public PetriNetModelFactory getModelFactory() {
		return MODELFACTORY;
	}

	/**
	 * Returns the nsUri of the {@link EPackage} managed by this Package
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the nsUri of the EPackage
	 * @generated
	 */
	@Override
	public String getNsURI() {
		return NS_URI;
	}

	/**
	 * Returns the name of the ecore file containing the ecore model of the
	 * {@link EPackage} managed here. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the name of the ecore file
	 * @generated
	 */
	@Override
	public String getEcoreFileName() {
		return "PetriNet.ecore";
	}

	/**
	 * Returns the {@link EClass} '<em><b>Place</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Place</b></em>'
	 * @generated
	 */
	public EClass getPlaceEClass() {
		return (EClass) getEPackage().getEClassifiers()
				.get(PLACE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Place.name</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Place.name</b></em>'.
	 * @generated
	 */
	public EAttribute getPlace_Name() {
		return (EAttribute) getPlaceEClass().getEAllStructuralFeatures().get(
				PLACE_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Place.token</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Place.token</b></em>'.
	 * @generated
	 */
	public EReference getPlace_Token() {
		return (EReference) getPlaceEClass().getEAllStructuralFeatures().get(
				PLACE_TOKEN_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Place.inputArc</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Place.inputArc</b></em>'.
	 * @generated
	 */
	public EReference getPlace_InputArc() {
		return (EReference) getPlaceEClass().getEAllStructuralFeatures().get(
				PLACE_INPUTARC_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Place.outputArc</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Place.outputArc</b></em>'.
	 * @generated
	 */
	public EReference getPlace_OutputArc() {
		return (EReference) getPlaceEClass().getEAllStructuralFeatures().get(
				PLACE_OUTPUTARC_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Token</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Token</b></em>'
	 * @generated
	 */
	public EClass getTokenEClass() {
		return (EClass) getEPackage().getEClassifiers()
				.get(TOKEN_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>InputArc</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>InputArc</b></em>'
	 * @generated
	 */
	public EClass getInputArcEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				INPUTARC_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>InputArc.place</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>InputArc.place</b></em>'.
	 * @generated
	 */
	public EReference getInputArc_Place() {
		return (EReference) getInputArcEClass().getEAllStructuralFeatures()
				.get(INPUTARC_PLACE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>InputArc.transition</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>InputArc.transition</b></em>'.
	 * @generated
	 */
	public EReference getInputArc_Transition() {
		return (EReference) getInputArcEClass().getEAllStructuralFeatures()
				.get(INPUTARC_TRANSITION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>OutputArc</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>OutputArc</b></em>'
	 * @generated
	 */
	public EClass getOutputArcEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				OUTPUTARC_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>OutputArc.place</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>OutputArc.place</b></em>'.
	 * @generated
	 */
	public EReference getOutputArc_Place() {
		return (EReference) getOutputArcEClass().getEAllStructuralFeatures()
				.get(OUTPUTARC_PLACE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>OutputArc.transition</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>OutputArc.transition</b></em>'.
	 * @generated
	 */
	public EReference getOutputArc_Transition() {
		return (EReference) getOutputArcEClass().getEAllStructuralFeatures()
				.get(OUTPUTARC_TRANSITION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Transition</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Transition</b></em>'
	 * @generated
	 */
	public EClass getTransitionEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				TRANSITION_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Transition.name</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Transition.name</b></em>'.
	 * @generated
	 */
	public EAttribute getTransition_Name() {
		return (EAttribute) getTransitionEClass().getEAllStructuralFeatures()
				.get(TRANSITION_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Transition.inputArc</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Transition.inputArc</b></em>'.
	 * @generated
	 */
	public EReference getTransition_InputArc() {
		return (EReference) getTransitionEClass().getEAllStructuralFeatures()
				.get(TRANSITION_INPUTARC_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Transition.outputArc</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Transition.outputArc</b></em>'.
	 * @generated
	 */
	public EReference getTransition_OutputArc() {
		return (EReference) getTransitionEClass().getEAllStructuralFeatures()
				.get(TRANSITION_OUTPUTARC_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Net</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Net</b></em>'
	 * @generated
	 */
	public EClass getNetEClass() {
		return (EClass) getEPackage().getEClassifiers().get(NET_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Net.place</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Net.place</b></em>'.
	 * @generated
	 */
	public EReference getNet_Place() {
		return (EReference) getNetEClass().getEAllStructuralFeatures().get(
				NET_PLACE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Net.token</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Net.token</b></em>'.
	 * @generated
	 */
	public EReference getNet_Token() {
		return (EReference) getNetEClass().getEAllStructuralFeatures().get(
				NET_TOKEN_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Net.inputArc</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Net.inputArc</b></em>'.
	 * @generated
	 */
	public EReference getNet_InputArc() {
		return (EReference) getNetEClass().getEAllStructuralFeatures().get(
				NET_INPUTARC_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Net.outputArc</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Net.outputArc</b></em>'.
	 * @generated
	 */
	public EReference getNet_OutputArc() {
		return (EReference) getNetEClass().getEAllStructuralFeatures().get(
				NET_OUTPUTARC_FEATURE_ID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eClassifier
	 *            the {@link EClassifier}
	 * @return the class implementing a specific {@link EClass}.
	 * @generated
	 */
	@Override
	public Class<?> getEClassifierClass(EClassifier eClassifier) {
		switch (eClassifier.getClassifierID()) {
		case PLACE_CLASSIFIER_ID:
			return Place.class;
		case TOKEN_CLASSIFIER_ID:
			return Token.class;
		case INPUTARC_CLASSIFIER_ID:
			return InputArc.class;
		case OUTPUTARC_CLASSIFIER_ID:
			return OutputArc.class;
		case TRANSITION_CLASSIFIER_ID:
			return Transition.class;
		case NET_CLASSIFIER_ID:
			return Net.class;
		default:
			throw new IllegalArgumentException("The EClassifier '"
					+ eClassifier + "' is not defined in this EPackage");
		}
	}
}
