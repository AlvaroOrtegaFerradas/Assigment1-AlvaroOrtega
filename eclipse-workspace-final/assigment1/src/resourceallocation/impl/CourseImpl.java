/**
 */
package resourceallocation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import resourceallocation.Course;
import resourceallocation.ResourceallocationPackage;
import resourceallocation.Semester;
import resourceallocation.Specialty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resourceallocation.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link resourceallocation.impl.CourseImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link resourceallocation.impl.CourseImpl#getType <em>Type</em>}</li>
 *   <li>{@link resourceallocation.impl.CourseImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link resourceallocation.impl.CourseImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link resourceallocation.impl.CourseImpl#getSpecialty <em>Specialty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float CREDITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected float credits = CREDITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

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
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceallocationPackage.Literals.COURSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceallocationPackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester getSemester() {
		if (eContainerFeatureID() != ResourceallocationPackage.COURSE__SEMESTER) return null;
		return (Semester)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemester(Semester newSemester, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSemester, ResourceallocationPackage.COURSE__SEMESTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemester(Semester newSemester) {
		if (newSemester != eInternalContainer() || (eContainerFeatureID() != ResourceallocationPackage.COURSE__SEMESTER && newSemester != null)) {
			if (EcoreUtil.isAncestor(this, newSemester))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSemester != null)
				msgs = ((InternalEObject)newSemester).eInverseAdd(this, ResourceallocationPackage.SEMESTER__COURSES, Semester.class, msgs);
			msgs = basicSetSemester(newSemester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceallocationPackage.COURSE__SEMESTER, newSemester, newSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredits(float newCredits) {
		float oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceallocationPackage.COURSE__CREDITS, oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceallocationPackage.COURSE__LANGUAGE, oldLanguage, language));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourceallocationPackage.COURSE__SPECIALTY, oldSpecialty, specialty));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourceallocationPackage.COURSE__SPECIALTY, oldSpecialty, newSpecialty);
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
				msgs = ((InternalEObject)specialty).eInverseRemove(this, ResourceallocationPackage.SPECIALTY__COURSE, Specialty.class, msgs);
			if (newSpecialty != null)
				msgs = ((InternalEObject)newSpecialty).eInverseAdd(this, ResourceallocationPackage.SPECIALTY__COURSE, Specialty.class, msgs);
			msgs = basicSetSpecialty(newSpecialty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceallocationPackage.COURSE__SPECIALTY, newSpecialty, newSpecialty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceallocationPackage.COURSE__TYPE, oldType, type));
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
			case ResourceallocationPackage.COURSE__SEMESTER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSemester((Semester)otherEnd, msgs);
			case ResourceallocationPackage.COURSE__SPECIALTY:
				if (specialty != null)
					msgs = ((InternalEObject)specialty).eInverseRemove(this, ResourceallocationPackage.SPECIALTY__COURSE, Specialty.class, msgs);
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
			case ResourceallocationPackage.COURSE__SEMESTER:
				return basicSetSemester(null, msgs);
			case ResourceallocationPackage.COURSE__SPECIALTY:
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
			case ResourceallocationPackage.COURSE__SEMESTER:
				return eInternalContainer().eInverseRemove(this, ResourceallocationPackage.SEMESTER__COURSES, Semester.class, msgs);
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
			case ResourceallocationPackage.COURSE__NAME:
				return getName();
			case ResourceallocationPackage.COURSE__SEMESTER:
				return getSemester();
			case ResourceallocationPackage.COURSE__TYPE:
				return getType();
			case ResourceallocationPackage.COURSE__CREDITS:
				return getCredits();
			case ResourceallocationPackage.COURSE__LANGUAGE:
				return getLanguage();
			case ResourceallocationPackage.COURSE__SPECIALTY:
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
			case ResourceallocationPackage.COURSE__NAME:
				setName((String)newValue);
				return;
			case ResourceallocationPackage.COURSE__SEMESTER:
				setSemester((Semester)newValue);
				return;
			case ResourceallocationPackage.COURSE__TYPE:
				setType((String)newValue);
				return;
			case ResourceallocationPackage.COURSE__CREDITS:
				setCredits((Float)newValue);
				return;
			case ResourceallocationPackage.COURSE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case ResourceallocationPackage.COURSE__SPECIALTY:
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
			case ResourceallocationPackage.COURSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResourceallocationPackage.COURSE__SEMESTER:
				setSemester((Semester)null);
				return;
			case ResourceallocationPackage.COURSE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ResourceallocationPackage.COURSE__CREDITS:
				setCredits(CREDITS_EDEFAULT);
				return;
			case ResourceallocationPackage.COURSE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case ResourceallocationPackage.COURSE__SPECIALTY:
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
			case ResourceallocationPackage.COURSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ResourceallocationPackage.COURSE__SEMESTER:
				return getSemester() != null;
			case ResourceallocationPackage.COURSE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ResourceallocationPackage.COURSE__CREDITS:
				return credits != CREDITS_EDEFAULT;
			case ResourceallocationPackage.COURSE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case ResourceallocationPackage.COURSE__SPECIALTY:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", credits: ");
		result.append(credits);
		result.append(", language: ");
		result.append(language);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
