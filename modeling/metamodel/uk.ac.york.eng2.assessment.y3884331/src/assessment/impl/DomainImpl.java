/**
 */
package assessment.impl;

import assessment.AssessmentPackage;
import assessment.Domain;
import assessment.HttpMethod;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assessment.impl.DomainImpl#getName <em>Name</em>}</li>
 *   <li>{@link assessment.impl.DomainImpl#getParentMS <em>Parent MS</em>}</li>
 *   <li>{@link assessment.impl.DomainImpl#getHttpMethods <em>Http Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHttpMethods() <em>Http Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<HttpMethod> httpMethods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.DOMAIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microservice getParentMS() {
		if (eContainerFeatureID() != AssessmentPackage.DOMAIN__PARENT_MS) return null;
		return (Microservice)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentMS(Microservice newParentMS, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentMS, AssessmentPackage.DOMAIN__PARENT_MS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentMS(Microservice newParentMS) {
		if (newParentMS != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.DOMAIN__PARENT_MS && newParentMS != null)) {
			if (EcoreUtil.isAncestor(this, newParentMS))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentMS != null)
				msgs = ((InternalEObject)newParentMS).eInverseAdd(this, AssessmentPackage.MICROSERVICE__DOMAINS, Microservice.class, msgs);
			msgs = basicSetParentMS(newParentMS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.DOMAIN__PARENT_MS, newParentMS, newParentMS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HttpMethod> getHttpMethods() {
		if (httpMethods == null) {
			httpMethods = new EObjectContainmentEList<HttpMethod>(HttpMethod.class, this, AssessmentPackage.DOMAIN__HTTP_METHODS);
		}
		return httpMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssessmentPackage.DOMAIN__PARENT_MS:
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
			case AssessmentPackage.DOMAIN__PARENT_MS:
				return basicSetParentMS(null, msgs);
			case AssessmentPackage.DOMAIN__HTTP_METHODS:
				return ((InternalEList<?>)getHttpMethods()).basicRemove(otherEnd, msgs);
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
			case AssessmentPackage.DOMAIN__PARENT_MS:
				return eInternalContainer().eInverseRemove(this, AssessmentPackage.MICROSERVICE__DOMAINS, Microservice.class, msgs);
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
			case AssessmentPackage.DOMAIN__NAME:
				return getName();
			case AssessmentPackage.DOMAIN__PARENT_MS:
				return getParentMS();
			case AssessmentPackage.DOMAIN__HTTP_METHODS:
				return getHttpMethods();
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
			case AssessmentPackage.DOMAIN__NAME:
				setName((String)newValue);
				return;
			case AssessmentPackage.DOMAIN__PARENT_MS:
				setParentMS((Microservice)newValue);
				return;
			case AssessmentPackage.DOMAIN__HTTP_METHODS:
				getHttpMethods().clear();
				getHttpMethods().addAll((Collection<? extends HttpMethod>)newValue);
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
			case AssessmentPackage.DOMAIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssessmentPackage.DOMAIN__PARENT_MS:
				setParentMS((Microservice)null);
				return;
			case AssessmentPackage.DOMAIN__HTTP_METHODS:
				getHttpMethods().clear();
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
			case AssessmentPackage.DOMAIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssessmentPackage.DOMAIN__PARENT_MS:
				return getParentMS() != null;
			case AssessmentPackage.DOMAIN__HTTP_METHODS:
				return httpMethods != null && !httpMethods.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DomainImpl
