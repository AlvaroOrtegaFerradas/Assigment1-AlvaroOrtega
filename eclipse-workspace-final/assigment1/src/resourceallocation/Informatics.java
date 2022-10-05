/**
 */
package resourceallocation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Informatics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceallocation.Informatics#getPlan <em>Plan</em>}</li>
 * </ul>
 *
 * @see resourceallocation.ResourceallocationPackage#getInformatics()
 * @model
 * @generated
 */
public interface Informatics extends EObject {
	/**
	 * Returns the value of the '<em><b>Plan</b></em>' containment reference list.
	 * The list contents are of type {@link resourceallocation.Plan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan</em>' containment reference list.
	 * @see resourceallocation.ResourceallocationPackage#getInformatics_Plan()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Plan> getPlan();

} // Informatics
