/**
 */
package assessment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see assessment.AssessmentFactory
 * @model kind="package"
 * @generated
 */
public interface AssessmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "assessment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://york.ac.uk/cs/eng2/assessment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssessmentPackage eINSTANCE = assessment.impl.AssessmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link assessment.impl.AssessmentImpl <em>Assessment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assessment.impl.AssessmentImpl
	 * @see assessment.impl.AssessmentPackageImpl#getAssessment()
	 * @generated
	 */
	int ASSESSMENT = 0;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__PACKAGE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__EVENTS = 1;

	/**
	 * The feature id for the '<em><b>Microservices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__MICROSERVICES = 2;

	/**
	 * The feature id for the '<em><b>Topics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__TOPICS = 3;

	/**
	 * The number of structural features of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assessment.impl.TopicImpl <em>Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assessment.impl.TopicImpl
	 * @see assessment.impl.AssessmentPackageImpl#getTopic()
	 * @generated
	 */
	int TOPIC = 1;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__TOPIC_NAME = 0;

	/**
	 * The feature id for the '<em><b>Related Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__RELATED_EVENTS = 1;

	/**
	 * The feature id for the '<em><b>Producers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__PRODUCERS = 2;

	/**
	 * The feature id for the '<em><b>Subscribers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__SUBSCRIBERS = 3;

	/**
	 * The number of structural features of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assessment.impl.KafStreamImpl <em>Kaf Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assessment.impl.KafStreamImpl
	 * @see assessment.impl.AssessmentPackageImpl#getKafStream()
	 * @generated
	 */
	int KAF_STREAM = 2;

	/**
	 * The feature id for the '<em><b>Stream Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAF_STREAM__STREAM_NAME = 0;

	/**
	 * The feature id for the '<em><b>Associated Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAF_STREAM__ASSOCIATED_EVENTS = 1;

	/**
	 * The feature id for the '<em><b>Parent MS</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAF_STREAM__PARENT_MS = 2;

	/**
	 * The number of structural features of the '<em>Kaf Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAF_STREAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Kaf Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAF_STREAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assessment.impl.KafConImpl <em>Kaf Con</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assessment.impl.KafConImpl
	 * @see assessment.impl.AssessmentPackageImpl#getKafCon()
	 * @generated
	 */
	int KAF_CON = 3;

	/**
	 * The feature id for the '<em><b>Con Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAF_CON__CON_NAME = 0;

	/**
	 * The feature id for the '<em><b>Consumed Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAF_CON__CONSUMED_EVENTS = 1;

	/**
	 * The number of structural features of the '<em>Kaf Con</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAF_CON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Kaf Con</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAF_CON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assessment.impl.KafProdImpl <em>Kaf Prod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assessment.impl.KafProdImpl
	 * @see assessment.impl.AssessmentPackageImpl#getKafProd()
	 * @generated
	 */
	int KAF_PROD = 4;

	/**
	 * The feature id for the '<em><b>Prod Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAF_PROD__PROD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Produced Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAF_PROD__PRODUCED_EVENTS = 1;

	/**
	 * The number of structural features of the '<em>Kaf Prod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAF_PROD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Kaf Prod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAF_PROD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assessment.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assessment.impl.EventImpl
	 * @see assessment.impl.AssessmentPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 5;

	/**
	 * The feature id for the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EVENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__KEY = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Related Topics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__RELATED_TOPICS = 3;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assessment.impl.MicroserviceImpl <em>Microservice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assessment.impl.MicroserviceImpl
	 * @see assessment.impl.AssessmentPackageImpl#getMicroservice()
	 * @generated
	 */
	int MICROSERVICE = 6;

	/**
	 * The feature id for the '<em><b>Ms Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__MS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Packagename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__PACKAGENAME = 1;

	/**
	 * The feature id for the '<em><b>Domains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__DOMAINS = 2;

	/**
	 * The feature id for the '<em><b>Stream</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__STREAM = 3;

	/**
	 * The feature id for the '<em><b>Consumers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__CONSUMERS = 4;

	/**
	 * The feature id for the '<em><b>Producers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__PRODUCERS = 5;

	/**
	 * The number of structural features of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assessment.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assessment.impl.DomainImpl
	 * @see assessment.impl.AssessmentPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent MS</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__PARENT_MS = 1;

	/**
	 * The feature id for the '<em><b>Http Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__HTTP_METHODS = 2;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assessment.impl.HttpMethodImpl <em>Http Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assessment.impl.HttpMethodImpl
	 * @see assessment.impl.AssessmentPackageImpl#getHttpMethod()
	 * @generated
	 */
	int HTTP_METHOD = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Http Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__HTTP_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__RETURN_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__PATH = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__PARAMETERS = 4;

	/**
	 * The feature id for the '<em><b>Transactional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD__TRANSACTIONAL = 5;

	/**
	 * The number of structural features of the '<em>Http Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Http Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assessment.httpTypeEnum <em>http Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assessment.httpTypeEnum
	 * @see assessment.impl.AssessmentPackageImpl#gethttpTypeEnum()
	 * @generated
	 */
	int HTTP_TYPE_ENUM = 9;


	/**
	 * Returns the meta object for class '{@link assessment.Assessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment</em>'.
	 * @see assessment.Assessment
	 * @generated
	 */
	EClass getAssessment();

	/**
	 * Returns the meta object for the attribute '{@link assessment.Assessment#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see assessment.Assessment#getPackageName()
	 * @see #getAssessment()
	 * @generated
	 */
	EAttribute getAssessment_PackageName();

	/**
	 * Returns the meta object for the containment reference list '{@link assessment.Assessment#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see assessment.Assessment#getEvents()
	 * @see #getAssessment()
	 * @generated
	 */
	EReference getAssessment_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link assessment.Assessment#getMicroservices <em>Microservices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Microservices</em>'.
	 * @see assessment.Assessment#getMicroservices()
	 * @see #getAssessment()
	 * @generated
	 */
	EReference getAssessment_Microservices();

	/**
	 * Returns the meta object for the containment reference list '{@link assessment.Assessment#getTopics <em>Topics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topics</em>'.
	 * @see assessment.Assessment#getTopics()
	 * @see #getAssessment()
	 * @generated
	 */
	EReference getAssessment_Topics();

	/**
	 * Returns the meta object for class '{@link assessment.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic</em>'.
	 * @see assessment.Topic
	 * @generated
	 */
	EClass getTopic();

	/**
	 * Returns the meta object for the attribute '{@link assessment.Topic#getTopicName <em>Topic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Name</em>'.
	 * @see assessment.Topic#getTopicName()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_TopicName();

	/**
	 * Returns the meta object for the reference list '{@link assessment.Topic#getRelatedEvents <em>Related Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Events</em>'.
	 * @see assessment.Topic#getRelatedEvents()
	 * @see #getTopic()
	 * @generated
	 */
	EReference getTopic_RelatedEvents();

	/**
	 * Returns the meta object for the reference list '{@link assessment.Topic#getProducers <em>Producers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Producers</em>'.
	 * @see assessment.Topic#getProducers()
	 * @see #getTopic()
	 * @generated
	 */
	EReference getTopic_Producers();

	/**
	 * Returns the meta object for the reference list '{@link assessment.Topic#getSubscribers <em>Subscribers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subscribers</em>'.
	 * @see assessment.Topic#getSubscribers()
	 * @see #getTopic()
	 * @generated
	 */
	EReference getTopic_Subscribers();

	/**
	 * Returns the meta object for class '{@link assessment.KafStream <em>Kaf Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kaf Stream</em>'.
	 * @see assessment.KafStream
	 * @generated
	 */
	EClass getKafStream();

	/**
	 * Returns the meta object for the attribute '{@link assessment.KafStream#getStreamName <em>Stream Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stream Name</em>'.
	 * @see assessment.KafStream#getStreamName()
	 * @see #getKafStream()
	 * @generated
	 */
	EAttribute getKafStream_StreamName();

	/**
	 * Returns the meta object for the reference list '{@link assessment.KafStream#getAssociatedEvents <em>Associated Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associated Events</em>'.
	 * @see assessment.KafStream#getAssociatedEvents()
	 * @see #getKafStream()
	 * @generated
	 */
	EReference getKafStream_AssociatedEvents();

	/**
	 * Returns the meta object for the container reference '{@link assessment.KafStream#getParentMS <em>Parent MS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent MS</em>'.
	 * @see assessment.KafStream#getParentMS()
	 * @see #getKafStream()
	 * @generated
	 */
	EReference getKafStream_ParentMS();

	/**
	 * Returns the meta object for class '{@link assessment.KafCon <em>Kaf Con</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kaf Con</em>'.
	 * @see assessment.KafCon
	 * @generated
	 */
	EClass getKafCon();

	/**
	 * Returns the meta object for the attribute '{@link assessment.KafCon#getConName <em>Con Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Con Name</em>'.
	 * @see assessment.KafCon#getConName()
	 * @see #getKafCon()
	 * @generated
	 */
	EAttribute getKafCon_ConName();

	/**
	 * Returns the meta object for the reference list '{@link assessment.KafCon#getConsumedEvents <em>Consumed Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consumed Events</em>'.
	 * @see assessment.KafCon#getConsumedEvents()
	 * @see #getKafCon()
	 * @generated
	 */
	EReference getKafCon_ConsumedEvents();

	/**
	 * Returns the meta object for class '{@link assessment.KafProd <em>Kaf Prod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kaf Prod</em>'.
	 * @see assessment.KafProd
	 * @generated
	 */
	EClass getKafProd();

	/**
	 * Returns the meta object for the attribute '{@link assessment.KafProd#getProdName <em>Prod Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prod Name</em>'.
	 * @see assessment.KafProd#getProdName()
	 * @see #getKafProd()
	 * @generated
	 */
	EAttribute getKafProd_ProdName();

	/**
	 * Returns the meta object for the reference list '{@link assessment.KafProd#getProducedEvents <em>Produced Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Produced Events</em>'.
	 * @see assessment.KafProd#getProducedEvents()
	 * @see #getKafProd()
	 * @generated
	 */
	EReference getKafProd_ProducedEvents();

	/**
	 * Returns the meta object for class '{@link assessment.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see assessment.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link assessment.Event#getEventName <em>Event Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Name</em>'.
	 * @see assessment.Event#getEventName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_EventName();

	/**
	 * Returns the meta object for the attribute '{@link assessment.Event#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see assessment.Event#getKey()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Key();

	/**
	 * Returns the meta object for the attribute '{@link assessment.Event#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see assessment.Event#getValue()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Value();

	/**
	 * Returns the meta object for the reference list '{@link assessment.Event#getRelatedTopics <em>Related Topics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Topics</em>'.
	 * @see assessment.Event#getRelatedTopics()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_RelatedTopics();

	/**
	 * Returns the meta object for class '{@link assessment.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microservice</em>'.
	 * @see assessment.Microservice
	 * @generated
	 */
	EClass getMicroservice();

	/**
	 * Returns the meta object for the attribute '{@link assessment.Microservice#getMsName <em>Ms Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ms Name</em>'.
	 * @see assessment.Microservice#getMsName()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_MsName();

	/**
	 * Returns the meta object for the attribute '{@link assessment.Microservice#getPackagename <em>Packagename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packagename</em>'.
	 * @see assessment.Microservice#getPackagename()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_Packagename();

	/**
	 * Returns the meta object for the containment reference list '{@link assessment.Microservice#getDomains <em>Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domains</em>'.
	 * @see assessment.Microservice#getDomains()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Domains();

	/**
	 * Returns the meta object for the containment reference list '{@link assessment.Microservice#getStream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stream</em>'.
	 * @see assessment.Microservice#getStream()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Stream();

	/**
	 * Returns the meta object for the containment reference list '{@link assessment.Microservice#getConsumers <em>Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consumers</em>'.
	 * @see assessment.Microservice#getConsumers()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Consumers();

	/**
	 * Returns the meta object for the containment reference list '{@link assessment.Microservice#getProducers <em>Producers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Producers</em>'.
	 * @see assessment.Microservice#getProducers()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Producers();

	/**
	 * Returns the meta object for class '{@link assessment.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see assessment.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the attribute '{@link assessment.Domain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assessment.Domain#getName()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Name();

	/**
	 * Returns the meta object for the container reference '{@link assessment.Domain#getParentMS <em>Parent MS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent MS</em>'.
	 * @see assessment.Domain#getParentMS()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_ParentMS();

	/**
	 * Returns the meta object for the containment reference list '{@link assessment.Domain#getHttpMethods <em>Http Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Http Methods</em>'.
	 * @see assessment.Domain#getHttpMethods()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_HttpMethods();

	/**
	 * Returns the meta object for class '{@link assessment.HttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Method</em>'.
	 * @see assessment.HttpMethod
	 * @generated
	 */
	EClass getHttpMethod();

	/**
	 * Returns the meta object for the attribute '{@link assessment.HttpMethod#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assessment.HttpMethod#getName()
	 * @see #getHttpMethod()
	 * @generated
	 */
	EAttribute getHttpMethod_Name();

	/**
	 * Returns the meta object for the attribute '{@link assessment.HttpMethod#getHttpType <em>Http Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Type</em>'.
	 * @see assessment.HttpMethod#getHttpType()
	 * @see #getHttpMethod()
	 * @generated
	 */
	EAttribute getHttpMethod_HttpType();

	/**
	 * Returns the meta object for the attribute '{@link assessment.HttpMethod#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see assessment.HttpMethod#getReturnType()
	 * @see #getHttpMethod()
	 * @generated
	 */
	EAttribute getHttpMethod_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link assessment.HttpMethod#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see assessment.HttpMethod#getPath()
	 * @see #getHttpMethod()
	 * @generated
	 */
	EAttribute getHttpMethod_Path();

	/**
	 * Returns the meta object for the attribute list '{@link assessment.HttpMethod#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters</em>'.
	 * @see assessment.HttpMethod#getParameters()
	 * @see #getHttpMethod()
	 * @generated
	 */
	EAttribute getHttpMethod_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link assessment.HttpMethod#isTransactional <em>Transactional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transactional</em>'.
	 * @see assessment.HttpMethod#isTransactional()
	 * @see #getHttpMethod()
	 * @generated
	 */
	EAttribute getHttpMethod_Transactional();

	/**
	 * Returns the meta object for enum '{@link assessment.httpTypeEnum <em>http Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>http Type Enum</em>'.
	 * @see assessment.httpTypeEnum
	 * @generated
	 */
	EEnum gethttpTypeEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssessmentFactory getAssessmentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link assessment.impl.AssessmentImpl <em>Assessment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assessment.impl.AssessmentImpl
		 * @see assessment.impl.AssessmentPackageImpl#getAssessment()
		 * @generated
		 */
		EClass ASSESSMENT = eINSTANCE.getAssessment();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSESSMENT__PACKAGE_NAME = eINSTANCE.getAssessment_PackageName();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSESSMENT__EVENTS = eINSTANCE.getAssessment_Events();

		/**
		 * The meta object literal for the '<em><b>Microservices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSESSMENT__MICROSERVICES = eINSTANCE.getAssessment_Microservices();

		/**
		 * The meta object literal for the '<em><b>Topics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSESSMENT__TOPICS = eINSTANCE.getAssessment_Topics();

		/**
		 * The meta object literal for the '{@link assessment.impl.TopicImpl <em>Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assessment.impl.TopicImpl
		 * @see assessment.impl.AssessmentPackageImpl#getTopic()
		 * @generated
		 */
		EClass TOPIC = eINSTANCE.getTopic();

		/**
		 * The meta object literal for the '<em><b>Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__TOPIC_NAME = eINSTANCE.getTopic_TopicName();

		/**
		 * The meta object literal for the '<em><b>Related Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC__RELATED_EVENTS = eINSTANCE.getTopic_RelatedEvents();

		/**
		 * The meta object literal for the '<em><b>Producers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC__PRODUCERS = eINSTANCE.getTopic_Producers();

		/**
		 * The meta object literal for the '<em><b>Subscribers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC__SUBSCRIBERS = eINSTANCE.getTopic_Subscribers();

		/**
		 * The meta object literal for the '{@link assessment.impl.KafStreamImpl <em>Kaf Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assessment.impl.KafStreamImpl
		 * @see assessment.impl.AssessmentPackageImpl#getKafStream()
		 * @generated
		 */
		EClass KAF_STREAM = eINSTANCE.getKafStream();

		/**
		 * The meta object literal for the '<em><b>Stream Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAF_STREAM__STREAM_NAME = eINSTANCE.getKafStream_StreamName();

		/**
		 * The meta object literal for the '<em><b>Associated Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAF_STREAM__ASSOCIATED_EVENTS = eINSTANCE.getKafStream_AssociatedEvents();

		/**
		 * The meta object literal for the '<em><b>Parent MS</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAF_STREAM__PARENT_MS = eINSTANCE.getKafStream_ParentMS();

		/**
		 * The meta object literal for the '{@link assessment.impl.KafConImpl <em>Kaf Con</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assessment.impl.KafConImpl
		 * @see assessment.impl.AssessmentPackageImpl#getKafCon()
		 * @generated
		 */
		EClass KAF_CON = eINSTANCE.getKafCon();

		/**
		 * The meta object literal for the '<em><b>Con Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAF_CON__CON_NAME = eINSTANCE.getKafCon_ConName();

		/**
		 * The meta object literal for the '<em><b>Consumed Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAF_CON__CONSUMED_EVENTS = eINSTANCE.getKafCon_ConsumedEvents();

		/**
		 * The meta object literal for the '{@link assessment.impl.KafProdImpl <em>Kaf Prod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assessment.impl.KafProdImpl
		 * @see assessment.impl.AssessmentPackageImpl#getKafProd()
		 * @generated
		 */
		EClass KAF_PROD = eINSTANCE.getKafProd();

		/**
		 * The meta object literal for the '<em><b>Prod Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAF_PROD__PROD_NAME = eINSTANCE.getKafProd_ProdName();

		/**
		 * The meta object literal for the '<em><b>Produced Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAF_PROD__PRODUCED_EVENTS = eINSTANCE.getKafProd_ProducedEvents();

		/**
		 * The meta object literal for the '{@link assessment.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assessment.impl.EventImpl
		 * @see assessment.impl.AssessmentPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Event Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__EVENT_NAME = eINSTANCE.getEvent_EventName();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__KEY = eINSTANCE.getEvent_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__VALUE = eINSTANCE.getEvent_Value();

		/**
		 * The meta object literal for the '<em><b>Related Topics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__RELATED_TOPICS = eINSTANCE.getEvent_RelatedTopics();

		/**
		 * The meta object literal for the '{@link assessment.impl.MicroserviceImpl <em>Microservice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assessment.impl.MicroserviceImpl
		 * @see assessment.impl.AssessmentPackageImpl#getMicroservice()
		 * @generated
		 */
		EClass MICROSERVICE = eINSTANCE.getMicroservice();

		/**
		 * The meta object literal for the '<em><b>Ms Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__MS_NAME = eINSTANCE.getMicroservice_MsName();

		/**
		 * The meta object literal for the '<em><b>Packagename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__PACKAGENAME = eINSTANCE.getMicroservice_Packagename();

		/**
		 * The meta object literal for the '<em><b>Domains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__DOMAINS = eINSTANCE.getMicroservice_Domains();

		/**
		 * The meta object literal for the '<em><b>Stream</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__STREAM = eINSTANCE.getMicroservice_Stream();

		/**
		 * The meta object literal for the '<em><b>Consumers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__CONSUMERS = eINSTANCE.getMicroservice_Consumers();

		/**
		 * The meta object literal for the '<em><b>Producers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__PRODUCERS = eINSTANCE.getMicroservice_Producers();

		/**
		 * The meta object literal for the '{@link assessment.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assessment.impl.DomainImpl
		 * @see assessment.impl.AssessmentPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

		/**
		 * The meta object literal for the '<em><b>Parent MS</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__PARENT_MS = eINSTANCE.getDomain_ParentMS();

		/**
		 * The meta object literal for the '<em><b>Http Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__HTTP_METHODS = eINSTANCE.getDomain_HttpMethods();

		/**
		 * The meta object literal for the '{@link assessment.impl.HttpMethodImpl <em>Http Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assessment.impl.HttpMethodImpl
		 * @see assessment.impl.AssessmentPackageImpl#getHttpMethod()
		 * @generated
		 */
		EClass HTTP_METHOD = eINSTANCE.getHttpMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_METHOD__NAME = eINSTANCE.getHttpMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Http Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_METHOD__HTTP_TYPE = eINSTANCE.getHttpMethod_HttpType();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_METHOD__RETURN_TYPE = eINSTANCE.getHttpMethod_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_METHOD__PATH = eINSTANCE.getHttpMethod_Path();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_METHOD__PARAMETERS = eINSTANCE.getHttpMethod_Parameters();

		/**
		 * The meta object literal for the '<em><b>Transactional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_METHOD__TRANSACTIONAL = eINSTANCE.getHttpMethod_Transactional();

		/**
		 * The meta object literal for the '{@link assessment.httpTypeEnum <em>http Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assessment.httpTypeEnum
		 * @see assessment.impl.AssessmentPackageImpl#gethttpTypeEnum()
		 * @generated
		 */
		EEnum HTTP_TYPE_ENUM = eINSTANCE.gethttpTypeEnum();

	}

} //AssessmentPackage
