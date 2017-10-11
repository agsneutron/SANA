/**
 * AltaGrupoWSRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package safisrv.ws.schemas;

public class AltaGrupoWSRequest  implements java.io.Serializable {
    private java.lang.String nombreGrupo;

    private java.lang.String folio;

    private java.lang.String claveUsuario;

    private java.lang.String dispositivo;

    public AltaGrupoWSRequest() {
    }

    public AltaGrupoWSRequest(
           java.lang.String nombreGrupo,
           java.lang.String folio,
           java.lang.String claveUsuario,
           java.lang.String dispositivo) {
           this.nombreGrupo = nombreGrupo;
           this.folio = folio;
           this.claveUsuario = claveUsuario;
           this.dispositivo = dispositivo;
    }


    /**
     * Gets the nombreGrupo value for this AltaGrupoWSRequest.
     * 
     * @return nombreGrupo
     */
    public java.lang.String getNombreGrupo() {
        return nombreGrupo;
    }


    /**
     * Sets the nombreGrupo value for this AltaGrupoWSRequest.
     * 
     * @param nombreGrupo
     */
    public void setNombreGrupo(java.lang.String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }


    /**
     * Gets the folio value for this AltaGrupoWSRequest.
     * 
     * @return folio
     */
    public java.lang.String getFolio() {
        return folio;
    }


    /**
     * Sets the folio value for this AltaGrupoWSRequest.
     * 
     * @param folio
     */
    public void setFolio(java.lang.String folio) {
        this.folio = folio;
    }


    /**
     * Gets the claveUsuario value for this AltaGrupoWSRequest.
     * 
     * @return claveUsuario
     */
    public java.lang.String getClaveUsuario() {
        return claveUsuario;
    }


    /**
     * Sets the claveUsuario value for this AltaGrupoWSRequest.
     * 
     * @param claveUsuario
     */
    public void setClaveUsuario(java.lang.String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }


    /**
     * Gets the dispositivo value for this AltaGrupoWSRequest.
     * 
     * @return dispositivo
     */
    public java.lang.String getDispositivo() {
        return dispositivo;
    }


    /**
     * Sets the dispositivo value for this AltaGrupoWSRequest.
     * 
     * @param dispositivo
     */
    public void setDispositivo(java.lang.String dispositivo) {
        this.dispositivo = dispositivo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AltaGrupoWSRequest)) return false;
        AltaGrupoWSRequest other = (AltaGrupoWSRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nombreGrupo==null && other.getNombreGrupo()==null) || 
             (this.nombreGrupo!=null &&
              this.nombreGrupo.equals(other.getNombreGrupo()))) &&
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
        if (getNombreGrupo() != null) {
            _hashCode += getNombreGrupo().hashCode();
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
        new org.apache.axis.description.TypeDesc(AltaGrupoWSRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://safisrv/ws/schemas", ">AltaGrupoWSRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreGrupo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://safisrv/ws/schemas", "nombreGrupo"));
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
