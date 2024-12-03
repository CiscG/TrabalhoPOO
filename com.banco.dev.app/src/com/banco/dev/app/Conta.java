package com.banco.dev.app;
import java.util.*;
public class Conta {
    Pessoa cliente;
    float saldo;
    Banco agencia;
    int numeroConta;
    Random gerador = new Random();

    ArrayList<Object> historicoExtrato;
    //Banco banco;

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

    public void saque(float valor){
        saldo -= valor;
    }

    public void GetHistoricoExtrato() {
        //printar na tela o extrato
    }
}
