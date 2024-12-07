package com.banco.dev.app;

import java.util.*;

public class ContaCorrente extends Conta {
  int limite;
  ArrayList<TransacaoCorrente> listaTrasacoes;
  /// Para add o ArrayList tem que dar import java.util.*.
  /// Inclusive, acho que organizei o código errado, depois a gente vê

  public ContaCorrente() {
  }

  public ContaCorrente(Pessoa cliente, Banco agencia, double saldo) {
    this.cliente = cliente;
    this.saldo = saldo;
    this.agencia = agencia;
    this.numeroConta = gerador.nextInt(10000000, 99999999);
    this.extrato = new ArrayList<Transacao>();
    this.listaTrasacoes = new ArrayList<TransacaoCorrente>();
    setLimite();
  }
  public void setLimite(){
    this.limite = 20000;
  }
  public void TrasacaoCorrente(int destino, float valor, int destinatario)
  {
      if(valor <= saldo){
        TransacaoCorrente transacao = new TransacaoCorrente(valor, destino, destinatario);
        this.listaTrasacoes.add(transacao);
      }else{
          System.out.println("Saldo insuficiente para a transacao");
      }
  }

  @Override
  public void saque(double valor) {
    double total = this.saldo + this.limite;
    if (valor <= total)
    {
      saldo -= valor;
      Date data = new Date();
      Transacao saque = new Transacao(valor, this.numeroConta);
      extrato.add(saque);
    }
    else{
      System.out.println("Valor para saque indisponivel");
    }
  }

  @Override
  public void GetHistoricoExtrato() {
    listaTrasacoes.forEach(transacao -> System.out.println(transacao.getData() + "  " + transacao.getValor() + " " + transacao.getEmissor() + " "+ transacao.getDestinatario()));
    extrato.forEach(transacao -> System.out.println(transacao.getData() + "  " + transacao.getValor() + " " + transacao.getEmissor()));
  }
}
