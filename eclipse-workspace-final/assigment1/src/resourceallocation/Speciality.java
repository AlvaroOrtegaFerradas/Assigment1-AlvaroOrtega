/**
 */
package resourceallocation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Speciality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceallocation.Speciality#getName <em>Name</em>}</li>
 *   <li>{@link resourceallocation.Speciality#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see resourceallocation.ResourceallocationPackage#getSpeciality()
 * @model
 * @generated
 */
public interface Speciality extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see resourceallocation.ResourceallocationPackage#getSpeciality_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link resourceallocation.Speciality#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link resourceallocation.Course}.
	 * It is bidirectional and its opposite is '{@link resourceallocation.Course#getSpeciality <em>Speciality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see resourceallocation.ResourceallocationPackage#getSpeciality_Courses()
	 * @see resourceallocation.Course#getSpeciality
	 * @model opposite="speciality" required="true"
	 * @generated
	 */
	EList<Course> getCourses();

} // Speciality
