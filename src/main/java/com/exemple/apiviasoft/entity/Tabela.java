package com.exemple.apiviasoft.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Tabela {
    //atributos

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 2, max = 5)
    private String autorizador;
    @NotNull
    @Size(min = 2, max = 3)
    private String autorizacao;
    @NotNull
    @Size(min = 2, max = 3)
    private String retornoAutorizacao;
    @NotNull
    @Size(min = 2, max = 3)
    private String inutilizacao;
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
}
