package org.example;

abstract class Forma {
    abstract void desenhar();
}
class Circulo extends Forma{
    @Override
    void desenhar() {
        System.out.println("Desenhando um ciruclo");
    }
}
