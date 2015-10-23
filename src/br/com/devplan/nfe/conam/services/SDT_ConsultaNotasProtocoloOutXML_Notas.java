/**
 * SDT_ConsultaNotasProtocoloOutXML_Notas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class SDT_ConsultaNotasProtocoloOutXML_Notas  implements java.io.Serializable {
    private java.lang.String cpfCnpj;

    private java.util.Date dtIni;

    private java.util.Date dtFin;

    private short tipoArq;

    private java.lang.String versao;

    private br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item[] reg20;

    private br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutXML_NotasReg90 reg90;

    public SDT_ConsultaNotasProtocoloOutXML_Notas() {
    }

    public SDT_ConsultaNotasProtocoloOutXML_Notas(
           java.lang.String cpfCnpj,
           java.util.Date dtIni,
           java.util.Date dtFin,
           short tipoArq,
           java.lang.String versao,
           br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item[] reg20,
           br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutXML_NotasReg90 reg90) {
           this.cpfCnpj = cpfCnpj;
           this.dtIni = dtIni;
           this.dtFin = dtFin;
           this.tipoArq = tipoArq;
           this.versao = versao;
           this.reg20 = reg20;
           this.reg90 = reg90;
    }


    /**
     * Gets the cpfCnpj value for this SDT_ConsultaNotasProtocoloOutXML_Notas.
     * 
     * @return cpfCnpj
     */
    public java.lang.String getCpfCnpj() {
        return cpfCnpj;
    }


    /**
     * Sets the cpfCnpj value for this SDT_ConsultaNotasProtocoloOutXML_Notas.
     * 
     * @param cpfCnpj
     */
    public void setCpfCnpj(java.lang.String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }


    /**
     * Gets the dtIni value for this SDT_ConsultaNotasProtocoloOutXML_Notas.
     * 
     * @return dtIni
     */
    public java.util.Date getDtIni() {
        return dtIni;
    }


    /**
     * Sets the dtIni value for this SDT_ConsultaNotasProtocoloOutXML_Notas.
     * 
     * @param dtIni
     */
    public void setDtIni(java.util.Date dtIni) {
        this.dtIni = dtIni;
    }


    /**
     * Gets the dtFin value for this SDT_ConsultaNotasProtocoloOutXML_Notas.
     * 
     * @return dtFin
     */
    public java.util.Date getDtFin() {
        return dtFin;
    }


    /**
     * Sets the dtFin value for this SDT_ConsultaNotasProtocoloOutXML_Notas.
     * 
     * @param dtFin
     */
    public void setDtFin(java.util.Date dtFin) {
        this.dtFin = dtFin;
    }


    /**
     * Gets the tipoArq value for this SDT_ConsultaNotasProtocoloOutXML_Notas.
     * 
     * @return tipoArq
     */
    public short getTipoArq() {
        return tipoArq;
    }


    /**
     * Sets the tipoArq value for this SDT_ConsultaNotasProtocoloOutXML_Notas.
     * 
     * @param tipoArq
     */
    public void setTipoArq(short tipoArq) {
        this.tipoArq = tipoArq;
    }


    /**
     * Gets the versao value for this SDT_ConsultaNotasProtocoloOutXML_Notas.
     * 
     * @return versao
     */
    public java.lang.String getVersao() {
        return versao;
    }


    /**
     * Sets the versao value for this SDT_ConsultaNotasProtocoloOutXML_Notas.
     * 
     * @param versao
     */
    public void setVersao(java.lang.String versao) {
        this.versao = versao;
    }


    /**
     * Gets the reg20 value for this SDT_ConsultaNotasProtocoloOutXML_Notas.
     * 
     * @return reg20
     */
    public br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item[] getReg20() {
        return reg20;
    }


    /**
     * Sets the reg20 value for this SDT_ConsultaNotasProtocoloOutXML_Notas.
     * 
     * @param reg20
     */
    public void setReg20(br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item[] reg20) {
        this.reg20 = reg20;
    }


    /**
     * Gets the reg90 value for this SDT_ConsultaNotasProtocoloOutXML_Notas.
     * 
     * @return reg90
     */
    public br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutXML_NotasReg90 getReg90() {
        return reg90;
    }


    /**
     * Sets the reg90 value for this SDT_ConsultaNotasProtocoloOutXML_Notas.
     * 
     * @param reg90
     */
    public void setReg90(br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutXML_NotasReg90 reg90) {
        this.reg90 = reg90;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SDT_ConsultaNotasProtocoloOutXML_Notas)) return false;
        SDT_ConsultaNotasProtocoloOutXML_Notas other = (SDT_ConsultaNotasProtocoloOutXML_Notas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cpfCnpj==null && other.getCpfCnpj()==null) || 
             (this.cpfCnpj!=null &&
              this.cpfCnpj.equals(other.getCpfCnpj()))) &&
            ((this.dtIni==null && other.getDtIni()==null) || 
             (this.dtIni!=null &&
              this.dtIni.equals(other.getDtIni()))) &&
            ((this.dtFin==null && other.getDtFin()==null) || 
             (this.dtFin!=null &&
              this.dtFin.equals(other.getDtFin()))) &&
            this.tipoArq == other.getTipoArq() &&
            ((this.versao==null && other.getVersao()==null) || 
             (this.versao!=null &&
              this.versao.equals(other.getVersao()))) &&
            ((this.reg20==null && other.getReg20()==null) || 
             (this.reg20!=null &&
              java.util.Arrays.equals(this.reg20, other.getReg20()))) &&
            ((this.reg90==null && other.getReg90()==null) || 
             (this.reg90!=null &&
              this.reg90.equals(other.getReg90())));
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
        if (getCpfCnpj() != null) {
            _hashCode += getCpfCnpj().hashCode();
        }
        if (getDtIni() != null) {
            _hashCode += getDtIni().hashCode();
        }
        if (getDtFin() != null) {
            _hashCode += getDtFin().hashCode();
        }
        _hashCode += getTipoArq();
        if (getVersao() != null) {
            _hashCode += getVersao().hashCode();
        }
        if (getReg20() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReg20());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReg20(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReg90() != null) {
            _hashCode += getReg90().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SDT_ConsultaNotasProtocoloOutXML_Notas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("NFe", "SDT_ConsultaNotasProtocoloOut.XML_Notas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "CpfCnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtIni");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "DtIni"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtFin");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "DtFin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoArq");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "TipoArq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versao");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Versao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reg20");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Reg20"));
        elemField.setXmlType(new javax.xml.namespace.QName("NFe", "SDT_ConsultaNotasProtocoloOut.XML_Notas.Reg20Item"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("NFe", "Reg20Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reg90");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Reg90"));
        elemField.setXmlType(new javax.xml.namespace.QName("NFe", "SDT_ConsultaNotasProtocoloOut.XML_Notas.Reg90"));
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
