/**
 */
package com.misc.touse.moplaf2.tousesolver.impl;

import com.misc.touse.moplaf2.tousesolver.Bucket;
import com.misc.touse.moplaf2.tousesolver.Jetty;
import com.misc.touse.moplaf2.tousesolver.JettyFormulation;
import com.misc.touse.moplaf2.tousesolver.Scenario;
import com.misc.touse.moplaf2.tousesolver.ToUseSolverPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf2.tousesolver.impl.ScenarioImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link com.misc.touse.moplaf2.tousesolver.impl.ScenarioImpl#getJetties <em>Jetties</em>}</li>
 *   <li>{@link com.misc.touse.moplaf2.tousesolver.impl.ScenarioImpl#getBuckets <em>Buckets</em>}</li>
 *   <li>{@link com.misc.touse.moplaf2.tousesolver.impl.ScenarioImpl#getFormulations <em>Formulations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJetties() <em>Jetties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJetties()
	 * @generated
	 * @ordered
	 */
	protected EList<Jetty> jetties;

	/**
	 * The cached value of the '{@link #getBuckets() <em>Buckets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuckets()
	 * @generated
	 * @ordered
	 */
	protected EList<Bucket> buckets;

	/**
	 * The cached value of the '{@link #getFormulations() <em>Formulations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormulations()
	 * @generated
	 * @ordered
	 */
	protected EList<JettyFormulation> formulations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSolverPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSolverPackage.SCENARIO__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Jetty> getJetties() {
		if (jetties == null) {
			jetties = new EObjectContainmentEList<Jetty>(Jetty.class, this, ToUseSolverPackage.SCENARIO__JETTIES);
		}
		return jetties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bucket> getBuckets() {
		if (buckets == null) {
			buckets = new EObjectContainmentEList<Bucket>(Bucket.class, this, ToUseSolverPackage.SCENARIO__BUCKETS);
		}
		return buckets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JettyFormulation> getFormulations() {
		if (formulations == null) {
			formulations = new EObjectContainmentWithInverseEList<JettyFormulation>(JettyFormulation.class, this, ToUseSolverPackage.SCENARIO__FORMULATIONS, ToUseSolverPackage.JETTY_FORMULATION__SCENARIO);
		}
		return formulations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseSolverPackage.SCENARIO__FORMULATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFormulations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseSolverPackage.SCENARIO__JETTIES:
				return ((InternalEList<?>)getJetties()).basicRemove(otherEnd, msgs);
			case ToUseSolverPackage.SCENARIO__BUCKETS:
				return ((InternalEList<?>)getBuckets()).basicRemove(otherEnd, msgs);
			case ToUseSolverPackage.SCENARIO__FORMULATIONS:
				return ((InternalEList<?>)getFormulations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseSolverPackage.SCENARIO__TAG:
				return getTag();
			case ToUseSolverPackage.SCENARIO__JETTIES:
				return getJetties();
			case ToUseSolverPackage.SCENARIO__BUCKETS:
				return getBuckets();
			case ToUseSolverPackage.SCENARIO__FORMULATIONS:
				return getFormulations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ToUseSolverPackage.SCENARIO__TAG:
				setTag((String)newValue);
				return;
			case ToUseSolverPackage.SCENARIO__JETTIES:
				getJetties().clear();
				getJetties().addAll((Collection<? extends Jetty>)newValue);
				return;
			case ToUseSolverPackage.SCENARIO__BUCKETS:
				getBuckets().clear();
				getBuckets().addAll((Collection<? extends Bucket>)newValue);
				return;
			case ToUseSolverPackage.SCENARIO__FORMULATIONS:
				getFormulations().clear();
				getFormulations().addAll((Collection<? extends JettyFormulation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ToUseSolverPackage.SCENARIO__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case ToUseSolverPackage.SCENARIO__JETTIES:
				getJetties().clear();
				return;
			case ToUseSolverPackage.SCENARIO__BUCKETS:
				getBuckets().clear();
				return;
			case ToUseSolverPackage.SCENARIO__FORMULATIONS:
				getFormulations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ToUseSolverPackage.SCENARIO__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
			case ToUseSolverPackage.SCENARIO__JETTIES:
				return jetties != null && !jetties.isEmpty();
			case ToUseSolverPackage.SCENARIO__BUCKETS:
				return buckets != null && !buckets.isEmpty();
			case ToUseSolverPackage.SCENARIO__FORMULATIONS:
				return formulations != null && !formulations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Tag: ");
		result.append(tag);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
