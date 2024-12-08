package com.banco.dev.app;
import java.util.*;
public class Conta {

    public static Random gerador = new Random();
    public Pessoa cliente;
    public double saldo;
    public boolean ver;
    public int verificador;
    //Analisar a necessidade dessa instancia, se irei manter ou não
    public Banco agencia;
    public int numeroConta;
    public ArrayList<Transacao> extrato;
    //Banco banco;
    //Criar o random para o banco e para a conta

    Conta() {
    }

    Conta(Pessoa cliente, float saldo, Banco agencia, int numeroConta) {
        this.setCliente(cliente);
        this.saldo = saldo;
        this.agencia = agencia;
        this.extrato = new ArrayList<Transacao>();
      
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Pessoa getCliente() {
        return this.cliente;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia.agencia;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

//    public void setNumeroDaConta(){
//        System.out.println("Entrou");
//        this.ver = false;
//        while(!this.ver){
//            this.verificador = gerador.nextInt(10000000,99999999);
//            this.ver = true;
//            int size;
//            if(this.agencia.contasCorrent == null)
//            {
//                size = 0;
//            }else{
//                size = this.agencia.contasCorrent.size();
//            }
//            for(int i =0; i <= size; i++){
//                if (this.agencia.contasCorrent(i).getNumeroConta() == this.verificador);
//                {
//                    this.ver = false;
//                }
//            }
////            this.agencia.contasCorrent.forEach(contaPoupanca -> {
////                
////            });
//        }
//        this.numeroConta = verificador;
//        System.out.println(this.getNumeroConta());
//    }

    public void deposito(double valor){
        saldo += valor;
        Transacao recebimento = new Transacao(valor, this.numeroConta);
        extrato.add(recebimento);
    }

    public void saque(double valor){
        if (valor <= saldo)
        {
            saldo -= valor;
            Transacao saque = new Transacao(valor, this.numeroConta);
            extrato.add(saque);
        }
        else{
            System.out.println("Valor para saque indisponivel");
        }
    }
    public void receberTransacao(Transacao transacao) {
        extrato.add(transacao);
    }
    public void GetHistoricoExtrato() {
        extrato.forEach(transacao -> System.out.println(transacao.getData() + "  " + transacao.getValor() + " " + transacao.getEmissor()));
    }
}
