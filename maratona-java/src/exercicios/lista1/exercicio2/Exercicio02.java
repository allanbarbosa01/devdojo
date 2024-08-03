//2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
package exercicios.lista1.exercicio2;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("Ímpar");
        }
        if (numero >= 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }

        sc.close();
    }
}