
package soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap package. 
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

    private final static QName _CambiarEstadoEnvio_QNAME = new QName("http://soap/", "cambiarEstadoEnvio");
    private final static QName _CambiarEstadoEnvioResponse_QNAME = new QName("http://soap/", "cambiarEstadoEnvioResponse");
    private final static QName _ObtenerEnviosPendientesSocioLogistico_QNAME = new QName("http://soap/", "obtenerEnviosPendientesSocioLogistico");
    private final static QName _ObtenerEnviosPendientesSocioLogisticoResponse_QNAME = new QName("http://soap/", "obtenerEnviosPendientesSocioLogisticoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CambiarEstadoEnvio }
     * 
     */
    public CambiarEstadoEnvio createCambiarEstadoEnvio() {
        return new CambiarEstadoEnvio();
    }

    /**
     * Create an instance of {@link CambiarEstadoEnvioResponse }
     * 
     */
    public CambiarEstadoEnvioResponse createCambiarEstadoEnvioResponse() {
        return new CambiarEstadoEnvioResponse();
    }

    /**
     * Create an instance of {@link ObtenerEnviosPendientesSocioLogistico }
     * 
     */
    public ObtenerEnviosPendientesSocioLogistico createObtenerEnviosPendientesSocioLogistico() {
        return new ObtenerEnviosPendientesSocioLogistico();
    }

    /**
     * Create an instance of {@link ObtenerEnviosPendientesSocioLogisticoResponse }
     * 
     */
    public ObtenerEnviosPendientesSocioLogisticoResponse createObtenerEnviosPendientesSocioLogisticoResponse() {
        return new ObtenerEnviosPendientesSocioLogisticoResponse();
    }

    /**
     * Create an instance of {@link DtEnvio }
     * 
     */
    public DtEnvio createDtEnvio() {
        return new DtEnvio();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarEstadoEnvio }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CambiarEstadoEnvio }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "cambiarEstadoEnvio")
    public JAXBElement<CambiarEstadoEnvio> createCambiarEstadoEnvio(CambiarEstadoEnvio value) {
        return new JAXBElement<CambiarEstadoEnvio>(_CambiarEstadoEnvio_QNAME, CambiarEstadoEnvio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarEstadoEnvioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CambiarEstadoEnvioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "cambiarEstadoEnvioResponse")
    public JAXBElement<CambiarEstadoEnvioResponse> createCambiarEstadoEnvioResponse(CambiarEstadoEnvioResponse value) {
        return new JAXBElement<CambiarEstadoEnvioResponse>(_CambiarEstadoEnvioResponse_QNAME, CambiarEstadoEnvioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerEnviosPendientesSocioLogistico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerEnviosPendientesSocioLogistico }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "obtenerEnviosPendientesSocioLogistico")
    public JAXBElement<ObtenerEnviosPendientesSocioLogistico> createObtenerEnviosPendientesSocioLogistico(ObtenerEnviosPendientesSocioLogistico value) {
        return new JAXBElement<ObtenerEnviosPendientesSocioLogistico>(_ObtenerEnviosPendientesSocioLogistico_QNAME, ObtenerEnviosPendientesSocioLogistico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerEnviosPendientesSocioLogisticoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerEnviosPendientesSocioLogisticoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "obtenerEnviosPendientesSocioLogisticoResponse")
    public JAXBElement<ObtenerEnviosPendientesSocioLogisticoResponse> createObtenerEnviosPendientesSocioLogisticoResponse(ObtenerEnviosPendientesSocioLogisticoResponse value) {
        return new JAXBElement<ObtenerEnviosPendientesSocioLogisticoResponse>(_ObtenerEnviosPendientesSocioLogisticoResponse_QNAME, ObtenerEnviosPendientesSocioLogisticoResponse.class, null, value);
    }

}
