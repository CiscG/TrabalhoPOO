package com.banco.dev.app;
import java.util.*;
//Extends para definir de qual classe ele herda atributos
public class TransacaoCorrente extends Transacao{
    public int destinatario;
    //Construtor da classe filha, pois a classe filha não herda construtor
    TransacaoCorrente(){}
    TransacaoCorrente(float valor, int destinatario, int emissor){
        this.valor = valor;
        this.destinatario = destinatario;
        this.emissor = emissor;
        this.data = new Date();
    }
    public void setDestinatario(int destinatario){
        this.destinatario = destinatario;
    }
    public int getDestinatario(){
        return this.destinatario;
  }
}
