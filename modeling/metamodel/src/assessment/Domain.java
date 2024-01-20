/**
 */
package assessment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assessment.Domain#getName <em>Name</em>}</li>
 *   <li>{@link assessment.Domain#getParentMS <em>Parent MS</em>}</li>
 *   <li>{@link assessment.Domain#getHttpMethods <em>Http Methods</em>}</li>
 * </ul>
 *
 * @see assessment.AssessmentPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assessment.AssessmentPackage#getDomain_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assessment.Domain#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent MS</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link assessment.Microservice#getDomains <em>Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent MS</em>' container reference.
	 * @see #setParentMS(Microservice)
	 * @see assessment.AssessmentPackage#getDomain_ParentMS()
	 * @see assessment.Microservice#getDomains
	 * @model opposite="domains" transient="false"
	 * @generated
	 */
	Microservice getParentMS();

	/**
	 * Sets the value of the '{@link assessment.Domain#getParentMS <em>Parent MS</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent MS</em>' container reference.
	 * @see #getParentMS()
	 * @generated
	 */
	void setParentMS(Microservice value);

	/**
	 * Returns the value of the '<em><b>Http Methods</b></em>' containment reference list.
	 * The list contents are of type {@link assessment.HttpMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Methods</em>' containment reference list.
	 * @see assessment.AssessmentPackage#getDomain_HttpMethods()
	 * @model containment="true"
	 * @generated
	 */
	EList<HttpMethod> getHttpMethods();

} // Domain
