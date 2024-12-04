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
  public void setNome(String nome){
    this.nome = nome;
  }
     public String getNome(){
        return this.nome;
  }
  public void setTipo(char tipo){
    this.tipo = tipo;
  }
  public void setTaxa(float taxa){
    this.taxa = taxa;
  }
  public void setValor(float valor){
    this.valor = valor;
  }
     public float getValor(){
        return this.valor;
  }
}
