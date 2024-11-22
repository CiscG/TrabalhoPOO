package com.banco.dev.app;

import java.util.*;

public class Transacao {
    float valor;
    Date data;
    String destino;

    //Construtores da classe mãe
    Transacao(){}
    //Construotor recebendo parametros
    Transacao(float valor, String destino){
        this.valor = valor;
        this.destino = destino;

    }
}
