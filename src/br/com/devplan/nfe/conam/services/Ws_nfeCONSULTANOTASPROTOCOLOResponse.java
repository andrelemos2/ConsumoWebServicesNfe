/**
 * Ws_nfeCONSULTANOTASPROTOCOLOResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class Ws_nfeCONSULTANOTASPROTOCOLOResponse  implements java.io.Serializable {
    private br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOut sdt_consultanotasprotocoloout;

    public Ws_nfeCONSULTANOTASPROTOCOLOResponse() {
    }

    public Ws_nfeCONSULTANOTASPROTOCOLOResponse(
           br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOut sdt_consultanotasprotocoloout) {
           this.sdt_consultanotasprotocoloout = sdt_consultanotasprotocoloout;
    }


    /**
     * Gets the sdt_consultanotasprotocoloout value for this Ws_nfeCONSULTANOTASPROTOCOLOResponse.
     * 
     * @return sdt_consultanotasprotocoloout
     */
    public br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOut getSdt_consultanotasprotocoloout() {
        return sdt_consultanotasprotocoloout;
    }


    /**
     * Sets the sdt_consultanotasprotocoloout value for this Ws_nfeCONSULTANOTASPROTOCOLOResponse.
     * 
     * @param sdt_consultanotasprotocoloout
     */
    public void setSdt_consultanotasprotocoloout(br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOut sdt_consultanotasprotocoloout) {
        this.sdt_consultanotasprotocoloout = sdt_consultanotasprotocoloout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws_nfeCONSULTANOTASPROTOCOLOResponse)) return false;
        Ws_nfeCONSULTANOTASPROTOCOLOResponse other = (Ws_nfeCONSULTANOTASPROTOCOLOResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sdt_consultanotasprotocoloout==null && other.getSdt_consultanotasprotocoloout()==null) || 
             (this.sdt_consultanotasprotocoloout!=null &&
              this.sdt_consultanotasprotocoloout.equals(other.getSdt_consultanotasprotocoloout())));
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
        if (getSdt_consultanotasprotocoloout() != null) {
            _hashCode += getSdt_consultanotasprotocoloout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ws_nfeCONSULTANOTASPROTOCOLOResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("NFe", ">ws_nfe.CONSULTANOTASPROTOCOLOResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sdt_consultanotasprotocoloout");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Sdt_consultanotasprotocoloout"));
        elemField.setXmlType(new javax.xml.namespace.QName("NFe", "SDT_ConsultaNotasProtocoloOut"));
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
