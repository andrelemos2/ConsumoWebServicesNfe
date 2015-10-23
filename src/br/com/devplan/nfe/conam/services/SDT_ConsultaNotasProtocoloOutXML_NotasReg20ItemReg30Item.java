/**
 * SDT_ConsultaNotasProtocoloOutXML_NotasReg20ItemReg30Item.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class SDT_ConsultaNotasProtocoloOutXML_NotasReg20ItemReg30Item  implements java.io.Serializable {
    private java.lang.String tributoSigla;

    private double tributoAliquota;

    private double tributoValor;

    public SDT_ConsultaNotasProtocoloOutXML_NotasReg20ItemReg30Item() {
    }

    public SDT_ConsultaNotasProtocoloOutXML_NotasReg20ItemReg30Item(
           java.lang.String tributoSigla,
           double tributoAliquota,
           double tributoValor) {
           this.tributoSigla = tributoSigla;
           this.tributoAliquota = tributoAliquota;
           this.tributoValor = tributoValor;
    }


    /**
     * Gets the tributoSigla value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20ItemReg30Item.
     * 
     * @return tributoSigla
     */
    public java.lang.String getTributoSigla() {
        return tributoSigla;
    }


    /**
     * Sets the tributoSigla value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20ItemReg30Item.
     * 
     * @param tributoSigla
     */
    public void setTributoSigla(java.lang.String tributoSigla) {
        this.tributoSigla = tributoSigla;
    }


    /**
     * Gets the tributoAliquota value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20ItemReg30Item.
     * 
     * @return tributoAliquota
     */
    public double getTributoAliquota() {
        return tributoAliquota;
    }


    /**
     * Sets the tributoAliquota value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20ItemReg30Item.
     * 
     * @param tributoAliquota
     */
    public void setTributoAliquota(double tributoAliquota) {
        this.tributoAliquota = tributoAliquota;
    }


    /**
     * Gets the tributoValor value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20ItemReg30Item.
     * 
     * @return tributoValor
     */
    public double getTributoValor() {
        return tributoValor;
    }


    /**
     * Sets the tributoValor value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20ItemReg30Item.
     * 
     * @param tributoValor
     */
    public void setTributoValor(double tributoValor) {
        this.tributoValor = tributoValor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SDT_ConsultaNotasProtocoloOutXML_NotasReg20ItemReg30Item)) return false;
        SDT_ConsultaNotasProtocoloOutXML_NotasReg20ItemReg30Item other = (SDT_ConsultaNotasProtocoloOutXML_NotasReg20ItemReg30Item) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tributoSigla==null && other.getTributoSigla()==null) || 
             (this.tributoSigla!=null &&
              this.tributoSigla.equals(other.getTributoSigla()))) &&
            this.tributoAliquota == other.getTributoAliquota() &&
            this.tributoValor == other.getTributoValor();
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
        if (getTributoSigla() != null) {
            _hashCode += getTributoSigla().hashCode();
        }
        _hashCode += new Double(getTributoAliquota()).hashCode();
        _hashCode += new Double(getTributoValor()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SDT_ConsultaNotasProtocoloOutXML_NotasReg20ItemReg30Item.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("NFe", "SDT_ConsultaNotasProtocoloOut.XML_Notas.Reg20Item.Reg30Item"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tributoSigla");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "TributoSigla"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tributoAliquota");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "TributoAliquota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tributoValor");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "TributoValor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
