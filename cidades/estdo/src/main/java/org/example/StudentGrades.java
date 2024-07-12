package org.example;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    public static void main(String[] args) {
        // Criação do Map para armazenar alunos e suas notas
        Map<String, Double> studentGrades = new HashMap<>();

        // Adicionando alunos e suas notas ao Map
        studentGrades.put("Alice", 85.0);
        studentGrades.put("Bob", 92.5);
        studentGrades.put("Charlie", 78.3);
        studentGrades.put("Diana", 88.9);

        // Atualizando a nota de um aluno
        studentGrades.put("Alice", 90.0);

        // Removendo um aluno
        studentGrades.remove("Charlie");

        // Exibindo a lista de alunos e suas notas
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            System.out.println("Aluno: " + entry.getKey() + ", Nota: " + entry.getValue());
        }

        // Verificando se um aluno específico está no Map
        String studentName = "Diana";
        if (studentGrades.containsKey(studentName)) {
            System.out.println(studentName + " está na lista com a nota: " + studentGrades.get(studentName));
        } else {
            System.out.println(studentName + " não está na lista.");
        }
    }
}
