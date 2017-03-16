/**
 * AltaSolicitudGrupalWSRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package safisrv.ws.schemas;

public class AltaSolicitudGrupalWSRequest  implements java.io.Serializable {
    private safisrv.ws.schemas.Integrante[] integrantes;

    private java.lang.String grupoID;

    private java.lang.String productoCreditoID;

    private java.lang.String periodicidad;

    private java.lang.String plazo;

    private java.lang.String tipoDispersion;

    private java.lang.String cuentaCLABE;

    private java.lang.String tipoPagoCapital;

    private java.lang.String folio;

    private java.lang.String claveUsuario;

    private java.lang.String dispositivo;

    public AltaSolicitudGrupalWSRequest() {
    }

    public AltaSolicitudGrupalWSRequest(
           safisrv.ws.schemas.Integrante[] integrantes,
           java.lang.String grupoID,
           java.lang.String productoCreditoID,
           java.lang.String periodicidad,
           java.lang.String plazo,
           java.lang.String tipoDispersion,
           java.lang.String cuentaCLABE,
           java.lang.String tipoPagoCapital,
           java.lang.String folio,
           java.lang.String claveUsuario,
           java.lang.String dispositivo) {
           this.integrantes = integrantes;
           this.grupoID = grupoID;
           this.productoCreditoID = productoCreditoID;
           this.periodicidad = periodicidad;
           this.plazo = plazo;
           this.tipoDispersion = tipoDispersion;
           this.cuentaCLABE = cuentaCLABE;
           this.tipoPagoCapital = tipoPagoCapital;
           this.folio = folio;
           this.claveUsuario = claveUsuario;
           this.dispositivo = dispositivo;
    }


    /**
     * Gets the integrantes value for this AltaSolicitudGrupalWSRequest.
     * 
     * @return integrantes
     */
    public safisrv.ws.schemas.Integrante[] getIntegrantes() {
        return integrantes;
    }


    /**
     * Sets the integrantes value for this AltaSolicitudGrupalWSRequest.
     * 
     * @param integrantes
     */
    public void setIntegrantes(safisrv.ws.schemas.Integrante[] integrantes) {
        this.integrantes = integrantes;
    }


    /**
     * Gets the grupoID value for this AltaSolicitudGrupalWSRequest.
     * 
     * @return grupoID
     */
    public java.lang.String getGrupoID() {
        return grupoID;
    }


    /**
     * Sets the grupoID value for this AltaSolicitudGrupalWSRequest.
     * 
     * @param grupoID
     */
    public void setGrupoID(java.lang.String grupoID) {
        this.grupoID = grupoID;
    }


    /**
     * Gets the productoCreditoID value for this AltaSolicitudGrupalWSRequest.
     * 
     * @return productoCreditoID
     */
    public java.lang.String getProductoCreditoID() {
        return productoCreditoID;
    }


    /**
     * Sets the productoCreditoID value for this AltaSolicitudGrupalWSRequest.
     * 
     * @param productoCreditoID
     */
    public void setProductoCreditoID(java.lang.String productoCreditoID) {
        this.productoCreditoID = productoCreditoID;
    }


    /**
     * Gets the periodicidad value for this AltaSolicitudGrupalWSRequest.
     * 
     * @return periodicidad
     */
    public java.lang.String getPeriodicidad() {
        return periodicidad;
    }


    /**
     * Sets the periodicidad value for this AltaSolicitudGrupalWSRequest.
     * 
     * @param periodicidad
     */
    public void setPeriodicidad(java.lang.String periodicidad) {
        this.periodicidad = periodicidad;
    }


    /**
     * Gets the plazo value for this AltaSolicitudGrupalWSRequest.
     * 
     * @return plazo
     */
    public java.lang.String getPlazo() {
        return plazo;
    }


    /**
     * Sets the plazo value for this AltaSolicitudGrupalWSRequest.
     * 
     * @param plazo
     */
    public void setPlazo(java.lang.String plazo) {
        this.plazo = plazo;
    }


    /**
     * Gets the tipoDispersion value for this AltaSolicitudGrupalWSRequest.
     * 
     * @return tipoDispersion
     */
    public java.lang.String getTipoDispersion() {
        return tipoDispersion;
    }


    /**
     * Sets the tipoDispersion value for this AltaSolicitudGrupalWSRequest.
     * 
     * @param tipoDispersion
     */
    public void setTipoDispersion(java.lang.String tipoDispersion) {
        this.tipoDispersion = tipoDispersion;
    }


    /**
     * Gets the cuentaCLABE value for this AltaSolicitudGrupalWSRequest.
     * 
     * @return cuentaCLABE
     */
    public java.lang.String getCuentaCLABE() {
        return cuentaCLABE;
    }


    /**
     * Sets the cuentaCLABE value for this AltaSolicitudGrupalWSRequest.
     * 
     * @param cuentaCLABE
     */
    public void setCuentaCLABE(java.lang.String cuentaCLABE) {
        this.cuentaCLABE = cuentaCLABE;
    }


    /**
     * Gets the tipoPagoCapital value for this AltaSolicitudGrupalWSRequest.
     * 
     * @return tipoPagoCapital
     */
    public java.lang.String getTipoPagoCapital() {
        return tipoPagoCapital;
    }


    /**
     * Sets the tipoPagoCapital value for this AltaSolicitudGrupalWSRequest.
     * 
     * @param tipoPagoCapital
     */
    public void setTipoPagoCapital(java.lang.String tipoPagoCapital) {
        this.tipoPagoCapital = tipoPagoCapital;
    }


    /**
     * Gets the folio value for this AltaSolicitudGrupalWSRequest.
     * 
     * @return folio
     */
    public java.lang.String getFolio() {
        return folio;
    }


    /**
     * Sets the folio value for this AltaSolicitudGrupalWSRequest.
     * 
     * @param folio
     */
    public void setFolio(java.lang.String folio) {
        this.folio = folio;
    }


    /**
     * Gets the claveUsuario value for this AltaSolicitudGrupalWSRequest.
     * 
     * @return claveUsuario
     */
    public java.lang.String getClaveUsuario() {
        return claveUsuario;
    }


    /**
     * Sets the claveUsuario value for this AltaSolicitudGrupalWSRequest.
     * 
     * @param claveUsuario
     */
    public void setClaveUsuario(java.lang.String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }


    /**
     * Gets the dispositivo value for this AltaSolicitudGrupalWSRequest.
     * 
     * @return dispositivo
     */
    public java.lang.String getDispositivo() {
        return dispositivo;
    }


    /**
     * Sets the dispositivo value for this AltaSolicitudGrupalWSRequest.
     * 
     * @param dispositivo
     */
    public void setDispositivo(java.lang.String dispositivo) {
        this.dispositivo = dispositivo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AltaSolicitudGrupalWSRequest)) return false;
        AltaSolicitudGrupalWSRequest other = (AltaSolicitudGrupalWSRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.integrantes==null && other.getIntegrantes()==null) || 
             (this.integrantes!=null &&
              java.util.Arrays.equals(this.integrantes, other.getIntegrantes()))) &&
            ((this.grupoID==null && other.getGrupoID()==null) || 
             (this.grupoID!=null &&
              this.grupoID.equals(other.getGrupoID()))) &&
            ((this.productoCreditoID==null && other.getProductoCreditoID()==null) || 
             (this.productoCreditoID!=null &&
              this.productoCreditoID.equals(other.getProductoCreditoID()))) &&
            ((this.periodicidad==null && other.getPeriodicidad()==null) || 
             (this.periodicidad!=null &&
              this.periodicidad.equals(other.getPeriodicidad()))) &&
            ((this.plazo==null && other.getPlazo()==null) || 
             (this.plazo!=null &&
              this.plazo.equals(other.getPlazo()))) &&
            ((this.tipoDispersion==null && other.getTipoDispersion()==null) || 
             (this.tipoDispersion!=null &&
              this.tipoDispersion.equals(other.getTipoDispersion()))) &&
            ((this.cuentaCLABE==null && other.getCuentaCLABE()==null) || 
             (this.cuentaCLABE!=null &&
              this.cuentaCLABE.equals(other.getCuentaCLABE()))) &&
            ((this.tipoPagoCapital==null && other.getTipoPagoCapital()==null) || 
             (this.tipoPagoCapital!=null &&
              this.tipoPagoCapital.equals(other.getTipoPagoCapital()))) &&
            ((this.folio==null && other.getFolio()==null) || 
             (this.folio!=null &&
              this.folio.equals(other.getFolio()))) &&
            ((this.claveUsuario==null && other.getClaveUsuario()==null) || 
             (this.claveUsuario!=null &&
              this.claveUsuario.equals(other.getClaveUsuario()))) &&
            ((this.dispositivo==null && other.getDispositivo()==null) || 
             (this.dispositivo!=null &&
              this.dispositivo.equals(other.getDispositivo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIntegrantes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntegrantes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntegrantes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGrupoID() != null) {
            _hashCode += getGrupoID().hashCode();
        }
        if (getProductoCreditoID() != null) {
            _hashCode += getProductoCreditoID().hashCode();
        }
        if (getPeriodicidad() != null) {
            _hashCode += getPeriodicidad().hashCode();
        }
        if (getPlazo() != null) {
            _hashCode += getPlazo().hashCode();
        }
        if (getTipoDispersion() != null) {
            _hashCode += getTipoDispersion().hashCode();
        }
        if (getCuentaCLABE() != null) {
            _hashCode += getCuentaCLABE().hashCode();
        }
        if (getTipoPagoCapital() != null) {
            _hashCode += getTipoPagoCapital().hashCode();
        }
        if (getFolio() != null) {
            _hashCode += getFolio().hashCode();
        }
        if (getClaveUsuario() != null) {
            _hashCode += getClaveUsuario().hashCode();
        }
        if (getDispositivo() != null) {
            _hashCode += getDispositivo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AltaSolicitudGrupalWSRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">AltaSolicitudGrupalWSRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integrantes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "integrantes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "integrante"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grupoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "grupoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productoCreditoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "productoCreditoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodicidad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "periodicidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plazo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "plazo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDispersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "tipoDispersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuentaCLABE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "cuentaCLABE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPagoCapital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "tipoPagoCapital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "folio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claveUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "claveUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dispositivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "dispositivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
