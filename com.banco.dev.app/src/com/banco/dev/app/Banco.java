package com.banco.dev.app;
import java.util.*;
public class Banco {
  int agencia;

  ArrayList<ContaInvestimento> contasInve;
  ArrayList<ContaCorrente> contasCorrent;
  ArrayList<ContaPoupanca> contasPoupa;
  //Preciso organizar esse caos desse ArrayList de contas
  ArrayList<Object> contas;
  //Variavel para execucao de testes
  public Conta conta;

  public Banco(){
  }

  public Banco(int agencia){
    this.agencia = agencia;
    //this.CriaConta();
  }

  void CriaContaInvest(){
    //Template para teste
    //Conta conta = new Conta(CriarCliente(), 11111f, this, 11111);
    this.conta = conta;
  }

  void CriaContaCorrent(){
    //Template para teste
    //Conta conta = new Conta(CriarCliente(), 11111f, this, 11111);

    this.conta = conta;
  }

  void CriaContaPoupa() {
    //Template para teste
  }
  /*Pessoa CriarCliente()
  {

    //Template para teste

    // colocar recebimento de dados por input
    // colocar os parametro que o metodo deve receber

    Pessoa cliente = new Pessoa("Rogerio", 11, "asdasdasd", 1111111, "asdasd", 111111, 12903812f);
    return cliente;
  }*/
  /*void AdicaoConta(Conta conta)
  {

    //contasPoupa.add(conta);

    //Verificar se vou manter um metodo a parte ou fazer isso diretamente na criacao de conta
    contas.add(conta);

  }*/

  public void PassagemDoMes(){
    // fazer passagem do mês e fazer os calculos dos produtos e das taxas da poupança
    // Foreach onde se existe calcula taxas/criar metodos para cada tipo de conta realizar isso
  }
  public void SaveBanco()
  {
    //Metodo para salvar banco em json
  }
  public void LoadBanco(){
    //Metodo para carregar Banco via json
  }
}
