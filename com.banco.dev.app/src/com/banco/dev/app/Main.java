package com.banco.dev.app;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random gerador = new Random();
        Pessoa novoCliente;
        int contaCliente;
        boolean verificador = true;
        boolean emOpera = true;
        int opcao;
        Scanner scanner = new Scanner(System.in);
        Banco agencia = new Banco(gerador.nextInt(1000, 9999));
        do {
            do {
                System.out.println("Digite a operação desejada \n1. criação de conta \n2. Acessar conta\n 3. Excluir Conta \n4. Sair");
                opcao = scanner.nextInt();
                if (opcao < 1 || opcao > 4) {
                    System.out.println("Opção inválida, digite novamente uma opção valida");
                    verificador = false;
                } else {
                    verificador = true;
                }
            } while (!verificador);
            switch (opcao) {
                case 1:
                    novoCliente = new Pessoa();
                    System.out.println("digite as seguintes informações \n Nome:");
                    novoCliente.setNome(scanner.nextLine());
                    System.out.println("Idade:");
                    novoCliente.setIdade(scanner.nextInt());
                    System.out.println("Celular: ");
                    novoCliente.setNumeroCelular(scanner.nextInt());
                    System.out.println("Documento de identificação");
                    novoCliente.setID(scanner.nextInt());
                    System.out.println("Renda");
                    novoCliente.setRenda(scanner.nextInt());

                    //sout
                    break;

                case 2:
                    System.out.println("Acessar Conta");
                    break;

                case 3:
                    System.out.println("Excluir conta");
                    break;
                case 4:
                    emOpera = false;
                    break;
            }
        }while(emOpera);
    }
}
