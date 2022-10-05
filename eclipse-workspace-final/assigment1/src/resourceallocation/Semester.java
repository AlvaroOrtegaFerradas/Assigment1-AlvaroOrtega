/**
 */
package resourceallocation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceallocation.Semester#getNumber <em>Number</em>}</li>
 *   <li>{@link resourceallocation.Semester#getYear <em>Year</em>}</li>
 *   <li>{@link resourceallocation.Semester#getCourses <em>Courses</em>}</li>
 *   <li>{@link resourceallocation.Semester#getSpecialty <em>Specialty</em>}</li>
 * </ul>
 *
 * @see resourceallocation.ResourceallocationPackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see resourceallocation.ResourceallocationPackage#getSemester_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link resourceallocation.Semester#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link resourceallocation.Year#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' container reference.
	 * @see #setYear(Year)
	 * @see resourceallocation.ResourceallocationPackage#getSemester_Year()
	 * @see resourceallocation.Year#getSemesters
	 * @model opposite="semesters" required="true" transient="false"
	 * @generated
	 */
	Year getYear();

	/**
	 * Sets the value of the '{@link resourceallocation.Semester#getYear <em>Year</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' container reference.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(Year value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link resourceallocation.Course}.
	 * It is bidirectional and its opposite is '{@link resourceallocation.Course#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see resourceallocation.ResourceallocationPackage#getSemester_Courses()
	 * @see resourceallocation.Course#getSemester
	 * @model opposite="semester" containment="true" required="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Specialty</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link resourceallocation.Specialty#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialty</em>' reference.
	 * @see #setSpecialty(Specialty)
	 * @see resourceallocation.ResourceallocationPackage#getSemester_Specialty()
	 * @see resourceallocation.Specialty#getSemester
	 * @model opposite="semester"
	 * @generated
	 */
	Specialty getSpecialty();

	/**
	 * Sets the value of the '{@link resourceallocation.Semester#getSpecialty <em>Specialty</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialty</em>' reference.
	 * @see #getSpecialty()
	 * @generated
	 */
	void setSpecialty(Specialty value);

} // Semester
