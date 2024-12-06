package com.banco.dev.app;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random gerador = new Random();
        Pessoa novoCliente;
        boolean verificador = true;
        int opcao;
        Scanner scanner = new Scanner(System.in);
        Banco agencia = new Banco(gerador.nextInt(10000, 99999));
        do{
            //verificador = true;
            System.out.println("Digite a operação desejada");
            opcao = scanner.nextInt();
            if (opcao < 1 || opcao > 4)
            {
                System.out.println("Opção inválida, digite novamente uma opção valida");
                verificador = false;
            }else{
                verificador = true;
            }
        }while(!verificador);
        switch (opcao){
            case 1:
                System.out.println("Nova Conta");
                break;
            case 2:
                System.out.println("Acessar Conta");
                break;
            case 3:
                System.out.println("Excluir conta");
                break;
            case 4:
                System.out.println("Saida");
                break;
        }
    }
}
