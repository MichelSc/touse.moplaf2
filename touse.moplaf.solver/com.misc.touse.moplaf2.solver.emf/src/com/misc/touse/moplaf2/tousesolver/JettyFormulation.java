/**
 */
package com.misc.touse.moplaf2.tousesolver;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jetty Formulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf2.tousesolver.JettyFormulation#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.misc.touse.moplaf2.tousesolver.JettyFormulation#getJetties <em>Jetties</em>}</li>
 *   <li>{@link com.misc.touse.moplaf2.tousesolver.JettyFormulation#getBuckets <em>Buckets</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf2.tousesolver.ToUseSolverPackage#getJettyFormulation()
 * @model
 * @generated
 */
public interface JettyFormulation extends EObject {
	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf2.tousesolver.Scenario#getFormulations <em>Formulations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' container reference.
	 * @see #setScenario(Scenario)
	 * @see com.misc.touse.moplaf2.tousesolver.ToUseSolverPackage#getJettyFormulation_Scenario()
	 * @see com.misc.touse.moplaf2.tousesolver.Scenario#getFormulations
	 * @model opposite="Formulations" required="true" transient="false"
	 * @generated
	 */
	Scenario getScenario();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf2.tousesolver.JettyFormulation#getScenario <em>Scenario</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' container reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(Scenario value);

	/**
	 * Returns the value of the '<em><b>Jetties</b></em>' reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf2.tousesolver.Jetty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jetties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jetties</em>' reference list.
	 * @see com.misc.touse.moplaf2.tousesolver.ToUseSolverPackage#getJettyFormulation_Jetties()
	 * @model
	 * @generated
	 */
	EList<Jetty> getJetties();

	/**
	 * Returns the value of the '<em><b>Buckets</b></em>' reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf2.tousesolver.Bucket}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buckets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buckets</em>' reference list.
	 * @see com.misc.touse.moplaf2.tousesolver.ToUseSolverPackage#getJettyFormulation_Buckets()
	 * @model
	 * @generated
	 */
	EList<Bucket> getBuckets();

} // JettyFormulation
