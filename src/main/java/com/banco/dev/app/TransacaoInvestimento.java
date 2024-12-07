package com.banco.dev.app;
import java.util.*;
public class TransacaoInvestimento extends Transacao {
    boolean status;
    TransacaoInvestimento(){}
    TransacaoInvestimento(float valor, int emissor ,Date data){
        this.valor =  valor;
        this.emissor = emissor;
        this.data = data;
    }
    public void VerificarCompra(boolean status){
        this.status = status;
    }
    public boolean getStatus(){
        return this.status;
    }
}
