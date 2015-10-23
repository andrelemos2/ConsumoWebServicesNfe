/**
 * Ws_nfeVERFICARPS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class Ws_nfeVERFICARPS  implements java.io.Serializable {
    private br.com.devplan.nfe.conam.services.Sdt_ProcessarpsIn sdt_processarpsin;

    public Ws_nfeVERFICARPS() {
    }

    public Ws_nfeVERFICARPS(
           br.com.devplan.nfe.conam.services.Sdt_ProcessarpsIn sdt_processarpsin) {
           this.sdt_processarpsin = sdt_processarpsin;
    }


    /**
     * Gets the sdt_processarpsin value for this Ws_nfeVERFICARPS.
     * 
     * @return sdt_processarpsin
     */
    public br.com.devplan.nfe.conam.services.Sdt_ProcessarpsIn getSdt_processarpsin() {
        return sdt_processarpsin;
    }


    /**
     * Sets the sdt_processarpsin value for this Ws_nfeVERFICARPS.
     * 
     * @param sdt_processarpsin
     */
    public void setSdt_processarpsin(br.com.devplan.nfe.conam.services.Sdt_ProcessarpsIn sdt_processarpsin) {
        this.sdt_processarpsin = sdt_processarpsin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws_nfeVERFICARPS)) return false;
        Ws_nfeVERFICARPS other = (Ws_nfeVERFICARPS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sdt_processarpsin==null && other.getSdt_processarpsin()==null) || 
             (this.sdt_processarpsin!=null &&
              this.sdt_processarpsin.equals(other.getSdt_processarpsin())));
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
        if (getSdt_processarpsin() != null) {
            _hashCode += getSdt_processarpsin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ws_nfeVERFICARPS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("NFe", ">ws_nfe.VERFICARPS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sdt_processarpsin");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Sdt_processarpsin"));
        elemField.setXmlType(new javax.xml.namespace.QName("NFe", "Sdt_ProcessarpsIn"));
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
