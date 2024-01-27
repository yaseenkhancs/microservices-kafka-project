/**
 */
package assessment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kaf Stream</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assessment.KafStream#getStreamName <em>Stream Name</em>}</li>
 *   <li>{@link assessment.KafStream#getAssociatedEvents <em>Associated Events</em>}</li>
 *   <li>{@link assessment.KafStream#getParentMS <em>Parent MS</em>}</li>
 * </ul>
 *
 * @see assessment.AssessmentPackage#getKafStream()
 * @model
 * @generated
 */
public interface KafStream extends EObject {
	/**
	 * Returns the value of the '<em><b>Stream Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stream Name</em>' attribute.
	 * @see #setStreamName(String)
	 * @see assessment.AssessmentPackage#getKafStream_StreamName()
	 * @model
	 * @generated
	 */
	String getStreamName();

	/**
	 * Sets the value of the '{@link assessment.KafStream#getStreamName <em>Stream Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream Name</em>' attribute.
	 * @see #getStreamName()
	 * @generated
	 */
	void setStreamName(String value);

	/**
	 * Returns the value of the '<em><b>Associated Events</b></em>' reference list.
	 * The list contents are of type {@link assessment.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Events</em>' reference list.
	 * @see assessment.AssessmentPackage#getKafStream_AssociatedEvents()
	 * @model
	 * @generated
	 */
	EList<Event> getAssociatedEvents();

	/**
	 * Returns the value of the '<em><b>Parent MS</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link assessment.Microservice#getStream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent MS</em>' container reference.
	 * @see #setParentMS(Microservice)
	 * @see assessment.AssessmentPackage#getKafStream_ParentMS()
	 * @see assessment.Microservice#getStream
	 * @model opposite="stream" transient="false"
	 * @generated
	 */
	Microservice getParentMS();

	/**
	 * Sets the value of the '{@link assessment.KafStream#getParentMS <em>Parent MS</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent MS</em>' container reference.
	 * @see #getParentMS()
	 * @generated
	 */
	void setParentMS(Microservice value);

} // KafStream
