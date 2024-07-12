package org.example;
import java.util.HashMap;
import java.util.Map;



    public class ProductCatalog {
        public static void main(String[] args) {
            // Criação do Map para armazenar produtos e seus preços
            Map<String, Double> productPrices = new HashMap<>();

            // Adicionando produtos e seus preços ao Map
            productPrices.put("Notebook", 2500.00);
            productPrices.put("Smartphone", 1500.00);
            productPrices.put("Tablet", 800.00);
            productPrices.put("Monitor", 600.00);

            // Atualizando o preço de um produto
            productPrices.put("Smartphone", 1400.00);

            // Removendo um produto
            productPrices.remove("Tablet");

            // Exibindo a lista de produtos e seus preços
            for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
                System.out.println("Produto: " + entry.getKey() + ", Preço: " + entry.getValue());
            }

            // Buscando o preço de um produto específico
            String productName = "Monitor";
            if (productPrices.containsKey(productName)) {
                System.out.println("O preço do " + productName + " é: " + productPrices.get(productName));
            } else {
                System.out.println(productName + " não está no catálogo.");
            }
        }
    }

