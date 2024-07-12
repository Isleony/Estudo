package org.example;

public class SmartTV {  // Classe renomeada para seguir convenção de Java

    private boolean ligada;
    private int canal;
    private int volume;

    // Construtor
    public SmartTV(boolean ligada, int canal, int volume) {
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }

    // Getter para verificar se a TV está ligada
    public boolean isLigada() {
        return ligada;
    }

    // Método para ligar a TV
    public void ligar() {
        this.ligada = true;
    }

    // Método para desligar a TV
    public void desligar() {
        this.ligada = false;
    }

    // Getter para o canal
    public int getCanal() {
        return canal;
    }

    // Método para aumentar o canal
    public void aumentarCanal() {
        if (ligada) {
            this.canal++;
        }
    }

    // Método para diminuir o canal
    public void diminuirCanal() {
        if (ligada && canal > 1) { // Supondo que o canal mínimo seja 1
            this.canal--;
        }
    }

    // Método para definir um canal específico
    public void definirCanal(int novoCanal) {
        if (ligada && novoCanal > 0) { // Supondo que o canal deve ser um número positivo
            this.canal = novoCanal;
        }
    }

    // Getter para o volume
    public int getVolume() {
        return volume;
    }

    // Método para aumentar o volume
    public void aumentarVolume() {
        if (ligada && volume < 100) { // Supondo que o volume máximo seja 100
            this.volume++;
        }
    }

    // Método para diminuir o volume
    public void diminuirVolume() {
        if (ligada && volume > 0) { // Supondo que o volume mínimo seja 0
            this.volume--;
        }
    }

    // Método setter para o volume (não recomendado uso direto)
    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Método setter para o canal (não recomendado uso direto)
    public void setCanal(int canal) {
        this.canal = canal;
    }

    public static void main(String[] args) {
        SmartTV minhaTV = new SmartTV(false, 1, 10);

        // Testando os métodos
        System.out.println("Estado inicial da TV:");
        System.out.println("Ligada: " + minhaTV.isLigada());
        System.out.println("Canal: " + minhaTV.getCanal());
        System.out.println("Volume: " + minhaTV.getVolume());

        // Ligando a TV
        minhaTV.ligar();
        System.out.println("\nApós ligar a TV:");
        System.out.println("Ligada: " + minhaTV.isLigada());

        // Aumentando o volume
        minhaTV.aumentarVolume();
        minhaTV.aumentarVolume();
        System.out.println("\nApós aumentar o volume:");
        System.out.println("Volume: " + minhaTV.getVolume());

        // Diminuindo o volume
        minhaTV.diminuirVolume();
        System.out.println("\nApós diminuir o volume:");
        System.out.println("Volume: " + minhaTV.getVolume());

        // Mudando o canal
        minhaTV.aumentarCanal();
        minhaTV.definirCanal(10);
        System.out.println("\nApós mudar de canal:");
        System.out.println("Canal: " + minhaTV.getCanal());

        // Desligando a TV
        minhaTV.desligar();
        System.out.println("\nApós desligar a TV:");
        System.out.println("Ligada: " + minhaTV.isLigada());
    }
}
