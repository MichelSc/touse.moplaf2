/**
 */
package com.misc.touse.moplaf2.tousesolver.impl;

import com.misc.common.moplaf2.solver.Formulation;
import com.misc.common.moplaf2.solver.IFormulation;
import com.misc.common.moplaf2.solver.ITuple;
import com.misc.common.moplaf2.solver.Tuple1;
import com.misc.common.moplaf2.solver.Tuple2;
import com.misc.common.moplaf2.solver.Variable;
import com.misc.touse.moplaf2.tousesolver.Bucket;
import com.misc.touse.moplaf2.tousesolver.Jetty;
import com.misc.touse.moplaf2.tousesolver.JettyFormulation;
import com.misc.touse.moplaf2.tousesolver.Scenario;
import com.misc.touse.moplaf2.tousesolver.ToUseSolverPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jetty Formulation</b></em>'.
 * @implements Formulation
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.moplaf2.tousesolver.impl.JettyFormulationImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.misc.touse.moplaf2.tousesolver.impl.JettyFormulationImpl#getJetties <em>Jetties</em>}</li>
 *   <li>{@link com.misc.touse.moplaf2.tousesolver.impl.JettyFormulationImpl#getBuckets <em>Buckets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JettyFormulationImpl extends MinimalEObjectImpl.Container implements JettyFormulation, Formulation {
	/**
	 * The cached value of the '{@link #getJetties() <em>Jetties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJetties()
	 * @generated
	 * @ordered
	 */
	protected EList<Jetty> jetties;

	/**
	 * The cached value of the '{@link #getBuckets() <em>Buckets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuckets()
	 * @generated
	 * @ordered
	 */
	protected EList<Bucket> buckets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JettyFormulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToUseSolverPackage.Literals.JETTY_FORMULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario getScenario() {
		if (eContainerFeatureID() != ToUseSolverPackage.JETTY_FORMULATION__SCENARIO) return null;
		return (Scenario)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenario(Scenario newScenario, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScenario, ToUseSolverPackage.JETTY_FORMULATION__SCENARIO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(Scenario newScenario) {
		if (newScenario != eInternalContainer() || (eContainerFeatureID() != ToUseSolverPackage.JETTY_FORMULATION__SCENARIO && newScenario != null)) {
			if (EcoreUtil.isAncestor(this, newScenario))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScenario != null)
				msgs = ((InternalEObject)newScenario).eInverseAdd(this, ToUseSolverPackage.SCENARIO__FORMULATIONS, Scenario.class, msgs);
			msgs = basicSetScenario(newScenario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToUseSolverPackage.JETTY_FORMULATION__SCENARIO, newScenario, newScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Jetty> getJetties() {
		if (jetties == null) {
			jetties = new EObjectResolvingEList<Jetty>(Jetty.class, this, ToUseSolverPackage.JETTY_FORMULATION__JETTIES);
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
			buckets = new EObjectResolvingEList<Bucket>(Bucket.class, this, ToUseSolverPackage.JETTY_FORMULATION__BUCKETS);
		}
		return buckets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToUseSolverPackage.JETTY_FORMULATION__SCENARIO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetScenario((Scenario)otherEnd, msgs);
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
			case ToUseSolverPackage.JETTY_FORMULATION__SCENARIO:
				return basicSetScenario(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ToUseSolverPackage.JETTY_FORMULATION__SCENARIO:
				return eInternalContainer().eInverseRemove(this, ToUseSolverPackage.SCENARIO__FORMULATIONS, Scenario.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToUseSolverPackage.JETTY_FORMULATION__SCENARIO:
				return getScenario();
			case ToUseSolverPackage.JETTY_FORMULATION__JETTIES:
				return getJetties();
			case ToUseSolverPackage.JETTY_FORMULATION__BUCKETS:
				return getBuckets();
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
			case ToUseSolverPackage.JETTY_FORMULATION__SCENARIO:
				setScenario((Scenario)newValue);
				return;
			case ToUseSolverPackage.JETTY_FORMULATION__JETTIES:
				getJetties().clear();
				getJetties().addAll((Collection<? extends Jetty>)newValue);
				return;
			case ToUseSolverPackage.JETTY_FORMULATION__BUCKETS:
				getBuckets().clear();
				getBuckets().addAll((Collection<? extends Bucket>)newValue);
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
			case ToUseSolverPackage.JETTY_FORMULATION__SCENARIO:
				setScenario((Scenario)null);
				return;
			case ToUseSolverPackage.JETTY_FORMULATION__JETTIES:
				getJetties().clear();
				return;
			case ToUseSolverPackage.JETTY_FORMULATION__BUCKETS:
				getBuckets().clear();
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
			case ToUseSolverPackage.JETTY_FORMULATION__SCENARIO:
				return getScenario() != null;
			case ToUseSolverPackage.JETTY_FORMULATION__JETTIES:
				return jetties != null && !jetties.isEmpty();
			case ToUseSolverPackage.JETTY_FORMULATION__BUCKETS:
				return buckets != null && !buckets.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	//-------------------------------------------------------------------------
	// formulation content
	//-------------------------------------------------------------------------
	class TupleScenario extends Tuple1<Scenario>{

		@Override
		public Collection<? extends ITuple> getSubTuples() {
			List<ITuple> list = JettyFormulationImpl.this.getJetties()
					.stream()
					.map(j->new TupleJetty().init(j))
					.collect(Collectors.toList());
			return list;
		}		
	}

	class TupleJetty extends Tuple1<Jetty>{

		@Override
		public Collection<? extends ITuple> getSubTuples() {
			Jetty jetty = this.getDimension1();
			List<ITuple> list = JettyFormulationImpl.this.getBuckets()
					.stream()
					.map(b->new TupleJettyBucket().init(jetty, b))
					.collect(Collectors.toList());
			return list;
		}
	}

	class TupleJettyBucket extends Tuple2<Jetty, Bucket>{
		@Override
		public Collection<? extends Variable<?>> getVariables() {
			List<Variable<?>> list = new ArrayList<>();
			list.add(new VarJettyBucketStart().init(this));
			list.add(new VarJettyBucketEnd());
			return list;
		}	
	}
	
	class VarJettyBucketStart extends Variable<TupleJettyBucket>{

		@Override
		public String getName() {
			return "start";
		}
		@Override
		public int getType() {
			return IFormulation.VAR_TYPE_INTEGER;
		}
	}

	class VarJettyBucketEnd extends Variable<TupleJettyBucket>{

		@Override
		public String getName() {
			return "end";
		}
		@Override
		public int getType() {
			return IFormulation.VAR_TYPE_INTEGER;
		}
		private void test() {
			Jetty jetty = this.getTuple().getDimension1();
		}
	}

} //JettyFormulationImpl
