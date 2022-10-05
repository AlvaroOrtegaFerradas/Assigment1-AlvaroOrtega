/**
 */
package resourceallocation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceallocation.Course#getName <em>Name</em>}</li>
 *   <li>{@link resourceallocation.Course#getSemester <em>Semester</em>}</li>
 *   <li>{@link resourceallocation.Course#getType <em>Type</em>}</li>
 *   <li>{@link resourceallocation.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link resourceallocation.Course#getLanguage <em>Language</em>}</li>
 *   <li>{@link resourceallocation.Course#getSpecialty <em>Specialty</em>}</li>
 * </ul>
 *
 * @see resourceallocation.ResourceallocationPackage#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='min_num_credits'"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see resourceallocation.ResourceallocationPackage#getCourse_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link resourceallocation.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link resourceallocation.Semester#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' container reference.
	 * @see #setSemester(Semester)
	 * @see resourceallocation.ResourceallocationPackage#getCourse_Semester()
	 * @see resourceallocation.Semester#getCourses
	 * @model opposite="courses" required="true" transient="false"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link resourceallocation.Course#getSemester <em>Semester</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' container reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(float)
	 * @see resourceallocation.ResourceallocationPackage#getCourse_Credits()
	 * @model required="true"
	 * @generated
	 */
	float getCredits();

	/**
	 * Sets the value of the '{@link resourceallocation.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(float value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see resourceallocation.ResourceallocationPackage#getCourse_Language()
	 * @model required="true"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link resourceallocation.Course#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Specialty</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link resourceallocation.Specialty#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialty</em>' reference.
	 * @see #setSpecialty(Specialty)
	 * @see resourceallocation.ResourceallocationPackage#getCourse_Specialty()
	 * @see resourceallocation.Specialty#getCourse
	 * @model opposite="course"
	 * @generated
	 */
	Specialty getSpecialty();

	/**
	 * Sets the value of the '{@link resourceallocation.Course#getSpecialty <em>Specialty</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialty</em>' reference.
	 * @see #getSpecialty()
	 * @generated
	 */
	void setSpecialty(Specialty value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see resourceallocation.ResourceallocationPackage#getCourse_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link resourceallocation.Course#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Course
