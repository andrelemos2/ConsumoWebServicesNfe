/**
 * Sdt_ProcessarpsInSDTRPS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class Sdt_ProcessarpsInSDTRPS  implements java.io.Serializable {
    private java.lang.String ano;

    private java.lang.String mes;

    private java.lang.String CPFCNPJ;

    private java.lang.String DTIni;

    private java.lang.String DTFin;

    private java.lang.String tipoTrib;

    private java.lang.String dtAdeSN;

    private java.lang.String alqIssSN_IP;

    private java.lang.String versao;

    private br.com.devplan.nfe.conam.services.Sdt_ProcessarpsInSDTRPSReg20Item[] reg20;

    private br.com.devplan.nfe.conam.services.Sdt_ProcessarpsInSDTRPSReg90 reg90;

    public Sdt_ProcessarpsInSDTRPS() {
    }

    public Sdt_ProcessarpsInSDTRPS(
           java.lang.String ano,
           java.lang.String mes,
           java.lang.String CPFCNPJ,
           java.lang.String DTIni,
           java.lang.String DTFin,
           java.lang.String tipoTrib,
           java.lang.String dtAdeSN,
           java.lang.String alqIssSN_IP,
           java.lang.String versao,
           br.com.devplan.nfe.conam.services.Sdt_ProcessarpsInSDTRPSReg20Item[] reg20,
           br.com.devplan.nfe.conam.services.Sdt_ProcessarpsInSDTRPSReg90 reg90) {
           this.ano = ano;
           this.mes = mes;
           this.CPFCNPJ = CPFCNPJ;
           this.DTIni = DTIni;
           this.DTFin = DTFin;
           this.tipoTrib = tipoTrib;
           this.dtAdeSN = dtAdeSN;
           this.alqIssSN_IP = alqIssSN_IP;
           this.versao = versao;
           this.reg20 = reg20;
           this.reg90 = reg90;
    }


    /**
     * Gets the ano value for this Sdt_ProcessarpsInSDTRPS.
     * 
     * @return ano
     */
    public java.lang.String getAno() {
        return ano;
    }


    /**
     * Sets the ano value for this Sdt_ProcessarpsInSDTRPS.
     * 
     * @param ano
     */
    public void setAno(java.lang.String ano) {
        this.ano = ano;
    }


    /**
     * Gets the mes value for this Sdt_ProcessarpsInSDTRPS.
     * 
     * @return mes
     */
    public java.lang.String getMes() {
        return mes;
    }


    /**
     * Sets the mes value for this Sdt_ProcessarpsInSDTRPS.
     * 
     * @param mes
     */
    public void setMes(java.lang.String mes) {
        this.mes = mes;
    }


    /**
     * Gets the CPFCNPJ value for this Sdt_ProcessarpsInSDTRPS.
     * 
     * @return CPFCNPJ
     */
    public java.lang.String getCPFCNPJ() {
        return CPFCNPJ;
    }


    /**
     * Sets the CPFCNPJ value for this Sdt_ProcessarpsInSDTRPS.
     * 
     * @param CPFCNPJ
     */
    public void setCPFCNPJ(java.lang.String CPFCNPJ) {
        this.CPFCNPJ = CPFCNPJ;
    }


    /**
     * Gets the DTIni value for this Sdt_ProcessarpsInSDTRPS.
     * 
     * @return DTIni
     */
    public java.lang.String getDTIni() {
        return DTIni;
    }


    /**
     * Sets the DTIni value for this Sdt_ProcessarpsInSDTRPS.
     * 
     * @param DTIni
     */
    public void setDTIni(java.lang.String DTIni) {
        this.DTIni = DTIni;
    }


    /**
     * Gets the DTFin value for this Sdt_ProcessarpsInSDTRPS.
     * 
     * @return DTFin
     */
    public java.lang.String getDTFin() {
        return DTFin;
    }


    /**
     * Sets the DTFin value for this Sdt_ProcessarpsInSDTRPS.
     * 
     * @param DTFin
     */
    public void setDTFin(java.lang.String DTFin) {
        this.DTFin = DTFin;
    }


    /**
     * Gets the tipoTrib value for this Sdt_ProcessarpsInSDTRPS.
     * 
     * @return tipoTrib
     */
    public java.lang.String getTipoTrib() {
        return tipoTrib;
    }


    /**
     * Sets the tipoTrib value for this Sdt_ProcessarpsInSDTRPS.
     * 
     * @param tipoTrib
     */
    public void setTipoTrib(java.lang.String tipoTrib) {
        this.tipoTrib = tipoTrib;
    }


    /**
     * Gets the dtAdeSN value for this Sdt_ProcessarpsInSDTRPS.
     * 
     * @return dtAdeSN
     */
    public java.lang.String getDtAdeSN() {
        return dtAdeSN;
    }


    /**
     * Sets the dtAdeSN value for this Sdt_ProcessarpsInSDTRPS.
     * 
     * @param dtAdeSN
     */
    public void setDtAdeSN(java.lang.String dtAdeSN) {
        this.dtAdeSN = dtAdeSN;
    }


    /**
     * Gets the alqIssSN_IP value for this Sdt_ProcessarpsInSDTRPS.
     * 
     * @return alqIssSN_IP
     */
    public java.lang.String getAlqIssSN_IP() {
        return alqIssSN_IP;
    }


    /**
     * Sets the alqIssSN_IP value for this Sdt_ProcessarpsInSDTRPS.
     * 
     * @param alqIssSN_IP
     */
    public void setAlqIssSN_IP(java.lang.String alqIssSN_IP) {
        this.alqIssSN_IP = alqIssSN_IP;
    }


    /**
     * Gets the versao value for this Sdt_ProcessarpsInSDTRPS.
     * 
     * @return versao
     */
    public java.lang.String getVersao() {
        return versao;
    }


    /**
     * Sets the versao value for this Sdt_ProcessarpsInSDTRPS.
     * 
     * @param versao
     */
    public void setVersao(java.lang.String versao) {
        this.versao = versao;
    }


    /**
     * Gets the reg20 value for this Sdt_ProcessarpsInSDTRPS.
     * 
     * @return reg20
     */
    public br.com.devplan.nfe.conam.services.Sdt_ProcessarpsInSDTRPSReg20Item[] getReg20() {
        return reg20;
    }


    /**
     * Sets the reg20 value for this Sdt_ProcessarpsInSDTRPS.
     * 
     * @param reg20
     */
    public void setReg20(br.com.devplan.nfe.conam.services.Sdt_ProcessarpsInSDTRPSReg20Item[] reg20) {
        this.reg20 = reg20;
    }


    /**
     * Gets the reg90 value for this Sdt_ProcessarpsInSDTRPS.
     * 
     * @return reg90
     */
    public br.com.devplan.nfe.conam.services.Sdt_ProcessarpsInSDTRPSReg90 getReg90() {
        return reg90;
    }


    /**
     * Sets the reg90 value for this Sdt_ProcessarpsInSDTRPS.
     * 
     * @param reg90
     */
    public void setReg90(br.com.devplan.nfe.conam.services.Sdt_ProcessarpsInSDTRPSReg90 reg90) {
        this.reg90 = reg90;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sdt_ProcessarpsInSDTRPS)) return false;
        Sdt_ProcessarpsInSDTRPS other = (Sdt_ProcessarpsInSDTRPS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ano==null && other.getAno()==null) || 
             (this.ano!=null &&
              this.ano.equals(other.getAno()))) &&
            ((this.mes==null && other.getMes()==null) || 
             (this.mes!=null &&
              this.mes.equals(other.getMes()))) &&
            ((this.CPFCNPJ==null && other.getCPFCNPJ()==null) || 
             (this.CPFCNPJ!=null &&
              this.CPFCNPJ.equals(other.getCPFCNPJ()))) &&
            ((this.DTIni==null && other.getDTIni()==null) || 
             (this.DTIni!=null &&
              this.DTIni.equals(other.getDTIni()))) &&
            ((this.DTFin==null && other.getDTFin()==null) || 
             (this.DTFin!=null &&
              this.DTFin.equals(other.getDTFin()))) &&
            ((this.tipoTrib==null && other.getTipoTrib()==null) || 
             (this.tipoTrib!=null &&
              this.tipoTrib.equals(other.getTipoTrib()))) &&
            ((this.dtAdeSN==null && other.getDtAdeSN()==null) || 
             (this.dtAdeSN!=null &&
              this.dtAdeSN.equals(other.getDtAdeSN()))) &&
            ((this.alqIssSN_IP==null && other.getAlqIssSN_IP()==null) || 
             (this.alqIssSN_IP!=null &&
              this.alqIssSN_IP.equals(other.getAlqIssSN_IP()))) &&
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
        if (getAno() != null) {
            _hashCode += getAno().hashCode();
        }
        if (getMes() != null) {
            _hashCode += getMes().hashCode();
        }
        if (getCPFCNPJ() != null) {
            _hashCode += getCPFCNPJ().hashCode();
        }
        if (getDTIni() != null) {
            _hashCode += getDTIni().hashCode();
        }
        if (getDTFin() != null) {
            _hashCode += getDTFin().hashCode();
        }
        if (getTipoTrib() != null) {
            _hashCode += getTipoTrib().hashCode();
        }
        if (getDtAdeSN() != null) {
            _hashCode += getDtAdeSN().hashCode();
        }
        if (getAlqIssSN_IP() != null) {
            _hashCode += getAlqIssSN_IP().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(Sdt_ProcessarpsInSDTRPS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("NFe", "Sdt_ProcessarpsIn.SDTRPS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ano");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Ano"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mes");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Mes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CPFCNPJ");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "CPFCNPJ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DTIni");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "DTIni"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DTFin");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "DTFin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoTrib");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "TipoTrib"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtAdeSN");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "DtAdeSN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alqIssSN_IP");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "AlqIssSN_IP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("NFe", "Sdt_ProcessarpsIn.SDTRPS.Reg20Item"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("NFe", "Reg20Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reg90");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Reg90"));
        elemField.setXmlType(new javax.xml.namespace.QName("NFe", "Sdt_ProcessarpsIn.SDTRPS.Reg90"));
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
