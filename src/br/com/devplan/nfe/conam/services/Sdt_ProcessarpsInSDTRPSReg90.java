/**
 * Sdt_ProcessarpsInSDTRPSReg90.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class Sdt_ProcessarpsInSDTRPSReg90  implements java.io.Serializable {
    private java.lang.String qtdRegNormal;

    private java.lang.String valorNFS;

    private java.lang.String valorISS;

    private java.lang.String valorDed;

    private java.lang.String valorIssRetTom;

    private java.lang.String qtdReg30;

    private java.lang.String valorTributos;

    public Sdt_ProcessarpsInSDTRPSReg90() {
    }

    public Sdt_ProcessarpsInSDTRPSReg90(
           java.lang.String qtdRegNormal,
           java.lang.String valorNFS,
           java.lang.String valorISS,
           java.lang.String valorDed,
           java.lang.String valorIssRetTom,
           java.lang.String qtdReg30,
           java.lang.String valorTributos) {
           this.qtdRegNormal = qtdRegNormal;
           this.valorNFS = valorNFS;
           this.valorISS = valorISS;
           this.valorDed = valorDed;
           this.valorIssRetTom = valorIssRetTom;
           this.qtdReg30 = qtdReg30;
           this.valorTributos = valorTributos;
    }


    /**
     * Gets the qtdRegNormal value for this Sdt_ProcessarpsInSDTRPSReg90.
     * 
     * @return qtdRegNormal
     */
    public java.lang.String getQtdRegNormal() {
        return qtdRegNormal;
    }


    /**
     * Sets the qtdRegNormal value for this Sdt_ProcessarpsInSDTRPSReg90.
     * 
     * @param qtdRegNormal
     */
    public void setQtdRegNormal(java.lang.String qtdRegNormal) {
        this.qtdRegNormal = qtdRegNormal;
    }


    /**
     * Gets the valorNFS value for this Sdt_ProcessarpsInSDTRPSReg90.
     * 
     * @return valorNFS
     */
    public java.lang.String getValorNFS() {
        return valorNFS;
    }


    /**
     * Sets the valorNFS value for this Sdt_ProcessarpsInSDTRPSReg90.
     * 
     * @param valorNFS
     */
    public void setValorNFS(java.lang.String valorNFS) {
        this.valorNFS = valorNFS;
    }


    /**
     * Gets the valorISS value for this Sdt_ProcessarpsInSDTRPSReg90.
     * 
     * @return valorISS
     */
    public java.lang.String getValorISS() {
        return valorISS;
    }


    /**
     * Sets the valorISS value for this Sdt_ProcessarpsInSDTRPSReg90.
     * 
     * @param valorISS
     */
    public void setValorISS(java.lang.String valorISS) {
        this.valorISS = valorISS;
    }


    /**
     * Gets the valorDed value for this Sdt_ProcessarpsInSDTRPSReg90.
     * 
     * @return valorDed
     */
    public java.lang.String getValorDed() {
        return valorDed;
    }


    /**
     * Sets the valorDed value for this Sdt_ProcessarpsInSDTRPSReg90.
     * 
     * @param valorDed
     */
    public void setValorDed(java.lang.String valorDed) {
        this.valorDed = valorDed;
    }


    /**
     * Gets the valorIssRetTom value for this Sdt_ProcessarpsInSDTRPSReg90.
     * 
     * @return valorIssRetTom
     */
    public java.lang.String getValorIssRetTom() {
        return valorIssRetTom;
    }


    /**
     * Sets the valorIssRetTom value for this Sdt_ProcessarpsInSDTRPSReg90.
     * 
     * @param valorIssRetTom
     */
    public void setValorIssRetTom(java.lang.String valorIssRetTom) {
        this.valorIssRetTom = valorIssRetTom;
    }


    /**
     * Gets the qtdReg30 value for this Sdt_ProcessarpsInSDTRPSReg90.
     * 
     * @return qtdReg30
     */
    public java.lang.String getQtdReg30() {
        return qtdReg30;
    }


    /**
     * Sets the qtdReg30 value for this Sdt_ProcessarpsInSDTRPSReg90.
     * 
     * @param qtdReg30
     */
    public void setQtdReg30(java.lang.String qtdReg30) {
        this.qtdReg30 = qtdReg30;
    }


    /**
     * Gets the valorTributos value for this Sdt_ProcessarpsInSDTRPSReg90.
     * 
     * @return valorTributos
     */
    public java.lang.String getValorTributos() {
        return valorTributos;
    }


    /**
     * Sets the valorTributos value for this Sdt_ProcessarpsInSDTRPSReg90.
     * 
     * @param valorTributos
     */
    public void setValorTributos(java.lang.String valorTributos) {
        this.valorTributos = valorTributos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sdt_ProcessarpsInSDTRPSReg90)) return false;
        Sdt_ProcessarpsInSDTRPSReg90 other = (Sdt_ProcessarpsInSDTRPSReg90) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.qtdRegNormal==null && other.getQtdRegNormal()==null) || 
             (this.qtdRegNormal!=null &&
              this.qtdRegNormal.equals(other.getQtdRegNormal()))) &&
            ((this.valorNFS==null && other.getValorNFS()==null) || 
             (this.valorNFS!=null &&
              this.valorNFS.equals(other.getValorNFS()))) &&
            ((this.valorISS==null && other.getValorISS()==null) || 
             (this.valorISS!=null &&
              this.valorISS.equals(other.getValorISS()))) &&
            ((this.valorDed==null && other.getValorDed()==null) || 
             (this.valorDed!=null &&
              this.valorDed.equals(other.getValorDed()))) &&
            ((this.valorIssRetTom==null && other.getValorIssRetTom()==null) || 
             (this.valorIssRetTom!=null &&
              this.valorIssRetTom.equals(other.getValorIssRetTom()))) &&
            ((this.qtdReg30==null && other.getQtdReg30()==null) || 
             (this.qtdReg30!=null &&
              this.qtdReg30.equals(other.getQtdReg30()))) &&
            ((this.valorTributos==null && other.getValorTributos()==null) || 
             (this.valorTributos!=null &&
              this.valorTributos.equals(other.getValorTributos())));
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
        if (getQtdRegNormal() != null) {
            _hashCode += getQtdRegNormal().hashCode();
        }
        if (getValorNFS() != null) {
            _hashCode += getValorNFS().hashCode();
        }
        if (getValorISS() != null) {
            _hashCode += getValorISS().hashCode();
        }
        if (getValorDed() != null) {
            _hashCode += getValorDed().hashCode();
        }
        if (getValorIssRetTom() != null) {
            _hashCode += getValorIssRetTom().hashCode();
        }
        if (getQtdReg30() != null) {
            _hashCode += getQtdReg30().hashCode();
        }
        if (getValorTributos() != null) {
            _hashCode += getValorTributos().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sdt_ProcessarpsInSDTRPSReg90.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("NFe", "Sdt_ProcessarpsIn.SDTRPS.Reg90"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdRegNormal");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "QtdRegNormal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorNFS");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "ValorNFS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorISS");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "ValorISS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorDed");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "ValorDed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorIssRetTom");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "ValorIssRetTom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdReg30");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "QtdReg30"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorTributos");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "ValorTributos"));
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
