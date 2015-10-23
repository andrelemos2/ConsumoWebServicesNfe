/**
 * SDT_ConsultaProtocoloIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class SDT_ConsultaProtocoloIn  implements java.io.Serializable {
    private java.lang.String protocolo;

    private br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloInLogin login;

    public SDT_ConsultaProtocoloIn() {
    }

    public SDT_ConsultaProtocoloIn(
           java.lang.String protocolo,
           br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloInLogin login) {
           this.protocolo = protocolo;
           this.login = login;
    }


    /**
     * Gets the protocolo value for this SDT_ConsultaProtocoloIn.
     * 
     * @return protocolo
     */
    public java.lang.String getProtocolo() {
        return protocolo;
    }


    /**
     * Sets the protocolo value for this SDT_ConsultaProtocoloIn.
     * 
     * @param protocolo
     */
    public void setProtocolo(java.lang.String protocolo) {
        this.protocolo = protocolo;
    }


    /**
     * Gets the login value for this SDT_ConsultaProtocoloIn.
     * 
     * @return login
     */
    public br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloInLogin getLogin() {
        return login;
    }


    /**
     * Sets the login value for this SDT_ConsultaProtocoloIn.
     * 
     * @param login
     */
    public void setLogin(br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloInLogin login) {
        this.login = login;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SDT_ConsultaProtocoloIn)) return false;
        SDT_ConsultaProtocoloIn other = (SDT_ConsultaProtocoloIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.protocolo==null && other.getProtocolo()==null) || 
             (this.protocolo!=null &&
              this.protocolo.equals(other.getProtocolo()))) &&
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin())));
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
        if (getProtocolo() != null) {
            _hashCode += getProtocolo().hashCode();
        }
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SDT_ConsultaProtocoloIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("NFe", "SDT_ConsultaProtocoloIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolo");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Protocolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Login"));
        elemField.setXmlType(new javax.xml.namespace.QName("NFe", "SDT_ConsultaProtocoloIn.Login"));
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
