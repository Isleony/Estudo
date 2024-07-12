package org.example;

//protected -> acesso por classesnomesmo pacote ou subclasses (henrança)

public class TvEsperta {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void mudarCanal(int novoCanaL) {
        canal = novoCanaL;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }


    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public static void main(String[] args) {
        TvEsperta tvEsperta = new TvEsperta();
        Usuario usuario = new Usuario(tvEsperta);


    }

    static class Usuario {
        public Usuario(TvEsperta tvEsperta) {
            tvEsperta.diminuirVolume();
            tvEsperta.diminuirVolume();
            tvEsperta.diminuirVolume();
            tvEsperta.aumentarVolume();
            System.out.println("Qual canal: " + tvEsperta.canal);
            System.out.println("Volume atual:  " + tvEsperta.volume);

            tvEsperta.ligar();
            System.out.println("Tv ligada? " + tvEsperta.ligada);

            tvEsperta.desligar();
            System.out.println("Tv desligada? " + tvEsperta.ligada);

            tvEsperta.mudarCanal(13);
        }
    }

}
