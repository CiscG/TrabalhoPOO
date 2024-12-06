package com.banco.dev.app;
import java.util.*;
public class Conta {

    public Random gerador = new Random();
    public Pessoa cliente;
    public float saldo;
    //Analisar a necessidade dessa instancia, se irei manter ou não
    public Banco agencia;
    public int numeroConta;
    public ArrayList<Transacao> extrato;


    ArrayList<Object> historicoExtrato;
    //Banco banco;
    //Criar o random para o banco e para a conta

    Conta() {
    }

    Conta(Pessoa cliente, float saldo, Banco agencia, int numeroConta) {
        this.SetCliente(cliente);
        this.saldo = saldo;
        this.agencia = agencia;
        //SetBanco(banco);
    }

    public void SetCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public void SetSaldo(float saldo) {
        this.saldo = saldo;
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
        saldo += valor;
        Date data = new Date();
        Transacao deposito = new Transacao(valor, this.cliente.nome, data);
        extrato.add(deposito);
    }

    public void Saque(float valor){
        if (valor <= saldo)
        {
            saldo -= valor;
            Date data = new Date();
            Transacao saque = new Transacao(valor, this.cliente.nome, data);
            extrato.add(saque);
        }
        else{
            System.out.println("Valor para saque indisponivel");
        }
    }

    public void GetHistoricoExtrato() {
        extrato.forEach(transacao -> System.out.println(transacao.getData() + "  " + transacao.getValor() + " " + transacao.getDestino()));
    }
}
