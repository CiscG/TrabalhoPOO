package com.banco.dev.app;
import java.util.*;
public class ContaInvestimento extends Conta{

    ArrayList<TransacaoInvestimento> listaTransacoes;
    ArrayList<Produto> produtos;
    
    public ContaInvestimento(Pessoa cliente, float saldo, Banco agencia){
        this.cliente = cliente;
        this.saldo = saldo;
        this.agencia = agencia;
//        this.numeroConta = gerador.nextInt(10000000, 99999999);
        setNumeroDaConta();
        this.extrato = new ArrayList<Transacao>();
        this.listaTransacoes = new ArrayList<TransacaoInvestimento>();
        this.produtos = new ArrayList<Produto>();
    }
    
    public ContaInvestimento(){
    }

    @Override
    public void setNumeroDaConta(){
       this.ver = false;
        if(agencia.contasInve.size() == 0){
            this.verificador = gerador.nextInt(100000,999999);
        }else{
         while(!this.ver){
            this.verificador = gerador.nextInt(100000,999999);
            this.ver = true;
            agencia.contasInve.forEach(conta -> {
                if(conta.numeroConta == verificador){
                    ver = false;
                }
            });
         }
        }
        this.numeroConta = verificador;
        System.out.println(this.getNumeroConta());
    }

    public void compraProduto(float valor, int tipoDeProduto){
        float taxa;
        String nome = "";
        
        if(this.saldo >= valor){

            Random gerador = new Random();
            taxa = gerador.nextFloat(0.1f, 0.15f);

            switch (tipoDeProduto){
                case 1:
                    nome = "LCA";
                    break;
                case 2:
                    nome = "CDB";
                    break;
                case 3:
                    nome = "LCI";
                    break;
            }

            Produto compra = new Produto();
            compra.setTaxa(taxa);
            compra.setNome(nome);
            compra.setValor(valor);
            Date data = new Date();
            TransacaoInvestimento extrato = new TransacaoInvestimento(valor, this.numeroConta, data);
            extrato.VerificarCompra(true);
            listaTransacoes.add(extrato);
            produtos.add(compra);

        }

        else{
            Date data = new Date();
            TransacaoInvestimento extrato = new TransacaoInvestimento(valor, this.numeroConta, data);
            extrato.VerificarCompra(false);
            listaTransacoes.add(extrato);
        }
    }

    public void venderProduto(String nome){
           for(Produto produto : produtos){
               if(produto.getNome().equals(nome)){
                   produtos.remove(produto);
               }
           }
    }
    public void atualizarProdutos(){
        produtos.forEach(produto -> produto.atualizarValor());
    }

    @Override
    public void GetHistoricoExtrato() {
        listaTransacoes.forEach(transacao -> System.out.println(transacao.getData() + "  " + transacao.getValor() + " " + transacao.getEmissor() + " " + transacao.getStatus()));
        extrato.forEach(transacao -> System.out.println(transacao.getData() + "  " + transacao.getValor() + " " + transacao.getEmissor()));
    }
}
