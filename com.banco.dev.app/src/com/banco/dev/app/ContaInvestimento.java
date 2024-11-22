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
            ///Ainda precisa ser feita a entrada de dados e inserir ele no ArrayList
            ///Coloquei apenas um placeholder para criar o metodo, depois basta mudar para um input de taclado para receber os valores
            String nome = "aA";
            float taxa = 0;
            Produto compra = new Produto();
            compra.SetTaxa(taxa);
            compra.SetNome(nome);
            compra.SetValor(valor);
            Date data = new Date();
            TransacaoInvestimento extrato = new TransacaoInvestimento(valor, nome, data);
            extrato.VerificarCompra(true);
        }
        else{
            String nome = "aA";
            Date data = new Date();
            TransacaoInvestimento extrato = new TransacaoInvestimento(valor, nome, data);
            extrato.VerificarCompra(false);
        }
    }
}
