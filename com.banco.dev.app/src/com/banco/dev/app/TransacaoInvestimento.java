package com.banco.dev.app;
import java.util.*;
public class TransacaoInvestimento extends Transacao {
    boolean status;
    TransacaoInvestimento(){}
    TransacaoInvestimento(float valor, String destino,Date data){
        this.valor =  valor;
        this.destino = destino;
        this.data = data;
    }
    void VerificarCompra(int valor){
        if(this.valor <= valor){
            status = true;
        }
        else{
            status = false;
        }
    }
}
