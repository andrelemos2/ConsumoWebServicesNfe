/**
 * Ws_nfeVERFICARPSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class Ws_nfeVERFICARPSResponse  implements java.io.Serializable {
    private br.com.devplan.nfe.conam.services.Sdt_ProcessarpsOut sdt_processarpsout;

    public Ws_nfeVERFICARPSResponse() {
    }

    public Ws_nfeVERFICARPSResponse(
           br.com.devplan.nfe.conam.services.Sdt_ProcessarpsOut sdt_processarpsout) {
           this.sdt_processarpsout = sdt_processarpsout;
    }


    /**
     * Gets the sdt_processarpsout value for this Ws_nfeVERFICARPSResponse.
     * 
     * @return sdt_processarpsout
     */
    public br.com.devplan.nfe.conam.services.Sdt_ProcessarpsOut getSdt_processarpsout() {
        return sdt_processarpsout;
    }


    /**
     * Sets the sdt_processarpsout value for this Ws_nfeVERFICARPSResponse.
     * 
     * @param sdt_processarpsout
     */
    public void setSdt_processarpsout(br.com.devplan.nfe.conam.services.Sdt_ProcessarpsOut sdt_processarpsout) {
        this.sdt_processarpsout = sdt_processarpsout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ws_nfeVERFICARPSResponse)) return false;
        Ws_nfeVERFICARPSResponse other = (Ws_nfeVERFICARPSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sdt_processarpsout==null && other.getSdt_processarpsout()==null) || 
             (this.sdt_processarpsout!=null &&
              this.sdt_processarpsout.equals(other.getSdt_processarpsout())));
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
        if (getSdt_processarpsout() != null) {
            _hashCode += getSdt_processarpsout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ws_nfeVERFICARPSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("NFe", ">ws_nfe.VERFICARPSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sdt_processarpsout");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Sdt_processarpsout"));
        elemField.setXmlType(new javax.xml.namespace.QName("NFe", "Sdt_ProcessarpsOut"));
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
