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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import resourceallocation.Bachelor;
import resourceallocation.Course;
import resourceallocation.ResourceallocationPackage;
import resourceallocation.Semester;
import resourceallocation.Specialty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resourceallocation.impl.SpecialtyImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link resourceallocation.impl.SpecialtyImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link resourceallocation.impl.SpecialtyImpl#getName <em>Name</em>}</li>
 *   <li>{@link resourceallocation.impl.SpecialtyImpl#getBachelor <em>Bachelor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecialtyImpl extends MinimalEObjectImpl.Container implements Specialty {
	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> course;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semester;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecialtyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceallocationPackage.Literals.SPECIALTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourse() {
		if (course == null) {
			course = new EObjectWithInverseResolvingEList<Course>(Course.class, this, ResourceallocationPackage.SPECIALTY__COURSE, ResourceallocationPackage.COURSE__SPECIALTY);
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semester> getSemester() {
		if (semester == null) {
			semester = new EObjectWithInverseResolvingEList<Semester>(Semester.class, this, ResourceallocationPackage.SPECIALTY__SEMESTER, ResourceallocationPackage.SEMESTER__SPECIALTY);
		}
		return semester;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceallocationPackage.SPECIALTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bachelor getBachelor() {
		if (eContainerFeatureID() != ResourceallocationPackage.SPECIALTY__BACHELOR) return null;
		return (Bachelor)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBachelor(Bachelor newBachelor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBachelor, ResourceallocationPackage.SPECIALTY__BACHELOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBachelor(Bachelor newBachelor) {
		if (newBachelor != eInternalContainer() || (eContainerFeatureID() != ResourceallocationPackage.SPECIALTY__BACHELOR && newBachelor != null)) {
			if (EcoreUtil.isAncestor(this, newBachelor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBachelor != null)
				msgs = ((InternalEObject)newBachelor).eInverseAdd(this, ResourceallocationPackage.BACHELOR__SPECIALTY, Bachelor.class, msgs);
			msgs = basicSetBachelor(newBachelor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceallocationPackage.SPECIALTY__BACHELOR, newBachelor, newBachelor));
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
			case ResourceallocationPackage.SPECIALTY__COURSE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourse()).basicAdd(otherEnd, msgs);
			case ResourceallocationPackage.SPECIALTY__SEMESTER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemester()).basicAdd(otherEnd, msgs);
			case ResourceallocationPackage.SPECIALTY__BACHELOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBachelor((Bachelor)otherEnd, msgs);
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
			case ResourceallocationPackage.SPECIALTY__COURSE:
				return ((InternalEList<?>)getCourse()).basicRemove(otherEnd, msgs);
			case ResourceallocationPackage.SPECIALTY__SEMESTER:
				return ((InternalEList<?>)getSemester()).basicRemove(otherEnd, msgs);
			case ResourceallocationPackage.SPECIALTY__BACHELOR:
				return basicSetBachelor(null, msgs);
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
			case ResourceallocationPackage.SPECIALTY__BACHELOR:
				return eInternalContainer().eInverseRemove(this, ResourceallocationPackage.BACHELOR__SPECIALTY, Bachelor.class, msgs);
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
			case ResourceallocationPackage.SPECIALTY__COURSE:
				return getCourse();
			case ResourceallocationPackage.SPECIALTY__SEMESTER:
				return getSemester();
			case ResourceallocationPackage.SPECIALTY__NAME:
				return getName();
			case ResourceallocationPackage.SPECIALTY__BACHELOR:
				return getBachelor();
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
			case ResourceallocationPackage.SPECIALTY__COURSE:
				getCourse().clear();
				getCourse().addAll((Collection<? extends Course>)newValue);
				return;
			case ResourceallocationPackage.SPECIALTY__SEMESTER:
				getSemester().clear();
				getSemester().addAll((Collection<? extends Semester>)newValue);
				return;
			case ResourceallocationPackage.SPECIALTY__NAME:
				setName((String)newValue);
				return;
			case ResourceallocationPackage.SPECIALTY__BACHELOR:
				setBachelor((Bachelor)newValue);
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
			case ResourceallocationPackage.SPECIALTY__COURSE:
				getCourse().clear();
				return;
			case ResourceallocationPackage.SPECIALTY__SEMESTER:
				getSemester().clear();
				return;
			case ResourceallocationPackage.SPECIALTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResourceallocationPackage.SPECIALTY__BACHELOR:
				setBachelor((Bachelor)null);
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
			case ResourceallocationPackage.SPECIALTY__COURSE:
				return course != null && !course.isEmpty();
			case ResourceallocationPackage.SPECIALTY__SEMESTER:
				return semester != null && !semester.isEmpty();
			case ResourceallocationPackage.SPECIALTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ResourceallocationPackage.SPECIALTY__BACHELOR:
				return getBachelor() != null;
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

} //SpecialtyImpl
