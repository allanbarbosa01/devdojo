//19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.

package exercicios.lista1.exercicio19.test;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        int multiplicando;
        int multiplicador;

        for (multiplicando = 1; multiplicando <= 10; multiplicando++) {
            System.out.println("Tabuada do "+multiplicando);
            System.out.println();
            for (multiplicador = 1; multiplicador <= 10; multiplicador++) {
                System.out.println(multiplicando + "x" + multiplicador + " = " + multiplicador * multiplicando);
            }
        }

    }
}

