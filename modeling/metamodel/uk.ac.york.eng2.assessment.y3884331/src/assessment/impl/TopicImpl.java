/**
 */
package assessment.impl;

import assessment.AssessmentPackage;
import assessment.Event;
import assessment.KafCon;
import assessment.KafProd;
import assessment.Topic;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assessment.impl.TopicImpl#getTopicName <em>Topic Name</em>}</li>
 *   <li>{@link assessment.impl.TopicImpl#getRelatedEvents <em>Related Events</em>}</li>
 *   <li>{@link assessment.impl.TopicImpl#getProducers <em>Producers</em>}</li>
 *   <li>{@link assessment.impl.TopicImpl#getSubscribers <em>Subscribers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopicImpl extends MinimalEObjectImpl.Container implements Topic {
	/**
	 * The default value of the '{@link #getTopicName() <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicName()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopicName() <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicName()
	 * @generated
	 * @ordered
	 */
	protected String topicName = TOPIC_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedEvents() <em>Related Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> relatedEvents;

	/**
	 * The cached value of the '{@link #getProducers() <em>Producers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducers()
	 * @generated
	 * @ordered
	 */
	protected EList<KafProd> producers;

	/**
	 * The cached value of the '{@link #getSubscribers() <em>Subscribers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribers()
	 * @generated
	 * @ordered
	 */
	protected EList<KafCon> subscribers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.TOPIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopicName() {
		return topicName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopicName(String newTopicName) {
		String oldTopicName = topicName;
		topicName = newTopicName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.TOPIC__TOPIC_NAME, oldTopicName, topicName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getRelatedEvents() {
		if (relatedEvents == null) {
			relatedEvents = new EObjectWithInverseResolvingEList.ManyInverse<Event>(Event.class, this, AssessmentPackage.TOPIC__RELATED_EVENTS, AssessmentPackage.EVENT__RELATED_TOPICS);
		}
		return relatedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KafProd> getProducers() {
		if (producers == null) {
			producers = new EObjectResolvingEList<KafProd>(KafProd.class, this, AssessmentPackage.TOPIC__PRODUCERS);
		}
		return producers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KafCon> getSubscribers() {
		if (subscribers == null) {
			subscribers = new EObjectResolvingEList<KafCon>(KafCon.class, this, AssessmentPackage.TOPIC__SUBSCRIBERS);
		}
		return subscribers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssessmentPackage.TOPIC__RELATED_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelatedEvents()).basicAdd(otherEnd, msgs);
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
			case AssessmentPackage.TOPIC__RELATED_EVENTS:
				return ((InternalEList<?>)getRelatedEvents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssessmentPackage.TOPIC__TOPIC_NAME:
				return getTopicName();
			case AssessmentPackage.TOPIC__RELATED_EVENTS:
				return getRelatedEvents();
			case AssessmentPackage.TOPIC__PRODUCERS:
				return getProducers();
			case AssessmentPackage.TOPIC__SUBSCRIBERS:
				return getSubscribers();
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
			case AssessmentPackage.TOPIC__TOPIC_NAME:
				setTopicName((String)newValue);
				return;
			case AssessmentPackage.TOPIC__RELATED_EVENTS:
				getRelatedEvents().clear();
				getRelatedEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case AssessmentPackage.TOPIC__PRODUCERS:
				getProducers().clear();
				getProducers().addAll((Collection<? extends KafProd>)newValue);
				return;
			case AssessmentPackage.TOPIC__SUBSCRIBERS:
				getSubscribers().clear();
				getSubscribers().addAll((Collection<? extends KafCon>)newValue);
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
			case AssessmentPackage.TOPIC__TOPIC_NAME:
				setTopicName(TOPIC_NAME_EDEFAULT);
				return;
			case AssessmentPackage.TOPIC__RELATED_EVENTS:
				getRelatedEvents().clear();
				return;
			case AssessmentPackage.TOPIC__PRODUCERS:
				getProducers().clear();
				return;
			case AssessmentPackage.TOPIC__SUBSCRIBERS:
				getSubscribers().clear();
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
			case AssessmentPackage.TOPIC__TOPIC_NAME:
				return TOPIC_NAME_EDEFAULT == null ? topicName != null : !TOPIC_NAME_EDEFAULT.equals(topicName);
			case AssessmentPackage.TOPIC__RELATED_EVENTS:
				return relatedEvents != null && !relatedEvents.isEmpty();
			case AssessmentPackage.TOPIC__PRODUCERS:
				return producers != null && !producers.isEmpty();
			case AssessmentPackage.TOPIC__SUBSCRIBERS:
				return subscribers != null && !subscribers.isEmpty();
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
		result.append(" (topicName: ");
		result.append(topicName);
		result.append(')');
		return result.toString();
	}

} //TopicImpl
