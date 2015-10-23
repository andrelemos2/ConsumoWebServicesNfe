/**
 * SDT_ConsultaProtocoloInLogin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class SDT_ConsultaProtocoloInLogin  implements java.io.Serializable {
    private java.lang.String codigoUsuario;

    private java.lang.String codigoContribuinte;

    public SDT_ConsultaProtocoloInLogin() {
    }

    public SDT_ConsultaProtocoloInLogin(
           java.lang.String codigoUsuario,
           java.lang.String codigoContribuinte) {
           this.codigoUsuario = codigoUsuario;
           this.codigoContribuinte = codigoContribuinte;
    }


    /**
     * Gets the codigoUsuario value for this SDT_ConsultaProtocoloInLogin.
     * 
     * @return codigoUsuario
     */
    public java.lang.String getCodigoUsuario() {
        return codigoUsuario;
    }


    /**
     * Sets the codigoUsuario value for this SDT_ConsultaProtocoloInLogin.
     * 
     * @param codigoUsuario
     */
    public void setCodigoUsuario(java.lang.String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }


    /**
     * Gets the codigoContribuinte value for this SDT_ConsultaProtocoloInLogin.
     * 
     * @return codigoContribuinte
     */
    public java.lang.String getCodigoContribuinte() {
        return codigoContribuinte;
    }


    /**
     * Sets the codigoContribuinte value for this SDT_ConsultaProtocoloInLogin.
     * 
     * @param codigoContribuinte
     */
    public void setCodigoContribuinte(java.lang.String codigoContribuinte) {
        this.codigoContribuinte = codigoContribuinte;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SDT_ConsultaProtocoloInLogin)) return false;
        SDT_ConsultaProtocoloInLogin other = (SDT_ConsultaProtocoloInLogin) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoUsuario==null && other.getCodigoUsuario()==null) || 
             (this.codigoUsuario!=null &&
              this.codigoUsuario.equals(other.getCodigoUsuario()))) &&
            ((this.codigoContribuinte==null && other.getCodigoContribuinte()==null) || 
             (this.codigoContribuinte!=null &&
              this.codigoContribuinte.equals(other.getCodigoContribuinte())));
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
        if (getCodigoUsuario() != null) {
            _hashCode += getCodigoUsuario().hashCode();
        }
        if (getCodigoContribuinte() != null) {
            _hashCode += getCodigoContribuinte().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SDT_ConsultaProtocoloInLogin.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("NFe", "SDT_ConsultaProtocoloIn.Login"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "CodigoUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoContribuinte");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "CodigoContribuinte"));
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
