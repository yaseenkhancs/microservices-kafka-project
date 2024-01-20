/**
 */
package assessment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kaf Prod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assessment.KafProd#getProdName <em>Prod Name</em>}</li>
 *   <li>{@link assessment.KafProd#getProducedEvents <em>Produced Events</em>}</li>
 * </ul>
 *
 * @see assessment.AssessmentPackage#getKafProd()
 * @model
 * @generated
 */
public interface KafProd extends EObject {
	/**
	 * Returns the value of the '<em><b>Prod Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prod Name</em>' attribute.
	 * @see #setProdName(String)
	 * @see assessment.AssessmentPackage#getKafProd_ProdName()
	 * @model
	 * @generated
	 */
	String getProdName();

	/**
	 * Sets the value of the '{@link assessment.KafProd#getProdName <em>Prod Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prod Name</em>' attribute.
	 * @see #getProdName()
	 * @generated
	 */
	void setProdName(String value);

	/**
	 * Returns the value of the '<em><b>Produced Events</b></em>' reference list.
	 * The list contents are of type {@link assessment.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produced Events</em>' reference list.
	 * @see assessment.AssessmentPackage#getKafProd_ProducedEvents()
	 * @model
	 * @generated
	 */
	EList<Event> getProducedEvents();

} // KafProd
