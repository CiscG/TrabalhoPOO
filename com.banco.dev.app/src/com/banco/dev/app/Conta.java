package com.banco.dev.app;
import java.util.*;
public class Conta {
    Pessoa cliente;
    float saldo;
    Banco agencia;
    int numeroConta;

    ArrayList<Object> historicoExtrato;
    //Banco banco;

    Conta() {
    }

    Conta(Pessoa cliente, float saldo, Banco agencia, int numeroConta) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
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

    /*public void SetBanco(Banco banco){
        this.banco = banco;
    }*/

    public void Deposito(float valor){
        saldo += valor;
    }

    public void Saque(float valor){
        saldo -= valor;
    }

    public void GetHistoricoExtrato() {
        //printar na tela o extrato
    }
}
