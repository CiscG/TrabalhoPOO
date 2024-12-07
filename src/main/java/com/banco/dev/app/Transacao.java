package com.banco.dev.app;

import java.util.*;

public class Transacao {
    public double valor;
    public Date data;
    public int emissor;

    ///Construtores da classe mãe
    Transacao(){}
    //Construotor recebendo parametros
    Transacao(double valor, int emissor){
        this.valor = valor;
        //this.SetValor(valor);
        //Não precisava definir como Date, pois ele já estava definido nos parametros
        this.data = new Date();
        this.emissor = emissor;
    }
    public void setValor(float valor){
        this.valor = valor;
    }
    // Estava como int mas ela foi definida como float lá em cima
    public double getValor(){
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
