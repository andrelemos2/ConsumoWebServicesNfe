/**
 * Ws_nfeCONSULTAPROTOCOLOResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class Ws_nfeCONSULTAPROTOCOLOResponse  implements java.io.Serializable {
    private br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloOut sdt_consultaprotocoloout;

    public Ws_nfeCONSULTAPROTOCOLOResponse() {
    }

    public Ws_nfeCONSULTAPROTOCOLOResponse(
           br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloOut sdt_consultaprotocoloout) {
           this.sdt_consultaprotocoloout = sdt_consultaprotocoloout;
    }


    /**
     * Gets the sdt_consultaprotocoloout value for this Ws_nfeCONSULTAPROTOCOLOResponse.
     * 
     * @return sdt_consultaprotocoloout
     */
    public br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloOut getSdt_consultaprotocoloout() {
        return sdt_consultaprotocoloout;
    }


    /**
     * Sets the sdt_consultaprotocoloout value for this Ws_nfeCONSULTAPROTOCOLOResponse.
     * 
     * @param sdt_consultaprotocoloout
     */
    public void setSdt_consultaprotocoloout(br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloOut sdt_consultaprotocoloout) {
        this.sdt_consultaprotocoloout = sdt_consultaprotocoloout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws_nfeCONSULTAPROTOCOLOResponse)) return false;
        Ws_nfeCONSULTAPROTOCOLOResponse other = (Ws_nfeCONSULTAPROTOCOLOResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sdt_consultaprotocoloout==null && other.getSdt_consultaprotocoloout()==null) || 
             (this.sdt_consultaprotocoloout!=null &&
              this.sdt_consultaprotocoloout.equals(other.getSdt_consultaprotocoloout())));
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
        if (getSdt_consultaprotocoloout() != null) {
            _hashCode += getSdt_consultaprotocoloout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ws_nfeCONSULTAPROTOCOLOResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("NFe", ">ws_nfe.CONSULTAPROTOCOLOResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sdt_consultaprotocoloout");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Sdt_consultaprotocoloout"));
        elemField.setXmlType(new javax.xml.namespace.QName("NFe", "SDT_ConsultaProtocoloOut"));
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
