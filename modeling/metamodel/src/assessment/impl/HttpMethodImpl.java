/**
 */
package assessment.impl;

import assessment.AssessmentPackage;
import assessment.HttpMethod;
import assessment.httpTypeEnum;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Http Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assessment.impl.HttpMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link assessment.impl.HttpMethodImpl#getHttpType <em>Http Type</em>}</li>
 *   <li>{@link assessment.impl.HttpMethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link assessment.impl.HttpMethodImpl#getPath <em>Path</em>}</li>
 *   <li>{@link assessment.impl.HttpMethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link assessment.impl.HttpMethodImpl#isTransactional <em>Transactional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HttpMethodImpl extends MinimalEObjectImpl.Container implements HttpMethod {
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
	 * The default value of the '{@link #getHttpType() <em>Http Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpType()
	 * @generated
	 * @ordered
	 */
	protected static final httpTypeEnum HTTP_TYPE_EDEFAULT = httpTypeEnum.GET;

	/**
	 * The cached value of the '{@link #getHttpType() <em>Http Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpType()
	 * @generated
	 * @ordered
	 */
	protected httpTypeEnum httpType = HTTP_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected String returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parameters;

	/**
	 * The default value of the '{@link #isTransactional() <em>Transactional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransactional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSACTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransactional() <em>Transactional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransactional()
	 * @generated
	 * @ordered
	 */
	protected boolean transactional = TRANSACTIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HttpMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.HTTP_METHOD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.HTTP_METHOD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public httpTypeEnum getHttpType() {
		return httpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpType(httpTypeEnum newHttpType) {
		httpTypeEnum oldHttpType = httpType;
		httpType = newHttpType == null ? HTTP_TYPE_EDEFAULT : newHttpType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.HTTP_METHOD__HTTP_TYPE, oldHttpType, httpType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(String newReturnType) {
		String oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.HTTP_METHOD__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.HTTP_METHOD__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getParameters() {
		if (parameters == null) {
			parameters = new EDataTypeEList<String>(String.class, this, AssessmentPackage.HTTP_METHOD__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransactional() {
		return transactional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactional(boolean newTransactional) {
		boolean oldTransactional = transactional;
		transactional = newTransactional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.HTTP_METHOD__TRANSACTIONAL, oldTransactional, transactional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssessmentPackage.HTTP_METHOD__NAME:
				return getName();
			case AssessmentPackage.HTTP_METHOD__HTTP_TYPE:
				return getHttpType();
			case AssessmentPackage.HTTP_METHOD__RETURN_TYPE:
				return getReturnType();
			case AssessmentPackage.HTTP_METHOD__PATH:
				return getPath();
			case AssessmentPackage.HTTP_METHOD__PARAMETERS:
				return getParameters();
			case AssessmentPackage.HTTP_METHOD__TRANSACTIONAL:
				return isTransactional();
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
			case AssessmentPackage.HTTP_METHOD__NAME:
				setName((String)newValue);
				return;
			case AssessmentPackage.HTTP_METHOD__HTTP_TYPE:
				setHttpType((httpTypeEnum)newValue);
				return;
			case AssessmentPackage.HTTP_METHOD__RETURN_TYPE:
				setReturnType((String)newValue);
				return;
			case AssessmentPackage.HTTP_METHOD__PATH:
				setPath((String)newValue);
				return;
			case AssessmentPackage.HTTP_METHOD__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends String>)newValue);
				return;
			case AssessmentPackage.HTTP_METHOD__TRANSACTIONAL:
				setTransactional((Boolean)newValue);
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
			case AssessmentPackage.HTTP_METHOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssessmentPackage.HTTP_METHOD__HTTP_TYPE:
				setHttpType(HTTP_TYPE_EDEFAULT);
				return;
			case AssessmentPackage.HTTP_METHOD__RETURN_TYPE:
				setReturnType(RETURN_TYPE_EDEFAULT);
				return;
			case AssessmentPackage.HTTP_METHOD__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case AssessmentPackage.HTTP_METHOD__PARAMETERS:
				getParameters().clear();
				return;
			case AssessmentPackage.HTTP_METHOD__TRANSACTIONAL:
				setTransactional(TRANSACTIONAL_EDEFAULT);
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
			case AssessmentPackage.HTTP_METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssessmentPackage.HTTP_METHOD__HTTP_TYPE:
				return httpType != HTTP_TYPE_EDEFAULT;
			case AssessmentPackage.HTTP_METHOD__RETURN_TYPE:
				return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
			case AssessmentPackage.HTTP_METHOD__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case AssessmentPackage.HTTP_METHOD__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case AssessmentPackage.HTTP_METHOD__TRANSACTIONAL:
				return transactional != TRANSACTIONAL_EDEFAULT;
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
		result.append(", httpType: ");
		result.append(httpType);
		result.append(", returnType: ");
		result.append(returnType);
		result.append(", path: ");
		result.append(path);
		result.append(", parameters: ");
		result.append(parameters);
		result.append(", transactional: ");
		result.append(transactional);
		result.append(')');
		return result.toString();
	}

} //HttpMethodImpl
