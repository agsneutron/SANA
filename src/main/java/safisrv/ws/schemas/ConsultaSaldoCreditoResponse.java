/**
 * ConsultaSaldoCreditoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package safisrv.ws.schemas;

public class ConsultaSaldoCreditoResponse  implements java.io.Serializable {
    private java.lang.String saldoTotal;

    private java.lang.String saldoExigibleDia;

    private java.lang.String proyeccion;

    private java.lang.String saldoFinalPlazo;

    private java.lang.String codigoRespuesta;

    private java.lang.String mensajeRespuesta;

    public ConsultaSaldoCreditoResponse() {
    }

    public ConsultaSaldoCreditoResponse(
           java.lang.String saldoTotal,
           java.lang.String saldoExigibleDia,
           java.lang.String proyeccion,
           java.lang.String saldoFinalPlazo,
           java.lang.String codigoRespuesta,
           java.lang.String mensajeRespuesta) {
           this.saldoTotal = saldoTotal;
           this.saldoExigibleDia = saldoExigibleDia;
           this.proyeccion = proyeccion;
           this.saldoFinalPlazo = saldoFinalPlazo;
           this.codigoRespuesta = codigoRespuesta;
           this.mensajeRespuesta = mensajeRespuesta;
    }


    /**
     * Gets the saldoTotal value for this ConsultaSaldoCreditoResponse.
     * 
     * @return saldoTotal
     */
    public java.lang.String getSaldoTotal() {
        return saldoTotal;
    }


    /**
     * Sets the saldoTotal value for this ConsultaSaldoCreditoResponse.
     * 
     * @param saldoTotal
     */
    public void setSaldoTotal(java.lang.String saldoTotal) {
        this.saldoTotal = saldoTotal;
    }


    /**
     * Gets the saldoExigibleDia value for this ConsultaSaldoCreditoResponse.
     * 
     * @return saldoExigibleDia
     */
    public java.lang.String getSaldoExigibleDia() {
        return saldoExigibleDia;
    }


    /**
     * Sets the saldoExigibleDia value for this ConsultaSaldoCreditoResponse.
     * 
     * @param saldoExigibleDia
     */
    public void setSaldoExigibleDia(java.lang.String saldoExigibleDia) {
        this.saldoExigibleDia = saldoExigibleDia;
    }


    /**
     * Gets the proyeccion value for this ConsultaSaldoCreditoResponse.
     * 
     * @return proyeccion
     */
    public java.lang.String getProyeccion() {
        return proyeccion;
    }


    /**
     * Sets the proyeccion value for this ConsultaSaldoCreditoResponse.
     * 
     * @param proyeccion
     */
    public void setProyeccion(java.lang.String proyeccion) {
        this.proyeccion = proyeccion;
    }


    /**
     * Gets the saldoFinalPlazo value for this ConsultaSaldoCreditoResponse.
     * 
     * @return saldoFinalPlazo
     */
    public java.lang.String getSaldoFinalPlazo() {
        return saldoFinalPlazo;
    }


    /**
     * Sets the saldoFinalPlazo value for this ConsultaSaldoCreditoResponse.
     * 
     * @param saldoFinalPlazo
     */
    public void setSaldoFinalPlazo(java.lang.String saldoFinalPlazo) {
        this.saldoFinalPlazo = saldoFinalPlazo;
    }


    /**
     * Gets the codigoRespuesta value for this ConsultaSaldoCreditoResponse.
     * 
     * @return codigoRespuesta
     */
    public java.lang.String getCodigoRespuesta() {
        return codigoRespuesta;
    }


    /**
     * Sets the codigoRespuesta value for this ConsultaSaldoCreditoResponse.
     * 
     * @param codigoRespuesta
     */
    public void setCodigoRespuesta(java.lang.String codigoRespuesta) {
        this.codigoRespuesta = codigoRespuesta;
    }


    /**
     * Gets the mensajeRespuesta value for this ConsultaSaldoCreditoResponse.
     * 
     * @return mensajeRespuesta
     */
    public java.lang.String getMensajeRespuesta() {
        return mensajeRespuesta;
    }


    /**
     * Sets the mensajeRespuesta value for this ConsultaSaldoCreditoResponse.
     * 
     * @param mensajeRespuesta
     */
    public void setMensajeRespuesta(java.lang.String mensajeRespuesta) {
        this.mensajeRespuesta = mensajeRespuesta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaSaldoCreditoResponse)) return false;
        ConsultaSaldoCreditoResponse other = (ConsultaSaldoCreditoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.saldoTotal==null && other.getSaldoTotal()==null) || 
             (this.saldoTotal!=null &&
              this.saldoTotal.equals(other.getSaldoTotal()))) &&
            ((this.saldoExigibleDia==null && other.getSaldoExigibleDia()==null) || 
             (this.saldoExigibleDia!=null &&
              this.saldoExigibleDia.equals(other.getSaldoExigibleDia()))) &&
            ((this.proyeccion==null && other.getProyeccion()==null) || 
             (this.proyeccion!=null &&
              this.proyeccion.equals(other.getProyeccion()))) &&
            ((this.saldoFinalPlazo==null && other.getSaldoFinalPlazo()==null) || 
             (this.saldoFinalPlazo!=null &&
              this.saldoFinalPlazo.equals(other.getSaldoFinalPlazo()))) &&
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
        if (getSaldoTotal() != null) {
            _hashCode += getSaldoTotal().hashCode();
        }
        if (getSaldoExigibleDia() != null) {
            _hashCode += getSaldoExigibleDia().hashCode();
        }
        if (getProyeccion() != null) {
            _hashCode += getProyeccion().hashCode();
        }
        if (getSaldoFinalPlazo() != null) {
            _hashCode += getSaldoFinalPlazo().hashCode();
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
        new org.apache.axis.description.TypeDesc(ConsultaSaldoCreditoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">ConsultaSaldoCreditoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saldoTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "saldoTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saldoExigibleDia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "saldoExigibleDia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proyeccion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "proyeccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saldoFinalPlazo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "saldoFinalPlazo"));
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
