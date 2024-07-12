package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Arry {
    public class ExemploList {

        public static void main(String[] args) {
            String nome1 = "Jeanne";
            String nome2 = "Cassio";
            String nome3 = "Dani";

            List<String> lista = new ArrayList<>();
            lista.add(nome1);

            System.out.println("Tamanho: " + lista.size());

            lista.add(nome2);
            System.out.println("Novo Tamanho: " + lista.size());

            lista.add("Debora");
            lista.add("Jeanne");
            System.out.println("Novo Tamanho: " + lista.size());
            System.out.println(lista);

            for(String nome: lista){
                System.out.println(nome);
            }

            System.out.println("--------------- SET ---------------- ");

            Set<String> nomesSet = new HashSet<>();
            nomesSet.add("Jeanne");
            nomesSet.add("Debora");
            nomesSet.add("Jeanne");
            System.out.println(nomesSet);



        }
    }
}
