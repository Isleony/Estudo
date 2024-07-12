package org.example;

public class SuperClasse {
    // Superclasse
    class Animal {
        String nome;

        public Animal(String nome) {
            this.nome = nome;
        }

        public void fazerSom() {
            System.out.println("O animal faz um som");
        }
    }

    // Subclasse
    class Cachorro extends Animal {

        public Cachorro(String nome) {
            super(nome);
        }

        @Override
        public void fazerSom() {
            System.out.println("O cachorro late");
        }
    }

    // Classe principal para testar
    public class Main {
        public void main(String[] args) {
            Animal meuAnimal = new Animal("Genérico");
            Cachorro meuCachorro = new Cachorro("Rex");

            meuAnimal.fazerSom();  // Saída: O animal faz um som
            meuCachorro.fazerSom();  // Saída: O cachorro late
        }
    }

}
