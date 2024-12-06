package com.banco.dev.app;
import java.util.*;
public class ContaInvestimento extends Conta{

    ArrayList<TransacaoInvestimento> listaTransacoes;
    ArrayList<Produto> produtos;
    
    public ContaInvestimento(Pessoa cliente, float saldo, Banco agencia){
        this.cliente = cliente;
        this.saldo = saldo;
        this.agencia = agencia;
        setNumeroDaConta();
    }
    
    public ContaInvestimento(){
    }

    @Override
    public void setNumeroDaConta() {
        boolean ver = false;
        int verificador = 0;
        while(!ver){
            verificador = gerador.nextInt(100000,999999);
            ver = true;
            int size = agencia.contasPoupa.size();
            for (int i = 0; i <= size; i++){
                ContaCorrente contaTemp = agencia.contasCorrent.get(i);
                if (contaTemp.getNumeroConta() == verificador);
                {
                    ver = false;
                }
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
                    nome = "CDI";
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
}
