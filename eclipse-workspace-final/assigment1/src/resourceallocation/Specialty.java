/**
 */
package resourceallocation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceallocation.Specialty#getCourse <em>Course</em>}</li>
 *   <li>{@link resourceallocation.Specialty#getSemester <em>Semester</em>}</li>
 *   <li>{@link resourceallocation.Specialty#getName <em>Name</em>}</li>
 *   <li>{@link resourceallocation.Specialty#getBachelor <em>Bachelor</em>}</li>
 * </ul>
 *
 * @see resourceallocation.ResourceallocationPackage#getSpecialty()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='name_length'"
 * @generated
 */
public interface Specialty extends EObject {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference list.
	 * The list contents are of type {@link resourceallocation.Course}.
	 * It is bidirectional and its opposite is '{@link resourceallocation.Course#getSpecialty <em>Specialty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference list.
	 * @see resourceallocation.ResourceallocationPackage#getSpecialty_Course()
	 * @see resourceallocation.Course#getSpecialty
	 * @model opposite="specialty" required="true"
	 * @generated
	 */
	EList<Course> getCourse();

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' reference list.
	 * The list contents are of type {@link resourceallocation.Semester}.
	 * It is bidirectional and its opposite is '{@link resourceallocation.Semester#getSpecialty <em>Specialty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' reference list.
	 * @see resourceallocation.ResourceallocationPackage#getSpecialty_Semester()
	 * @see resourceallocation.Semester#getSpecialty
	 * @model opposite="specialty" required="true"
	 * @generated
	 */
	EList<Semester> getSemester();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see resourceallocation.ResourceallocationPackage#getSpecialty_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link resourceallocation.Specialty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Bachelor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link resourceallocation.Bachelor#getSpecialty <em>Specialty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bachelor</em>' container reference.
	 * @see #setBachelor(Bachelor)
	 * @see resourceallocation.ResourceallocationPackage#getSpecialty_Bachelor()
	 * @see resourceallocation.Bachelor#getSpecialty
	 * @model opposite="specialty" required="true" transient="false"
	 * @generated
	 */
	Bachelor getBachelor();

	/**
	 * Sets the value of the '{@link resourceallocation.Specialty#getBachelor <em>Bachelor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bachelor</em>' container reference.
	 * @see #getBachelor()
	 * @generated
	 */
	void setBachelor(Bachelor value);

} // Specialty
