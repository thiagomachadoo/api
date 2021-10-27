package com.exemple.apiviasoft.entity;

public class TabelaDTO {
    //atributos
    private String autorizador;
    private String autorizacao;
    private String retornoAutorizacao;
    private String inutilizacao;

    private String consultaProtocolo;
    private String statusServico;
    private String tempoMedio;
    private String consultaCadastro;
    private String recepcaoEvento;


    //construtores


    public TabelaDTO(String autorizador, String autorizacao, String retornoAutorizacao, String inutilizacao, String consultaProtocolo, String statusServico, String tempoMedio, String consultaCadastro, String recepcaoEvento) {
        this.autorizador = autorizador;
        this.autorizacao = autorizacao;
        this.retornoAutorizacao = retornoAutorizacao;
        this.inutilizacao = inutilizacao;
        this.consultaProtocolo = consultaProtocolo;
        this.statusServico = statusServico;
        this.tempoMedio = tempoMedio;
        this.consultaCadastro = consultaCadastro;
        this.recepcaoEvento = recepcaoEvento;

    }


    public String getAutorizador() {
        return autorizador;
    }

    public void setAutorizador(String autorizador) {
        this.autorizador = autorizador;
    }

    public String getAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(String autorizacao) {
        this.autorizacao = autorizacao;
    }

    public String getRetornoAutorizacao() {
        return retornoAutorizacao;
    }

    public void setRetornoAutorizacao(String retornoAutorizacao) {
        this.retornoAutorizacao = retornoAutorizacao;
    }

    public String getInutilizacao() {
        return inutilizacao;
    }

    public void setInutilizacao(String inutilizacao) {
        this.inutilizacao = inutilizacao;
    }

    public String getConsultaProtocolo() {
        return consultaProtocolo;
    }

    public void setConsultaProtocolo(String consultaProtocolo) {
        this.consultaProtocolo = consultaProtocolo;
    }

    public String getStatusServico() {
        return statusServico;
    }

    public void setStatusServico(String statusServico) {
        this.statusServico = statusServico;
    }

    public String getTempoMedio() {
        return tempoMedio;
    }

    public void setTempoMedio(String tempoMedio) {
        this.tempoMedio = tempoMedio;
    }

    public String getConsultaCadastro() {
        return consultaCadastro;
    }

    public void setConsultaCadastro(String consultaCadastro) {
        this.consultaCadastro = consultaCadastro;
    }

    public String getRecepcaoEvento() {
        return recepcaoEvento;
    }

    public void setRecepcaoEvento(String recepcaoEvento) {
        this.recepcaoEvento = recepcaoEvento;
    }

}
