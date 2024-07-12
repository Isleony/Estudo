package org.example;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String nome;
    private String autor;
    private int anoPublicacao;

    public Livro(String nome, String autor, int anoPublicacao) {
        this.nome = nome;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio ou nulo");
        }
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.isEmpty()) {
            throw new IllegalArgumentException("Autor não pode ser vazio ou nulo");
        }
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao < 0) {
            throw new IllegalArgumentException("Ano de publicação não pode ser negativo");
        }
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        livro1.exibirDetalhes();

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1);
        biblioteca.listarLivros();
    }
}

class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            livro.exibirDetalhes();
        }
    }

    static class Revista extends Livro {
        private int edicao;

        public Revista(String nome, String autor, int anoPublicacao) {
            super(nome, autor, anoPublicacao);
        }

        public int getEdicao() {
            return edicao;
        }

        @Override
        public void exibirDetalhes() {
            System.out.println("Nome: " + getNome());
            System.out.println("Autor: " + getAutor());
            System.out.println("Ano de Publicação: " + getAnoPublicacao());
        }

        public static void main(String[] args) {
            Revista revista = new Revista("Caras", "Vogue", 1957);
            revista.exibirDetalhes();
        }

        public interface  ItemBiblioteca{
           class exibirDetalhes {
               private exibirDetalhes() {
               }

               @org.jetbrains.annotations.NotNull
               @org.jetbrains.annotations.Contract( value = " -> new", pure = true )
               public static exibirDetalhes createexibirDetalhes() {
                   return new exibirDetalhes();
               }
           }
        }
    }
}

