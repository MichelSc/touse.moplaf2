/**
 */
package com.misc.touse.moplaf2.tousesolver;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf2.tousesolver.ToUseSolverFactory
 * @model kind="package"
 * @generated
 */
public interface ToUseSolverPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tousesolver";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/touse/moplaf2/solver/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tuslv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToUseSolverPackage eINSTANCE = com.misc.touse.moplaf2.tousesolver.impl.ToUseSolverPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf2.tousesolver.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf2.tousesolver.impl.ScenarioImpl
	 * @see com.misc.touse.moplaf2.tousesolver.impl.ToUseSolverPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__TAG = 0;

	/**
	 * The feature id for the '<em><b>Jetties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__JETTIES = 1;

	/**
	 * The feature id for the '<em><b>Buckets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__BUCKETS = 2;

	/**
	 * The feature id for the '<em><b>Formulations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__FORMULATIONS = 3;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf2.tousesolver.impl.JettyImpl <em>Jetty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf2.tousesolver.impl.JettyImpl
	 * @see com.misc.touse.moplaf2.tousesolver.impl.ToUseSolverPackageImpl#getJetty()
	 * @generated
	 */
	int JETTY = 1;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JETTY__TAG = 0;

	/**
	 * The number of structural features of the '<em>Jetty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JETTY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Jetty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JETTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf2.tousesolver.impl.BucketImpl <em>Bucket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf2.tousesolver.impl.BucketImpl
	 * @see com.misc.touse.moplaf2.tousesolver.impl.ToUseSolverPackageImpl#getBucket()
	 * @generated
	 */
	int BUCKET = 2;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCKET__TAG = 0;

	/**
	 * The number of structural features of the '<em>Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCKET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUCKET_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link com.misc.touse.moplaf2.tousesolver.impl.JettyFormulationImpl <em>Jetty Formulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.moplaf2.tousesolver.impl.JettyFormulationImpl
	 * @see com.misc.touse.moplaf2.tousesolver.impl.ToUseSolverPackageImpl#getJettyFormulation()
	 * @generated
	 */
	int JETTY_FORMULATION = 3;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JETTY_FORMULATION__SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Jetties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JETTY_FORMULATION__JETTIES = 1;

	/**
	 * The feature id for the '<em><b>Buckets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JETTY_FORMULATION__BUCKETS = 2;

	/**
	 * The number of structural features of the '<em>Jetty Formulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JETTY_FORMULATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Jetty Formulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JETTY_FORMULATION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf2.tousesolver.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see com.misc.touse.moplaf2.tousesolver.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf2.tousesolver.Scenario#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.misc.touse.moplaf2.tousesolver.Scenario#getTag()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Tag();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf2.tousesolver.Scenario#getJetties <em>Jetties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jetties</em>'.
	 * @see com.misc.touse.moplaf2.tousesolver.Scenario#getJetties()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Jetties();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf2.tousesolver.Scenario#getBuckets <em>Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buckets</em>'.
	 * @see com.misc.touse.moplaf2.tousesolver.Scenario#getBuckets()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Buckets();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.moplaf2.tousesolver.Scenario#getFormulations <em>Formulations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formulations</em>'.
	 * @see com.misc.touse.moplaf2.tousesolver.Scenario#getFormulations()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Formulations();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf2.tousesolver.Jetty <em>Jetty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jetty</em>'.
	 * @see com.misc.touse.moplaf2.tousesolver.Jetty
	 * @generated
	 */
	EClass getJetty();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf2.tousesolver.Jetty#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.misc.touse.moplaf2.tousesolver.Jetty#getTag()
	 * @see #getJetty()
	 * @generated
	 */
	EAttribute getJetty_Tag();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf2.tousesolver.Bucket <em>Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bucket</em>'.
	 * @see com.misc.touse.moplaf2.tousesolver.Bucket
	 * @generated
	 */
	EClass getBucket();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.moplaf2.tousesolver.Bucket#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.misc.touse.moplaf2.tousesolver.Bucket#getTag()
	 * @see #getBucket()
	 * @generated
	 */
	EAttribute getBucket_Tag();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.moplaf2.tousesolver.JettyFormulation <em>Jetty Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jetty Formulation</em>'.
	 * @see com.misc.touse.moplaf2.tousesolver.JettyFormulation
	 * @generated
	 */
	EClass getJettyFormulation();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.touse.moplaf2.tousesolver.JettyFormulation#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scenario</em>'.
	 * @see com.misc.touse.moplaf2.tousesolver.JettyFormulation#getScenario()
	 * @see #getJettyFormulation()
	 * @generated
	 */
	EReference getJettyFormulation_Scenario();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.touse.moplaf2.tousesolver.JettyFormulation#getJetties <em>Jetties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Jetties</em>'.
	 * @see com.misc.touse.moplaf2.tousesolver.JettyFormulation#getJetties()
	 * @see #getJettyFormulation()
	 * @generated
	 */
	EReference getJettyFormulation_Jetties();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.touse.moplaf2.tousesolver.JettyFormulation#getBuckets <em>Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Buckets</em>'.
	 * @see com.misc.touse.moplaf2.tousesolver.JettyFormulation#getBuckets()
	 * @see #getJettyFormulation()
	 * @generated
	 */
	EReference getJettyFormulation_Buckets();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToUseSolverFactory getToUseSolverFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf2.tousesolver.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf2.tousesolver.impl.ScenarioImpl
		 * @see com.misc.touse.moplaf2.tousesolver.impl.ToUseSolverPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__TAG = eINSTANCE.getScenario_Tag();

		/**
		 * The meta object literal for the '<em><b>Jetties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__JETTIES = eINSTANCE.getScenario_Jetties();

		/**
		 * The meta object literal for the '<em><b>Buckets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__BUCKETS = eINSTANCE.getScenario_Buckets();

		/**
		 * The meta object literal for the '<em><b>Formulations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__FORMULATIONS = eINSTANCE.getScenario_Formulations();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf2.tousesolver.impl.JettyImpl <em>Jetty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf2.tousesolver.impl.JettyImpl
		 * @see com.misc.touse.moplaf2.tousesolver.impl.ToUseSolverPackageImpl#getJetty()
		 * @generated
		 */
		EClass JETTY = eINSTANCE.getJetty();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JETTY__TAG = eINSTANCE.getJetty_Tag();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf2.tousesolver.impl.BucketImpl <em>Bucket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf2.tousesolver.impl.BucketImpl
		 * @see com.misc.touse.moplaf2.tousesolver.impl.ToUseSolverPackageImpl#getBucket()
		 * @generated
		 */
		EClass BUCKET = eINSTANCE.getBucket();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUCKET__TAG = eINSTANCE.getBucket_Tag();

		/**
		 * The meta object literal for the '{@link com.misc.touse.moplaf2.tousesolver.impl.JettyFormulationImpl <em>Jetty Formulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.moplaf2.tousesolver.impl.JettyFormulationImpl
		 * @see com.misc.touse.moplaf2.tousesolver.impl.ToUseSolverPackageImpl#getJettyFormulation()
		 * @generated
		 */
		EClass JETTY_FORMULATION = eINSTANCE.getJettyFormulation();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JETTY_FORMULATION__SCENARIO = eINSTANCE.getJettyFormulation_Scenario();

		/**
		 * The meta object literal for the '<em><b>Jetties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JETTY_FORMULATION__JETTIES = eINSTANCE.getJettyFormulation_Jetties();

		/**
		 * The meta object literal for the '<em><b>Buckets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JETTY_FORMULATION__BUCKETS = eINSTANCE.getJettyFormulation_Buckets();

	}

} //ToUseSolverPackage
