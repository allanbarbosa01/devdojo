package exercicios.lista1.exercicio19.dominio;

public class Tabuada {
    private final int numero;

    public Tabuada(int numero) {
        this.numero = numero;
    }

    public void imprimeTabuada() {
        System.out.println("-- Tabuada do " + numero+"--");

        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            System.out.println("    "+numero + " x " + multiplicador + " = " + numero * multiplicador);
        }
    }
}
