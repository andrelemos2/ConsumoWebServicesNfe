/**
 * Sdt_ProcessarpsIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class Sdt_ProcessarpsIn  implements java.io.Serializable {
    private br.com.devplan.nfe.conam.services.Sdt_ProcessarpsInLogin login;

    private br.com.devplan.nfe.conam.services.Sdt_ProcessarpsInSDTRPS SDTRPS;

    public Sdt_ProcessarpsIn() {
    }

    public Sdt_ProcessarpsIn(
           br.com.devplan.nfe.conam.services.Sdt_ProcessarpsInLogin login,
           br.com.devplan.nfe.conam.services.Sdt_ProcessarpsInSDTRPS SDTRPS) {
           this.login = login;
           this.SDTRPS = SDTRPS;
    }


    /**
     * Gets the login value for this Sdt_ProcessarpsIn.
     * 
     * @return login
     */
    public br.com.devplan.nfe.conam.services.Sdt_ProcessarpsInLogin getLogin() {
        return login;
    }


    /**
     * Sets the login value for this Sdt_ProcessarpsIn.
     * 
     * @param login
     */
    public void setLogin(br.com.devplan.nfe.conam.services.Sdt_ProcessarpsInLogin login) {
        this.login = login;
    }


    /**
     * Gets the SDTRPS value for this Sdt_ProcessarpsIn.
     * 
     * @return SDTRPS
     */
    public br.com.devplan.nfe.conam.services.Sdt_ProcessarpsInSDTRPS getSDTRPS() {
        return SDTRPS;
    }


    /**
     * Sets the SDTRPS value for this Sdt_ProcessarpsIn.
     * 
     * @param SDTRPS
     */
    public void setSDTRPS(br.com.devplan.nfe.conam.services.Sdt_ProcessarpsInSDTRPS SDTRPS) {
        this.SDTRPS = SDTRPS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sdt_ProcessarpsIn)) return false;
        Sdt_ProcessarpsIn other = (Sdt_ProcessarpsIn) obj;
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
            ((this.SDTRPS==null && other.getSDTRPS()==null) || 
             (this.SDTRPS!=null &&
              this.SDTRPS.equals(other.getSDTRPS())));
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
        if (getSDTRPS() != null) {
            _hashCode += getSDTRPS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sdt_ProcessarpsIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("NFe", "Sdt_ProcessarpsIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Login"));
        elemField.setXmlType(new javax.xml.namespace.QName("NFe", "Sdt_ProcessarpsIn.Login"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SDTRPS");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "SDTRPS"));
        elemField.setXmlType(new javax.xml.namespace.QName("NFe", "Sdt_ProcessarpsIn.SDTRPS"));
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
