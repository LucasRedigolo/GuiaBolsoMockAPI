package com.guiabolsomockapi.model;


import java.util.Date;

public class Transacao {

    public String descricao;
    public long data;
    public int valor;


    public void setData(long data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
