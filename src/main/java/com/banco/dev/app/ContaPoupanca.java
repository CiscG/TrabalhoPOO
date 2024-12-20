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
//  this.numeroConta = gerador.nextInt(10000000, 99999999);
    setNumeroDaConta();
    this.extrato = new ArrayList<Transacao>();
    setTaxaConta();
  }

  @Override
  public void setNumeroDaConta() {
    this.ver = false;
        if(agencia.contasPoupa.size() == 0){
            this.verificador = gerador.nextInt(10000000,99999999);
        }else{
         while(!this.ver){
            this.verificador = gerador.nextInt(10000000,99999999);
            this.ver = true;
            agencia.contasPoupa.forEach(conta -> {
                if(conta.numeroConta == verificador){
                    ver = false;
                }
            });
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
