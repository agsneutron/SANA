/**
 * Integrante.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package safisrv.ws.schemas_ant;

public class Integrante  implements java.io.Serializable {
    private java.lang.String prospectoID;

    private java.lang.String clienteID;

    private java.lang.String destinoCredito;

    private java.lang.String proyecto;

    private java.lang.String montoSolici;

    private java.lang.String tipoIntegrante;

    public Integrante() {
    }

    public Integrante(
           java.lang.String prospectoID,
           java.lang.String clienteID,
           java.lang.String destinoCredito,
           java.lang.String proyecto,
           java.lang.String montoSolici,
           java.lang.String tipoIntegrante) {
           this.prospectoID = prospectoID;
           this.clienteID = clienteID;
           this.destinoCredito = destinoCredito;
           this.proyecto = proyecto;
           this.montoSolici = montoSolici;
           this.tipoIntegrante = tipoIntegrante;
    }


    /**
     * Gets the prospectoID value for this Integrante.
     * 
     * @return prospectoID
     */
    public java.lang.String getProspectoID() {
        return prospectoID;
    }


    /**
     * Sets the prospectoID value for this Integrante.
     * 
     * @param prospectoID
     */
    public void setProspectoID(java.lang.String prospectoID) {
        this.prospectoID = prospectoID;
    }


    /**
     * Gets the clienteID value for this Integrante.
     * 
     * @return clienteID
     */
    public java.lang.String getClienteID() {
        return clienteID;
    }


    /**
     * Sets the clienteID value for this Integrante.
     * 
     * @param clienteID
     */
    public void setClienteID(java.lang.String clienteID) {
        this.clienteID = clienteID;
    }


    /**
     * Gets the destinoCredito value for this Integrante.
     * 
     * @return destinoCredito
     */
    public java.lang.String getDestinoCredito() {
        return destinoCredito;
    }


    /**
     * Sets the destinoCredito value for this Integrante.
     * 
     * @param destinoCredito
     */
    public void setDestinoCredito(java.lang.String destinoCredito) {
        this.destinoCredito = destinoCredito;
    }


    /**
     * Gets the proyecto value for this Integrante.
     * 
     * @return proyecto
     */
    public java.lang.String getProyecto() {
        return proyecto;
    }


    /**
     * Sets the proyecto value for this Integrante.
     * 
     * @param proyecto
     */
    public void setProyecto(java.lang.String proyecto) {
        this.proyecto = proyecto;
    }


    /**
     * Gets the montoSolici value for this Integrante.
     * 
     * @return montoSolici
     */
    public java.lang.String getMontoSolici() {
        return montoSolici;
    }


    /**
     * Sets the montoSolici value for this Integrante.
     * 
     * @param montoSolici
     */
    public void setMontoSolici(java.lang.String montoSolici) {
        this.montoSolici = montoSolici;
    }


    /**
     * Gets the tipoIntegrante value for this Integrante.
     * 
     * @return tipoIntegrante
     */
    public java.lang.String getTipoIntegrante() {
        return tipoIntegrante;
    }


    /**
     * Sets the tipoIntegrante value for this Integrante.
     * 
     * @param tipoIntegrante
     */
    public void setTipoIntegrante(java.lang.String tipoIntegrante) {
        this.tipoIntegrante = tipoIntegrante;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Integrante)) return false;
        Integrante other = (Integrante) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.prospectoID==null && other.getProspectoID()==null) || 
             (this.prospectoID!=null &&
              this.prospectoID.equals(other.getProspectoID()))) &&
            ((this.clienteID==null && other.getClienteID()==null) || 
             (this.clienteID!=null &&
              this.clienteID.equals(other.getClienteID()))) &&
            ((this.destinoCredito==null && other.getDestinoCredito()==null) || 
             (this.destinoCredito!=null &&
              this.destinoCredito.equals(other.getDestinoCredito()))) &&
            ((this.proyecto==null && other.getProyecto()==null) || 
             (this.proyecto!=null &&
              this.proyecto.equals(other.getProyecto()))) &&
            ((this.montoSolici==null && other.getMontoSolici()==null) || 
             (this.montoSolici!=null &&
              this.montoSolici.equals(other.getMontoSolici()))) &&
            ((this.tipoIntegrante==null && other.getTipoIntegrante()==null) || 
             (this.tipoIntegrante!=null &&
              this.tipoIntegrante.equals(other.getTipoIntegrante())));
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
        if (getProspectoID() != null) {
            _hashCode += getProspectoID().hashCode();
        }
        if (getClienteID() != null) {
            _hashCode += getClienteID().hashCode();
        }
        if (getDestinoCredito() != null) {
            _hashCode += getDestinoCredito().hashCode();
        }
        if (getProyecto() != null) {
            _hashCode += getProyecto().hashCode();
        }
        if (getMontoSolici() != null) {
            _hashCode += getMontoSolici().hashCode();
        }
        if (getTipoIntegrante() != null) {
            _hashCode += getTipoIntegrante().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Integrante.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">integrante"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prospectoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "prospectoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clienteID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "clienteID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinoCredito");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "destinoCredito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proyecto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "proyecto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montoSolici");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "montoSolici"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoIntegrante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "tipoIntegrante"));
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
