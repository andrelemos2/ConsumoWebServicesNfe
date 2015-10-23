/**
 * Sdt_CancelaNFE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class Sdt_CancelaNFE  implements java.io.Serializable {
    private br.com.devplan.nfe.conam.services.Sdt_CancelaNFELogin login;

    private br.com.devplan.nfe.conam.services.Sdt_CancelaNFENota nota;

    public Sdt_CancelaNFE() {
    }

    public Sdt_CancelaNFE(
           br.com.devplan.nfe.conam.services.Sdt_CancelaNFELogin login,
           br.com.devplan.nfe.conam.services.Sdt_CancelaNFENota nota) {
           this.login = login;
           this.nota = nota;
    }


    /**
     * Gets the login value for this Sdt_CancelaNFE.
     * 
     * @return login
     */
    public br.com.devplan.nfe.conam.services.Sdt_CancelaNFELogin getLogin() {
        return login;
    }


    /**
     * Sets the login value for this Sdt_CancelaNFE.
     * 
     * @param login
     */
    public void setLogin(br.com.devplan.nfe.conam.services.Sdt_CancelaNFELogin login) {
        this.login = login;
    }


    /**
     * Gets the nota value for this Sdt_CancelaNFE.
     * 
     * @return nota
     */
    public br.com.devplan.nfe.conam.services.Sdt_CancelaNFENota getNota() {
        return nota;
    }


    /**
     * Sets the nota value for this Sdt_CancelaNFE.
     * 
     * @param nota
     */
    public void setNota(br.com.devplan.nfe.conam.services.Sdt_CancelaNFENota nota) {
        this.nota = nota;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sdt_CancelaNFE)) return false;
        Sdt_CancelaNFE other = (Sdt_CancelaNFE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.nota==null && other.getNota()==null) || 
             (this.nota!=null &&
              this.nota.equals(other.getNota())));
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
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getNota() != null) {
            _hashCode += getNota().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sdt_CancelaNFE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("NFe", "Sdt_CancelaNFE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Login"));
        elemField.setXmlType(new javax.xml.namespace.QName("NFe", "Sdt_CancelaNFE.Login"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nota");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Nota"));
        elemField.setXmlType(new javax.xml.namespace.QName("NFe", "Sdt_CancelaNFE.Nota"));
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
