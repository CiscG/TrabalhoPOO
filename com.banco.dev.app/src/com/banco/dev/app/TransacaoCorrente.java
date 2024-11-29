package com.banco.dev.app;
import java.util.*;
//Extends para definir de qual classe ele herda atributos
public class TransacaoCorrente extends Transacao{
    public String destinatario;
    //Construtor da classe filha, pois a classe filha não herda construtor
    TransacaoCorrente(){}
    TransacaoCorrente(float valor, String destinatario, String destino, Date data){
        this.valor = valor;
        this.destinatario = destinatario;
        this.destino = destino;
        this.data = data;
    }
    public void SetDestinatario(String destinatario){
        this.destinatario = destinatario;
    }
}
