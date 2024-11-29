package com.banco.dev.app;
import java.util.*;
public class TransacaoInvestimento extends Transacao {
    public boolean status;
    TransacaoInvestimento(){}
    TransacaoInvestimento(float valor, String destino,Date data){
        this.valor =  valor;
        this.destino = destino;
        this.data = data;
    }
    void VerificarCompra(boolean status){
        this.status = status;
    }
}
