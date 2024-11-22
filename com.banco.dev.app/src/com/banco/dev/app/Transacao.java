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
}
