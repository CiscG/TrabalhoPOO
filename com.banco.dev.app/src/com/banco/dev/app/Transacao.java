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
        //this.SetValor(valor);
        this.data = data;
        this.destino = destino;
    }
    public void SetValor(int valor){
        this.valor = valor;
    }
    public void SetData (Date data){
        this.data = data;
    }
    public void SetDestino(String destino){
        this.destino = destino;
    }
}
