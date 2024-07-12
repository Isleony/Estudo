package org.example;

public class TrueOrFalse {
    public static  void  main(String[]args){
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("Numero 1 é igual a numero 2? " + simNao);
        //Vai dar False

        simNao = numero1 != numero2;

        System.out.println("Numero 1 é diferente a numero 2? " + simNao);
        //Vai dar True

        simNao = numero1 > numero2;

        System.out.println("Numero 1 é maior a numero 2? " + simNao);
        //Vai dar False
    }
}
