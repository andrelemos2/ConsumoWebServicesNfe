/**
 * Ws_nfeSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class Ws_nfeSoapBindingStub extends org.apache.axis.client.Stub implements br.com.devplan.nfe.conam.services.Ws_nfeSoapPort_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PROCESSARPS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("NFe", "ws_nfe.PROCESSARPS"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("NFe", ">ws_nfe.PROCESSARPS"), br.com.devplan.nfe.conam.services.Ws_nfePROCESSARPS.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("NFe", ">ws_nfe.PROCESSARPSResponse"));
        oper.setReturnClass(br.com.devplan.nfe.conam.services.Ws_nfePROCESSARPSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("NFe", "ws_nfe.PROCESSARPSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CONSULTANOTASPROTOCOLO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("NFe", "ws_nfe.CONSULTANOTASPROTOCOLO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("NFe", ">ws_nfe.CONSULTANOTASPROTOCOLO"), br.com.devplan.nfe.conam.services.Ws_nfeCONSULTANOTASPROTOCOLO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("NFe", ">ws_nfe.CONSULTANOTASPROTOCOLOResponse"));
        oper.setReturnClass(br.com.devplan.nfe.conam.services.Ws_nfeCONSULTANOTASPROTOCOLOResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("NFe", "ws_nfe.CONSULTANOTASPROTOCOLOResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CONSULTAPROTOCOLO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("NFe", "ws_nfe.CONSULTAPROTOCOLO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("NFe", ">ws_nfe.CONSULTAPROTOCOLO"), br.com.devplan.nfe.conam.services.Ws_nfeCONSULTAPROTOCOLO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("NFe", ">ws_nfe.CONSULTAPROTOCOLOResponse"));
        oper.setReturnClass(br.com.devplan.nfe.conam.services.Ws_nfeCONSULTAPROTOCOLOResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("NFe", "ws_nfe.CONSULTAPROTOCOLOResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VERFICARPS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("NFe", "ws_nfe.VERFICARPS"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("NFe", ">ws_nfe.VERFICARPS"), br.com.devplan.nfe.conam.services.Ws_nfeVERFICARPS.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("NFe", ">ws_nfe.VERFICARPSResponse"));
        oper.setReturnClass(br.com.devplan.nfe.conam.services.Ws_nfeVERFICARPSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("NFe", "ws_nfe.VERFICARPSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CANCELANOTAELETRONICA");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("NFe", "ws_nfe.CANCELANOTAELETRONICA"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("NFe", ">ws_nfe.CANCELANOTAELETRONICA"), br.com.devplan.nfe.conam.services.Ws_nfeCANCELANOTAELETRONICA.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("NFe", ">ws_nfe.CANCELANOTAELETRONICAResponse"));
        oper.setReturnClass(br.com.devplan.nfe.conam.services.Ws_nfeCANCELANOTAELETRONICAResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("NFe", "ws_nfe.CANCELANOTAELETRONICAResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

    }

    public Ws_nfeSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Ws_nfeSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Ws_nfeSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("NFe", ">SDT_ConsultaNotasProtocoloOut.XML_Notas.Reg20Item>Reg30");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutXML_NotasReg20ItemReg30Item[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("NFe", "SDT_ConsultaNotasProtocoloOut.XML_Notas.Reg20Item.Reg30Item");
            qName2 = new javax.xml.namespace.QName("NFe", "Reg30Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("NFe", ">SDT_ConsultaNotasProtocoloOut.XML_Notas>Reg20");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("NFe", "SDT_ConsultaNotasProtocoloOut.XML_Notas.Reg20Item");
            qName2 = new javax.xml.namespace.QName("NFe", "Reg20Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("NFe", ">SDT_ConsultaNotasProtocoloOut>Messages");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutMessage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("NFe", "SDT_ConsultaNotasProtocoloOut.Message");
            qName2 = new javax.xml.namespace.QName("NFe", "Message");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("NFe", ">SDT_ConsultaProtocoloOut>Messages");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloOutMessage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("NFe", "SDT_ConsultaProtocoloOut.Message");
            qName2 = new javax.xml.namespace.QName("NFe", "Message");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("NFe", ">Sdt_ProcessarpsIn.SDTRPS.Reg20Item>Reg30");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Sdt_ProcessarpsInSDTRPSReg20ItemReg30Item[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("NFe", "Sdt_ProcessarpsIn.SDTRPS.Reg20Item.Reg30Item");
            qName2 = new javax.xml.namespace.QName("NFe", "Reg30Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("NFe", ">Sdt_ProcessarpsIn.SDTRPS>Reg20");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Sdt_ProcessarpsInSDTRPSReg20Item[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("NFe", "Sdt_ProcessarpsIn.SDTRPS.Reg20Item");
            qName2 = new javax.xml.namespace.QName("NFe", "Reg20Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("NFe", ">Sdt_ProcessarpsOut>Messages");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Sdt_ProcessarpsOutMessage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("NFe", "Sdt_ProcessarpsOut.Message");
            qName2 = new javax.xml.namespace.QName("NFe", "Message");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("NFe", ">Sdt_RetornoCancelaNFE>Messages");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Sdt_RetornoCancelaNFEMessage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("NFe", "Sdt_RetornoCancelaNFE.Message");
            qName2 = new javax.xml.namespace.QName("NFe", "Message");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("NFe", ">ws_nfe.CANCELANOTAELETRONICA");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Ws_nfeCANCELANOTAELETRONICA.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", ">ws_nfe.CANCELANOTAELETRONICAResponse");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Ws_nfeCANCELANOTAELETRONICAResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", ">ws_nfe.CONSULTANOTASPROTOCOLO");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Ws_nfeCONSULTANOTASPROTOCOLO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", ">ws_nfe.CONSULTANOTASPROTOCOLOResponse");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Ws_nfeCONSULTANOTASPROTOCOLOResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", ">ws_nfe.CONSULTAPROTOCOLO");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Ws_nfeCONSULTAPROTOCOLO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", ">ws_nfe.CONSULTAPROTOCOLOResponse");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Ws_nfeCONSULTAPROTOCOLOResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", ">ws_nfe.PROCESSARPS");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Ws_nfePROCESSARPS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", ">ws_nfe.PROCESSARPSResponse");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Ws_nfePROCESSARPSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", ">ws_nfe.VERFICARPS");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Ws_nfeVERFICARPS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", ">ws_nfe.VERFICARPSResponse");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Ws_nfeVERFICARPSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", "Sdt_CancelaNFE");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Sdt_CancelaNFE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", "Sdt_CancelaNFE.Login");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Sdt_CancelaNFELogin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", "Sdt_CancelaNFE.Nota");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Sdt_CancelaNFENota.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", "SDT_ConsultaNotasProtocoloOut");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", "SDT_ConsultaNotasProtocoloOut.Message");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", "SDT_ConsultaNotasProtocoloOut.XML_Notas");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutXML_Notas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", "SDT_ConsultaNotasProtocoloOut.XML_Notas.Reg20Item");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", "SDT_ConsultaNotasProtocoloOut.XML_Notas.Reg20Item.Reg30Item");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutXML_NotasReg20ItemReg30Item.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", "SDT_ConsultaNotasProtocoloOut.XML_Notas.Reg90");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutXML_NotasReg90.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", "SDT_ConsultaProtocoloIn");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", "SDT_ConsultaProtocoloIn.Login");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloInLogin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", "SDT_ConsultaProtocoloOut");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", "SDT_ConsultaProtocoloOut.Message");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.SDT_ConsultaProtocoloOutMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", "Sdt_ProcessarpsIn");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Sdt_ProcessarpsIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", "Sdt_ProcessarpsIn.Login");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Sdt_ProcessarpsInLogin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", "Sdt_ProcessarpsIn.SDTRPS");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Sdt_ProcessarpsInSDTRPS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", "Sdt_ProcessarpsIn.SDTRPS.Reg20Item");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Sdt_ProcessarpsInSDTRPSReg20Item.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", "Sdt_ProcessarpsIn.SDTRPS.Reg20Item.Reg30Item");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Sdt_ProcessarpsInSDTRPSReg20ItemReg30Item.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", "Sdt_ProcessarpsIn.SDTRPS.Reg90");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Sdt_ProcessarpsInSDTRPSReg90.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", "Sdt_ProcessarpsOut");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Sdt_ProcessarpsOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", "Sdt_ProcessarpsOut.Message");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Sdt_ProcessarpsOutMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", "Sdt_RetornoCancelaNFE");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Sdt_RetornoCancelaNFE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("NFe", "Sdt_RetornoCancelaNFE.Message");
            cachedSerQNames.add(qName);
            cls = br.com.devplan.nfe.conam.services.Sdt_RetornoCancelaNFEMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public br.com.devplan.nfe.conam.services.Ws_nfePROCESSARPSResponse PROCESSARPS(br.com.devplan.nfe.conam.services.Ws_nfePROCESSARPS parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("NFeaction/AWS_NFE.PROCESSARPS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "PROCESSARPS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.devplan.nfe.conam.services.Ws_nfePROCESSARPSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.devplan.nfe.conam.services.Ws_nfePROCESSARPSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.devplan.nfe.conam.services.Ws_nfePROCESSARPSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.devplan.nfe.conam.services.Ws_nfeCONSULTANOTASPROTOCOLOResponse CONSULTANOTASPROTOCOLO(br.com.devplan.nfe.conam.services.Ws_nfeCONSULTANOTASPROTOCOLO parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("NFeaction/AWS_NFE.CONSULTANOTASPROTOCOLO");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CONSULTANOTASPROTOCOLO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.devplan.nfe.conam.services.Ws_nfeCONSULTANOTASPROTOCOLOResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.devplan.nfe.conam.services.Ws_nfeCONSULTANOTASPROTOCOLOResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.devplan.nfe.conam.services.Ws_nfeCONSULTANOTASPROTOCOLOResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.devplan.nfe.conam.services.Ws_nfeCONSULTAPROTOCOLOResponse CONSULTAPROTOCOLO(br.com.devplan.nfe.conam.services.Ws_nfeCONSULTAPROTOCOLO parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("NFeaction/AWS_NFE.CONSULTAPROTOCOLO");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CONSULTAPROTOCOLO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.devplan.nfe.conam.services.Ws_nfeCONSULTAPROTOCOLOResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.devplan.nfe.conam.services.Ws_nfeCONSULTAPROTOCOLOResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.devplan.nfe.conam.services.Ws_nfeCONSULTAPROTOCOLOResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.devplan.nfe.conam.services.Ws_nfeVERFICARPSResponse VERFICARPS(br.com.devplan.nfe.conam.services.Ws_nfeVERFICARPS parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("NFeaction/AWS_NFE.VERFICARPS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "VERFICARPS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.devplan.nfe.conam.services.Ws_nfeVERFICARPSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.devplan.nfe.conam.services.Ws_nfeVERFICARPSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.devplan.nfe.conam.services.Ws_nfeVERFICARPSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.devplan.nfe.conam.services.Ws_nfeCANCELANOTAELETRONICAResponse CANCELANOTAELETRONICA(br.com.devplan.nfe.conam.services.Ws_nfeCANCELANOTAELETRONICA parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("NFeaction/AWS_NFE.CANCELANOTAELETRONICA");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CANCELANOTAELETRONICA"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.devplan.nfe.conam.services.Ws_nfeCANCELANOTAELETRONICAResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.devplan.nfe.conam.services.Ws_nfeCANCELANOTAELETRONICAResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.devplan.nfe.conam.services.Ws_nfeCANCELANOTAELETRONICAResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
