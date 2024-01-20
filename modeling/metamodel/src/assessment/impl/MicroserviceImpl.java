/**
 */
package assessment.impl;

import assessment.AssessmentPackage;
import assessment.Domain;
import assessment.KafCon;
import assessment.KafProd;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assessment.impl.MicroserviceImpl#getMsName <em>Ms Name</em>}</li>
 *   <li>{@link assessment.impl.MicroserviceImpl#getPackagename <em>Packagename</em>}</li>
 *   <li>{@link assessment.impl.MicroserviceImpl#getDomains <em>Domains</em>}</li>
 *   <li>{@link assessment.impl.MicroserviceImpl#getStream <em>Stream</em>}</li>
 *   <li>{@link assessment.impl.MicroserviceImpl#getConsumers <em>Consumers</em>}</li>
 *   <li>{@link assessment.impl.MicroserviceImpl#getProducers <em>Producers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicroserviceImpl extends MinimalEObjectImpl.Container implements Microservice {
	/**
	 * The default value of the '{@link #getMsName() <em>Ms Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsName()
	 * @generated
	 * @ordered
	 */
	protected static final String MS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMsName() <em>Ms Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsName()
	 * @generated
	 * @ordered
	 */
	protected String msName = MS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackagename() <em>Packagename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagename()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackagename() <em>Packagename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagename()
	 * @generated
	 * @ordered
	 */
	protected String packagename = PACKAGENAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomains() <em>Domains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomains()
	 * @generated
	 * @ordered
	 */
	protected EList<Domain> domains;

	/**
	 * The cached value of the '{@link #getStream() <em>Stream</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStream()
	 * @generated
	 * @ordered
	 */
	protected EList<KafStream> stream;

	/**
	 * The cached value of the '{@link #getConsumers() <em>Consumers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumers()
	 * @generated
	 * @ordered
	 */
	protected EList<KafCon> consumers;

	/**
	 * The cached value of the '{@link #getProducers() <em>Producers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducers()
	 * @generated
	 * @ordered
	 */
	protected EList<KafProd> producers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroserviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.MICROSERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMsName() {
		return msName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsName(String newMsName) {
		String oldMsName = msName;
		msName = newMsName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.MICROSERVICE__MS_NAME, oldMsName, msName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackagename() {
		return packagename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackagename(String newPackagename) {
		String oldPackagename = packagename;
		packagename = newPackagename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.MICROSERVICE__PACKAGENAME, oldPackagename, packagename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Domain> getDomains() {
		if (domains == null) {
			domains = new EObjectContainmentWithInverseEList<Domain>(Domain.class, this, AssessmentPackage.MICROSERVICE__DOMAINS, AssessmentPackage.DOMAIN__PARENT_MS);
		}
		return domains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KafStream> getStream() {
		if (stream == null) {
			stream = new EObjectContainmentWithInverseEList<KafStream>(KafStream.class, this, AssessmentPackage.MICROSERVICE__STREAM, AssessmentPackage.KAF_STREAM__PARENT_MS);
		}
		return stream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KafCon> getConsumers() {
		if (consumers == null) {
			consumers = new EObjectContainmentEList<KafCon>(KafCon.class, this, AssessmentPackage.MICROSERVICE__CONSUMERS);
		}
		return consumers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KafProd> getProducers() {
		if (producers == null) {
			producers = new EObjectContainmentEList<KafProd>(KafProd.class, this, AssessmentPackage.MICROSERVICE__PRODUCERS);
		}
		return producers;
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
			case AssessmentPackage.MICROSERVICE__DOMAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDomains()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.MICROSERVICE__STREAM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStream()).basicAdd(otherEnd, msgs);
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
			case AssessmentPackage.MICROSERVICE__DOMAINS:
				return ((InternalEList<?>)getDomains()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.MICROSERVICE__STREAM:
				return ((InternalEList<?>)getStream()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.MICROSERVICE__CONSUMERS:
				return ((InternalEList<?>)getConsumers()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.MICROSERVICE__PRODUCERS:
				return ((InternalEList<?>)getProducers()).basicRemove(otherEnd, msgs);
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
			case AssessmentPackage.MICROSERVICE__MS_NAME:
				return getMsName();
			case AssessmentPackage.MICROSERVICE__PACKAGENAME:
				return getPackagename();
			case AssessmentPackage.MICROSERVICE__DOMAINS:
				return getDomains();
			case AssessmentPackage.MICROSERVICE__STREAM:
				return getStream();
			case AssessmentPackage.MICROSERVICE__CONSUMERS:
				return getConsumers();
			case AssessmentPackage.MICROSERVICE__PRODUCERS:
				return getProducers();
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
			case AssessmentPackage.MICROSERVICE__MS_NAME:
				setMsName((String)newValue);
				return;
			case AssessmentPackage.MICROSERVICE__PACKAGENAME:
				setPackagename((String)newValue);
				return;
			case AssessmentPackage.MICROSERVICE__DOMAINS:
				getDomains().clear();
				getDomains().addAll((Collection<? extends Domain>)newValue);
				return;
			case AssessmentPackage.MICROSERVICE__STREAM:
				getStream().clear();
				getStream().addAll((Collection<? extends KafStream>)newValue);
				return;
			case AssessmentPackage.MICROSERVICE__CONSUMERS:
				getConsumers().clear();
				getConsumers().addAll((Collection<? extends KafCon>)newValue);
				return;
			case AssessmentPackage.MICROSERVICE__PRODUCERS:
				getProducers().clear();
				getProducers().addAll((Collection<? extends KafProd>)newValue);
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
			case AssessmentPackage.MICROSERVICE__MS_NAME:
				setMsName(MS_NAME_EDEFAULT);
				return;
			case AssessmentPackage.MICROSERVICE__PACKAGENAME:
				setPackagename(PACKAGENAME_EDEFAULT);
				return;
			case AssessmentPackage.MICROSERVICE__DOMAINS:
				getDomains().clear();
				return;
			case AssessmentPackage.MICROSERVICE__STREAM:
				getStream().clear();
				return;
			case AssessmentPackage.MICROSERVICE__CONSUMERS:
				getConsumers().clear();
				return;
			case AssessmentPackage.MICROSERVICE__PRODUCERS:
				getProducers().clear();
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
			case AssessmentPackage.MICROSERVICE__MS_NAME:
				return MS_NAME_EDEFAULT == null ? msName != null : !MS_NAME_EDEFAULT.equals(msName);
			case AssessmentPackage.MICROSERVICE__PACKAGENAME:
				return PACKAGENAME_EDEFAULT == null ? packagename != null : !PACKAGENAME_EDEFAULT.equals(packagename);
			case AssessmentPackage.MICROSERVICE__DOMAINS:
				return domains != null && !domains.isEmpty();
			case AssessmentPackage.MICROSERVICE__STREAM:
				return stream != null && !stream.isEmpty();
			case AssessmentPackage.MICROSERVICE__CONSUMERS:
				return consumers != null && !consumers.isEmpty();
			case AssessmentPackage.MICROSERVICE__PRODUCERS:
				return producers != null && !producers.isEmpty();
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
		result.append(" (msName: ");
		result.append(msName);
		result.append(", packagename: ");
		result.append(packagename);
		result.append(')');
		return result.toString();
	}

} //MicroserviceImpl
