/**
 * Sdt_CancelaNFENota.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class Sdt_CancelaNFENota  implements java.io.Serializable {
    private java.lang.String serieNota;

    private int numeroNota;

    private java.lang.String serieRPS;

    private int numeroRps;

    private double valorNota;

    private java.lang.String motivoCancelamento;

    private java.lang.String podeCancelarGuia;

    public Sdt_CancelaNFENota() {
    }

    public Sdt_CancelaNFENota(
           java.lang.String serieNota,
           int numeroNota,
           java.lang.String serieRPS,
           int numeroRps,
           double valorNota,
           java.lang.String motivoCancelamento,
           java.lang.String podeCancelarGuia) {
           this.serieNota = serieNota;
           this.numeroNota = numeroNota;
           this.serieRPS = serieRPS;
           this.numeroRps = numeroRps;
           this.valorNota = valorNota;
           this.motivoCancelamento = motivoCancelamento;
           this.podeCancelarGuia = podeCancelarGuia;
    }


    /**
     * Gets the serieNota value for this Sdt_CancelaNFENota.
     * 
     * @return serieNota
     */
    public java.lang.String getSerieNota() {
        return serieNota;
    }


    /**
     * Sets the serieNota value for this Sdt_CancelaNFENota.
     * 
     * @param serieNota
     */
    public void setSerieNota(java.lang.String serieNota) {
        this.serieNota = serieNota;
    }


    /**
     * Gets the numeroNota value for this Sdt_CancelaNFENota.
     * 
     * @return numeroNota
     */
    public int getNumeroNota() {
        return numeroNota;
    }


    /**
     * Sets the numeroNota value for this Sdt_CancelaNFENota.
     * 
     * @param numeroNota
     */
    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }


    /**
     * Gets the serieRPS value for this Sdt_CancelaNFENota.
     * 
     * @return serieRPS
     */
    public java.lang.String getSerieRPS() {
        return serieRPS;
    }


    /**
     * Sets the serieRPS value for this Sdt_CancelaNFENota.
     * 
     * @param serieRPS
     */
    public void setSerieRPS(java.lang.String serieRPS) {
        this.serieRPS = serieRPS;
    }


    /**
     * Gets the numeroRps value for this Sdt_CancelaNFENota.
     * 
     * @return numeroRps
     */
    public int getNumeroRps() {
        return numeroRps;
    }


    /**
     * Sets the numeroRps value for this Sdt_CancelaNFENota.
     * 
     * @param numeroRps
     */
    public void setNumeroRps(int numeroRps) {
        this.numeroRps = numeroRps;
    }


    /**
     * Gets the valorNota value for this Sdt_CancelaNFENota.
     * 
     * @return valorNota
     */
    public double getValorNota() {
        return valorNota;
    }


    /**
     * Sets the valorNota value for this Sdt_CancelaNFENota.
     * 
     * @param valorNota
     */
    public void setValorNota(double valorNota) {
        this.valorNota = valorNota;
    }


    /**
     * Gets the motivoCancelamento value for this Sdt_CancelaNFENota.
     * 
     * @return motivoCancelamento
     */
    public java.lang.String getMotivoCancelamento() {
        return motivoCancelamento;
    }


    /**
     * Sets the motivoCancelamento value for this Sdt_CancelaNFENota.
     * 
     * @param motivoCancelamento
     */
    public void setMotivoCancelamento(java.lang.String motivoCancelamento) {
        this.motivoCancelamento = motivoCancelamento;
    }


    /**
     * Gets the podeCancelarGuia value for this Sdt_CancelaNFENota.
     * 
     * @return podeCancelarGuia
     */
    public java.lang.String getPodeCancelarGuia() {
        return podeCancelarGuia;
    }


    /**
     * Sets the podeCancelarGuia value for this Sdt_CancelaNFENota.
     * 
     * @param podeCancelarGuia
     */
    public void setPodeCancelarGuia(java.lang.String podeCancelarGuia) {
        this.podeCancelarGuia = podeCancelarGuia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sdt_CancelaNFENota)) return false;
        Sdt_CancelaNFENota other = (Sdt_CancelaNFENota) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serieNota==null && other.getSerieNota()==null) || 
             (this.serieNota!=null &&
              this.serieNota.equals(other.getSerieNota()))) &&
            this.numeroNota == other.getNumeroNota() &&
            ((this.serieRPS==null && other.getSerieRPS()==null) || 
             (this.serieRPS!=null &&
              this.serieRPS.equals(other.getSerieRPS()))) &&
            this.numeroRps == other.getNumeroRps() &&
            this.valorNota == other.getValorNota() &&
            ((this.motivoCancelamento==null && other.getMotivoCancelamento()==null) || 
             (this.motivoCancelamento!=null &&
              this.motivoCancelamento.equals(other.getMotivoCancelamento()))) &&
            ((this.podeCancelarGuia==null && other.getPodeCancelarGuia()==null) || 
             (this.podeCancelarGuia!=null &&
              this.podeCancelarGuia.equals(other.getPodeCancelarGuia())));
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
        if (getSerieNota() != null) {
            _hashCode += getSerieNota().hashCode();
        }
        _hashCode += getNumeroNota();
        if (getSerieRPS() != null) {
            _hashCode += getSerieRPS().hashCode();
        }
        _hashCode += getNumeroRps();
        _hashCode += new Double(getValorNota()).hashCode();
        if (getMotivoCancelamento() != null) {
            _hashCode += getMotivoCancelamento().hashCode();
        }
        if (getPodeCancelarGuia() != null) {
            _hashCode += getPodeCancelarGuia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sdt_CancelaNFENota.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("NFe", "Sdt_CancelaNFE.Nota"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serieNota");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "SerieNota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroNota");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "NumeroNota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serieRPS");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "SerieRPS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroRps");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "NumeroRps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorNota");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "ValorNota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivoCancelamento");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "MotivoCancelamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("podeCancelarGuia");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "PodeCancelarGuia"));
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
