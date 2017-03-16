/**
 * PagoCreditoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package safisrv.ws.schemas;

public class PagoCreditoRequest  implements java.io.Serializable {
    private java.lang.String creditoID;

    private java.lang.String monto;

    private java.lang.String montoGL;

    private java.lang.String folio;

    private java.lang.String claveUsuario;

    private java.lang.String dispositivo;

    public PagoCreditoRequest() {
    }

    public PagoCreditoRequest(
           java.lang.String creditoID,
           java.lang.String monto,
           java.lang.String montoGL,
           java.lang.String folio,
           java.lang.String claveUsuario,
           java.lang.String dispositivo) {
           this.creditoID = creditoID;
           this.monto = monto;
           this.montoGL = montoGL;
           this.folio = folio;
           this.claveUsuario = claveUsuario;
           this.dispositivo = dispositivo;
    }


    /**
     * Gets the creditoID value for this PagoCreditoRequest.
     * 
     * @return creditoID
     */
    public java.lang.String getCreditoID() {
        return creditoID;
    }


    /**
     * Sets the creditoID value for this PagoCreditoRequest.
     * 
     * @param creditoID
     */
    public void setCreditoID(java.lang.String creditoID) {
        this.creditoID = creditoID;
    }


    /**
     * Gets the monto value for this PagoCreditoRequest.
     * 
     * @return monto
     */
    public java.lang.String getMonto() {
        return monto;
    }


    /**
     * Sets the monto value for this PagoCreditoRequest.
     * 
     * @param monto
     */
    public void setMonto(java.lang.String monto) {
        this.monto = monto;
    }


    /**
     * Gets the montoGL value for this PagoCreditoRequest.
     * 
     * @return montoGL
     */
    public java.lang.String getMontoGL() {
        return montoGL;
    }


    /**
     * Sets the montoGL value for this PagoCreditoRequest.
     * 
     * @param montoGL
     */
    public void setMontoGL(java.lang.String montoGL) {
        this.montoGL = montoGL;
    }


    /**
     * Gets the folio value for this PagoCreditoRequest.
     * 
     * @return folio
     */
    public java.lang.String getFolio() {
        return folio;
    }


    /**
     * Sets the folio value for this PagoCreditoRequest.
     * 
     * @param folio
     */
    public void setFolio(java.lang.String folio) {
        this.folio = folio;
    }


    /**
     * Gets the claveUsuario value for this PagoCreditoRequest.
     * 
     * @return claveUsuario
     */
    public java.lang.String getClaveUsuario() {
        return claveUsuario;
    }


    /**
     * Sets the claveUsuario value for this PagoCreditoRequest.
     * 
     * @param claveUsuario
     */
    public void setClaveUsuario(java.lang.String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }


    /**
     * Gets the dispositivo value for this PagoCreditoRequest.
     * 
     * @return dispositivo
     */
    public java.lang.String getDispositivo() {
        return dispositivo;
    }


    /**
     * Sets the dispositivo value for this PagoCreditoRequest.
     * 
     * @param dispositivo
     */
    public void setDispositivo(java.lang.String dispositivo) {
        this.dispositivo = dispositivo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PagoCreditoRequest)) return false;
        PagoCreditoRequest other = (PagoCreditoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creditoID==null && other.getCreditoID()==null) || 
             (this.creditoID!=null &&
              this.creditoID.equals(other.getCreditoID()))) &&
            ((this.monto==null && other.getMonto()==null) || 
             (this.monto!=null &&
              this.monto.equals(other.getMonto()))) &&
            ((this.montoGL==null && other.getMontoGL()==null) || 
             (this.montoGL!=null &&
              this.montoGL.equals(other.getMontoGL()))) &&
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
        if (getCreditoID() != null) {
            _hashCode += getCreditoID().hashCode();
        }
        if (getMonto() != null) {
            _hashCode += getMonto().hashCode();
        }
        if (getMontoGL() != null) {
            _hashCode += getMontoGL().hashCode();
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
        new org.apache.axis.description.TypeDesc(PagoCreditoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">PagoCreditoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "creditoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "monto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montoGL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "montoGL"));
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
