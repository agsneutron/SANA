
package jax.safisrv.ws.schemas;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SAFIServicios", targetNamespace = "http://safisrv/ws/schemas")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SAFIServicios {


    /**
     * 
     * @param altaSolicitudGrupalWSRequest
     * @return
     *     returns safisrv.ws.schemas.AltaSolicitudGrupalWSResponse
     */
    @WebMethod(operationName = "AltaSolicitudGrupalWS")
    @WebResult(name = "AltaSolicitudGrupalWSResponse", targetNamespace = "http://safisrv/ws/schemas", partName = "AltaSolicitudGrupalWSResponse")
    public AltaSolicitudGrupalWSResponse altaSolicitudGrupalWS(
        @WebParam(name = "AltaSolicitudGrupalWSRequest", targetNamespace = "http://safisrv/ws/schemas", partName = "AltaSolicitudGrupalWSRequest")
        AltaSolicitudGrupalWSRequest altaSolicitudGrupalWSRequest);

    /**
     * 
     * @param pagoCreditoRequest
     * @return
     *     returns safisrv.ws.schemas.PagoCreditoResponse
     */
    @WebMethod(operationName = "PagoCredito")
    @WebResult(name = "PagoCreditoResponse", targetNamespace = "http://safisrv/ws/schemas", partName = "PagoCreditoResponse")
    public PagoCreditoResponse pagoCredito(
        @WebParam(name = "PagoCreditoRequest", targetNamespace = "http://safisrv/ws/schemas", partName = "PagoCreditoRequest")
        PagoCreditoRequest pagoCreditoRequest);

    /**
     * 
     * @param altaSolicitudCreditoRequest
     * @return
     *     returns safisrv.ws.schemas.AltaSolicitudCreditoResponse
     */
    @WebMethod
    @WebResult(name = "altaSolicitudCreditoResponse", targetNamespace = "http://safisrv/ws/schemas", partName = "altaSolicitudCreditoResponse")
    public AltaSolicitudCreditoResponse altaSolicitudCredito(
        @WebParam(name = "altaSolicitudCreditoRequest", targetNamespace = "http://safisrv/ws/schemas", partName = "altaSolicitudCreditoRequest")
        AltaSolicitudCreditoRequest altaSolicitudCreditoRequest);

    /**
     * 
     * @param solAltaClienteRequest
     * @return
     *     returns safisrv.ws.schemas.SolAltaClienteResponse
     */
    @WebMethod(operationName = "SolAltaCliente")
    @WebResult(name = "SolAltaClienteResponse", targetNamespace = "http://safisrv/ws/schemas", partName = "SolAltaClienteResponse")
    public SolAltaClienteResponse solAltaCliente(
        @WebParam(name = "SolAltaClienteRequest", targetNamespace = "http://safisrv/ws/schemas", partName = "SolAltaClienteRequest")
        SolAltaClienteRequest solAltaClienteRequest);

    /**
     * 
     * @param altaGrupoWSRequest
     * @return
     *     returns safisrv.ws.schemas.AltaGrupoWSResponse
     */
    @WebMethod(operationName = "AltaGrupoWS")
    @WebResult(name = "AltaGrupoWSResponse", targetNamespace = "http://safisrv/ws/schemas", partName = "AltaGrupoWSResponse")
    public AltaGrupoWSResponse altaGrupoWS(
        @WebParam(name = "AltaGrupoWSRequest", targetNamespace = "http://safisrv/ws/schemas", partName = "AltaGrupoWSRequest")
        AltaGrupoWSRequest altaGrupoWSRequest);

    /**
     * 
     * @param consultaSaldoCreditoRequest
     * @return
     *     returns safisrv.ws.schemas.ConsultaSaldoCreditoResponse
     */
    @WebMethod(operationName = "ConsultaSaldoCredito")
    @WebResult(name = "ConsultaSaldoCreditoResponse", targetNamespace = "http://safisrv/ws/schemas", partName = "ConsultaSaldoCreditoResponse")
    public ConsultaSaldoCreditoResponse consultaSaldoCredito(
        @WebParam(name = "ConsultaSaldoCreditoRequest", targetNamespace = "http://safisrv/ws/schemas", partName = "ConsultaSaldoCreditoRequest")
        ConsultaSaldoCreditoRequest consultaSaldoCreditoRequest);

}
