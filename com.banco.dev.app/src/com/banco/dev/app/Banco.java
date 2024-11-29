package com.banco.dev.app;
import java.util.*;
public class Banco {
  int agencia;
  ArrayList<Object> contas;
  //Variavel para execucao de testes
  public Conta conta;
  public Banco(){
  }
  public Banco(int agencia){
    this.agencia = agencia;
    this.CriaConta();
  }
  void CriaConta(){
    //colocar recebimento por input para a 
    Conta conta = new Conta(CriarCliente(), 11111f, this, 11111);
    this.conta = conta;
  }
  Pessoa CriarCliente()
  {
    // colocar recebimento de dados por input
    Pessoa cliente = new Pessoa("Rogerio", 11, "asdasdasd", 1111111, "asdasd", 111111, 12903812f);
    return cliente;
  }
  void AdicaoConta(Conta conta)
  {
    contas.add(conta);
  }

  public void PassagemDoMes(){
    // fazer passagem do mês e fazer os calculos dos produtos e das taxas da poupança
  }
}
