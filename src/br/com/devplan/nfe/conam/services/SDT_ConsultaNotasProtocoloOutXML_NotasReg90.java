/**
 * SDT_ConsultaNotasProtocoloOutXML_NotasReg90.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class SDT_ConsultaNotasProtocoloOutXML_NotasReg90  implements java.io.Serializable {
    private int qtdRegNormal;

    private double valorNFS;

    private double valorISS;

    private double valorDed;

    private double valorIssRet;

    private int qtdReg30;

    private double valorTributos;

    public SDT_ConsultaNotasProtocoloOutXML_NotasReg90() {
    }

    public SDT_ConsultaNotasProtocoloOutXML_NotasReg90(
           int qtdRegNormal,
           double valorNFS,
           double valorISS,
           double valorDed,
           double valorIssRet,
           int qtdReg30,
           double valorTributos) {
           this.qtdRegNormal = qtdRegNormal;
           this.valorNFS = valorNFS;
           this.valorISS = valorISS;
           this.valorDed = valorDed;
           this.valorIssRet = valorIssRet;
           this.qtdReg30 = qtdReg30;
           this.valorTributos = valorTributos;
    }


    /**
     * Gets the qtdRegNormal value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg90.
     * 
     * @return qtdRegNormal
     */
    public int getQtdRegNormal() {
        return qtdRegNormal;
    }


    /**
     * Sets the qtdRegNormal value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg90.
     * 
     * @param qtdRegNormal
     */
    public void setQtdRegNormal(int qtdRegNormal) {
        this.qtdRegNormal = qtdRegNormal;
    }


    /**
     * Gets the valorNFS value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg90.
     * 
     * @return valorNFS
     */
    public double getValorNFS() {
        return valorNFS;
    }


    /**
     * Sets the valorNFS value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg90.
     * 
     * @param valorNFS
     */
    public void setValorNFS(double valorNFS) {
        this.valorNFS = valorNFS;
    }


    /**
     * Gets the valorISS value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg90.
     * 
     * @return valorISS
     */
    public double getValorISS() {
        return valorISS;
    }


    /**
     * Sets the valorISS value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg90.
     * 
     * @param valorISS
     */
    public void setValorISS(double valorISS) {
        this.valorISS = valorISS;
    }


    /**
     * Gets the valorDed value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg90.
     * 
     * @return valorDed
     */
    public double getValorDed() {
        return valorDed;
    }


    /**
     * Sets the valorDed value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg90.
     * 
     * @param valorDed
     */
    public void setValorDed(double valorDed) {
        this.valorDed = valorDed;
    }


    /**
     * Gets the valorIssRet value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg90.
     * 
     * @return valorIssRet
     */
    public double getValorIssRet() {
        return valorIssRet;
    }


    /**
     * Sets the valorIssRet value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg90.
     * 
     * @param valorIssRet
     */
    public void setValorIssRet(double valorIssRet) {
        this.valorIssRet = valorIssRet;
    }


    /**
     * Gets the qtdReg30 value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg90.
     * 
     * @return qtdReg30
     */
    public int getQtdReg30() {
        return qtdReg30;
    }


    /**
     * Sets the qtdReg30 value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg90.
     * 
     * @param qtdReg30
     */
    public void setQtdReg30(int qtdReg30) {
        this.qtdReg30 = qtdReg30;
    }


    /**
     * Gets the valorTributos value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg90.
     * 
     * @return valorTributos
     */
    public double getValorTributos() {
        return valorTributos;
    }


    /**
     * Sets the valorTributos value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg90.
     * 
     * @param valorTributos
     */
    public void setValorTributos(double valorTributos) {
        this.valorTributos = valorTributos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SDT_ConsultaNotasProtocoloOutXML_NotasReg90)) return false;
        SDT_ConsultaNotasProtocoloOutXML_NotasReg90 other = (SDT_ConsultaNotasProtocoloOutXML_NotasReg90) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.qtdRegNormal == other.getQtdRegNormal() &&
            this.valorNFS == other.getValorNFS() &&
            this.valorISS == other.getValorISS() &&
            this.valorDed == other.getValorDed() &&
            this.valorIssRet == other.getValorIssRet() &&
            this.qtdReg30 == other.getQtdReg30() &&
            this.valorTributos == other.getValorTributos();
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
        _hashCode += getQtdRegNormal();
        _hashCode += new Double(getValorNFS()).hashCode();
        _hashCode += new Double(getValorISS()).hashCode();
        _hashCode += new Double(getValorDed()).hashCode();
        _hashCode += new Double(getValorIssRet()).hashCode();
        _hashCode += getQtdReg30();
        _hashCode += new Double(getValorTributos()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SDT_ConsultaNotasProtocoloOutXML_NotasReg90.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("NFe", "SDT_ConsultaNotasProtocoloOut.XML_Notas.Reg90"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdRegNormal");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "QtdRegNormal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorNFS");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "ValorNFS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorISS");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "ValorISS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorDed");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "ValorDed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorIssRet");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "ValorIssRet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdReg30");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "QtdReg30"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorTributos");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "ValorTributos"));
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
