package com.banco.dev.app;

import java.util.*;

public class Transacao {
    float valor;
    Date data;
    String destino;

    //Construtores da classe mãe
    Transacao(){}
    //Construotor recebendo parametros
    Transacao(float valor, String destino, Date data){
        this.valor = valor;
        this.data = data;
        this.destino = destino;
    }
    void SetValor(int valor){
        this.valor = valor;
    }
    void SetData (Date data){
        this.data = data;
    }
    void SetDestino(String destino){
        this.destino = destino;
    }
}
