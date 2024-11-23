package com.banco.dev.app;
public class ContaCorrente extends Conta {
  int limite;


  /// Arraylist faltando de novo :)
  /// Para add o ArrayList tem que dar import java.util.*.
  /// Inclusive, acho que organizei o código errado, depois a gente vê

  ContaCorrente() {
  }

  ContaCorrente(Pessoa cliente, int agencia, float saldo, int numeroConta, int limite) {
    this.cliente = cliente;
    this.saldo = saldo;
    this.agencia = agencia;
    this.numeroConta = numeroConta;
    this.limite = limite;
  }
  void SetLimite(){
    this.limite = 20000;
  }
  void TrasacaoCorrente(String destinatario)
  {
    TransacaoCorrente transacao = new TransacaoCorrente();

  }
}