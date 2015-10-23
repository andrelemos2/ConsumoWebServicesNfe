/**
 * SDT_ConsultaProtocoloOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class SDT_ConsultaProtocoloOut  implements java.io.Serializable {
    private boolean retorno;

    private byte prtXSts;

    private java.lang.String prtCSerRps;

    private long prtCRps_1;

    private long prtCRps_2;

    private java.util.Calendar prtLPrcIni;

    private java.util.Calendar prtLFinGrv;

    private int pnfCNfe_1;

    private int pnfCnfe_2;

    private br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloOutMessage[] messages;

    public SDT_ConsultaProtocoloOut() {
    }

    public SDT_ConsultaProtocoloOut(
           boolean retorno,
           byte prtXSts,
           java.lang.String prtCSerRps,
           long prtCRps_1,
           long prtCRps_2,
           java.util.Calendar prtLPrcIni,
           java.util.Calendar prtLFinGrv,
           int pnfCNfe_1,
           int pnfCnfe_2,
           br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloOutMessage[] messages) {
           this.retorno = retorno;
           this.prtXSts = prtXSts;
           this.prtCSerRps = prtCSerRps;
           this.prtCRps_1 = prtCRps_1;
           this.prtCRps_2 = prtCRps_2;
           this.prtLPrcIni = prtLPrcIni;
           this.prtLFinGrv = prtLFinGrv;
           this.pnfCNfe_1 = pnfCNfe_1;
           this.pnfCnfe_2 = pnfCnfe_2;
           this.messages = messages;
    }


    /**
     * Gets the retorno value for this SDT_ConsultaProtocoloOut.
     * 
     * @return retorno
     */
    public boolean isRetorno() {
        return retorno;
    }


    /**
     * Sets the retorno value for this SDT_ConsultaProtocoloOut.
     * 
     * @param retorno
     */
    public void setRetorno(boolean retorno) {
        this.retorno = retorno;
    }


    /**
     * Gets the prtXSts value for this SDT_ConsultaProtocoloOut.
     * 
     * @return prtXSts
     */
    public byte getPrtXSts() {
        return prtXSts;
    }


    /**
     * Sets the prtXSts value for this SDT_ConsultaProtocoloOut.
     * 
     * @param prtXSts
     */
    public void setPrtXSts(byte prtXSts) {
        this.prtXSts = prtXSts;
    }


    /**
     * Gets the prtCSerRps value for this SDT_ConsultaProtocoloOut.
     * 
     * @return prtCSerRps
     */
    public java.lang.String getPrtCSerRps() {
        return prtCSerRps;
    }


    /**
     * Sets the prtCSerRps value for this SDT_ConsultaProtocoloOut.
     * 
     * @param prtCSerRps
     */
    public void setPrtCSerRps(java.lang.String prtCSerRps) {
        this.prtCSerRps = prtCSerRps;
    }


    /**
     * Gets the prtCRps_1 value for this SDT_ConsultaProtocoloOut.
     * 
     * @return prtCRps_1
     */
    public long getPrtCRps_1() {
        return prtCRps_1;
    }


    /**
     * Sets the prtCRps_1 value for this SDT_ConsultaProtocoloOut.
     * 
     * @param prtCRps_1
     */
    public void setPrtCRps_1(long prtCRps_1) {
        this.prtCRps_1 = prtCRps_1;
    }


    /**
     * Gets the prtCRps_2 value for this SDT_ConsultaProtocoloOut.
     * 
     * @return prtCRps_2
     */
    public long getPrtCRps_2() {
        return prtCRps_2;
    }


    /**
     * Sets the prtCRps_2 value for this SDT_ConsultaProtocoloOut.
     * 
     * @param prtCRps_2
     */
    public void setPrtCRps_2(long prtCRps_2) {
        this.prtCRps_2 = prtCRps_2;
    }


    /**
     * Gets the prtLPrcIni value for this SDT_ConsultaProtocoloOut.
     * 
     * @return prtLPrcIni
     */
    public java.util.Calendar getPrtLPrcIni() {
        return prtLPrcIni;
    }


    /**
     * Sets the prtLPrcIni value for this SDT_ConsultaProtocoloOut.
     * 
     * @param prtLPrcIni
     */
    public void setPrtLPrcIni(java.util.Calendar prtLPrcIni) {
        this.prtLPrcIni = prtLPrcIni;
    }


    /**
     * Gets the prtLFinGrv value for this SDT_ConsultaProtocoloOut.
     * 
     * @return prtLFinGrv
     */
    public java.util.Calendar getPrtLFinGrv() {
        return prtLFinGrv;
    }


    /**
     * Sets the prtLFinGrv value for this SDT_ConsultaProtocoloOut.
     * 
     * @param prtLFinGrv
     */
    public void setPrtLFinGrv(java.util.Calendar prtLFinGrv) {
        this.prtLFinGrv = prtLFinGrv;
    }


    /**
     * Gets the pnfCNfe_1 value for this SDT_ConsultaProtocoloOut.
     * 
     * @return pnfCNfe_1
     */
    public int getPnfCNfe_1() {
        return pnfCNfe_1;
    }


    /**
     * Sets the pnfCNfe_1 value for this SDT_ConsultaProtocoloOut.
     * 
     * @param pnfCNfe_1
     */
    public void setPnfCNfe_1(int pnfCNfe_1) {
        this.pnfCNfe_1 = pnfCNfe_1;
    }


    /**
     * Gets the pnfCnfe_2 value for this SDT_ConsultaProtocoloOut.
     * 
     * @return pnfCnfe_2
     */
    public int getPnfCnfe_2() {
        return pnfCnfe_2;
    }


    /**
     * Sets the pnfCnfe_2 value for this SDT_ConsultaProtocoloOut.
     * 
     * @param pnfCnfe_2
     */
    public void setPnfCnfe_2(int pnfCnfe_2) {
        this.pnfCnfe_2 = pnfCnfe_2;
    }


    /**
     * Gets the messages value for this SDT_ConsultaProtocoloOut.
     * 
     * @return messages
     */
    public br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloOutMessage[] getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this SDT_ConsultaProtocoloOut.
     * 
     * @param messages
     */
    public void setMessages(br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloOutMessage[] messages) {
        this.messages = messages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SDT_ConsultaProtocoloOut)) return false;
        SDT_ConsultaProtocoloOut other = (SDT_ConsultaProtocoloOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.retorno == other.isRetorno() &&
            this.prtXSts == other.getPrtXSts() &&
            ((this.prtCSerRps==null && other.getPrtCSerRps()==null) || 
             (this.prtCSerRps!=null &&
              this.prtCSerRps.equals(other.getPrtCSerRps()))) &&
            this.prtCRps_1 == other.getPrtCRps_1() &&
            this.prtCRps_2 == other.getPrtCRps_2() &&
            ((this.prtLPrcIni==null && other.getPrtLPrcIni()==null) || 
             (this.prtLPrcIni!=null &&
              this.prtLPrcIni.equals(other.getPrtLPrcIni()))) &&
            ((this.prtLFinGrv==null && other.getPrtLFinGrv()==null) || 
             (this.prtLFinGrv!=null &&
              this.prtLFinGrv.equals(other.getPrtLFinGrv()))) &&
            this.pnfCNfe_1 == other.getPnfCNfe_1() &&
            this.pnfCnfe_2 == other.getPnfCnfe_2() &&
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
        _hashCode += getPrtXSts();
        if (getPrtCSerRps() != null) {
            _hashCode += getPrtCSerRps().hashCode();
        }
        _hashCode += new Long(getPrtCRps_1()).hashCode();
        _hashCode += new Long(getPrtCRps_2()).hashCode();
        if (getPrtLPrcIni() != null) {
            _hashCode += getPrtLPrcIni().hashCode();
        }
        if (getPrtLFinGrv() != null) {
            _hashCode += getPrtLFinGrv().hashCode();
        }
        _hashCode += getPnfCNfe_1();
        _hashCode += getPnfCnfe_2();
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
        new org.apache.axis.description.TypeDesc(SDT_ConsultaProtocoloOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("NFe", "SDT_ConsultaProtocoloOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retorno");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Retorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prtXSts");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "PrtXSts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prtCSerRps");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "PrtCSerRps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prtCRps_1");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "PrtCRps_1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prtCRps_2");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "PrtCRps_2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prtLPrcIni");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "PrtLPrcIni"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prtLFinGrv");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "PrtLFinGrv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnfCNfe_1");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "PnfCNfe_1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnfCnfe_2");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "PnfCnfe_2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messages");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Messages"));
        elemField.setXmlType(new javax.xml.namespace.QName("NFe", "SDT_ConsultaProtocoloOut.Message"));
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
