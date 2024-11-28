package com.banco.dev.app;
public class ContaPoupanca extends Conta {
  float taxaPoupanca;

  public ContaPoupanca() {
  }

  public ContaPoupanca(Pessoa cliente, int agencia, float saldo, int numeroConta, float taxaPoupanca) {
    this.cliente = cliente;
    this.saldo = saldo;
    this.agencia = agencia;
    this.numeroConta = numeroConta;
    this.taxaPoupanca = taxaPoupanca;
  }
  public void SetTaxaConta(float taxaPoupanca){
    this.taxaPoupanca = taxaPoupanca;
  }
  public void AtualizarValorConta(){
    ///Será o metodo para a atualização do valor da conta baseado na taxa da conta poupança
    ///Darei uma olhada nisso mais tarde
  }
}