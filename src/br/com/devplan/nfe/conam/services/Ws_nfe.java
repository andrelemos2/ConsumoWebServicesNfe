/**
 * Ws_nfe.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public interface Ws_nfe extends javax.xml.rpc.Service {
    public java.lang.String getws_nfeSoapPortAddress();

    public br.com.devplan.nfe.conam.services.Ws_nfeSoapPort_PortType getws_nfeSoapPort() throws javax.xml.rpc.ServiceException;

    public br.com.devplan.nfe.conam.services.Ws_nfeSoapPort_PortType getws_nfeSoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
