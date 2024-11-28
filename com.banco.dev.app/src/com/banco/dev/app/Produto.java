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
  public void SetNome(String nome){
    this.nome = nome;
  }
  public void SetTipo(char tipo){
    this.tipo = tipo;
  }
  public void SetTaxa(float taxa){
    this.taxa = taxa;
  }
  public void SetValor(float valor){
    this.valor = valor;
  }
}
