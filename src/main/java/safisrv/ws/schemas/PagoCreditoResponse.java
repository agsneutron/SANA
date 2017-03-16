/**
 * PagoCreditoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package safisrv.ws.schemas;

public class PagoCreditoResponse  implements java.io.Serializable {
    private java.lang.String creditoID;

    private java.lang.String numTransaccion;

    private java.lang.String saldoExigible;

    private java.lang.String saldoTotalActual;

    private java.lang.String codigoRespuesta;

    private java.lang.String mensajeRespuesta;

    public PagoCreditoResponse() {
    }

    public PagoCreditoResponse(
           java.lang.String creditoID,
           java.lang.String numTransaccion,
           java.lang.String saldoExigible,
           java.lang.String saldoTotalActual,
           java.lang.String codigoRespuesta,
           java.lang.String mensajeRespuesta) {
           this.creditoID = creditoID;
           this.numTransaccion = numTransaccion;
           this.saldoExigible = saldoExigible;
           this.saldoTotalActual = saldoTotalActual;
           this.codigoRespuesta = codigoRespuesta;
           this.mensajeRespuesta = mensajeRespuesta;
    }


    /**
     * Gets the creditoID value for this PagoCreditoResponse.
     * 
     * @return creditoID
     */
    public java.lang.String getCreditoID() {
        return creditoID;
    }


    /**
     * Sets the creditoID value for this PagoCreditoResponse.
     * 
     * @param creditoID
     */
    public void setCreditoID(java.lang.String creditoID) {
        this.creditoID = creditoID;
    }


    /**
     * Gets the numTransaccion value for this PagoCreditoResponse.
     * 
     * @return numTransaccion
     */
    public java.lang.String getNumTransaccion() {
        return numTransaccion;
    }


    /**
     * Sets the numTransaccion value for this PagoCreditoResponse.
     * 
     * @param numTransaccion
     */
    public void setNumTransaccion(java.lang.String numTransaccion) {
        this.numTransaccion = numTransaccion;
    }


    /**
     * Gets the saldoExigible value for this PagoCreditoResponse.
     * 
     * @return saldoExigible
     */
    public java.lang.String getSaldoExigible() {
        return saldoExigible;
    }


    /**
     * Sets the saldoExigible value for this PagoCreditoResponse.
     * 
     * @param saldoExigible
     */
    public void setSaldoExigible(java.lang.String saldoExigible) {
        this.saldoExigible = saldoExigible;
    }


    /**
     * Gets the saldoTotalActual value for this PagoCreditoResponse.
     * 
     * @return saldoTotalActual
     */
    public java.lang.String getSaldoTotalActual() {
        return saldoTotalActual;
    }


    /**
     * Sets the saldoTotalActual value for this PagoCreditoResponse.
     * 
     * @param saldoTotalActual
     */
    public void setSaldoTotalActual(java.lang.String saldoTotalActual) {
        this.saldoTotalActual = saldoTotalActual;
    }


    /**
     * Gets the codigoRespuesta value for this PagoCreditoResponse.
     * 
     * @return codigoRespuesta
     */
    public java.lang.String getCodigoRespuesta() {
        return codigoRespuesta;
    }


    /**
     * Sets the codigoRespuesta value for this PagoCreditoResponse.
     * 
     * @param codigoRespuesta
     */
    public void setCodigoRespuesta(java.lang.String codigoRespuesta) {
        this.codigoRespuesta = codigoRespuesta;
    }


    /**
     * Gets the mensajeRespuesta value for this PagoCreditoResponse.
     * 
     * @return mensajeRespuesta
     */
    public java.lang.String getMensajeRespuesta() {
        return mensajeRespuesta;
    }


    /**
     * Sets the mensajeRespuesta value for this PagoCreditoResponse.
     * 
     * @param mensajeRespuesta
     */
    public void setMensajeRespuesta(java.lang.String mensajeRespuesta) {
        this.mensajeRespuesta = mensajeRespuesta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PagoCreditoResponse)) return false;
        PagoCreditoResponse other = (PagoCreditoResponse) obj;
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
            ((this.numTransaccion==null && other.getNumTransaccion()==null) || 
             (this.numTransaccion!=null &&
              this.numTransaccion.equals(other.getNumTransaccion()))) &&
            ((this.saldoExigible==null && other.getSaldoExigible()==null) || 
             (this.saldoExigible!=null &&
              this.saldoExigible.equals(other.getSaldoExigible()))) &&
            ((this.saldoTotalActual==null && other.getSaldoTotalActual()==null) || 
             (this.saldoTotalActual!=null &&
              this.saldoTotalActual.equals(other.getSaldoTotalActual()))) &&
            ((this.codigoRespuesta==null && other.getCodigoRespuesta()==null) || 
             (this.codigoRespuesta!=null &&
              this.codigoRespuesta.equals(other.getCodigoRespuesta()))) &&
            ((this.mensajeRespuesta==null && other.getMensajeRespuesta()==null) || 
             (this.mensajeRespuesta!=null &&
              this.mensajeRespuesta.equals(other.getMensajeRespuesta())));
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
        if (getNumTransaccion() != null) {
            _hashCode += getNumTransaccion().hashCode();
        }
        if (getSaldoExigible() != null) {
            _hashCode += getSaldoExigible().hashCode();
        }
        if (getSaldoTotalActual() != null) {
            _hashCode += getSaldoTotalActual().hashCode();
        }
        if (getCodigoRespuesta() != null) {
            _hashCode += getCodigoRespuesta().hashCode();
        }
        if (getMensajeRespuesta() != null) {
            _hashCode += getMensajeRespuesta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PagoCreditoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">PagoCreditoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "creditoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numTransaccion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "numTransaccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saldoExigible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "saldoExigible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saldoTotalActual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "saldoTotalActual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoRespuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "codigoRespuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensajeRespuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "mensajeRespuesta"));
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
