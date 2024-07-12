package org.example;

import java.util.Locale;
import java.util.Scanner;

public class AoCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("DIgite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Qual sua idade? ");
        int idade = scanner.nextInt();

        System.out.println("Qual sua altura ? ");
        double altura = scanner.nextDouble();

        System.out.println("Olá, me chamo: " + nome + "" + sobrenome);
        System.out.println("Tenho " + idade + "anos");
        System.out.println("Minha altura é: " + altura);
        scanner.close();
    }

}
