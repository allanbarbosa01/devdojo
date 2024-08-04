//4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
package exercicios.lista1.exercicio4;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Atribua um valor a A: ");
        int a = sc.nextInt();
        int b = a+1;
        int c = a-1;
        System.out.println("Seu antecessor é: "+c+" e seu sucessor é: "+b);

    }


}
