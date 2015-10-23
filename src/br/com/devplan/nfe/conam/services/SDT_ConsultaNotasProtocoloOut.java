/**
 * SDT_ConsultaNotasProtocoloOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class SDT_ConsultaNotasProtocoloOut  implements java.io.Serializable {
    private boolean retorno;

    private br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutMessage[] messages;

    private br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutXML_Notas XML_Notas;

    public SDT_ConsultaNotasProtocoloOut() {
    }

    public SDT_ConsultaNotasProtocoloOut(
           boolean retorno,
           br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutMessage[] messages,
           br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutXML_Notas XML_Notas) {
           this.retorno = retorno;
           this.messages = messages;
           this.XML_Notas = XML_Notas;
    }


    /**
     * Gets the retorno value for this SDT_ConsultaNotasProtocoloOut.
     * 
     * @return retorno
     */
    public boolean isRetorno() {
        return retorno;
    }


    /**
     * Sets the retorno value for this SDT_ConsultaNotasProtocoloOut.
     * 
     * @param retorno
     */
    public void setRetorno(boolean retorno) {
        this.retorno = retorno;
    }


    /**
     * Gets the messages value for this SDT_ConsultaNotasProtocoloOut.
     * 
     * @return messages
     */
    public br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutMessage[] getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this SDT_ConsultaNotasProtocoloOut.
     * 
     * @param messages
     */
    public void setMessages(br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutMessage[] messages) {
        this.messages = messages;
    }


    /**
     * Gets the XML_Notas value for this SDT_ConsultaNotasProtocoloOut.
     * 
     * @return XML_Notas
     */
    public br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutXML_Notas getXML_Notas() {
        return XML_Notas;
    }


    /**
     * Sets the XML_Notas value for this SDT_ConsultaNotasProtocoloOut.
     * 
     * @param XML_Notas
     */
    public void setXML_Notas(br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutXML_Notas XML_Notas) {
        this.XML_Notas = XML_Notas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SDT_ConsultaNotasProtocoloOut)) return false;
        SDT_ConsultaNotasProtocoloOut other = (SDT_ConsultaNotasProtocoloOut) obj;
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
              java.util.Arrays.equals(this.messages, other.getMessages()))) &&
            ((this.XML_Notas==null && other.getXML_Notas()==null) || 
             (this.XML_Notas!=null &&
              this.XML_Notas.equals(other.getXML_Notas())));
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
        if (getXML_Notas() != null) {
            _hashCode += getXML_Notas().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SDT_ConsultaNotasProtocoloOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("NFe", "SDT_ConsultaNotasProtocoloOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retorno");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Retorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messages");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Messages"));
        elemField.setXmlType(new javax.xml.namespace.QName("NFe", "SDT_ConsultaNotasProtocoloOut.Message"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("NFe", "Message"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XML_Notas");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "XML_Notas"));
        elemField.setXmlType(new javax.xml.namespace.QName("NFe", "SDT_ConsultaNotasProtocoloOut.XML_Notas"));
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
