//22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.

package exercicios.lista1.exercicio22.test;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor a ser dividido: ");
        int dividendo = sc.nextInt();
        System.out.println("Insira um divisor: ");
        int divisor = sc.nextInt();
        int resto = dividendo % divisor;
        int quociente = dividendo / divisor;
        System.out.println("Resto = " + resto + " e " + "Quociente = " + quociente);
    }
}
