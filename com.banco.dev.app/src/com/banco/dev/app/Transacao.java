package com.banco.dev.app;

import java.util.*;

public class Transacao {
    public float valor;
    public Date data;
    public String destino;

    ///Construtores da classe mãe
    Transacao(){}
    //Construotor recebendo parametros
    Transacao(float valor, String destino, Date data){
        this.valor = valor;
        //this.SetValor(valor);
        this.data = data;
        Date data = new Date();
        this.destino = destino;
    }
    public void setValor(float valor){
        this.valor = valor;
    }
    // Estava como int mas ela foi definida como float lá em cima
    public float getValor(){
        return this.valor;
  }
     public Date getData(){
        return this.data;
  }
    public void setDestino(String destino){
        this.destino = destino;
    }
     public String getDestino(){
        return this.destino;
  }
}
