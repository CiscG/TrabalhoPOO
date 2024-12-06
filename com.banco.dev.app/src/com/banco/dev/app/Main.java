package com.banco.dev.app;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Random gerador = new Random();
        Pessoa novoCliente;
        ContaCorrente contaCorrtemp;
        int[] numeroConta = new int[2];
        ContaInvestimento contaInvTemp;
        ContaPoupanca contaPoupaTemp;
        int contaCliente;
        float valor;
        Scanner scanner = new Scanner(System.in);
        Banco agencia = new Banco(gerador.nextInt(1000, 9999));

        System.out.println("Criação contas correntes");

        System.out.println("Conta Corrente 1");

        novoCliente = new Pessoa();

        System.out.println("Digite seu nome");
        novoCliente.setNome(scanner.nextLine());

        System.out.println("Digite sua idade");
        novoCliente.setIdade(scanner.nextInt());

        System.out.println("Digite seu Telefone");
        novoCliente.setNumeroCelular(scanner.nextInt());

        System.out.println("Digite seu Documento");
        novoCliente.setID(scanner.nextInt());

        System.out.println("Digite sua Renda");
        novoCliente.setRenda(scanner.nextFloat());

        contaCorrtemp = new ContaCorrente(novoCliente, agencia, 0f);
        contaCorrtemp.deposito(novoCliente.getRenda() * 4);
        numeroConta[0] = contaCorrtemp.getNumeroConta();
        agencia.contasCorrent.add(contaCorrtemp);

        System.out.println("Conta Corrente 2");

        novoCliente = new Pessoa();

        System.out.println("Digite seu nome");
        novoCliente.setNome(scanner.nextLine());

        System.out.println("Digite sua idade");
        novoCliente.setIdade(scanner.nextInt());

        System.out.println("Digite seu Telefone");
        novoCliente.setNumeroCelular(scanner.nextInt());

        System.out.println("Digite seu Documento");
        novoCliente.setID(scanner.nextInt());

        System.out.println("Digite sua Renda");
        novoCliente.setRenda(scanner.nextFloat());

        contaCorrtemp = new ContaCorrente(novoCliente, agencia, 0f);
        contaCorrtemp.deposito(novoCliente.getRenda() * 4);
        numeroConta[1] = contaCorrtemp.getNumeroConta();
        agencia.contasCorrent.add(contaCorrtemp);

        System.out.println("Digite o valor da transferencia para a segunda conta criada");
        valor = scanner.nextFloat();
        agencia.transacaoCorrente(numeroConta[0], numeroConta[1], valor);

        System.out.println("Digite o valor da transferencia para a primeira conta criada");
        valor = scanner.nextFloat();
        agencia.transacaoCorrente(numeroConta[1], numeroConta[0], valor);



    }
}
