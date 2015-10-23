/**
 * Ws_nfeLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class Ws_nfeLocator extends org.apache.axis.client.Service implements br.com.devplan.nfe.conam.services.Ws_nfe {

    public Ws_nfeLocator() {
    }


    public Ws_nfeLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Ws_nfeLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ws_nfeSoapPort
    private java.lang.String ws_nfeSoapPort_address = "https://nfehomologacao.etransparencia.com.br/sp.limeira/webservice/aws_nfe.aspx";

    public java.lang.String getws_nfeSoapPortAddress() {
        return ws_nfeSoapPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ws_nfeSoapPortWSDDServiceName = "ws_nfeSoapPort";

    public java.lang.String getws_nfeSoapPortWSDDServiceName() {
        return ws_nfeSoapPortWSDDServiceName;
    }

    public void setws_nfeSoapPortWSDDServiceName(java.lang.String name) {
        ws_nfeSoapPortWSDDServiceName = name;
    }

    public br.com.devplan.nfe.conam.services.Ws_nfeSoapPort_PortType getws_nfeSoapPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ws_nfeSoapPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getws_nfeSoapPort(endpoint);
    }

    public br.com.devplan.nfe.conam.services.Ws_nfeSoapPort_PortType getws_nfeSoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.devplan.nfe.conam.services.Ws_nfeSoapBindingStub _stub = new br.com.devplan.nfe.conam.services.Ws_nfeSoapBindingStub(portAddress, this);
            _stub.setPortName(getws_nfeSoapPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setws_nfeSoapPortEndpointAddress(java.lang.String address) {
        ws_nfeSoapPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.devplan.nfe.conam.services.Ws_nfeSoapPort_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.devplan.nfe.conam.services.Ws_nfeSoapBindingStub _stub = new br.com.devplan.nfe.conam.services.Ws_nfeSoapBindingStub(new java.net.URL(ws_nfeSoapPort_address), this);
                _stub.setPortName(getws_nfeSoapPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ws_nfeSoapPort".equals(inputPortName)) {
            return getws_nfeSoapPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("NFe", "ws_nfe");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("NFe", "ws_nfeSoapPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ws_nfeSoapPort".equals(portName)) {
            setws_nfeSoapPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
