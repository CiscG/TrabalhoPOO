package com.banco.dev.app;
import java.util.*;
public class Conta {
<<<<<<< HEAD
    Pessoa cliente;
    float saldo;
    Banco agencia;
    int numeroConta;
    Random gerador = new Random();
=======
    public Pessoa cliente;
    public float saldo;
    //Analisar a necessidade dessa instancia, se irei manter ou não
    public Banco agencia;
    public int numeroConta;
>>>>>>> refs/remotes/origin/main

    ArrayList<Object> historicoExtrato;
    //Banco banco;
    //Criar o random para o banco e para a conta

    Conta() {
    }

    Conta(Pessoa cliente, float saldo, Banco agencia, int numeroConta) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.agencia = agencia;
        //SetBanco(banco);
    }

    public void SetCliente(Pessoa Cliente) {
        this.cliente = cliente;
    }

    public void SetSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void SetAgencia(Banco agencia) {
        this.agencia = agencia;
    }

    public void SetNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa GetCliente() {
        return this.cliente;
    }

    public float GetSaldo() {
        return this.saldo;
    }

    public int GetAgencia() {
        return this.agencia.agencia;
    }

    public int GetNumeroConta() {
        return this.numeroConta;
    }
    //Entra junto da analise da instancia do banco
    /*public void SetBanco(Banco banco){
        this.banco = banco;
    }*/
    public void setNumeroDaConta(){
        boolean ver = false;
        int verificador = 0;
        while(!ver){
            verificador = gerador.nextInt(100000000,999999999);
            ver = true;
            int size = agencia.contasPoupa.size();
            for (int i = 0; i <= size; i++){
                Object contaTemp = agencia.contasPoupa.get(i);
                if (contaTemp.getNumeroConta == ver);
            }
        }
        this.numeroConta = verificador;
    }

    public void deposito(float valor){
        saldo += valor;
    }

<<<<<<< HEAD
    public void saque(float valor){
=======
    public void Saque(float valor){
        //Fazer verificacao de possibilidade da operacao
>>>>>>> refs/remotes/origin/main
        saldo -= valor;
    }

    public void GetHistoricoExtrato() {
        //printar na tela o extrato
    }
}
