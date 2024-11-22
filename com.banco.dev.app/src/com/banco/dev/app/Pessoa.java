package com.banco.dev.app;
public class Pessoa {
  String nome;
  int idade;
  String email;
  int numeroCelular;
  String tipoDePessoa;
  int id;
  float renda;
  
  Pessoa(){
  }
  Pessoa(String nome, int idade, String email, int numeroCelular, String tipoDePessoa, int id, float renda){
    this.nome = nome;
    this.idade = idade;
    this.email = email;
    this.numeroCelular = numeroCelular;
    this.tipoDePessoa = tipoDePessoa;
    this.id = id;
    this.renda = renda;
  }
  ///Os metodos vão ser inseridos de acordo com a necessidade da classe
  /// Qualquer coisa só olhar a uml, mas se vc achar que poder adicionar algo
  /// Pode ficar a vontade para fazer
  void SetNome(String nome){
    this.nome = nome;
  }
  void SetIdade(int idade){
    this.idade = idade;
  }
  void SetEmail(String email){
    this.email = email;
  }
  void SetNumeroCelular(int numeroCelular){
    this.numeroCelular = numeroCelular;
  }
  void SetID(int id){
    this.id = id;
  }
  void SetRenda(float renda){
    this.renda = renda;
  }
  String GetNome(){
    return this.nome;
  }
  int GetIdade() {
    return this.idade;
  }
  int GetID(){
    return this.id;
  }
  float GetRenda(){
    return this.renda;
  }


}
