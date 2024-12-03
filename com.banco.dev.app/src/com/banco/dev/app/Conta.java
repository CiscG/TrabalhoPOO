package com.banco.dev.app;
import java.text.*;
import java.util.*;
public class Conta {

    public Random gerador = new Random();
    public Pessoa cliente;
    public float saldo;
    //Analisar a necessidade dessa instancia, se irei manter ou não
    public Banco agencia;
    public int numeroConta;


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

    public void setCliente(Pessoa Cliente) {
        this.cliente = cliente;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setAgencia(Banco agencia) {
        this.agencia = agencia;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa getCliente() {
        return this.cliente;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia.agencia;
    }

    public int getNumeroConta() {
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
                ContaCorrente contaTemp = agencia.contasCorrent.get(i);
                if (contaTemp.GetNumeroConta() == verificador);
                {
                    ver = false;
                }
            }
        }
        this.numeroConta = verificador;
    }

    public void deposito(float valor){
        this.saldo += valor;
    }


    public void saque(float valor){
        if(valor <= this.saldo){
            this.saldo-= valor;
        }
        else{
            System.out.println("Valor do saque indisponivel");
        }

    }
    public void getHistoricoExtrato() {
        //printar na tela o extrato
    }
}
