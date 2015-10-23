/**
 * Ws_nfeCONSULTANOTASPROTOCOLO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class Ws_nfeCONSULTANOTASPROTOCOLO  implements java.io.Serializable {
    private br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloIn sdt_consultanotasprotocoloin;

    public Ws_nfeCONSULTANOTASPROTOCOLO() {
    }

    public Ws_nfeCONSULTANOTASPROTOCOLO(
           br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloIn sdt_consultanotasprotocoloin) {
           this.sdt_consultanotasprotocoloin = sdt_consultanotasprotocoloin;
    }


    /**
     * Gets the sdt_consultanotasprotocoloin value for this Ws_nfeCONSULTANOTASPROTOCOLO.
     * 
     * @return sdt_consultanotasprotocoloin
     */
    public br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloIn getSdt_consultanotasprotocoloin() {
        return sdt_consultanotasprotocoloin;
    }


    /**
     * Sets the sdt_consultanotasprotocoloin value for this Ws_nfeCONSULTANOTASPROTOCOLO.
     * 
     * @param sdt_consultanotasprotocoloin
     */
    public void setSdt_consultanotasprotocoloin(br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloIn sdt_consultanotasprotocoloin) {
        this.sdt_consultanotasprotocoloin = sdt_consultanotasprotocoloin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws_nfeCONSULTANOTASPROTOCOLO)) return false;
        Ws_nfeCONSULTANOTASPROTOCOLO other = (Ws_nfeCONSULTANOTASPROTOCOLO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sdt_consultanotasprotocoloin==null && other.getSdt_consultanotasprotocoloin()==null) || 
             (this.sdt_consultanotasprotocoloin!=null &&
              this.sdt_consultanotasprotocoloin.equals(other.getSdt_consultanotasprotocoloin())));
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
        if (getSdt_consultanotasprotocoloin() != null) {
            _hashCode += getSdt_consultanotasprotocoloin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ws_nfeCONSULTANOTASPROTOCOLO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("NFe", ">ws_nfe.CONSULTANOTASPROTOCOLO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sdt_consultanotasprotocoloin");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Sdt_consultanotasprotocoloin"));
        elemField.setXmlType(new javax.xml.namespace.QName("NFe", "SDT_ConsultaProtocoloIn"));
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
