/**
 */
package com.misc.touse.moplaf2.tousesolver;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.touse.moplaf2.tousesolver.ToUseSolverPackage
 * @generated
 */
public interface ToUseSolverFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToUseSolverFactory eINSTANCE = com.misc.touse.moplaf2.tousesolver.impl.ToUseSolverFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>Jetty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jetty</em>'.
	 * @generated
	 */
	Jetty createJetty();

	/**
	 * Returns a new object of class '<em>Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bucket</em>'.
	 * @generated
	 */
	Bucket createBucket();

	/**
	 * Returns a new object of class '<em>Jetty Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jetty Formulation</em>'.
	 * @generated
	 */
	JettyFormulation createJettyFormulation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ToUseSolverPackage getToUseSolverPackage();

} //ToUseSolverFactory
