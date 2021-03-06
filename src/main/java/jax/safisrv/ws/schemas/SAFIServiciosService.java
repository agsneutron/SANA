
package jax.safisrv.ws.schemas;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
//@WebServiceClient(name = "SAFIServiciosService", targetNamespace = "http://safisrv/ws/schemas", wsdlLocation = "http://sanatusfinanzas.info:8082/microfin/services/PDA.wsdl")
@WebServiceClient(name = "SAFIServiciosService", targetNamespace = "http://safisrv/ws/schemas", wsdlLocation = "http://192.168.10.22:8080/microfin/services/PDA.wsdl")
public class SAFIServiciosService
    extends Service
{

    private final static URL SAFISERVICIOSSERVICE_WSDL_LOCATION;
    private final static WebServiceException SAFISERVICIOSSERVICE_EXCEPTION;
    private final static QName SAFISERVICIOSSERVICE_QNAME = new QName("http://safisrv/ws/schemas", "SAFIServiciosService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            //url = new URL("http://sanatusfinanzas.info:8082/microfin/services/PDA.wsdl");
        	url = new URL("http://192.168.10.22:8080/microfin/services/PDA.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SAFISERVICIOSSERVICE_WSDL_LOCATION = url;
        SAFISERVICIOSSERVICE_EXCEPTION = e;
    }

    public SAFIServiciosService() {
        super(__getWsdlLocation(), SAFISERVICIOSSERVICE_QNAME);
    }

    public SAFIServiciosService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SAFISERVICIOSSERVICE_QNAME, features);
    }

    public SAFIServiciosService(URL wsdlLocation) {
        super(wsdlLocation, SAFISERVICIOSSERVICE_QNAME);
    }

    public SAFIServiciosService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SAFISERVICIOSSERVICE_QNAME, features);
    }

    public SAFIServiciosService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SAFIServiciosService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SAFIServicios
     */
    @WebEndpoint(name = "SAFIServiciosSoap11")
    public SAFIServicios getSAFIServiciosSoap11() {
        return super.getPort(new QName("http://safisrv/ws/schemas", "SAFIServiciosSoap11"), SAFIServicios.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SAFIServicios
     */
    @WebEndpoint(name = "SAFIServiciosSoap11")
    public SAFIServicios getSAFIServiciosSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://safisrv/ws/schemas", "SAFIServiciosSoap11"), SAFIServicios.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SAFISERVICIOSSERVICE_EXCEPTION!= null) {
            throw SAFISERVICIOSSERVICE_EXCEPTION;
        }
        return SAFISERVICIOSSERVICE_WSDL_LOCATION;
    }

}
