/**
 */
package com.misc.touse.moplaf2.tousesolver.impl;

import com.misc.touse.moplaf2.tousesolver.Bucket;
import com.misc.touse.moplaf2.tousesolver.Jetty;
import com.misc.touse.moplaf2.tousesolver.JettyFormulation;
import com.misc.touse.moplaf2.tousesolver.Scenario;
import com.misc.touse.moplaf2.tousesolver.ToUseSolverFactory;
import com.misc.touse.moplaf2.tousesolver.ToUseSolverPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToUseSolverPackageImpl extends EPackageImpl implements ToUseSolverPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jettyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bucketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jettyFormulationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.misc.touse.moplaf2.tousesolver.ToUseSolverPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ToUseSolverPackageImpl() {
		super(eNS_URI, ToUseSolverFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ToUseSolverPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ToUseSolverPackage init() {
		if (isInited) return (ToUseSolverPackage)EPackage.Registry.INSTANCE.getEPackage(ToUseSolverPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredToUseSolverPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ToUseSolverPackageImpl theToUseSolverPackage = registeredToUseSolverPackage instanceof ToUseSolverPackageImpl ? (ToUseSolverPackageImpl)registeredToUseSolverPackage : new ToUseSolverPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theToUseSolverPackage.createPackageContents();

		// Initialize created meta-data
		theToUseSolverPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theToUseSolverPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ToUseSolverPackage.eNS_URI, theToUseSolverPackage);
		return theToUseSolverPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_Tag() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Jetties() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Buckets() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Formulations() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJetty() {
		return jettyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJetty_Tag() {
		return (EAttribute)jettyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBucket() {
		return bucketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBucket_Tag() {
		return (EAttribute)bucketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJettyFormulation() {
		return jettyFormulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJettyFormulation_Scenario() {
		return (EReference)jettyFormulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJettyFormulation_Jetties() {
		return (EReference)jettyFormulationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJettyFormulation_Buckets() {
		return (EReference)jettyFormulationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseSolverFactory getToUseSolverFactory() {
		return (ToUseSolverFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		scenarioEClass = createEClass(SCENARIO);
		createEAttribute(scenarioEClass, SCENARIO__TAG);
		createEReference(scenarioEClass, SCENARIO__JETTIES);
		createEReference(scenarioEClass, SCENARIO__BUCKETS);
		createEReference(scenarioEClass, SCENARIO__FORMULATIONS);

		jettyEClass = createEClass(JETTY);
		createEAttribute(jettyEClass, JETTY__TAG);

		bucketEClass = createEClass(BUCKET);
		createEAttribute(bucketEClass, BUCKET__TAG);

		jettyFormulationEClass = createEClass(JETTY_FORMULATION);
		createEReference(jettyFormulationEClass, JETTY_FORMULATION__SCENARIO);
		createEReference(jettyFormulationEClass, JETTY_FORMULATION__JETTIES);
		createEReference(jettyFormulationEClass, JETTY_FORMULATION__BUCKETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScenario_Tag(), ecorePackage.getEString(), "Tag", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Jetties(), this.getJetty(), null, "Jetties", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Buckets(), this.getBucket(), null, "Buckets", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Formulations(), this.getJettyFormulation(), this.getJettyFormulation_Scenario(), "Formulations", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jettyEClass, Jetty.class, "Jetty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJetty_Tag(), ecorePackage.getEString(), "Tag", null, 0, 1, Jetty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bucketEClass, Bucket.class, "Bucket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBucket_Tag(), ecorePackage.getEString(), "Tag", null, 0, 1, Bucket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jettyFormulationEClass, JettyFormulation.class, "JettyFormulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJettyFormulation_Scenario(), this.getScenario(), this.getScenario_Formulations(), "Scenario", null, 1, 1, JettyFormulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJettyFormulation_Jetties(), this.getJetty(), null, "Jetties", null, 0, -1, JettyFormulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJettyFormulation_Buckets(), this.getBucket(), null, "Buckets", null, 0, -1, JettyFormulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ToUseSolverPackageImpl
