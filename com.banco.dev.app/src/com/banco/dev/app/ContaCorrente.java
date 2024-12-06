package com.banco.dev.app;

import java.util.*;

public class ContaCorrente extends Conta {
  int limite;
  ArrayList<TransacaoCorrente> listaTrasacoes;
  /// Para add o ArrayList tem que dar import java.util.*.
  /// Inclusive, acho que organizei o código errado, depois a gente vê

  public ContaCorrente() {
  }

  public ContaCorrente(Pessoa cliente, Banco agencia, float saldo) {
    this.cliente = cliente;
    this.saldo = saldo;
    this.agencia = agencia;
    setNumeroDaConta();
    setLimite();
  }
  public void setLimite(){
    this.limite = 20000;
  }
  public void TrasacaoCorrente(int destino, float valor, int destinatario)
  {
    TransacaoCorrente transacao = new TransacaoCorrente(valor, destino, destinatario);
    this.listaTrasacoes.add(transacao);
  }

  @Override
  public void saque(float valor) {
    float total = this.saldo + this.limite;
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
}
