/**
 * Sdt_RetornoCancelaNFE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class Sdt_RetornoCancelaNFE  implements java.io.Serializable {
    private boolean retorno;

    private br.com.devplan.nfe.conam.services.Sdt_RetornoCancelaNFEMessage[] messages;

    public Sdt_RetornoCancelaNFE() {
    }

    public Sdt_RetornoCancelaNFE(
           boolean retorno,
           br.com.devplan.nfe.conam.services.Sdt_RetornoCancelaNFEMessage[] messages) {
           this.retorno = retorno;
           this.messages = messages;
    }


    /**
     * Gets the retorno value for this Sdt_RetornoCancelaNFE.
     * 
     * @return retorno
     */
    public boolean isRetorno() {
        return retorno;
    }


    /**
     * Sets the retorno value for this Sdt_RetornoCancelaNFE.
     * 
     * @param retorno
     */
    public void setRetorno(boolean retorno) {
        this.retorno = retorno;
    }


    /**
     * Gets the messages value for this Sdt_RetornoCancelaNFE.
     * 
     * @return messages
     */
    public br.com.devplan.nfe.conam.services.Sdt_RetornoCancelaNFEMessage[] getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this Sdt_RetornoCancelaNFE.
     * 
     * @param messages
     */
    public void setMessages(br.com.devplan.nfe.conam.services.Sdt_RetornoCancelaNFEMessage[] messages) {
        this.messages = messages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sdt_RetornoCancelaNFE)) return false;
        Sdt_RetornoCancelaNFE other = (Sdt_RetornoCancelaNFE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.retorno == other.isRetorno() &&
            ((this.messages==null && other.getMessages()==null) || 
             (this.messages!=null &&
              java.util.Arrays.equals(this.messages, other.getMessages())));
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
        _hashCode += (isRetorno() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMessages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sdt_RetornoCancelaNFE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("NFe", "Sdt_RetornoCancelaNFE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retorno");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Retorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messages");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Messages"));
        elemField.setXmlType(new javax.xml.namespace.QName("NFe", "Sdt_RetornoCancelaNFE.Message"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("NFe", "Message"));
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
