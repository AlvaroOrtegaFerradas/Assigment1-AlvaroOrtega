/**
 */
package resourceallocation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import resourceallocation.Bachelor;
import resourceallocation.Plan;
import resourceallocation.ResourceallocationPackage;
import resourceallocation.Specialty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bachelor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resourceallocation.impl.BachelorImpl#getPlans <em>Plans</em>}</li>
 *   <li>{@link resourceallocation.impl.BachelorImpl#getName <em>Name</em>}</li>
 *   <li>{@link resourceallocation.impl.BachelorImpl#getSpecialty <em>Specialty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BachelorImpl extends MinimalEObjectImpl.Container implements Bachelor {
	/**
	 * The cached value of the '{@link #getPlans() <em>Plans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlans()
	 * @generated
	 * @ordered
	 */
	protected EList<Plan> plans;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecialty() <em>Specialty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialty()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialty> specialty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BachelorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceallocationPackage.Literals.BACHELOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plan> getPlans() {
		if (plans == null) {
			plans = new EObjectContainmentWithInverseEList<Plan>(Plan.class, this, ResourceallocationPackage.BACHELOR__PLANS, ResourceallocationPackage.PLAN__BACHELOR);
		}
		return plans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceallocationPackage.BACHELOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialty> getSpecialty() {
		if (specialty == null) {
			specialty = new EObjectContainmentWithInverseEList<Specialty>(Specialty.class, this, ResourceallocationPackage.BACHELOR__SPECIALTY, ResourceallocationPackage.SPECIALTY__BACHELOR);
		}
		return specialty;
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
			case ResourceallocationPackage.BACHELOR__PLANS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlans()).basicAdd(otherEnd, msgs);
			case ResourceallocationPackage.BACHELOR__SPECIALTY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecialty()).basicAdd(otherEnd, msgs);
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
			case ResourceallocationPackage.BACHELOR__PLANS:
				return ((InternalEList<?>)getPlans()).basicRemove(otherEnd, msgs);
			case ResourceallocationPackage.BACHELOR__SPECIALTY:
				return ((InternalEList<?>)getSpecialty()).basicRemove(otherEnd, msgs);
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
			case ResourceallocationPackage.BACHELOR__PLANS:
				return getPlans();
			case ResourceallocationPackage.BACHELOR__NAME:
				return getName();
			case ResourceallocationPackage.BACHELOR__SPECIALTY:
				return getSpecialty();
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
			case ResourceallocationPackage.BACHELOR__PLANS:
				getPlans().clear();
				getPlans().addAll((Collection<? extends Plan>)newValue);
				return;
			case ResourceallocationPackage.BACHELOR__NAME:
				setName((String)newValue);
				return;
			case ResourceallocationPackage.BACHELOR__SPECIALTY:
				getSpecialty().clear();
				getSpecialty().addAll((Collection<? extends Specialty>)newValue);
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
			case ResourceallocationPackage.BACHELOR__PLANS:
				getPlans().clear();
				return;
			case ResourceallocationPackage.BACHELOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResourceallocationPackage.BACHELOR__SPECIALTY:
				getSpecialty().clear();
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
			case ResourceallocationPackage.BACHELOR__PLANS:
				return plans != null && !plans.isEmpty();
			case ResourceallocationPackage.BACHELOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ResourceallocationPackage.BACHELOR__SPECIALTY:
				return specialty != null && !specialty.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BachelorImpl
