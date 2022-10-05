/**
 */
package resourceallocation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceallocation.Year#getNumber <em>Number</em>}</li>
 *   <li>{@link resourceallocation.Year#getPlan <em>Plan</em>}</li>
 *   <li>{@link resourceallocation.Year#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @see resourceallocation.ResourceallocationPackage#getYear()
 * @model
 * @generated
 */
public interface Year extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see resourceallocation.ResourceallocationPackage#getYear_Number()
	 * @model required="true"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link resourceallocation.Year#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Plan</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link resourceallocation.Plan#getYears <em>Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan</em>' container reference.
	 * @see #setPlan(Plan)
	 * @see resourceallocation.ResourceallocationPackage#getYear_Plan()
	 * @see resourceallocation.Plan#getYears
	 * @model opposite="years" required="true" transient="false"
	 * @generated
	 */
	Plan getPlan();

	/**
	 * Sets the value of the '{@link resourceallocation.Year#getPlan <em>Plan</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan</em>' container reference.
	 * @see #getPlan()
	 * @generated
	 */
	void setPlan(Plan value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link resourceallocation.Semester}.
	 * It is bidirectional and its opposite is '{@link resourceallocation.Semester#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see resourceallocation.ResourceallocationPackage#getYear_Semesters()
	 * @see resourceallocation.Semester#getYear
	 * @model opposite="year" containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<Semester> getSemesters();

} // Year
