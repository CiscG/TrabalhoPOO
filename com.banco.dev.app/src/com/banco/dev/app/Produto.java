package com.banco.dev.app;

public class Produto {
  String nome;
  char tipo;
  float taxa;
  float valor;
  Produto(){
  }
  Produto(String nome, char tipo, float taxa, float valor){
    this.nome = nome;
    this.tipo = tipo;
    this.taxa = taxa;
    this.valor = valor;
  }
  void SetNome(String nome){
    this.nome = nome;
  }
  void SetTipo(char tipo){
    this.tipo = tipo;
  }
  void SetTaxa(float taxa){
    this.taxa = taxa;
  }
  void SetValor(float valor){
    this.valor = valor;
  }
}
