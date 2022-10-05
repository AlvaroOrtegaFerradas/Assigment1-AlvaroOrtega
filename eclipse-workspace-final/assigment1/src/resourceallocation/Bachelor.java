/**
 */
package resourceallocation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bachelor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceallocation.Bachelor#getPlans <em>Plans</em>}</li>
 *   <li>{@link resourceallocation.Bachelor#getName <em>Name</em>}</li>
 *   <li>{@link resourceallocation.Bachelor#getSpecialty <em>Specialty</em>}</li>
 * </ul>
 *
 * @see resourceallocation.ResourceallocationPackage#getBachelor()
 * @model
 * @generated
 */
public interface Bachelor extends EObject {
	/**
	 * Returns the value of the '<em><b>Plans</b></em>' containment reference list.
	 * The list contents are of type {@link resourceallocation.Plan}.
	 * It is bidirectional and its opposite is '{@link resourceallocation.Plan#getBachelor <em>Bachelor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plans</em>' containment reference list.
	 * @see resourceallocation.ResourceallocationPackage#getBachelor_Plans()
	 * @see resourceallocation.Plan#getBachelor
	 * @model opposite="bachelor" containment="true" required="true"
	 * @generated
	 */
	EList<Plan> getPlans();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see resourceallocation.ResourceallocationPackage#getBachelor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link resourceallocation.Bachelor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Specialty</b></em>' containment reference list.
	 * The list contents are of type {@link resourceallocation.Specialty}.
	 * It is bidirectional and its opposite is '{@link resourceallocation.Specialty#getBachelor <em>Bachelor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialty</em>' containment reference list.
	 * @see resourceallocation.ResourceallocationPackage#getBachelor_Specialty()
	 * @see resourceallocation.Specialty#getBachelor
	 * @model opposite="bachelor" containment="true"
	 * @generated
	 */
	EList<Specialty> getSpecialty();

} // Bachelor
