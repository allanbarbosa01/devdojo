//8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
package exercicios.lista1.exercicio8;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int numero1 = sc.nextInt();
        System.out.println("Digite o terceiro número:");
        int numero2 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int numero3 = sc.nextInt();

        int[] numeros = {numero1, numero2, numero3};
        //Arrays.sort ordena em ordem crescente!!!
        Arrays.sort(numeros);
        System.out.println("Valores em ordem decrescente: " + numeros[2] +", "+ numeros[1] +", "+ numeros[0]);
        sc.close();
    }
}
