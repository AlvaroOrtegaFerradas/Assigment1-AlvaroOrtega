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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import resourceallocation.Course;
import resourceallocation.ResourceallocationPackage;
import resourceallocation.Semester;
import resourceallocation.Specialty;
import resourceallocation.Year;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resourceallocation.impl.SemesterImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link resourceallocation.impl.SemesterImpl#getYear <em>Year</em>}</li>
 *   <li>{@link resourceallocation.impl.SemesterImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link resourceallocation.impl.SemesterImpl#getSpecialty <em>Specialty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The cached value of the '{@link #getSpecialty() <em>Specialty</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialty()
	 * @generated
	 * @ordered
	 */
	protected Specialty specialty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceallocationPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceallocationPackage.SEMESTER__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Year getYear() {
		if (eContainerFeatureID() != ResourceallocationPackage.SEMESTER__YEAR) return null;
		return (Year)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYear(Year newYear, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newYear, ResourceallocationPackage.SEMESTER__YEAR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(Year newYear) {
		if (newYear != eInternalContainer() || (eContainerFeatureID() != ResourceallocationPackage.SEMESTER__YEAR && newYear != null)) {
			if (EcoreUtil.isAncestor(this, newYear))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newYear != null)
				msgs = ((InternalEObject)newYear).eInverseAdd(this, ResourceallocationPackage.YEAR__SEMESTERS, Year.class, msgs);
			msgs = basicSetYear(newYear, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceallocationPackage.SEMESTER__YEAR, newYear, newYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentWithInverseEList<Course>(Course.class, this, ResourceallocationPackage.SEMESTER__COURSES, ResourceallocationPackage.COURSE__SEMESTER);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialty getSpecialty() {
		if (specialty != null && specialty.eIsProxy()) {
			InternalEObject oldSpecialty = (InternalEObject)specialty;
			specialty = (Specialty)eResolveProxy(oldSpecialty);
			if (specialty != oldSpecialty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourceallocationPackage.SEMESTER__SPECIALTY, oldSpecialty, specialty));
			}
		}
		return specialty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialty basicGetSpecialty() {
		return specialty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialty(Specialty newSpecialty, NotificationChain msgs) {
		Specialty oldSpecialty = specialty;
		specialty = newSpecialty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourceallocationPackage.SEMESTER__SPECIALTY, oldSpecialty, newSpecialty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialty(Specialty newSpecialty) {
		if (newSpecialty != specialty) {
			NotificationChain msgs = null;
			if (specialty != null)
				msgs = ((InternalEObject)specialty).eInverseRemove(this, ResourceallocationPackage.SPECIALTY__SEMESTER, Specialty.class, msgs);
			if (newSpecialty != null)
				msgs = ((InternalEObject)newSpecialty).eInverseAdd(this, ResourceallocationPackage.SPECIALTY__SEMESTER, Specialty.class, msgs);
			msgs = basicSetSpecialty(newSpecialty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceallocationPackage.SEMESTER__SPECIALTY, newSpecialty, newSpecialty));
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
			case ResourceallocationPackage.SEMESTER__YEAR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetYear((Year)otherEnd, msgs);
			case ResourceallocationPackage.SEMESTER__COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourses()).basicAdd(otherEnd, msgs);
			case ResourceallocationPackage.SEMESTER__SPECIALTY:
				if (specialty != null)
					msgs = ((InternalEObject)specialty).eInverseRemove(this, ResourceallocationPackage.SPECIALTY__SEMESTER, Specialty.class, msgs);
				return basicSetSpecialty((Specialty)otherEnd, msgs);
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
			case ResourceallocationPackage.SEMESTER__YEAR:
				return basicSetYear(null, msgs);
			case ResourceallocationPackage.SEMESTER__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
			case ResourceallocationPackage.SEMESTER__SPECIALTY:
				return basicSetSpecialty(null, msgs);
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
			case ResourceallocationPackage.SEMESTER__YEAR:
				return eInternalContainer().eInverseRemove(this, ResourceallocationPackage.YEAR__SEMESTERS, Year.class, msgs);
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
			case ResourceallocationPackage.SEMESTER__NUMBER:
				return getNumber();
			case ResourceallocationPackage.SEMESTER__YEAR:
				return getYear();
			case ResourceallocationPackage.SEMESTER__COURSES:
				return getCourses();
			case ResourceallocationPackage.SEMESTER__SPECIALTY:
				if (resolve) return getSpecialty();
				return basicGetSpecialty();
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
			case ResourceallocationPackage.SEMESTER__NUMBER:
				setNumber((Integer)newValue);
				return;
			case ResourceallocationPackage.SEMESTER__YEAR:
				setYear((Year)newValue);
				return;
			case ResourceallocationPackage.SEMESTER__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case ResourceallocationPackage.SEMESTER__SPECIALTY:
				setSpecialty((Specialty)newValue);
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
			case ResourceallocationPackage.SEMESTER__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case ResourceallocationPackage.SEMESTER__YEAR:
				setYear((Year)null);
				return;
			case ResourceallocationPackage.SEMESTER__COURSES:
				getCourses().clear();
				return;
			case ResourceallocationPackage.SEMESTER__SPECIALTY:
				setSpecialty((Specialty)null);
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
			case ResourceallocationPackage.SEMESTER__NUMBER:
				return number != NUMBER_EDEFAULT;
			case ResourceallocationPackage.SEMESTER__YEAR:
				return getYear() != null;
			case ResourceallocationPackage.SEMESTER__COURSES:
				return courses != null && !courses.isEmpty();
			case ResourceallocationPackage.SEMESTER__SPECIALTY:
				return specialty != null;
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
		result.append(" (number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
