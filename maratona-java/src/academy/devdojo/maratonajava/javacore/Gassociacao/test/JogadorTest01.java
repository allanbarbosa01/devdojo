package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Oliver Tsubasa");
        Jogador jogador2 = new Jogador("Taro Misaki");
        Jogador jogador3 = new Jogador("Kojiro Hyuga");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }

}

