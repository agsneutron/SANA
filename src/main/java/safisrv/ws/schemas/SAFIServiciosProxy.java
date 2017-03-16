package safisrv.ws.schemas;

public abstract class SAFIServiciosProxy implements safisrv.ws.schemas.SAFIServicios {
  private String _endpoint = null;
  private safisrv.ws.schemas.SAFIServicios sAFIServicios = null;
  
  public SAFIServiciosProxy() {
    _initSAFIServiciosProxy();
  }
  
  public SAFIServiciosProxy(String endpoint) {
    _endpoint = endpoint;
    _initSAFIServiciosProxy();
  }
  
  private void _initSAFIServiciosProxy() {
    try {
      sAFIServicios = (new safisrv.ws.schemas.SAFIServiciosServiceLocator()).getSAFIServiciosSoap11();
      if (sAFIServicios != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sAFIServicios)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sAFIServicios)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sAFIServicios != null)
      ((javax.xml.rpc.Stub)sAFIServicios)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public safisrv.ws.schemas.SAFIServicios getSAFIServicios() {
    if (sAFIServicios == null)
      _initSAFIServiciosProxy();
    return sAFIServicios;
  }
  
  public safisrv.ws.schemas.PagoCreditoResponse pagoCredito(safisrv.ws.schemas.PagoCreditoRequest pagoCreditoRequest) throws java.rmi.RemoteException{
    if (sAFIServicios == null)
      _initSAFIServiciosProxy();
    return sAFIServicios.pagoCredito(pagoCreditoRequest);
  }
  
  public safisrv.ws.schemas.AltaSolicitudCreditoResponse altaSolicitudCredito(safisrv.ws.schemas.AltaSolicitudCreditoRequest altaSolicitudCreditoRequest) throws java.rmi.RemoteException{
    if (sAFIServicios == null)
      _initSAFIServiciosProxy();
    return sAFIServicios.altaSolicitudCredito(altaSolicitudCreditoRequest);
  }
  
  public safisrv.ws.schemas.SolAltaClienteResponse solAltaCliente(safisrv.ws.schemas.SolAltaClienteRequest solAltaClienteRequest) throws java.rmi.RemoteException{
    if (sAFIServicios == null)
      _initSAFIServiciosProxy();
    return sAFIServicios.solAltaCliente(solAltaClienteRequest);
  }
  
  public safisrv.ws.schemas.AltaGrupoWSResponse altaGrupoWS(safisrv.ws.schemas.AltaGrupoWSRequest altaGrupoWSRequest) throws java.rmi.RemoteException{
    if (sAFIServicios == null)
      _initSAFIServiciosProxy();
    return sAFIServicios.altaGrupoWS(altaGrupoWSRequest);
  }
  
  public safisrv.ws.schemas.ConsultaSaldoCreditoResponse consultaSaldoCredito(safisrv.ws.schemas.ConsultaSaldoCreditoRequest consultaSaldoCreditoRequest) throws java.rmi.RemoteException{
    if (sAFIServicios == null)
      _initSAFIServiciosProxy();
    return sAFIServicios.consultaSaldoCredito(consultaSaldoCreditoRequest);
  }
  
  
}