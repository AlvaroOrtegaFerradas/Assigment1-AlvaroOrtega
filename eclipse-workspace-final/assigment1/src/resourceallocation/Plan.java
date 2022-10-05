/**
 */
package resourceallocation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceallocation.Plan#getName <em>Name</em>}</li>
 *   <li>{@link resourceallocation.Plan#getBachelor <em>Bachelor</em>}</li>
 *   <li>{@link resourceallocation.Plan#getYears <em>Years</em>}</li>
 *   <li>{@link resourceallocation.Plan#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see resourceallocation.ResourceallocationPackage#getPlan()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='correct_year'"
 * @generated
 */
public interface Plan extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(int)
	 * @see resourceallocation.ResourceallocationPackage#getPlan_Name()
	 * @model required="true"
	 * @generated
	 */
	int getName();

	/**
	 * Sets the value of the '{@link resourceallocation.Plan#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(int value);

	/**
	 * Returns the value of the '<em><b>Bachelor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link resourceallocation.Bachelor#getPlans <em>Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bachelor</em>' container reference.
	 * @see #setBachelor(Bachelor)
	 * @see resourceallocation.ResourceallocationPackage#getPlan_Bachelor()
	 * @see resourceallocation.Bachelor#getPlans
	 * @model opposite="plans" required="true" transient="false"
	 * @generated
	 */
	Bachelor getBachelor();

	/**
	 * Sets the value of the '{@link resourceallocation.Plan#getBachelor <em>Bachelor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bachelor</em>' container reference.
	 * @see #getBachelor()
	 * @generated
	 */
	void setBachelor(Bachelor value);

	/**
	 * Returns the value of the '<em><b>Years</b></em>' containment reference list.
	 * The list contents are of type {@link resourceallocation.Year}.
	 * It is bidirectional and its opposite is '{@link resourceallocation.Year#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Years</em>' containment reference list.
	 * @see resourceallocation.ResourceallocationPackage#getPlan_Years()
	 * @see resourceallocation.Year#getPlan
	 * @model opposite="plan" containment="true" required="true"
	 * @generated
	 */
	EList<Year> getYears();

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see resourceallocation.ResourceallocationPackage#getPlan_Duration()
	 * @model required="true"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link resourceallocation.Plan#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

} // Plan
