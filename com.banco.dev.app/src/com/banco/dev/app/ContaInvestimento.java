package com.banco.dev.app;
import java.util.*;
public class ContaInvestimento extends Conta {

    ArrayList<Produto> produtos;
    ContaInvestimento(Pessoa cliente, float saldo, int agencia, int numeroConta){
        this.cliente = cliente;
        this.saldo = saldo;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }
    ContaInvestimento(){

    }
    void CompraProduto(float valor){
        if(this.saldo >= valor){
            //Ainda precisa ser feita a entrada de dados e inserir ele no ArrayList
            String nome = "aA";
            float taxa = 0;
            Produto compra = new Produto();
            compra.SetTaxa(taxa);
            compra.SetNome(nome);
            compra.SetValor(valor);


        }

    }
}
