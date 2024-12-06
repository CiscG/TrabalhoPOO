package com.banco.dev.app;
import java.util.*;
public class Banco {
  int agencia;

  ArrayList<ContaInvestimento> contasInve;
  ArrayList<ContaCorrente> contasCorrent;
  ArrayList<ContaPoupanca> contasPoupa;

  public Banco(){
  }

  public Banco(int agencia){
    this.agencia = agencia;
  }

  void CriaContaInvest(Pessoa cliente, float saldo, Banco agencia){
    ContaInvestimento contaInvestimento = new ContaInvestimento(cliente, saldo, this);
    contasInve.add(contaInvestimento);
  }

  void CriaContaCorrent(Pessoa cliente, Banco agencia, float saldo){
    ContaCorrente contaCorrente = new ContaCorrente(cliente, this, saldo);
    contasCorrent.add(contaCorrente);
  }

  void CriaContaPoupa(Pessoa cliente, Banco agencia, float saldo) {
    ContaPoupanca contaPoupanca = new ContaPoupanca(cliente, this, saldo);
    contasPoupa.add(contaPoupanca);
  }

  public void PassagemDoMes(){
    contasPoupa.forEach(contaPoupanca -> contaPoupanca.setTaxaConta());
    contasInve.forEach(contaInve -> contaInve.atualizarProdutos());
  }

  public void transacaoCorrente(int contaEnvio, int contaReceb, float valor){
    contasCorrent.forEach(contaCorrente -> {
      if(contaCorrente.numeroConta == contaEnvio){
        contaCorrente.TrasacaoCorrente(contaReceb, valor, contaEnvio);
        contaCorrente.saldo -= valor;
      }else if(contaCorrente.numeroConta == contaReceb){
        contaCorrente.TrasacaoCorrente(contaReceb, valor, contaEnvio);
        contaCorrente.saldo += valor;
      }
    });

  }
}
