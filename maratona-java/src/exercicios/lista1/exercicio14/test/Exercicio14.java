//14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
package exercicios.lista1.exercicio14.test;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor A: ");
        int a = sc.nextInt();
        System.out.println("Digite um valor B: ");
        int b = sc.nextInt();
        System.out.println("Antes da troca: A = " +a+", B = "+b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("Depois da troca: A = "+a+", B = "+b);
        sc.close();
    }

}
