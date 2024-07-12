package org.example;


public class ExemploArray {

    public static void main(String[] args) {
        String nome1 = "Jeanne";
        String nome2 = "Cassio";
        String nome3 = "Dani";

        String[] nomes = new String[3];
        nomes[0] = "Jeanne";
        nomes[1] = "Cassio";

        String[] nomes2 = {"Jeanne", "Cassio"};

        System.out.println(nomes[0]);
        System.out.println(nomes[2]);

        int[] numeros = {1,2,3,4};
        System.out.println("Posição 0 : " + numeros[0]);
        System.out.println("Posição 1 : " + numeros[1]);
        System.out.println("Posição 2 : " + numeros[2]);
        System.out.println("Posição 3 : " + numeros[3]);
        System.out.println(" -------------------- ");

        for(int index =0; index < numeros.length; index++ ){
            System.out.println("Posição " + index + ": " + numeros[index]);
        }

    }
}





