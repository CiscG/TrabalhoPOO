package com.banco.dev.app;
import java.util.*;

public class ContaPoupanca extends Conta {
  float taxaPoupanca;

  public ContaPoupanca() {
  }

  public ContaPoupanca(Pessoa cliente, Banco agencia, float saldo) {
    this.cliente = cliente;
    this.saldo = saldo;
    this.agencia = agencia;
    setNumeroDaConta();
    setTaxaConta();
  }

  @Override
  public void setNumeroDaConta() {
    boolean ver = false;
    int verificador = 0;
    while(!ver){
      verificador = gerador.nextInt(10000000,99999999);
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

  void setTaxaConta(){
    float taxaPoupanca = this.gerador.nextFloat(0.005f, 0.007f);
    this.taxaPoupanca = taxaPoupanca;
  }
  public void AtualizarValorConta(){
    this.saldo = saldo * (taxaPoupanca + 1);
    setTaxaConta();
  }
}