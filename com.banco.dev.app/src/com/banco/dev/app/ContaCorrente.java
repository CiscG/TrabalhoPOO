package com.banco.dev.app;
public class ContaCorrente extends Conta {
  int limite;


  /// Arraylist faltando de novo :)
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
}