/**
 * Ws_nfeCANCELANOTAELETRONICAResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class Ws_nfeCANCELANOTAELETRONICAResponse  implements java.io.Serializable {
    private br.com.devplan.nfe.conam.services.Sdt_RetornoCancelaNFE sdt_retornocancelanfe;

    public Ws_nfeCANCELANOTAELETRONICAResponse() {
    }

    public Ws_nfeCANCELANOTAELETRONICAResponse(
           br.com.devplan.nfe.conam.services.Sdt_RetornoCancelaNFE sdt_retornocancelanfe) {
           this.sdt_retornocancelanfe = sdt_retornocancelanfe;
    }


    /**
     * Gets the sdt_retornocancelanfe value for this Ws_nfeCANCELANOTAELETRONICAResponse.
     * 
     * @return sdt_retornocancelanfe
     */
    public br.com.devplan.nfe.conam.services.Sdt_RetornoCancelaNFE getSdt_retornocancelanfe() {
        return sdt_retornocancelanfe;
    }


    /**
     * Sets the sdt_retornocancelanfe value for this Ws_nfeCANCELANOTAELETRONICAResponse.
     * 
     * @param sdt_retornocancelanfe
     */
    public void setSdt_retornocancelanfe(br.com.devplan.nfe.conam.services.Sdt_RetornoCancelaNFE sdt_retornocancelanfe) {
        this.sdt_retornocancelanfe = sdt_retornocancelanfe;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws_nfeCANCELANOTAELETRONICAResponse)) return false;
        Ws_nfeCANCELANOTAELETRONICAResponse other = (Ws_nfeCANCELANOTAELETRONICAResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sdt_retornocancelanfe==null && other.getSdt_retornocancelanfe()==null) || 
             (this.sdt_retornocancelanfe!=null &&
              this.sdt_retornocancelanfe.equals(other.getSdt_retornocancelanfe())));
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
        if (getSdt_retornocancelanfe() != null) {
            _hashCode += getSdt_retornocancelanfe().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ws_nfeCANCELANOTAELETRONICAResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("NFe", ">ws_nfe.CANCELANOTAELETRONICAResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sdt_retornocancelanfe");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Sdt_retornocancelanfe"));
        elemField.setXmlType(new javax.xml.namespace.QName("NFe", "Sdt_RetornoCancelaNFE"));
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
