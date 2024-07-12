package org.example;

import java.util.Scanner;

public class Industria {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the client: ");
        String cliente = scanner.nextLine();
        System.out.println("Client name: " + cliente);
        System.out.println("CPF?");
        String cpf = scanner.nextLine();
        System.out.println("Cpf: "+ cpf);
    }
}
