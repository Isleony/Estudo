package org.example;
//Classe é definida por atributos e métodos
//Atributo -> váriavéis
//Método -> funções -> nomeado como verbo -> padrão camelCase -> responsabilidade única
//Não existe Java global
//Sem retorno -> usar void
public class MinhaClasse {
     public static  void main (String [] args){
         String primeiroNome= "Noe";
         String segundoNome= "Natal;";

         String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
         System.out.println(nomeCompleto);
     }
     public static String nomeCompleto (String primeiroNome, String segundoNome){
         return primeiroNome.concat(" ").concat(segundoNome);
     }
}
