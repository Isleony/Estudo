package org.example;

public class BoletimEstudantil {
    public static void main(String[] args) {

        //vaiavel sempreemsingulas, menos em arrays
        //sempre a mesma convenção de linguagens

        int mediaPrimeiro = 100;
        int mediaSegundo = 2;
        int mediaFinal = (mediaPrimeiro + mediaSegundo) / 2;

        if (mediaFinal < 6) {
            System.out.println("Reprovado");
        } else if (mediaFinal == 6) {
            System.out.println("Prova Minerva");
        } else {
            System.out.println("Aprovado");
        }

    }
}
