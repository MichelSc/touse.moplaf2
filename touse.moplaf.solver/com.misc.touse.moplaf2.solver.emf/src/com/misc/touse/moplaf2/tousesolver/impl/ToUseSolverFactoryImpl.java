/**
 */
package com.misc.touse.moplaf2.tousesolver.impl;

import com.misc.touse.moplaf2.tousesolver.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToUseSolverFactoryImpl extends EFactoryImpl implements ToUseSolverFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToUseSolverFactory init() {
		try {
			ToUseSolverFactory theToUseSolverFactory = (ToUseSolverFactory)EPackage.Registry.INSTANCE.getEFactory(ToUseSolverPackage.eNS_URI);
			if (theToUseSolverFactory != null) {
				return theToUseSolverFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToUseSolverFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseSolverFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ToUseSolverPackage.SCENARIO: return createScenario();
			case ToUseSolverPackage.JETTY: return createJetty();
			case ToUseSolverPackage.BUCKET: return createBucket();
			case ToUseSolverPackage.JETTY_FORMULATION: return createJettyFormulation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jetty createJetty() {
		JettyImpl jetty = new JettyImpl();
		return jetty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bucket createBucket() {
		BucketImpl bucket = new BucketImpl();
		return bucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JettyFormulation createJettyFormulation() {
		JettyFormulationImpl jettyFormulation = new JettyFormulationImpl();
		return jettyFormulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseSolverPackage getToUseSolverPackage() {
		return (ToUseSolverPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToUseSolverPackage getPackage() {
		return ToUseSolverPackage.eINSTANCE;
	}

} //ToUseSolverFactoryImpl
