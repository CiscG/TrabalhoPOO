package com.banco.dev.app;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Banco agencia = new Banco(11111);
        System.out.println(agencia.conta.GetAgencia());
    }
}
