package com.banco.dev.app;
public class ContaCorrente extends Conta {
  int limite;

  /// Para add o ArrayList tem que dar import java.util.*.
  /// Inclusive, acho que organizei o código errado, depois a gente vê

  public ContaCorrente() {
  }

  public ContaCorrente(Pessoa cliente, Banco agencia, float saldo, int numeroConta, int limite) {
    this.cliente = cliente;
    this.saldo = saldo;
    this.agencia = agencia;
    this.numeroConta = numeroConta;
    this.limite = limite;
  }
  public void SetLimite(){
    this.limite = 20000;
  }
  public void TrasacaoCorrente(int destino, float valor)
  {

    //TransacaoCorrente transacao = new TransacaoCorrente(valor, destino, this.cliente.nome, );
  }
}
