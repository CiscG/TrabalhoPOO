package com.banco.dev.app;
import java.util.*;
public class Conta {
    Pessoa cliente;
    float saldo;
    int agencia;
    int numeroConta;
    ArrayList<Object> historicoExtrato;

    Conta() {
    }

    Conta(Pessoa cliente, float saldo, int agencia, int numeroConta) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    void SetCliente(Pessoa Cliente) {
        this.cliente = cliente;
    }

    void SetSaldo(float saldo) {
        this.saldo = saldo;
    }

    void SetAgencia(int agencia) {
        this.agencia = agencia;
    }

    void SetNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    Pessoa GetCliente() {
        return this.cliente;
    }

    float GetSaldo() {
        return this.saldo;
    }

    int GetAgencia() {
        return this.agencia;
    }

    int GetNumeroConta() {
        return this.numeroConta;
    }


    void GetHistoricoExtrato() {
        //printar na tela o extrato
    }
}
