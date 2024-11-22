package com.banco.dev.app;
public class TransacaoInvestimento extends Transacao {
    String status;
    TransacaoInvestimento(){}
    TransacaoInvestimento(float valor, String destino){
        this.valor =  valor;
        this.destino = destino;
    }
}
