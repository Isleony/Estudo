package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {


    public class StreamExample {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            // Filtrar números pares e coletar em uma nova lista
            List<Integer> evenNumbers = numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .collect(Collectors.toList());

            // Imprimir a lista de números pares
            System.out.println("Números pares: " + evenNumbers);

            // Calcular a soma dos números pares
            int sumEvenNumbers = evenNumbers.stream()
                    .mapToInt(Integer::intValue)
                    .sum();

            // Imprimir a soma dos números pares
            System.out.println("Soma dos números pares: " + sumEvenNumbers);
        }
    }

}


//Criação da Stream: Usamos numbers.stream() para criar uma stream a partir da lista.
//
//Filtragem: Usamos a operação intermediária filter para filtrar apenas os números pares.
//
//Coleta: Usamos a operação terminal collect para coletar os números pares em uma nova lista evenNumbers.
//
//Impressão da Lista: Imprimimos a lista de números pares.
//
//Mapeamento e Soma: Usamos mapToInt para converter os elementos da stream em inteiros primitivos e sum para calcular a soma dos números pares.
//
//Impressão da Soma: Imprimimos a soma dos números pares.
