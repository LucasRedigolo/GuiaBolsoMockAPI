package com.guiabolsomockapi.model;

import com.guiabolsomockapi.util.ParamValidator;
import com.guiabolsomockapi.util.Util;

import java.util.ArrayList;
import java.util.List;

public class TransacoesDTO {

    public List<Transacao> transacoesList = new ArrayList<>();

    Util util = new Util();
    ParamValidator paramValidator = new ParamValidator();


    public TransacoesDTO(int id, int mes, int ano){
        paramValidator.validate(id,mes);
        transacoesBuilder(id, mes, ano);
    }

    private void transacoesBuilder(int id, int mes, int ano) {
        int quantidadeTransacoes = getQuantidade(id, mes);

        for (int i = 0; i <= quantidadeTransacoes ; i++) {
            Transacao transacao = new Transacao();

            int valor = setValor(id, i, mes);
            String descricao = setDescricao(valor);
            long data = setData(mes, ano);

            transacao.valor = valor;
            transacao.descricao = descricao;
            transacao.data = data;
            transacoesList.add(transacao);
        }
    }

    private long setData(int mes, int ano) {
        String mesAno = mes +"" + ano;
        int dia = mesAno
                .chars()
                .map(Character::getNumericValue)
                .sum();
        String data = dia + "" + mesAno;
        return Long.parseLong(data);
    }

    private int setValor(int id, int indice, int mes) {
        return id + indice + mes;
    }

    private int getQuantidade(int id, int mes) {
        int firstDigit = util.getFirstDigit(id);
        return firstDigit * mes;
    }

    public String setDescricao(int quantidadeChar) {
        if (quantidadeChar < 10) {
            quantidadeChar = 10;
        }
        if(quantidadeChar > 60) {
            quantidadeChar = 60;
        }
        return util.descricaoBuilder(quantidadeChar);
    }



}
