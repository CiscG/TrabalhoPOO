package com.banco.dev.app;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random gerador = new Random();
        boolean verificador = true;
        int opcao;
        Scanner scanner = new Scanner(System.in);
        Banco agencia = new Banco(gerador.nextInt(10000, 99999));
        while(verificador){
            //verificador = true;
            System.out.println("Digite a operação desejada");
            opcao = scanner.nextInt();
            if (opcao < 1 || opcao > 4)
            {
                System.out.println("Opcao invalida, digite novamente uma opcao valida");
                verificador = false;
                System.out.println(verificador);
            }
        }
        System.out.println("Saiu");
    }
}
