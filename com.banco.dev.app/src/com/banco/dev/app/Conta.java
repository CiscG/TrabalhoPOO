package com.banco.dev.app;
public class Conta{
  Pessoa cliente;
  float saldo;
  int agencia;
  int numeroConta;
  /// Tem que fazer o arraylist das transações
}
///Em teoria o código tá certo, só vê o fim (lá não ta)

Conta(){
}
Conta(Pessoa cliente, float saldo, int agencia, int numeroConta){
  this.cliente = cliente;
  this.saldo = saldo;
  this.agencia = agencia;
  this.numeroConta = numeroConta;
}   
 void SetCliente(Pessoa Cliente){
    this.cliente = cliente;
  }
void SetSaldo(float saldo){
    this.saldo = saldo;
  }
void SetAgencia(int agencia){
    this.agencia = agencia;
  }
void SetNumeroConta(int numeroConta){
    this.numeroConta = numeroConta;
  }

Pessoa GetCliente(){
  return this.cliente;
}
float GetSaldo(){
  return this.saldo;
}
int GetAgencia(){
  return this.agencia;
}
int GetNumeroConta(){
  return this.numeroConta;
}
///Confere aí, e o último não saquei muito bem

void GetHistoricoExtrato(){
  return thi.historicoExtrato;
}
void passagemDeMes
