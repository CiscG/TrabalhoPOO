package com.banco.dev.app;
public class ContaPoupanca extends Conta{
  float taxaPoupanca;
}
ContaPoupanca(){
}
ContaPoupanca(Pessoa cliente, int agencia, float saldo, int numeroConta, float taxaPoupanca){
  this.cliente = cliente;
  this.saldo = saldo;
  this.agencia = agencia;
  this.numeroConta = numeroConta;
  this.taxaPoupanca = taxaPoupanca
}
