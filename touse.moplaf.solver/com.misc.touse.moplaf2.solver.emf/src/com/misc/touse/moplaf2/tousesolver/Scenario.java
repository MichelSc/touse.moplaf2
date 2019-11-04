/**
 */
package com.misc.touse.moplaf2.tousesolver;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf2.tousesolver.Scenario#getTag <em>Tag</em>}</li>
 *   <li>{@link com.misc.touse.moplaf2.tousesolver.Scenario#getJetties <em>Jetties</em>}</li>
 *   <li>{@link com.misc.touse.moplaf2.tousesolver.Scenario#getBuckets <em>Buckets</em>}</li>
 *   <li>{@link com.misc.touse.moplaf2.tousesolver.Scenario#getFormulations <em>Formulations</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.moplaf2.tousesolver.ToUseSolverPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject{
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @implements IFormulation
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see com.misc.touse.moplaf2.tousesolver.ToUseSolverPackage#getScenario_Tag()
	 * @model
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link com.misc.touse.moplaf2.tousesolver.Scenario#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Returns the value of the '<em><b>Jetties</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf2.tousesolver.Jetty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jetties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jetties</em>' containment reference list.
	 * @see com.misc.touse.moplaf2.tousesolver.ToUseSolverPackage#getScenario_Jetties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Jetty> getJetties();

	/**
	 * Returns the value of the '<em><b>Buckets</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf2.tousesolver.Bucket}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buckets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buckets</em>' containment reference list.
	 * @see com.misc.touse.moplaf2.tousesolver.ToUseSolverPackage#getScenario_Buckets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bucket> getBuckets();

	/**
	 * Returns the value of the '<em><b>Formulations</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.moplaf2.tousesolver.JettyFormulation}.
	 * It is bidirectional and its opposite is '{@link com.misc.touse.moplaf2.tousesolver.JettyFormulation#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formulations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formulations</em>' containment reference list.
	 * @see com.misc.touse.moplaf2.tousesolver.ToUseSolverPackage#getScenario_Formulations()
	 * @see com.misc.touse.moplaf2.tousesolver.JettyFormulation#getScenario
	 * @model opposite="Scenario" containment="true"
	 * @generated
	 */
	EList<JettyFormulation> getFormulations();

} // Scenario
