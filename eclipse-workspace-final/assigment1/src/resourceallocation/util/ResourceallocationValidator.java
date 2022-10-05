/**
 */
package resourceallocation.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import resourceallocation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see resourceallocation.ResourceallocationPackage
 * @generated
 */
public class ResourceallocationValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ResourceallocationValidator INSTANCE = new ResourceallocationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "resourceallocation";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceallocationValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ResourceallocationPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ResourceallocationPackage.BACHELOR:
				return validateBachelor((Bachelor)value, diagnostics, context);
			case ResourceallocationPackage.PLAN:
				return validatePlan((Plan)value, diagnostics, context);
			case ResourceallocationPackage.YEAR:
				return validateYear((Year)value, diagnostics, context);
			case ResourceallocationPackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case ResourceallocationPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case ResourceallocationPackage.SPECIALTY:
				return validateSpecialty((Specialty)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBachelor(Bachelor bachelor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bachelor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlan(Plan plan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(plan, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(plan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(plan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(plan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(plan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(plan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(plan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(plan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(plan, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlan_correct_year(plan, diagnostics, context);
		return result;
	}

	/**
	 * Validates the correct_year constraint of '<em>Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePlan_correct_year(Plan plan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (! minYear(plan.getName())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "min_num_credits", getObjectLabel(plan, context) },
						 new Object[] { plan },
						 context));
			}
			return false;
		}
		return true;
	}
	private boolean minYear(Integer name) {
	    if (name < 2019) {
	    	return false;
	    	}
	    if (name > 2022) {
	    	return false;
	        }
	    return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYear(Year year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(year, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_min_num_credits(course, diagnostics, context);
		return result;
	}

	/**
	 * Validates the min_num_credits constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCourse_min_num_credits(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (!minCredits(course.getCredits())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "min_num_credits", getObjectLabel(course, context) },
						 new Object[] { course },
						 context));
			}
			return false;
		}
		return true;
	}
	private boolean minCredits(Float credits) {
	    if (credits < 1.5) {
	    	return false;
	    	}
	    if (credits > 12) {
	    	return false;
	        }
	    return true;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialty(Specialty specialty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(specialty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(specialty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(specialty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(specialty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(specialty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(specialty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(specialty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(specialty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(specialty, diagnostics, context);
		if (result || diagnostics != null) result &= validateSpecialty_name_length(specialty, diagnostics, context);
		return result;
	}

	/**
	 * Validates the name_length constraint of '<em>Specialty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSpecialty_name_length(Specialty specialty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (!lengthName(specialty.getName())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "name_length", getObjectLabel(specialty, context) },
						 new Object[] { specialty },
						 context));
			}
			return false;
		}
		return true;
	}
	private boolean lengthName(String name) {
	    if (name.length() < 3 ) {
	    	return false;
	    	}
	    if (name.length() > 50) {
	    	return false;
	        }
	    return true;
	}
	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ResourceallocationValidator
