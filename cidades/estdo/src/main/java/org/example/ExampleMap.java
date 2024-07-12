package org.example;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.get;

public class ExampleMap {

    public static void main(String[] args) {
        // Criação de um HashMap com chaves Inteiras e valores String
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(10, "Jeanne");
        mapa.put(20, "Dani");
        mapa.put(30, "Cassio");
        mapa.put(40, "Marina40");
        mapa.put(50, "Marina");

        // Imprime o mapa completo
        System.out.println(mapa);

        // Recupera e imprime o valor associado à chave 40
        System.out.println(mapa.get(40));
    }
}
