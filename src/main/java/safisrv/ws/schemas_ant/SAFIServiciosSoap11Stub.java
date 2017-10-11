/**
 * SAFIServiciosSoap11Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package safisrv.ws.schemas_ant;

public class SAFIServiciosSoap11Stub extends org.apache.axis.client.Stub implements safisrv.ws.schemas.SAFIServicios {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[6];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AltaSolicitudGrupalWS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "AltaSolicitudGrupalWSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">AltaSolicitudGrupalWSRequest"), safisrv.ws.schemas.AltaSolicitudGrupalWSRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">AltaSolicitudGrupalWSResponse"));
        oper.setReturnClass(safisrv.ws.schemas.AltaSolicitudGrupalWSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "AltaSolicitudGrupalWSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PagoCredito");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "PagoCreditoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">PagoCreditoRequest"), safisrv.ws.schemas.PagoCreditoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">PagoCreditoResponse"));
        oper.setReturnClass(safisrv.ws.schemas.PagoCreditoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "PagoCreditoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("altaSolicitudCredito");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "altaSolicitudCreditoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">altaSolicitudCreditoRequest"), safisrv.ws.schemas.AltaSolicitudCreditoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">altaSolicitudCreditoResponse"));
        oper.setReturnClass(safisrv.ws.schemas.AltaSolicitudCreditoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "altaSolicitudCreditoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SolAltaCliente");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "SolAltaClienteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">SolAltaClienteRequest"), safisrv.ws.schemas.SolAltaClienteRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">SolAltaClienteResponse"));
        oper.setReturnClass(safisrv.ws.schemas.SolAltaClienteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "SolAltaClienteResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AltaGrupoWS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "AltaGrupoWSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">AltaGrupoWSRequest"), safisrv.ws.schemas.AltaGrupoWSRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">AltaGrupoWSResponse"));
        oper.setReturnClass(safisrv.ws.schemas.AltaGrupoWSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "AltaGrupoWSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConsultaSaldoCredito");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "ConsultaSaldoCreditoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">ConsultaSaldoCreditoRequest"), safisrv.ws.schemas.ConsultaSaldoCreditoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">ConsultaSaldoCreditoResponse"));
        oper.setReturnClass(safisrv.ws.schemas.ConsultaSaldoCreditoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "ConsultaSaldoCreditoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

    }

    public SAFIServiciosSoap11Stub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SAFIServiciosSoap11Stub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SAFIServiciosSoap11Stub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">>AltaSolicitudGrupalWSRequest>integrantes");
            cachedSerQNames.add(qName);
            cls = safisrv.ws.schemas.Integrante[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://safisrv/ws/schemas", "integrante");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">AltaGrupoWSRequest");
            cachedSerQNames.add(qName);
            cls = safisrv.ws.schemas.AltaGrupoWSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">AltaGrupoWSResponse");
            cachedSerQNames.add(qName);
            cls = safisrv.ws.schemas.AltaGrupoWSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">altaSolicitudCreditoRequest");
            cachedSerQNames.add(qName);
            cls = safisrv.ws.schemas.AltaSolicitudCreditoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">altaSolicitudCreditoResponse");
            cachedSerQNames.add(qName);
            cls = safisrv.ws.schemas.AltaSolicitudCreditoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">AltaSolicitudGrupalWSRequest");
            cachedSerQNames.add(qName);
            cls = safisrv.ws.schemas.AltaSolicitudGrupalWSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">AltaSolicitudGrupalWSResponse");
            cachedSerQNames.add(qName);
            cls = safisrv.ws.schemas.AltaSolicitudGrupalWSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">ConsultaSaldoCreditoRequest");
            cachedSerQNames.add(qName);
            cls = safisrv.ws.schemas.ConsultaSaldoCreditoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">ConsultaSaldoCreditoResponse");
            cachedSerQNames.add(qName);
            cls = safisrv.ws.schemas.ConsultaSaldoCreditoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">integrante");
            cachedSerQNames.add(qName);
            cls = safisrv.ws.schemas.Integrante.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">PagoCreditoRequest");
            cachedSerQNames.add(qName);
            cls = safisrv.ws.schemas.PagoCreditoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">PagoCreditoResponse");
            cachedSerQNames.add(qName);
            cls = safisrv.ws.schemas.PagoCreditoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">SolAltaClienteRequest");
            cachedSerQNames.add(qName);
            cls = safisrv.ws.schemas.SolAltaClienteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">SolAltaClienteResponse");
            cachedSerQNames.add(qName);
            cls = safisrv.ws.schemas.SolAltaClienteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public safisrv.ws.schemas.AltaSolicitudGrupalWSResponse altaSolicitudGrupalWS(safisrv.ws.schemas.AltaSolicitudGrupalWSRequest altaSolicitudGrupalWSRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AltaSolicitudGrupalWS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {altaSolicitudGrupalWSRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (safisrv.ws.schemas.AltaSolicitudGrupalWSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (safisrv.ws.schemas.AltaSolicitudGrupalWSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, safisrv.ws.schemas.AltaSolicitudGrupalWSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public safisrv.ws.schemas.PagoCreditoResponse pagoCredito(safisrv.ws.schemas.PagoCreditoRequest pagoCreditoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "PagoCredito"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pagoCreditoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (safisrv.ws.schemas.PagoCreditoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (safisrv.ws.schemas.PagoCreditoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, safisrv.ws.schemas.PagoCreditoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public safisrv.ws.schemas.AltaSolicitudCreditoResponse altaSolicitudCredito(safisrv.ws.schemas.AltaSolicitudCreditoRequest altaSolicitudCreditoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "altaSolicitudCredito"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {altaSolicitudCreditoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (safisrv.ws.schemas.AltaSolicitudCreditoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (safisrv.ws.schemas.AltaSolicitudCreditoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, safisrv.ws.schemas.AltaSolicitudCreditoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public safisrv.ws.schemas.SolAltaClienteResponse solAltaCliente(safisrv.ws.schemas.SolAltaClienteRequest solAltaClienteRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SolAltaCliente"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {solAltaClienteRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (safisrv.ws.schemas.SolAltaClienteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (safisrv.ws.schemas.SolAltaClienteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, safisrv.ws.schemas.SolAltaClienteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public safisrv.ws.schemas.AltaGrupoWSResponse altaGrupoWS(safisrv.ws.schemas.AltaGrupoWSRequest altaGrupoWSRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AltaGrupoWS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {altaGrupoWSRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (safisrv.ws.schemas.AltaGrupoWSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (safisrv.ws.schemas.AltaGrupoWSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, safisrv.ws.schemas.AltaGrupoWSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public safisrv.ws.schemas.ConsultaSaldoCreditoResponse consultaSaldoCredito(safisrv.ws.schemas.ConsultaSaldoCreditoRequest consultaSaldoCreditoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ConsultaSaldoCredito"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultaSaldoCreditoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (safisrv.ws.schemas.ConsultaSaldoCreditoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (safisrv.ws.schemas.ConsultaSaldoCreditoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, safisrv.ws.schemas.ConsultaSaldoCreditoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
