/**
 */
package assessment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assessment.HttpMethod#getName <em>Name</em>}</li>
 *   <li>{@link assessment.HttpMethod#getHttpType <em>Http Type</em>}</li>
 *   <li>{@link assessment.HttpMethod#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link assessment.HttpMethod#getPath <em>Path</em>}</li>
 *   <li>{@link assessment.HttpMethod#getParameters <em>Parameters</em>}</li>
 *   <li>{@link assessment.HttpMethod#isTransactional <em>Transactional</em>}</li>
 * </ul>
 *
 * @see assessment.AssessmentPackage#getHttpMethod()
 * @model
 * @generated
 */
public interface HttpMethod extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assessment.AssessmentPackage#getHttpMethod_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assessment.HttpMethod#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Http Type</b></em>' attribute.
	 * The literals are from the enumeration {@link assessment.httpTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Type</em>' attribute.
	 * @see assessment.httpTypeEnum
	 * @see #setHttpType(httpTypeEnum)
	 * @see assessment.AssessmentPackage#getHttpMethod_HttpType()
	 * @model
	 * @generated
	 */
	httpTypeEnum getHttpType();

	/**
	 * Sets the value of the '{@link assessment.HttpMethod#getHttpType <em>Http Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Type</em>' attribute.
	 * @see assessment.httpTypeEnum
	 * @see #getHttpType()
	 * @generated
	 */
	void setHttpType(httpTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see #setReturnType(String)
	 * @see assessment.AssessmentPackage#getHttpMethod_ReturnType()
	 * @model
	 * @generated
	 */
	String getReturnType();

	/**
	 * Sets the value of the '{@link assessment.HttpMethod#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see assessment.AssessmentPackage#getHttpMethod_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link assessment.HttpMethod#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute list.
	 * @see assessment.AssessmentPackage#getHttpMethod_Parameters()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getParameters();

	/**
	 * Returns the value of the '<em><b>Transactional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactional</em>' attribute.
	 * @see #setTransactional(boolean)
	 * @see assessment.AssessmentPackage#getHttpMethod_Transactional()
	 * @model
	 * @generated
	 */
	boolean isTransactional();

	/**
	 * Sets the value of the '{@link assessment.HttpMethod#isTransactional <em>Transactional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transactional</em>' attribute.
	 * @see #isTransactional()
	 * @generated
	 */
	void setTransactional(boolean value);

} // HttpMethod
