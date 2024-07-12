package org.example;

public class MediaNumeros {

    int valor1 = 2;
    int valor2 = 4;
    int valor3 = 8;
    int valor4 = 12;

    public static void main(String[] args) {
        MediaNumeros mediaNumeros = new MediaNumeros();
        int soma = mediaNumeros.valor1 + mediaNumeros.valor2 + mediaNumeros.valor3 + mediaNumeros.valor4;
        int media = soma / 4;

        System.out.println("A média dos números é: " + media);
    }
}
