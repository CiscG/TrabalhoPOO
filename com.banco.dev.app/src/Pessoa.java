package com.banco.dev.app
public class Pessoa {
  String nome;
  int idade;
  String tipoDePessoa;
  int id;
  float renda;
  
  Pessoa(){
  }
  Pessoa(String nome, int idade, String tipoDePessoa, int id, float renda){
    this.nome = nome;
    this.idade = idade;
    this.tipoDePessoa = tipoDePessoa;
    this.id = id;
    this.renda = renda;
  }
  void SetNome(String nome){
    this.nome = nome;
  }
  void SetIdade(int idade){
    this.idade = idade;
  }
  void SetID(int id){
    this.id = id;
  }
  void SetRenda(float renda){
    this.renda = renda;
  }
}
