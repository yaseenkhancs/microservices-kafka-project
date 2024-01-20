/**
 */
package assessment.impl;

import assessment.AssessmentPackage;
import assessment.Event;
import assessment.KafStream;
import assessment.Microservice;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kaf Stream</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assessment.impl.KafStreamImpl#getStreamName <em>Stream Name</em>}</li>
 *   <li>{@link assessment.impl.KafStreamImpl#getAssociatedEvents <em>Associated Events</em>}</li>
 *   <li>{@link assessment.impl.KafStreamImpl#getParentMS <em>Parent MS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KafStreamImpl extends MinimalEObjectImpl.Container implements KafStream {
	/**
	 * The default value of the '{@link #getStreamName() <em>Stream Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamName()
	 * @generated
	 * @ordered
	 */
	protected static final String STREAM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreamName() <em>Stream Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamName()
	 * @generated
	 * @ordered
	 */
	protected String streamName = STREAM_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssociatedEvents() <em>Associated Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> associatedEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KafStreamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.KAF_STREAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreamName() {
		return streamName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreamName(String newStreamName) {
		String oldStreamName = streamName;
		streamName = newStreamName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.KAF_STREAM__STREAM_NAME, oldStreamName, streamName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getAssociatedEvents() {
		if (associatedEvents == null) {
			associatedEvents = new EObjectResolvingEList<Event>(Event.class, this, AssessmentPackage.KAF_STREAM__ASSOCIATED_EVENTS);
		}
		return associatedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microservice getParentMS() {
		if (eContainerFeatureID() != AssessmentPackage.KAF_STREAM__PARENT_MS) return null;
		return (Microservice)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentMS(Microservice newParentMS, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentMS, AssessmentPackage.KAF_STREAM__PARENT_MS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentMS(Microservice newParentMS) {
		if (newParentMS != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.KAF_STREAM__PARENT_MS && newParentMS != null)) {
			if (EcoreUtil.isAncestor(this, newParentMS))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentMS != null)
				msgs = ((InternalEObject)newParentMS).eInverseAdd(this, AssessmentPackage.MICROSERVICE__STREAM, Microservice.class, msgs);
			msgs = basicSetParentMS(newParentMS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.KAF_STREAM__PARENT_MS, newParentMS, newParentMS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssessmentPackage.KAF_STREAM__PARENT_MS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentMS((Microservice)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssessmentPackage.KAF_STREAM__PARENT_MS:
				return basicSetParentMS(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AssessmentPackage.KAF_STREAM__PARENT_MS:
				return eInternalContainer().eInverseRemove(this, AssessmentPackage.MICROSERVICE__STREAM, Microservice.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssessmentPackage.KAF_STREAM__STREAM_NAME:
				return getStreamName();
			case AssessmentPackage.KAF_STREAM__ASSOCIATED_EVENTS:
				return getAssociatedEvents();
			case AssessmentPackage.KAF_STREAM__PARENT_MS:
				return getParentMS();
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
			case AssessmentPackage.KAF_STREAM__STREAM_NAME:
				setStreamName((String)newValue);
				return;
			case AssessmentPackage.KAF_STREAM__ASSOCIATED_EVENTS:
				getAssociatedEvents().clear();
				getAssociatedEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case AssessmentPackage.KAF_STREAM__PARENT_MS:
				setParentMS((Microservice)newValue);
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
			case AssessmentPackage.KAF_STREAM__STREAM_NAME:
				setStreamName(STREAM_NAME_EDEFAULT);
				return;
			case AssessmentPackage.KAF_STREAM__ASSOCIATED_EVENTS:
				getAssociatedEvents().clear();
				return;
			case AssessmentPackage.KAF_STREAM__PARENT_MS:
				setParentMS((Microservice)null);
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
			case AssessmentPackage.KAF_STREAM__STREAM_NAME:
				return STREAM_NAME_EDEFAULT == null ? streamName != null : !STREAM_NAME_EDEFAULT.equals(streamName);
			case AssessmentPackage.KAF_STREAM__ASSOCIATED_EVENTS:
				return associatedEvents != null && !associatedEvents.isEmpty();
			case AssessmentPackage.KAF_STREAM__PARENT_MS:
				return getParentMS() != null;
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
		result.append(" (streamName: ");
		result.append(streamName);
		result.append(')');
		return result.toString();
	}

} //KafStreamImpl
