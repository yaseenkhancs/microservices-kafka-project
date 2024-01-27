/**
 */
package assessment.impl;

import assessment.AssessmentPackage;
import assessment.Event;
import assessment.KafCon;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kaf Con</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assessment.impl.KafConImpl#getConName <em>Con Name</em>}</li>
 *   <li>{@link assessment.impl.KafConImpl#getConsumedEvents <em>Consumed Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KafConImpl extends MinimalEObjectImpl.Container implements KafCon {
	/**
	 * The default value of the '{@link #getConName() <em>Con Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConName()
	 * @generated
	 * @ordered
	 */
	protected static final String CON_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConName() <em>Con Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConName()
	 * @generated
	 * @ordered
	 */
	protected String conName = CON_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConsumedEvents() <em>Consumed Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumedEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> consumedEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KafConImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.KAF_CON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConName() {
		return conName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConName(String newConName) {
		String oldConName = conName;
		conName = newConName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.KAF_CON__CON_NAME, oldConName, conName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getConsumedEvents() {
		if (consumedEvents == null) {
			consumedEvents = new EObjectResolvingEList<Event>(Event.class, this, AssessmentPackage.KAF_CON__CONSUMED_EVENTS);
		}
		return consumedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssessmentPackage.KAF_CON__CON_NAME:
				return getConName();
			case AssessmentPackage.KAF_CON__CONSUMED_EVENTS:
				return getConsumedEvents();
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
			case AssessmentPackage.KAF_CON__CON_NAME:
				setConName((String)newValue);
				return;
			case AssessmentPackage.KAF_CON__CONSUMED_EVENTS:
				getConsumedEvents().clear();
				getConsumedEvents().addAll((Collection<? extends Event>)newValue);
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
			case AssessmentPackage.KAF_CON__CON_NAME:
				setConName(CON_NAME_EDEFAULT);
				return;
			case AssessmentPackage.KAF_CON__CONSUMED_EVENTS:
				getConsumedEvents().clear();
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
			case AssessmentPackage.KAF_CON__CON_NAME:
				return CON_NAME_EDEFAULT == null ? conName != null : !CON_NAME_EDEFAULT.equals(conName);
			case AssessmentPackage.KAF_CON__CONSUMED_EVENTS:
				return consumedEvents != null && !consumedEvents.isEmpty();
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
		result.append(" (conName: ");
		result.append(conName);
		result.append(')');
		return result.toString();
	}

} //KafConImpl
