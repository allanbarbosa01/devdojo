//7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
package exercicios.lista1.exercicio7;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número inteiro para o programa determinar se é par: ");
        int numero = sc.nextInt();

        boolean isPar = verificaPar(numero);

        if (isPar) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");

        }
    }


    private static boolean verificaPar(int num) {
        return num % 2 == 0;
    }
}
