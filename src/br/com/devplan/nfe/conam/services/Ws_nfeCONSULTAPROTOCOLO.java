/**
 * Ws_nfeCONSULTAPROTOCOLO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class Ws_nfeCONSULTAPROTOCOLO  implements java.io.Serializable {
    private br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloIn sdt_consultaprotocoloin;

    public Ws_nfeCONSULTAPROTOCOLO() {
    }

    public Ws_nfeCONSULTAPROTOCOLO(
           br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloIn sdt_consultaprotocoloin) {
           this.sdt_consultaprotocoloin = sdt_consultaprotocoloin;
    }


    /**
     * Gets the sdt_consultaprotocoloin value for this Ws_nfeCONSULTAPROTOCOLO.
     * 
     * @return sdt_consultaprotocoloin
     */
    public br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloIn getSdt_consultaprotocoloin() {
        return sdt_consultaprotocoloin;
    }


    /**
     * Sets the sdt_consultaprotocoloin value for this Ws_nfeCONSULTAPROTOCOLO.
     * 
     * @param sdt_consultaprotocoloin
     */
    public void setSdt_consultaprotocoloin(br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloIn sdt_consultaprotocoloin) {
        this.sdt_consultaprotocoloin = sdt_consultaprotocoloin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws_nfeCONSULTAPROTOCOLO)) return false;
        Ws_nfeCONSULTAPROTOCOLO other = (Ws_nfeCONSULTAPROTOCOLO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sdt_consultaprotocoloin==null && other.getSdt_consultaprotocoloin()==null) || 
             (this.sdt_consultaprotocoloin!=null &&
              this.sdt_consultaprotocoloin.equals(other.getSdt_consultaprotocoloin())));
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
        if (getSdt_consultaprotocoloin() != null) {
            _hashCode += getSdt_consultaprotocoloin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ws_nfeCONSULTAPROTOCOLO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("NFe", ">ws_nfe.CONSULTAPROTOCOLO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sdt_consultaprotocoloin");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Sdt_consultaprotocoloin"));
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
