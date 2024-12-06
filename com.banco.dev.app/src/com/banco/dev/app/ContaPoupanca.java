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
    this.ver = false;
    while(!this.ver){
      this.verificador = gerador.nextInt(10000000,99999999);
      this.ver = true;
      this.agencia.contasPoupa.forEach(contaPoupanca -> {
        if (contaPoupanca.getNumeroConta() == this.verificador);
        {
          this.ver = false;
        }
      });
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