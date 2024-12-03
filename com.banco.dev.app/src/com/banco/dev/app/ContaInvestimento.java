package com.banco.dev.app;
import java.util.*;
public class ContaInvestimento extends Conta {

    ArrayList<TransacaoInvestimento> listaTransacoes;
    ArrayList<Produto> produtos;
    
    public ContaInvestimento(Pessoa cliente, float saldo, Banco agencia, int numeroConta){
        this.cliente = cliente;
        this.saldo = saldo;
        this.agencia = agencia;
    }
    
    public ContaInvestimento(){
    }
    
    public void CompraProduto(float valor, String nome, float taxa){
        if(this.saldo >= valor){
            Random gerador = new Random();
            ///Ainda precisa ser feita a entrada de dados e inserir ele no ArrayList
            ///Coloquei apenas um placeholder para criar o metodo, depois basta mudar para um input de taclado para receber os valores
            //Analisar futuras mudanças
            taxa = gerador.nextFloat(0.1f, 0.15f);
            Produto compra = new Produto();
            compra.SetTaxa(taxa);
            compra.SetNome(nome);
            compra.SetValor(valor);
            Date data = new Date();
            TransacaoInvestimento extrato = new TransacaoInvestimento(valor, nome, data);
            extrato.VerificarCompra(true);
        }
        else{
            Date data = new Date();
            TransacaoInvestimento extrato = new TransacaoInvestimento(valor, nome, data);
            extrato.VerificarCompra(false);
        }
    }

    public void VenderProduto(String nome){
        //fazer foreach verificando o nome do que qr ser vendido e somar o valor do produto com o saldo da conta
    }
}
