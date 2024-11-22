package com.banco.dev.app;

public class Produto {
  String nome;
  float taxa;
  float valor;
  Produto(){
  }
  Produto(String nome, float taxa, float valor){
    this.nome = nome;
    this.taxa = taxa;
    this.valor = valor;
  }
  void SetNome(String nome){
    this.nome = nome;
  }
  void SetTaxa(float taxa){
    this.taxa = taxa;
  }
  void SetValor(float valor){
    this.valor = valor;
  }
}

///Me perdi na uml :)
