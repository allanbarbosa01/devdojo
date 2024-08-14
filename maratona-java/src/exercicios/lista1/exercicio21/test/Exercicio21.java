//21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.

package exercicios.lista1.exercicio21.test;

import java.util.Random;

public class Exercicio21 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(0,100));
    }
}
