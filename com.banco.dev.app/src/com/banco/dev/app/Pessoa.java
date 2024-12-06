package com.banco.dev.app;
public class Pessoa {
  String nome;
  int idade;

  int numeroCelular;
  String tipoDePessoa;
  int id;
  float renda;
  
  Pessoa(){ }

  Pessoa(String nome, int idade, int numeroCelular, String tipoDePessoa, int id, float renda){
    this.nome = nome;
    this.idade = idade;
    this.numeroCelular = numeroCelular;
    this.id = id;
    this.renda = renda;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public void setIdade(int idade){
    this.idade = idade;
  }

  public void setNumeroCelular(int numeroCelular){
    this.numeroCelular = numeroCelular;
  }

  public void setID(int id){
    this.id = id;
  }

  public void setRenda(float renda){
    this.renda = renda;
  }

  public String getNome(){
    return this.nome;
  }

  public int getIdade() {
    return this.idade;
  }

  public int getID(){
    return this.id;
  }

  public float getRenda(){
    return this.renda;
  }
}
