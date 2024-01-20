/**
 */
package assessment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kaf Con</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assessment.KafCon#getConName <em>Con Name</em>}</li>
 *   <li>{@link assessment.KafCon#getConsumedEvents <em>Consumed Events</em>}</li>
 * </ul>
 *
 * @see assessment.AssessmentPackage#getKafCon()
 * @model
 * @generated
 */
public interface KafCon extends EObject {
	/**
	 * Returns the value of the '<em><b>Con Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Con Name</em>' attribute.
	 * @see #setConName(String)
	 * @see assessment.AssessmentPackage#getKafCon_ConName()
	 * @model
	 * @generated
	 */
	String getConName();

	/**
	 * Sets the value of the '{@link assessment.KafCon#getConName <em>Con Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Con Name</em>' attribute.
	 * @see #getConName()
	 * @generated
	 */
	void setConName(String value);

	/**
	 * Returns the value of the '<em><b>Consumed Events</b></em>' reference list.
	 * The list contents are of type {@link assessment.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumed Events</em>' reference list.
	 * @see assessment.AssessmentPackage#getKafCon_ConsumedEvents()
	 * @model
	 * @generated
	 */
	EList<Event> getConsumedEvents();

} // KafCon
