/**
 */
package assessment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assessment.Topic#getTopicName <em>Topic Name</em>}</li>
 *   <li>{@link assessment.Topic#getRelatedEvents <em>Related Events</em>}</li>
 *   <li>{@link assessment.Topic#getProducers <em>Producers</em>}</li>
 *   <li>{@link assessment.Topic#getSubscribers <em>Subscribers</em>}</li>
 * </ul>
 *
 * @see assessment.AssessmentPackage#getTopic()
 * @model
 * @generated
 */
public interface Topic extends EObject {
	/**
	 * Returns the value of the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Name</em>' attribute.
	 * @see #setTopicName(String)
	 * @see assessment.AssessmentPackage#getTopic_TopicName()
	 * @model
	 * @generated
	 */
	String getTopicName();

	/**
	 * Sets the value of the '{@link assessment.Topic#getTopicName <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Name</em>' attribute.
	 * @see #getTopicName()
	 * @generated
	 */
	void setTopicName(String value);

	/**
	 * Returns the value of the '<em><b>Related Events</b></em>' reference list.
	 * The list contents are of type {@link assessment.Event}.
	 * It is bidirectional and its opposite is '{@link assessment.Event#getRelatedTopics <em>Related Topics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Events</em>' reference list.
	 * @see assessment.AssessmentPackage#getTopic_RelatedEvents()
	 * @see assessment.Event#getRelatedTopics
	 * @model opposite="relatedTopics"
	 * @generated
	 */
	EList<Event> getRelatedEvents();

	/**
	 * Returns the value of the '<em><b>Producers</b></em>' reference list.
	 * The list contents are of type {@link assessment.KafProd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producers</em>' reference list.
	 * @see assessment.AssessmentPackage#getTopic_Producers()
	 * @model
	 * @generated
	 */
	EList<KafProd> getProducers();

	/**
	 * Returns the value of the '<em><b>Subscribers</b></em>' reference list.
	 * The list contents are of type {@link assessment.KafCon}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribers</em>' reference list.
	 * @see assessment.AssessmentPackage#getTopic_Subscribers()
	 * @model
	 * @generated
	 */
	EList<KafCon> getSubscribers();

} // Topic
