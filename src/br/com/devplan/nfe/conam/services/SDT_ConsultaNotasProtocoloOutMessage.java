/**
 * SDT_ConsultaNotasProtocoloOutMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class SDT_ConsultaNotasProtocoloOutMessage  implements java.io.Serializable {
    private java.lang.String id;

    private byte type;

    private java.lang.String description;

    private int linErr;

    public SDT_ConsultaNotasProtocoloOutMessage() {
    }

    public SDT_ConsultaNotasProtocoloOutMessage(
           java.lang.String id,
           byte type,
           java.lang.String description,
           int linErr) {
           this.id = id;
           this.type = type;
           this.description = description;
           this.linErr = linErr;
    }


    /**
     * Gets the id value for this SDT_ConsultaNotasProtocoloOutMessage.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this SDT_ConsultaNotasProtocoloOutMessage.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the type value for this SDT_ConsultaNotasProtocoloOutMessage.
     * 
     * @return type
     */
    public byte getType() {
        return type;
    }


    /**
     * Sets the type value for this SDT_ConsultaNotasProtocoloOutMessage.
     * 
     * @param type
     */
    public void setType(byte type) {
        this.type = type;
    }


    /**
     * Gets the description value for this SDT_ConsultaNotasProtocoloOutMessage.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SDT_ConsultaNotasProtocoloOutMessage.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the linErr value for this SDT_ConsultaNotasProtocoloOutMessage.
     * 
     * @return linErr
     */
    public int getLinErr() {
        return linErr;
    }


    /**
     * Sets the linErr value for this SDT_ConsultaNotasProtocoloOutMessage.
     * 
     * @param linErr
     */
    public void setLinErr(int linErr) {
        this.linErr = linErr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SDT_ConsultaNotasProtocoloOutMessage)) return false;
        SDT_ConsultaNotasProtocoloOutMessage other = (SDT_ConsultaNotasProtocoloOutMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            this.type == other.getType() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.linErr == other.getLinErr();
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        _hashCode += getType();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += getLinErr();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SDT_ConsultaNotasProtocoloOutMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("NFe", "SDT_ConsultaNotasProtocoloOut.Message"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linErr");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "LinErr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
