package org.example;

public class SuperClass {
    class Car {
        String marca;

        public Car(String marca) {
            this.marca = marca;
        }

        public void turnOn() {
            System.out.println("O carro ligou");
        }
    }

    class Fusca extends Car{
        public Fusca (String marca){
            super(marca);
        }
        @Override
        public  void turnOn(){
            System.out.println("O carro acelerou");
        }
    }
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass(); // Instância da classe externa
        Car myCar = superClass.new Car("Volkswagen");
        Fusca myFusca = superClass.new Fusca("Fusca");

        myCar.turnOn(); // Saída: O carro ligou
        myFusca.turnOn(); // Saída: O carro acelerou
    }
}




