/**
 */
package assessment.impl;

import assessment.AssessmentPackage;
import assessment.Event;
import assessment.KafProd;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kaf Prod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assessment.impl.KafProdImpl#getProdName <em>Prod Name</em>}</li>
 *   <li>{@link assessment.impl.KafProdImpl#getProducedEvents <em>Produced Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KafProdImpl extends MinimalEObjectImpl.Container implements KafProd {
	/**
	 * The default value of the '{@link #getProdName() <em>Prod Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProdName() <em>Prod Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdName()
	 * @generated
	 * @ordered
	 */
	protected String prodName = PROD_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProducedEvents() <em>Produced Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> producedEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KafProdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.KAF_PROD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProdName() {
		return prodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProdName(String newProdName) {
		String oldProdName = prodName;
		prodName = newProdName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.KAF_PROD__PROD_NAME, oldProdName, prodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getProducedEvents() {
		if (producedEvents == null) {
			producedEvents = new EObjectResolvingEList<Event>(Event.class, this, AssessmentPackage.KAF_PROD__PRODUCED_EVENTS);
		}
		return producedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssessmentPackage.KAF_PROD__PROD_NAME:
				return getProdName();
			case AssessmentPackage.KAF_PROD__PRODUCED_EVENTS:
				return getProducedEvents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AssessmentPackage.KAF_PROD__PROD_NAME:
				setProdName((String)newValue);
				return;
			case AssessmentPackage.KAF_PROD__PRODUCED_EVENTS:
				getProducedEvents().clear();
				getProducedEvents().addAll((Collection<? extends Event>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AssessmentPackage.KAF_PROD__PROD_NAME:
				setProdName(PROD_NAME_EDEFAULT);
				return;
			case AssessmentPackage.KAF_PROD__PRODUCED_EVENTS:
				getProducedEvents().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AssessmentPackage.KAF_PROD__PROD_NAME:
				return PROD_NAME_EDEFAULT == null ? prodName != null : !PROD_NAME_EDEFAULT.equals(prodName);
			case AssessmentPackage.KAF_PROD__PRODUCED_EVENTS:
				return producedEvents != null && !producedEvents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (prodName: ");
		result.append(prodName);
		result.append(')');
		return result.toString();
	}

} //KafProdImpl
