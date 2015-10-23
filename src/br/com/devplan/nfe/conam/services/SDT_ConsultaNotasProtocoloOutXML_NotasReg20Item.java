/**
 * SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devplan.nfe.conam.services;

public class SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item  implements java.io.Serializable {
    private java.lang.String tipoNf;

    private int numNf;

    private java.lang.String serNf;

    private java.lang.String dtEmiNf;

    private java.lang.String dtHrGerNf;

    private java.lang.String codVernf;

    private int numRps;

    private java.lang.String serRps;

    private java.lang.String dtEmiRps;

    private java.lang.String tipoCpfCnpjPre;

    private java.lang.String cpfCnpjPre;

    private java.lang.String razSocPre;

    private java.lang.String logPre;

    private java.lang.String numEndPre;

    private java.lang.String complEndPre;

    private java.lang.String bairroPre;

    private java.lang.String munPre;

    private java.lang.String siglaUFPre;

    private int cepPre;

    private java.lang.String emailPre;

    private java.lang.String tipoTribPre;

    private java.lang.String dtAdeSN;

    private double alqIssSN;

    private byte sitNf;

    private java.lang.String dataCncNf;

    private java.lang.String motivoCncNf;

    private java.lang.String tipoCpfCnpjTom;

    private java.lang.String cpfCnpjTom;

    private java.lang.String razSocTom;

    private java.lang.String logTom;

    private java.lang.String numEndTom;

    private java.lang.String complEndTom;

    private java.lang.String bairroTom;

    private java.lang.String munTom;

    private java.lang.String siglaUFTom;

    private int cepTom;

    private java.lang.String EMailTom;

    private java.lang.String logLocPre;

    private java.lang.String numEndLocPre;

    private java.lang.String complEndLocPre;

    private java.lang.String bairroLocPre;

    private java.lang.String munLocPre;

    private java.lang.String siglaUFLocpre;

    private int cepLocPre;

    private java.lang.String codSrv;

    private java.lang.String discrSrv;

    private double vlNFS;

    private double vlDed;

    private java.lang.String discrDed;

    private double vlBasCalc;

    private double alqIss;

    private double vlIss;

    private double vlIssRet;

    private br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutXML_NotasReg20ItemReg30Item[] reg30;

    public SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item() {
    }

    public SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item(
           java.lang.String tipoNf,
           int numNf,
           java.lang.String serNf,
           java.lang.String dtEmiNf,
           java.lang.String dtHrGerNf,
           java.lang.String codVernf,
           int numRps,
           java.lang.String serRps,
           java.lang.String dtEmiRps,
           java.lang.String tipoCpfCnpjPre,
           java.lang.String cpfCnpjPre,
           java.lang.String razSocPre,
           java.lang.String logPre,
           java.lang.String numEndPre,
           java.lang.String complEndPre,
           java.lang.String bairroPre,
           java.lang.String munPre,
           java.lang.String siglaUFPre,
           int cepPre,
           java.lang.String emailPre,
           java.lang.String tipoTribPre,
           java.lang.String dtAdeSN,
           double alqIssSN,
           byte sitNf,
           java.lang.String dataCncNf,
           java.lang.String motivoCncNf,
           java.lang.String tipoCpfCnpjTom,
           java.lang.String cpfCnpjTom,
           java.lang.String razSocTom,
           java.lang.String logTom,
           java.lang.String numEndTom,
           java.lang.String complEndTom,
           java.lang.String bairroTom,
           java.lang.String munTom,
           java.lang.String siglaUFTom,
           int cepTom,
           java.lang.String EMailTom,
           java.lang.String logLocPre,
           java.lang.String numEndLocPre,
           java.lang.String complEndLocPre,
           java.lang.String bairroLocPre,
           java.lang.String munLocPre,
           java.lang.String siglaUFLocpre,
           int cepLocPre,
           java.lang.String codSrv,
           java.lang.String discrSrv,
           double vlNFS,
           double vlDed,
           java.lang.String discrDed,
           double vlBasCalc,
           double alqIss,
           double vlIss,
           double vlIssRet,
           br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutXML_NotasReg20ItemReg30Item[] reg30) {
           this.tipoNf = tipoNf;
           this.numNf = numNf;
           this.serNf = serNf;
           this.dtEmiNf = dtEmiNf;
           this.dtHrGerNf = dtHrGerNf;
           this.codVernf = codVernf;
           this.numRps = numRps;
           this.serRps = serRps;
           this.dtEmiRps = dtEmiRps;
           this.tipoCpfCnpjPre = tipoCpfCnpjPre;
           this.cpfCnpjPre = cpfCnpjPre;
           this.razSocPre = razSocPre;
           this.logPre = logPre;
           this.numEndPre = numEndPre;
           this.complEndPre = complEndPre;
           this.bairroPre = bairroPre;
           this.munPre = munPre;
           this.siglaUFPre = siglaUFPre;
           this.cepPre = cepPre;
           this.emailPre = emailPre;
           this.tipoTribPre = tipoTribPre;
           this.dtAdeSN = dtAdeSN;
           this.alqIssSN = alqIssSN;
           this.sitNf = sitNf;
           this.dataCncNf = dataCncNf;
           this.motivoCncNf = motivoCncNf;
           this.tipoCpfCnpjTom = tipoCpfCnpjTom;
           this.cpfCnpjTom = cpfCnpjTom;
           this.razSocTom = razSocTom;
           this.logTom = logTom;
           this.numEndTom = numEndTom;
           this.complEndTom = complEndTom;
           this.bairroTom = bairroTom;
           this.munTom = munTom;
           this.siglaUFTom = siglaUFTom;
           this.cepTom = cepTom;
           this.EMailTom = EMailTom;
           this.logLocPre = logLocPre;
           this.numEndLocPre = numEndLocPre;
           this.complEndLocPre = complEndLocPre;
           this.bairroLocPre = bairroLocPre;
           this.munLocPre = munLocPre;
           this.siglaUFLocpre = siglaUFLocpre;
           this.cepLocPre = cepLocPre;
           this.codSrv = codSrv;
           this.discrSrv = discrSrv;
           this.vlNFS = vlNFS;
           this.vlDed = vlDed;
           this.discrDed = discrDed;
           this.vlBasCalc = vlBasCalc;
           this.alqIss = alqIss;
           this.vlIss = vlIss;
           this.vlIssRet = vlIssRet;
           this.reg30 = reg30;
    }


    /**
     * Gets the tipoNf value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return tipoNf
     */
    public java.lang.String getTipoNf() {
        return tipoNf;
    }


    /**
     * Sets the tipoNf value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param tipoNf
     */
    public void setTipoNf(java.lang.String tipoNf) {
        this.tipoNf = tipoNf;
    }


    /**
     * Gets the numNf value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return numNf
     */
    public int getNumNf() {
        return numNf;
    }


    /**
     * Sets the numNf value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param numNf
     */
    public void setNumNf(int numNf) {
        this.numNf = numNf;
    }


    /**
     * Gets the serNf value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return serNf
     */
    public java.lang.String getSerNf() {
        return serNf;
    }


    /**
     * Sets the serNf value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param serNf
     */
    public void setSerNf(java.lang.String serNf) {
        this.serNf = serNf;
    }


    /**
     * Gets the dtEmiNf value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return dtEmiNf
     */
    public java.lang.String getDtEmiNf() {
        return dtEmiNf;
    }


    /**
     * Sets the dtEmiNf value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param dtEmiNf
     */
    public void setDtEmiNf(java.lang.String dtEmiNf) {
        this.dtEmiNf = dtEmiNf;
    }


    /**
     * Gets the dtHrGerNf value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return dtHrGerNf
     */
    public java.lang.String getDtHrGerNf() {
        return dtHrGerNf;
    }


    /**
     * Sets the dtHrGerNf value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param dtHrGerNf
     */
    public void setDtHrGerNf(java.lang.String dtHrGerNf) {
        this.dtHrGerNf = dtHrGerNf;
    }


    /**
     * Gets the codVernf value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return codVernf
     */
    public java.lang.String getCodVernf() {
        return codVernf;
    }


    /**
     * Sets the codVernf value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param codVernf
     */
    public void setCodVernf(java.lang.String codVernf) {
        this.codVernf = codVernf;
    }


    /**
     * Gets the numRps value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return numRps
     */
    public int getNumRps() {
        return numRps;
    }


    /**
     * Sets the numRps value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param numRps
     */
    public void setNumRps(int numRps) {
        this.numRps = numRps;
    }


    /**
     * Gets the serRps value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return serRps
     */
    public java.lang.String getSerRps() {
        return serRps;
    }


    /**
     * Sets the serRps value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param serRps
     */
    public void setSerRps(java.lang.String serRps) {
        this.serRps = serRps;
    }


    /**
     * Gets the dtEmiRps value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return dtEmiRps
     */
    public java.lang.String getDtEmiRps() {
        return dtEmiRps;
    }


    /**
     * Sets the dtEmiRps value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param dtEmiRps
     */
    public void setDtEmiRps(java.lang.String dtEmiRps) {
        this.dtEmiRps = dtEmiRps;
    }


    /**
     * Gets the tipoCpfCnpjPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return tipoCpfCnpjPre
     */
    public java.lang.String getTipoCpfCnpjPre() {
        return tipoCpfCnpjPre;
    }


    /**
     * Sets the tipoCpfCnpjPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param tipoCpfCnpjPre
     */
    public void setTipoCpfCnpjPre(java.lang.String tipoCpfCnpjPre) {
        this.tipoCpfCnpjPre = tipoCpfCnpjPre;
    }


    /**
     * Gets the cpfCnpjPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return cpfCnpjPre
     */
    public java.lang.String getCpfCnpjPre() {
        return cpfCnpjPre;
    }


    /**
     * Sets the cpfCnpjPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param cpfCnpjPre
     */
    public void setCpfCnpjPre(java.lang.String cpfCnpjPre) {
        this.cpfCnpjPre = cpfCnpjPre;
    }


    /**
     * Gets the razSocPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return razSocPre
     */
    public java.lang.String getRazSocPre() {
        return razSocPre;
    }


    /**
     * Sets the razSocPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param razSocPre
     */
    public void setRazSocPre(java.lang.String razSocPre) {
        this.razSocPre = razSocPre;
    }


    /**
     * Gets the logPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return logPre
     */
    public java.lang.String getLogPre() {
        return logPre;
    }


    /**
     * Sets the logPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param logPre
     */
    public void setLogPre(java.lang.String logPre) {
        this.logPre = logPre;
    }


    /**
     * Gets the numEndPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return numEndPre
     */
    public java.lang.String getNumEndPre() {
        return numEndPre;
    }


    /**
     * Sets the numEndPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param numEndPre
     */
    public void setNumEndPre(java.lang.String numEndPre) {
        this.numEndPre = numEndPre;
    }


    /**
     * Gets the complEndPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return complEndPre
     */
    public java.lang.String getComplEndPre() {
        return complEndPre;
    }


    /**
     * Sets the complEndPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param complEndPre
     */
    public void setComplEndPre(java.lang.String complEndPre) {
        this.complEndPre = complEndPre;
    }


    /**
     * Gets the bairroPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return bairroPre
     */
    public java.lang.String getBairroPre() {
        return bairroPre;
    }


    /**
     * Sets the bairroPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param bairroPre
     */
    public void setBairroPre(java.lang.String bairroPre) {
        this.bairroPre = bairroPre;
    }


    /**
     * Gets the munPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return munPre
     */
    public java.lang.String getMunPre() {
        return munPre;
    }


    /**
     * Sets the munPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param munPre
     */
    public void setMunPre(java.lang.String munPre) {
        this.munPre = munPre;
    }


    /**
     * Gets the siglaUFPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return siglaUFPre
     */
    public java.lang.String getSiglaUFPre() {
        return siglaUFPre;
    }


    /**
     * Sets the siglaUFPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param siglaUFPre
     */
    public void setSiglaUFPre(java.lang.String siglaUFPre) {
        this.siglaUFPre = siglaUFPre;
    }


    /**
     * Gets the cepPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return cepPre
     */
    public int getCepPre() {
        return cepPre;
    }


    /**
     * Sets the cepPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param cepPre
     */
    public void setCepPre(int cepPre) {
        this.cepPre = cepPre;
    }


    /**
     * Gets the emailPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return emailPre
     */
    public java.lang.String getEmailPre() {
        return emailPre;
    }


    /**
     * Sets the emailPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param emailPre
     */
    public void setEmailPre(java.lang.String emailPre) {
        this.emailPre = emailPre;
    }


    /**
     * Gets the tipoTribPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return tipoTribPre
     */
    public java.lang.String getTipoTribPre() {
        return tipoTribPre;
    }


    /**
     * Sets the tipoTribPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param tipoTribPre
     */
    public void setTipoTribPre(java.lang.String tipoTribPre) {
        this.tipoTribPre = tipoTribPre;
    }


    /**
     * Gets the dtAdeSN value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return dtAdeSN
     */
    public java.lang.String getDtAdeSN() {
        return dtAdeSN;
    }


    /**
     * Sets the dtAdeSN value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param dtAdeSN
     */
    public void setDtAdeSN(java.lang.String dtAdeSN) {
        this.dtAdeSN = dtAdeSN;
    }


    /**
     * Gets the alqIssSN value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return alqIssSN
     */
    public double getAlqIssSN() {
        return alqIssSN;
    }


    /**
     * Sets the alqIssSN value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param alqIssSN
     */
    public void setAlqIssSN(double alqIssSN) {
        this.alqIssSN = alqIssSN;
    }


    /**
     * Gets the sitNf value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return sitNf
     */
    public byte getSitNf() {
        return sitNf;
    }


    /**
     * Sets the sitNf value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param sitNf
     */
    public void setSitNf(byte sitNf) {
        this.sitNf = sitNf;
    }


    /**
     * Gets the dataCncNf value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return dataCncNf
     */
    public java.lang.String getDataCncNf() {
        return dataCncNf;
    }


    /**
     * Sets the dataCncNf value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param dataCncNf
     */
    public void setDataCncNf(java.lang.String dataCncNf) {
        this.dataCncNf = dataCncNf;
    }


    /**
     * Gets the motivoCncNf value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return motivoCncNf
     */
    public java.lang.String getMotivoCncNf() {
        return motivoCncNf;
    }


    /**
     * Sets the motivoCncNf value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param motivoCncNf
     */
    public void setMotivoCncNf(java.lang.String motivoCncNf) {
        this.motivoCncNf = motivoCncNf;
    }


    /**
     * Gets the tipoCpfCnpjTom value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return tipoCpfCnpjTom
     */
    public java.lang.String getTipoCpfCnpjTom() {
        return tipoCpfCnpjTom;
    }


    /**
     * Sets the tipoCpfCnpjTom value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param tipoCpfCnpjTom
     */
    public void setTipoCpfCnpjTom(java.lang.String tipoCpfCnpjTom) {
        this.tipoCpfCnpjTom = tipoCpfCnpjTom;
    }


    /**
     * Gets the cpfCnpjTom value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return cpfCnpjTom
     */
    public java.lang.String getCpfCnpjTom() {
        return cpfCnpjTom;
    }


    /**
     * Sets the cpfCnpjTom value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param cpfCnpjTom
     */
    public void setCpfCnpjTom(java.lang.String cpfCnpjTom) {
        this.cpfCnpjTom = cpfCnpjTom;
    }


    /**
     * Gets the razSocTom value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return razSocTom
     */
    public java.lang.String getRazSocTom() {
        return razSocTom;
    }


    /**
     * Sets the razSocTom value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param razSocTom
     */
    public void setRazSocTom(java.lang.String razSocTom) {
        this.razSocTom = razSocTom;
    }


    /**
     * Gets the logTom value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return logTom
     */
    public java.lang.String getLogTom() {
        return logTom;
    }


    /**
     * Sets the logTom value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param logTom
     */
    public void setLogTom(java.lang.String logTom) {
        this.logTom = logTom;
    }


    /**
     * Gets the numEndTom value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return numEndTom
     */
    public java.lang.String getNumEndTom() {
        return numEndTom;
    }


    /**
     * Sets the numEndTom value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param numEndTom
     */
    public void setNumEndTom(java.lang.String numEndTom) {
        this.numEndTom = numEndTom;
    }


    /**
     * Gets the complEndTom value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return complEndTom
     */
    public java.lang.String getComplEndTom() {
        return complEndTom;
    }


    /**
     * Sets the complEndTom value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param complEndTom
     */
    public void setComplEndTom(java.lang.String complEndTom) {
        this.complEndTom = complEndTom;
    }


    /**
     * Gets the bairroTom value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return bairroTom
     */
    public java.lang.String getBairroTom() {
        return bairroTom;
    }


    /**
     * Sets the bairroTom value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param bairroTom
     */
    public void setBairroTom(java.lang.String bairroTom) {
        this.bairroTom = bairroTom;
    }


    /**
     * Gets the munTom value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return munTom
     */
    public java.lang.String getMunTom() {
        return munTom;
    }


    /**
     * Sets the munTom value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param munTom
     */
    public void setMunTom(java.lang.String munTom) {
        this.munTom = munTom;
    }


    /**
     * Gets the siglaUFTom value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return siglaUFTom
     */
    public java.lang.String getSiglaUFTom() {
        return siglaUFTom;
    }


    /**
     * Sets the siglaUFTom value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param siglaUFTom
     */
    public void setSiglaUFTom(java.lang.String siglaUFTom) {
        this.siglaUFTom = siglaUFTom;
    }


    /**
     * Gets the cepTom value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return cepTom
     */
    public int getCepTom() {
        return cepTom;
    }


    /**
     * Sets the cepTom value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param cepTom
     */
    public void setCepTom(int cepTom) {
        this.cepTom = cepTom;
    }


    /**
     * Gets the EMailTom value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return EMailTom
     */
    public java.lang.String getEMailTom() {
        return EMailTom;
    }


    /**
     * Sets the EMailTom value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param EMailTom
     */
    public void setEMailTom(java.lang.String EMailTom) {
        this.EMailTom = EMailTom;
    }


    /**
     * Gets the logLocPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return logLocPre
     */
    public java.lang.String getLogLocPre() {
        return logLocPre;
    }


    /**
     * Sets the logLocPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param logLocPre
     */
    public void setLogLocPre(java.lang.String logLocPre) {
        this.logLocPre = logLocPre;
    }


    /**
     * Gets the numEndLocPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return numEndLocPre
     */
    public java.lang.String getNumEndLocPre() {
        return numEndLocPre;
    }


    /**
     * Sets the numEndLocPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param numEndLocPre
     */
    public void setNumEndLocPre(java.lang.String numEndLocPre) {
        this.numEndLocPre = numEndLocPre;
    }


    /**
     * Gets the complEndLocPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return complEndLocPre
     */
    public java.lang.String getComplEndLocPre() {
        return complEndLocPre;
    }


    /**
     * Sets the complEndLocPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param complEndLocPre
     */
    public void setComplEndLocPre(java.lang.String complEndLocPre) {
        this.complEndLocPre = complEndLocPre;
    }


    /**
     * Gets the bairroLocPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return bairroLocPre
     */
    public java.lang.String getBairroLocPre() {
        return bairroLocPre;
    }


    /**
     * Sets the bairroLocPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param bairroLocPre
     */
    public void setBairroLocPre(java.lang.String bairroLocPre) {
        this.bairroLocPre = bairroLocPre;
    }


    /**
     * Gets the munLocPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return munLocPre
     */
    public java.lang.String getMunLocPre() {
        return munLocPre;
    }


    /**
     * Sets the munLocPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param munLocPre
     */
    public void setMunLocPre(java.lang.String munLocPre) {
        this.munLocPre = munLocPre;
    }


    /**
     * Gets the siglaUFLocpre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return siglaUFLocpre
     */
    public java.lang.String getSiglaUFLocpre() {
        return siglaUFLocpre;
    }


    /**
     * Sets the siglaUFLocpre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param siglaUFLocpre
     */
    public void setSiglaUFLocpre(java.lang.String siglaUFLocpre) {
        this.siglaUFLocpre = siglaUFLocpre;
    }


    /**
     * Gets the cepLocPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return cepLocPre
     */
    public int getCepLocPre() {
        return cepLocPre;
    }


    /**
     * Sets the cepLocPre value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param cepLocPre
     */
    public void setCepLocPre(int cepLocPre) {
        this.cepLocPre = cepLocPre;
    }


    /**
     * Gets the codSrv value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return codSrv
     */
    public java.lang.String getCodSrv() {
        return codSrv;
    }


    /**
     * Sets the codSrv value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param codSrv
     */
    public void setCodSrv(java.lang.String codSrv) {
        this.codSrv = codSrv;
    }


    /**
     * Gets the discrSrv value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return discrSrv
     */
    public java.lang.String getDiscrSrv() {
        return discrSrv;
    }


    /**
     * Sets the discrSrv value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param discrSrv
     */
    public void setDiscrSrv(java.lang.String discrSrv) {
        this.discrSrv = discrSrv;
    }


    /**
     * Gets the vlNFS value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return vlNFS
     */
    public double getVlNFS() {
        return vlNFS;
    }


    /**
     * Sets the vlNFS value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param vlNFS
     */
    public void setVlNFS(double vlNFS) {
        this.vlNFS = vlNFS;
    }


    /**
     * Gets the vlDed value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return vlDed
     */
    public double getVlDed() {
        return vlDed;
    }


    /**
     * Sets the vlDed value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param vlDed
     */
    public void setVlDed(double vlDed) {
        this.vlDed = vlDed;
    }


    /**
     * Gets the discrDed value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return discrDed
     */
    public java.lang.String getDiscrDed() {
        return discrDed;
    }


    /**
     * Sets the discrDed value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param discrDed
     */
    public void setDiscrDed(java.lang.String discrDed) {
        this.discrDed = discrDed;
    }


    /**
     * Gets the vlBasCalc value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return vlBasCalc
     */
    public double getVlBasCalc() {
        return vlBasCalc;
    }


    /**
     * Sets the vlBasCalc value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param vlBasCalc
     */
    public void setVlBasCalc(double vlBasCalc) {
        this.vlBasCalc = vlBasCalc;
    }


    /**
     * Gets the alqIss value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return alqIss
     */
    public double getAlqIss() {
        return alqIss;
    }


    /**
     * Sets the alqIss value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param alqIss
     */
    public void setAlqIss(double alqIss) {
        this.alqIss = alqIss;
    }


    /**
     * Gets the vlIss value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return vlIss
     */
    public double getVlIss() {
        return vlIss;
    }


    /**
     * Sets the vlIss value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param vlIss
     */
    public void setVlIss(double vlIss) {
        this.vlIss = vlIss;
    }


    /**
     * Gets the vlIssRet value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return vlIssRet
     */
    public double getVlIssRet() {
        return vlIssRet;
    }


    /**
     * Sets the vlIssRet value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param vlIssRet
     */
    public void setVlIssRet(double vlIssRet) {
        this.vlIssRet = vlIssRet;
    }


    /**
     * Gets the reg30 value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @return reg30
     */
    public br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutXML_NotasReg20ItemReg30Item[] getReg30() {
        return reg30;
    }


    /**
     * Sets the reg30 value for this SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.
     * 
     * @param reg30
     */
    public void setReg30(br.com.devplan.nfe.conam.services.SDT_ConsultaNotasProtocoloOutXML_NotasReg20ItemReg30Item[] reg30) {
        this.reg30 = reg30;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item)) return false;
        SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item other = (SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoNf==null && other.getTipoNf()==null) || 
             (this.tipoNf!=null &&
              this.tipoNf.equals(other.getTipoNf()))) &&
            this.numNf == other.getNumNf() &&
            ((this.serNf==null && other.getSerNf()==null) || 
             (this.serNf!=null &&
              this.serNf.equals(other.getSerNf()))) &&
            ((this.dtEmiNf==null && other.getDtEmiNf()==null) || 
             (this.dtEmiNf!=null &&
              this.dtEmiNf.equals(other.getDtEmiNf()))) &&
            ((this.dtHrGerNf==null && other.getDtHrGerNf()==null) || 
             (this.dtHrGerNf!=null &&
              this.dtHrGerNf.equals(other.getDtHrGerNf()))) &&
            ((this.codVernf==null && other.getCodVernf()==null) || 
             (this.codVernf!=null &&
              this.codVernf.equals(other.getCodVernf()))) &&
            this.numRps == other.getNumRps() &&
            ((this.serRps==null && other.getSerRps()==null) || 
             (this.serRps!=null &&
              this.serRps.equals(other.getSerRps()))) &&
            ((this.dtEmiRps==null && other.getDtEmiRps()==null) || 
             (this.dtEmiRps!=null &&
              this.dtEmiRps.equals(other.getDtEmiRps()))) &&
            ((this.tipoCpfCnpjPre==null && other.getTipoCpfCnpjPre()==null) || 
             (this.tipoCpfCnpjPre!=null &&
              this.tipoCpfCnpjPre.equals(other.getTipoCpfCnpjPre()))) &&
            ((this.cpfCnpjPre==null && other.getCpfCnpjPre()==null) || 
             (this.cpfCnpjPre!=null &&
              this.cpfCnpjPre.equals(other.getCpfCnpjPre()))) &&
            ((this.razSocPre==null && other.getRazSocPre()==null) || 
             (this.razSocPre!=null &&
              this.razSocPre.equals(other.getRazSocPre()))) &&
            ((this.logPre==null && other.getLogPre()==null) || 
             (this.logPre!=null &&
              this.logPre.equals(other.getLogPre()))) &&
            ((this.numEndPre==null && other.getNumEndPre()==null) || 
             (this.numEndPre!=null &&
              this.numEndPre.equals(other.getNumEndPre()))) &&
            ((this.complEndPre==null && other.getComplEndPre()==null) || 
             (this.complEndPre!=null &&
              this.complEndPre.equals(other.getComplEndPre()))) &&
            ((this.bairroPre==null && other.getBairroPre()==null) || 
             (this.bairroPre!=null &&
              this.bairroPre.equals(other.getBairroPre()))) &&
            ((this.munPre==null && other.getMunPre()==null) || 
             (this.munPre!=null &&
              this.munPre.equals(other.getMunPre()))) &&
            ((this.siglaUFPre==null && other.getSiglaUFPre()==null) || 
             (this.siglaUFPre!=null &&
              this.siglaUFPre.equals(other.getSiglaUFPre()))) &&
            this.cepPre == other.getCepPre() &&
            ((this.emailPre==null && other.getEmailPre()==null) || 
             (this.emailPre!=null &&
              this.emailPre.equals(other.getEmailPre()))) &&
            ((this.tipoTribPre==null && other.getTipoTribPre()==null) || 
             (this.tipoTribPre!=null &&
              this.tipoTribPre.equals(other.getTipoTribPre()))) &&
            ((this.dtAdeSN==null && other.getDtAdeSN()==null) || 
             (this.dtAdeSN!=null &&
              this.dtAdeSN.equals(other.getDtAdeSN()))) &&
            this.alqIssSN == other.getAlqIssSN() &&
            this.sitNf == other.getSitNf() &&
            ((this.dataCncNf==null && other.getDataCncNf()==null) || 
             (this.dataCncNf!=null &&
              this.dataCncNf.equals(other.getDataCncNf()))) &&
            ((this.motivoCncNf==null && other.getMotivoCncNf()==null) || 
             (this.motivoCncNf!=null &&
              this.motivoCncNf.equals(other.getMotivoCncNf()))) &&
            ((this.tipoCpfCnpjTom==null && other.getTipoCpfCnpjTom()==null) || 
             (this.tipoCpfCnpjTom!=null &&
              this.tipoCpfCnpjTom.equals(other.getTipoCpfCnpjTom()))) &&
            ((this.cpfCnpjTom==null && other.getCpfCnpjTom()==null) || 
             (this.cpfCnpjTom!=null &&
              this.cpfCnpjTom.equals(other.getCpfCnpjTom()))) &&
            ((this.razSocTom==null && other.getRazSocTom()==null) || 
             (this.razSocTom!=null &&
              this.razSocTom.equals(other.getRazSocTom()))) &&
            ((this.logTom==null && other.getLogTom()==null) || 
             (this.logTom!=null &&
              this.logTom.equals(other.getLogTom()))) &&
            ((this.numEndTom==null && other.getNumEndTom()==null) || 
             (this.numEndTom!=null &&
              this.numEndTom.equals(other.getNumEndTom()))) &&
            ((this.complEndTom==null && other.getComplEndTom()==null) || 
             (this.complEndTom!=null &&
              this.complEndTom.equals(other.getComplEndTom()))) &&
            ((this.bairroTom==null && other.getBairroTom()==null) || 
             (this.bairroTom!=null &&
              this.bairroTom.equals(other.getBairroTom()))) &&
            ((this.munTom==null && other.getMunTom()==null) || 
             (this.munTom!=null &&
              this.munTom.equals(other.getMunTom()))) &&
            ((this.siglaUFTom==null && other.getSiglaUFTom()==null) || 
             (this.siglaUFTom!=null &&
              this.siglaUFTom.equals(other.getSiglaUFTom()))) &&
            this.cepTom == other.getCepTom() &&
            ((this.EMailTom==null && other.getEMailTom()==null) || 
             (this.EMailTom!=null &&
              this.EMailTom.equals(other.getEMailTom()))) &&
            ((this.logLocPre==null && other.getLogLocPre()==null) || 
             (this.logLocPre!=null &&
              this.logLocPre.equals(other.getLogLocPre()))) &&
            ((this.numEndLocPre==null && other.getNumEndLocPre()==null) || 
             (this.numEndLocPre!=null &&
              this.numEndLocPre.equals(other.getNumEndLocPre()))) &&
            ((this.complEndLocPre==null && other.getComplEndLocPre()==null) || 
             (this.complEndLocPre!=null &&
              this.complEndLocPre.equals(other.getComplEndLocPre()))) &&
            ((this.bairroLocPre==null && other.getBairroLocPre()==null) || 
             (this.bairroLocPre!=null &&
              this.bairroLocPre.equals(other.getBairroLocPre()))) &&
            ((this.munLocPre==null && other.getMunLocPre()==null) || 
             (this.munLocPre!=null &&
              this.munLocPre.equals(other.getMunLocPre()))) &&
            ((this.siglaUFLocpre==null && other.getSiglaUFLocpre()==null) || 
             (this.siglaUFLocpre!=null &&
              this.siglaUFLocpre.equals(other.getSiglaUFLocpre()))) &&
            this.cepLocPre == other.getCepLocPre() &&
            ((this.codSrv==null && other.getCodSrv()==null) || 
             (this.codSrv!=null &&
              this.codSrv.equals(other.getCodSrv()))) &&
            ((this.discrSrv==null && other.getDiscrSrv()==null) || 
             (this.discrSrv!=null &&
              this.discrSrv.equals(other.getDiscrSrv()))) &&
            this.vlNFS == other.getVlNFS() &&
            this.vlDed == other.getVlDed() &&
            ((this.discrDed==null && other.getDiscrDed()==null) || 
             (this.discrDed!=null &&
              this.discrDed.equals(other.getDiscrDed()))) &&
            this.vlBasCalc == other.getVlBasCalc() &&
            this.alqIss == other.getAlqIss() &&
            this.vlIss == other.getVlIss() &&
            this.vlIssRet == other.getVlIssRet() &&
            ((this.reg30==null && other.getReg30()==null) || 
             (this.reg30!=null &&
              java.util.Arrays.equals(this.reg30, other.getReg30())));
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
        if (getTipoNf() != null) {
            _hashCode += getTipoNf().hashCode();
        }
        _hashCode += getNumNf();
        if (getSerNf() != null) {
            _hashCode += getSerNf().hashCode();
        }
        if (getDtEmiNf() != null) {
            _hashCode += getDtEmiNf().hashCode();
        }
        if (getDtHrGerNf() != null) {
            _hashCode += getDtHrGerNf().hashCode();
        }
        if (getCodVernf() != null) {
            _hashCode += getCodVernf().hashCode();
        }
        _hashCode += getNumRps();
        if (getSerRps() != null) {
            _hashCode += getSerRps().hashCode();
        }
        if (getDtEmiRps() != null) {
            _hashCode += getDtEmiRps().hashCode();
        }
        if (getTipoCpfCnpjPre() != null) {
            _hashCode += getTipoCpfCnpjPre().hashCode();
        }
        if (getCpfCnpjPre() != null) {
            _hashCode += getCpfCnpjPre().hashCode();
        }
        if (getRazSocPre() != null) {
            _hashCode += getRazSocPre().hashCode();
        }
        if (getLogPre() != null) {
            _hashCode += getLogPre().hashCode();
        }
        if (getNumEndPre() != null) {
            _hashCode += getNumEndPre().hashCode();
        }
        if (getComplEndPre() != null) {
            _hashCode += getComplEndPre().hashCode();
        }
        if (getBairroPre() != null) {
            _hashCode += getBairroPre().hashCode();
        }
        if (getMunPre() != null) {
            _hashCode += getMunPre().hashCode();
        }
        if (getSiglaUFPre() != null) {
            _hashCode += getSiglaUFPre().hashCode();
        }
        _hashCode += getCepPre();
        if (getEmailPre() != null) {
            _hashCode += getEmailPre().hashCode();
        }
        if (getTipoTribPre() != null) {
            _hashCode += getTipoTribPre().hashCode();
        }
        if (getDtAdeSN() != null) {
            _hashCode += getDtAdeSN().hashCode();
        }
        _hashCode += new Double(getAlqIssSN()).hashCode();
        _hashCode += getSitNf();
        if (getDataCncNf() != null) {
            _hashCode += getDataCncNf().hashCode();
        }
        if (getMotivoCncNf() != null) {
            _hashCode += getMotivoCncNf().hashCode();
        }
        if (getTipoCpfCnpjTom() != null) {
            _hashCode += getTipoCpfCnpjTom().hashCode();
        }
        if (getCpfCnpjTom() != null) {
            _hashCode += getCpfCnpjTom().hashCode();
        }
        if (getRazSocTom() != null) {
            _hashCode += getRazSocTom().hashCode();
        }
        if (getLogTom() != null) {
            _hashCode += getLogTom().hashCode();
        }
        if (getNumEndTom() != null) {
            _hashCode += getNumEndTom().hashCode();
        }
        if (getComplEndTom() != null) {
            _hashCode += getComplEndTom().hashCode();
        }
        if (getBairroTom() != null) {
            _hashCode += getBairroTom().hashCode();
        }
        if (getMunTom() != null) {
            _hashCode += getMunTom().hashCode();
        }
        if (getSiglaUFTom() != null) {
            _hashCode += getSiglaUFTom().hashCode();
        }
        _hashCode += getCepTom();
        if (getEMailTom() != null) {
            _hashCode += getEMailTom().hashCode();
        }
        if (getLogLocPre() != null) {
            _hashCode += getLogLocPre().hashCode();
        }
        if (getNumEndLocPre() != null) {
            _hashCode += getNumEndLocPre().hashCode();
        }
        if (getComplEndLocPre() != null) {
            _hashCode += getComplEndLocPre().hashCode();
        }
        if (getBairroLocPre() != null) {
            _hashCode += getBairroLocPre().hashCode();
        }
        if (getMunLocPre() != null) {
            _hashCode += getMunLocPre().hashCode();
        }
        if (getSiglaUFLocpre() != null) {
            _hashCode += getSiglaUFLocpre().hashCode();
        }
        _hashCode += getCepLocPre();
        if (getCodSrv() != null) {
            _hashCode += getCodSrv().hashCode();
        }
        if (getDiscrSrv() != null) {
            _hashCode += getDiscrSrv().hashCode();
        }
        _hashCode += new Double(getVlNFS()).hashCode();
        _hashCode += new Double(getVlDed()).hashCode();
        if (getDiscrDed() != null) {
            _hashCode += getDiscrDed().hashCode();
        }
        _hashCode += new Double(getVlBasCalc()).hashCode();
        _hashCode += new Double(getAlqIss()).hashCode();
        _hashCode += new Double(getVlIss()).hashCode();
        _hashCode += new Double(getVlIssRet()).hashCode();
        if (getReg30() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReg30());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReg30(), i);
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
        new org.apache.axis.description.TypeDesc(SDT_ConsultaNotasProtocoloOutXML_NotasReg20Item.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("NFe", "SDT_ConsultaNotasProtocoloOut.XML_Notas.Reg20Item"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoNf");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "TipoNf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numNf");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "NumNf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serNf");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "SerNf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtEmiNf");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "DtEmiNf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtHrGerNf");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "DtHrGerNf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codVernf");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "CodVernf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRps");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "NumRps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serRps");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "SerRps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtEmiRps");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "DtEmiRps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCpfCnpjPre");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "TipoCpfCnpjPre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpjPre");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "CpfCnpjPre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("razSocPre");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "RazSocPre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logPre");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "LogPre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numEndPre");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "NumEndPre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complEndPre");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "ComplEndPre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bairroPre");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "BairroPre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("munPre");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "MunPre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaUFPre");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "SiglaUFPre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cepPre");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "CepPre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailPre");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "EmailPre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoTribPre");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "TipoTribPre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtAdeSN");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "DtAdeSN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alqIssSN");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "AlqIssSN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitNf");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "SitNf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCncNf");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "DataCncNf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivoCncNf");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "MotivoCncNf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCpfCnpjTom");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "TipoCpfCnpjTom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpjTom");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "CpfCnpjTom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("razSocTom");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "RazSocTom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logTom");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "LogTom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numEndTom");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "NumEndTom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complEndTom");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "ComplEndTom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bairroTom");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "BairroTom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("munTom");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "MunTom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaUFTom");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "SiglaUFTom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cepTom");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "CepTom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMailTom");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "EMailTom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logLocPre");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "LogLocPre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numEndLocPre");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "NumEndLocPre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complEndLocPre");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "ComplEndLocPre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bairroLocPre");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "BairroLocPre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("munLocPre");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "MunLocPre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaUFLocpre");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "SiglaUFLocpre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cepLocPre");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "CepLocPre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codSrv");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "CodSrv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discrSrv");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "DiscrSrv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlNFS");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "VlNFS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDed");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "VlDed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discrDed");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "DiscrDed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBasCalc");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "VlBasCalc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alqIss");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "AlqIss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlIss");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "VlIss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlIssRet");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "VlIssRet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reg30");
        elemField.setXmlName(new javax.xml.namespace.QName("NFe", "Reg30"));
        elemField.setXmlType(new javax.xml.namespace.QName("NFe", "SDT_ConsultaNotasProtocoloOut.XML_Notas.Reg20Item.Reg30Item"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("NFe", "Reg30Item"));
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
