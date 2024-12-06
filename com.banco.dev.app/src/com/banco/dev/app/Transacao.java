package com.banco.dev.app;

import java.util.*;

public class Transacao {
    public float valor;
    public Date data;
    public int emissor;

    ///Construtores da classe mãe
    Transacao(){}
    //Construotor recebendo parametros
    Transacao(float valor, int emissor, Date data){
        this.valor = valor;
        //this.SetValor(valor);
        //Não precisava definir como Date, pois ele já estava definido nos parametros
        data = new Date();
        this.data = data;
        this.emissor = emissor;
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
    public void setEmissor(int emissor){
        this.emissor = emissor;
    }
     public int getEmissor(){
        return this.emissor;
  }
}
