package com.exemple.apiviasoft.entity;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Tabela {
    //atributos

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String autorizador;
    private String autorizacao;
    private String retornoAutorizacao;
    private String inutilizacao;
    private String consultaProtocolo;
    private String statusServico;
    private String tempoMedio;
    private String consultaCadastro;
    private String recepcaoEvento;



    @Temporal(TemporalType.TIMESTAMP)
    private Date date = new java.sql.Date(System.currentTimeMillis());


    public Tabela(){

    }

    //getters and setters

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
