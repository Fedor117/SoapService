
package by.bsuir.aipos.sem6.soap.artifacts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the by.bsuir.aipos.sem6.soap.artifacts package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RequestToRetrieveRecord_QNAME = new QName("http://controller/", "requestToRetrieveRecord");
    private final static QName _RequestToUpdateRecordResponse_QNAME = new QName("http://controller/", "requestToUpdateRecordResponse");
    private final static QName _RequestToDeleteRecordResponse_QNAME = new QName("http://controller/", "requestToDeleteRecordResponse");
    private final static QName _RequestToCreateRecord_QNAME = new QName("http://controller/", "requestToCreateRecord");
    private final static QName _RequestToRetrieveRecordResponse_QNAME = new QName("http://controller/", "requestToRetrieveRecordResponse");
    private final static QName _RequestToCreateRecordResponse_QNAME = new QName("http://controller/", "requestToCreateRecordResponse");
    private final static QName _RequestToUpdateRecord_QNAME = new QName("http://controller/", "requestToUpdateRecord");
    private final static QName _RequestToDeleteRecord_QNAME = new QName("http://controller/", "requestToDeleteRecord");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: by.bsuir.aipos.sem6.soap.artifacts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestToDeleteRecord }
     * 
     */
    public RequestToDeleteRecord createRequestToDeleteRecord() {
        return new RequestToDeleteRecord();
    }

    /**
     * Create an instance of {@link RequestToUpdateRecord }
     * 
     */
    public RequestToUpdateRecord createRequestToUpdateRecord() {
        return new RequestToUpdateRecord();
    }

    /**
     * Create an instance of {@link RequestToRetrieveRecordResponse }
     * 
     */
    public RequestToRetrieveRecordResponse createRequestToRetrieveRecordResponse() {
        return new RequestToRetrieveRecordResponse();
    }

    /**
     * Create an instance of {@link RequestToCreateRecordResponse }
     * 
     */
    public RequestToCreateRecordResponse createRequestToCreateRecordResponse() {
        return new RequestToCreateRecordResponse();
    }

    /**
     * Create an instance of {@link RequestToDeleteRecordResponse }
     * 
     */
    public RequestToDeleteRecordResponse createRequestToDeleteRecordResponse() {
        return new RequestToDeleteRecordResponse();
    }

    /**
     * Create an instance of {@link RequestToCreateRecord }
     * 
     */
    public RequestToCreateRecord createRequestToCreateRecord() {
        return new RequestToCreateRecord();
    }

    /**
     * Create an instance of {@link RequestToRetrieveRecord }
     * 
     */
    public RequestToRetrieveRecord createRequestToRetrieveRecord() {
        return new RequestToRetrieveRecord();
    }

    /**
     * Create an instance of {@link RequestToUpdateRecordResponse }
     * 
     */
    public RequestToUpdateRecordResponse createRequestToUpdateRecordResponse() {
        return new RequestToUpdateRecordResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestToRetrieveRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "requestToRetrieveRecord")
    public JAXBElement<RequestToRetrieveRecord> createRequestToRetrieveRecord(RequestToRetrieveRecord value) {
        return new JAXBElement<RequestToRetrieveRecord>(_RequestToRetrieveRecord_QNAME, RequestToRetrieveRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestToUpdateRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "requestToUpdateRecordResponse")
    public JAXBElement<RequestToUpdateRecordResponse> createRequestToUpdateRecordResponse(RequestToUpdateRecordResponse value) {
        return new JAXBElement<RequestToUpdateRecordResponse>(_RequestToUpdateRecordResponse_QNAME, RequestToUpdateRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestToDeleteRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "requestToDeleteRecordResponse")
    public JAXBElement<RequestToDeleteRecordResponse> createRequestToDeleteRecordResponse(RequestToDeleteRecordResponse value) {
        return new JAXBElement<RequestToDeleteRecordResponse>(_RequestToDeleteRecordResponse_QNAME, RequestToDeleteRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestToCreateRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "requestToCreateRecord")
    public JAXBElement<RequestToCreateRecord> createRequestToCreateRecord(RequestToCreateRecord value) {
        return new JAXBElement<RequestToCreateRecord>(_RequestToCreateRecord_QNAME, RequestToCreateRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestToRetrieveRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "requestToRetrieveRecordResponse")
    public JAXBElement<RequestToRetrieveRecordResponse> createRequestToRetrieveRecordResponse(RequestToRetrieveRecordResponse value) {
        return new JAXBElement<RequestToRetrieveRecordResponse>(_RequestToRetrieveRecordResponse_QNAME, RequestToRetrieveRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestToCreateRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "requestToCreateRecordResponse")
    public JAXBElement<RequestToCreateRecordResponse> createRequestToCreateRecordResponse(RequestToCreateRecordResponse value) {
        return new JAXBElement<RequestToCreateRecordResponse>(_RequestToCreateRecordResponse_QNAME, RequestToCreateRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestToUpdateRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "requestToUpdateRecord")
    public JAXBElement<RequestToUpdateRecord> createRequestToUpdateRecord(RequestToUpdateRecord value) {
        return new JAXBElement<RequestToUpdateRecord>(_RequestToUpdateRecord_QNAME, RequestToUpdateRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestToDeleteRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "requestToDeleteRecord")
    public JAXBElement<RequestToDeleteRecord> createRequestToDeleteRecord(RequestToDeleteRecord value) {
        return new JAXBElement<RequestToDeleteRecord>(_RequestToDeleteRecord_QNAME, RequestToDeleteRecord.class, null, value);
    }

}
