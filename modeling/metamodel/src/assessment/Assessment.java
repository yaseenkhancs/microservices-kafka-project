/**
 */
package assessment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assessment.Assessment#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link assessment.Assessment#getEvents <em>Events</em>}</li>
 *   <li>{@link assessment.Assessment#getMicroservices <em>Microservices</em>}</li>
 *   <li>{@link assessment.Assessment#getTopics <em>Topics</em>}</li>
 * </ul>
 *
 * @see assessment.AssessmentPackage#getAssessment()
 * @model
 * @generated
 */
public interface Assessment extends EObject {
	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see assessment.AssessmentPackage#getAssessment_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link assessment.Assessment#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link assessment.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see assessment.AssessmentPackage#getAssessment_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Microservices</b></em>' containment reference list.
	 * The list contents are of type {@link assessment.Microservice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microservices</em>' containment reference list.
	 * @see assessment.AssessmentPackage#getAssessment_Microservices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Microservice> getMicroservices();

	/**
	 * Returns the value of the '<em><b>Topics</b></em>' containment reference list.
	 * The list contents are of type {@link assessment.Topic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics</em>' containment reference list.
	 * @see assessment.AssessmentPackage#getAssessment_Topics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Topic> getTopics();

} // Assessment
