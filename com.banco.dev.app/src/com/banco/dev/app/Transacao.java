package com.banco.dev.app;

import java.util.*;

public class Transacao {
    public float valor;
    public Date data;
    public String destino;

    ///Construtores da classe mãe
    Transacao(){}
    //Construotor recebendo parametros
    //Tu consegue colocar o metodo de SetData como private-
    //-e colocar ele dentro do construtor que funciona
    /* Pode colocar private nessa classe aqui ou colocar a data como private para acessar
       por meio de um GetData public*/
    Transacao(float valor, String destino, Date data){
        this.valor = valor;
        //this.SetValor(valor);
        this.data = data;
        //this.SetData();
        this.destino = destino;
    }
    public void SetValor(int valor){
        this.valor = valor;
    }
    // Estava como int mas ela foi definida como float lá em cima
    public float GetValor(){
        return this.valor;
  }
    public void SetData (Date data){
        this.data = data;
    }
     public Date GetData(){
        return this.data;
  }
    public void SetDestino(String destino){
        this.destino = destino;
    }
     public String GetDestino(){
        return this.destino;
  }
}
