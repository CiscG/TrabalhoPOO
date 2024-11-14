package com.banco.dev.app;
//Extends para definir de qual classe ele herdda atributos
public class TransacaoCorrente extends Transacao{
    String destinatario;
    //Construtor da classe filha, pois a classe filha não herda construtor
    TransacaoCorrente(){}
    TransacaoCorrente(float valor, String destinatario, String destino){

    }
}
