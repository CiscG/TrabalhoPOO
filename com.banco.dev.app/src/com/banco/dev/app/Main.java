package com.banco.dev.app;
import java.util.*;

public class TrabalhoPOO {
    public static void main(String[] args) {
        Random gerador = new Random();
        Pessoa novoCliente;
        ContaCorrente contaCorrtemp;
        int[] numeroContaCor = new int[2];
        int numeroContaPou;
        int numeroContaInv;
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
        novoCliente.setRenda(scanner.nextDouble());

        contaCorrtemp = new ContaCorrente(novoCliente, agencia, 0);
        contaCorrtemp.deposito(novoCliente.getRenda() * 4);
        numeroContaCor[0] = contaCorrtemp.getNumeroConta();
        agencia.contasCorrent.add(contaCorrtemp);

        System.out.println("Conta Corrente 2");

        novoCliente = new Pessoa();
        scanner = new Scanner(System.in);

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
        contaCorrtemp.deposito(novoCliente.getRenda());
        numeroContaCor[1] = contaCorrtemp.getNumeroConta();
        agencia.contasCorrent.add(contaCorrtemp);

        System.out.println("Digite o valor da transferencia para a segunda conta criada");
        valor = scanner.nextFloat();
        agencia.transacaoCorrente(numeroContaCor[0], numeroContaCor[1], valor);

        System.out.println("Digite o valor da transferencia para a primeira conta criada");
        valor = scanner.nextFloat();
        agencia.transacaoCorrente(numeroContaCor[1], numeroContaCor[0], valor);

        System.out.println("Conta Poupança");

        novoCliente = new Pessoa();
        scanner = new Scanner(System.in);

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

        contaPoupaTemp = new ContaPoupanca(novoCliente, agencia, 0f);
        contaPoupaTemp.deposito(novoCliente.getRenda() * 4);
        agencia.contasPoupa.add(contaPoupaTemp);

        System.out.println("Digite o valor do deposito");
        valor = scanner.nextFloat();
        float finalValor = valor;
        agencia.contasPoupa.forEach(contaPoupanca -> contaPoupanca.deposito(finalValor));


        System.out.println("Conta Investimento");

        novoCliente = new Pessoa();
        scanner = new Scanner(System.in);
                
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

        contaInvTemp = new ContaInvestimento(novoCliente, 0f, agencia);
        contaInvTemp.deposito(novoCliente.getRenda() * 4);
        agencia.contasPoupa.add(contaPoupaTemp);

        System.out.println("Digite o valor do compra");
        valor = scanner.nextFloat();
        float finalValor1 = valor;
        agencia.contasInve.forEach(contaInve -> {
            contaInve.compraProduto(finalValor1, 1);
            contaInve.compraProduto(finalValor1, 2);
            contaInve.compraProduto(finalValor1, 3);
        });
        agencia.contasInve.forEach(contaInvestimento -> {
            contaInvestimento.produtos.forEach(produto -> System.out.println(produto.nome + " " + produto.valor + " " + produto.taxa));
        });
        agencia.contasInve.forEach(contaInvestimento -> contaInvestimento.GetHistoricoExtrato());




    }
}
