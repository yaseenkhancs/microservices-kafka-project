/**
 */
package assessment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assessment.Microservice#getMsName <em>Ms Name</em>}</li>
 *   <li>{@link assessment.Microservice#getPackagename <em>Packagename</em>}</li>
 *   <li>{@link assessment.Microservice#getDomains <em>Domains</em>}</li>
 *   <li>{@link assessment.Microservice#getStream <em>Stream</em>}</li>
 *   <li>{@link assessment.Microservice#getConsumers <em>Consumers</em>}</li>
 *   <li>{@link assessment.Microservice#getProducers <em>Producers</em>}</li>
 * </ul>
 *
 * @see assessment.AssessmentPackage#getMicroservice()
 * @model
 * @generated
 */
public interface Microservice extends EObject {
	/**
	 * Returns the value of the '<em><b>Ms Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ms Name</em>' attribute.
	 * @see #setMsName(String)
	 * @see assessment.AssessmentPackage#getMicroservice_MsName()
	 * @model
	 * @generated
	 */
	String getMsName();

	/**
	 * Sets the value of the '{@link assessment.Microservice#getMsName <em>Ms Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ms Name</em>' attribute.
	 * @see #getMsName()
	 * @generated
	 */
	void setMsName(String value);

	/**
	 * Returns the value of the '<em><b>Packagename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packagename</em>' attribute.
	 * @see #setPackagename(String)
	 * @see assessment.AssessmentPackage#getMicroservice_Packagename()
	 * @model
	 * @generated
	 */
	String getPackagename();

	/**
	 * Sets the value of the '{@link assessment.Microservice#getPackagename <em>Packagename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packagename</em>' attribute.
	 * @see #getPackagename()
	 * @generated
	 */
	void setPackagename(String value);

	/**
	 * Returns the value of the '<em><b>Domains</b></em>' containment reference list.
	 * The list contents are of type {@link assessment.Domain}.
	 * It is bidirectional and its opposite is '{@link assessment.Domain#getParentMS <em>Parent MS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domains</em>' containment reference list.
	 * @see assessment.AssessmentPackage#getMicroservice_Domains()
	 * @see assessment.Domain#getParentMS
	 * @model opposite="parentMS" containment="true"
	 * @generated
	 */
	EList<Domain> getDomains();

	/**
	 * Returns the value of the '<em><b>Stream</b></em>' containment reference list.
	 * The list contents are of type {@link assessment.KafStream}.
	 * It is bidirectional and its opposite is '{@link assessment.KafStream#getParentMS <em>Parent MS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stream</em>' containment reference list.
	 * @see assessment.AssessmentPackage#getMicroservice_Stream()
	 * @see assessment.KafStream#getParentMS
	 * @model opposite="parentMS" containment="true"
	 * @generated
	 */
	EList<KafStream> getStream();

	/**
	 * Returns the value of the '<em><b>Consumers</b></em>' containment reference list.
	 * The list contents are of type {@link assessment.KafCon}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumers</em>' containment reference list.
	 * @see assessment.AssessmentPackage#getMicroservice_Consumers()
	 * @model containment="true"
	 * @generated
	 */
	EList<KafCon> getConsumers();

	/**
	 * Returns the value of the '<em><b>Producers</b></em>' containment reference list.
	 * The list contents are of type {@link assessment.KafProd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producers</em>' containment reference list.
	 * @see assessment.AssessmentPackage#getMicroservice_Producers()
	 * @model containment="true"
	 * @generated
	 */
	EList<KafProd> getProducers();

} // Microservice
