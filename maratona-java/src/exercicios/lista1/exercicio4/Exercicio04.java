//4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
package exercicios.lista1.exercicio4;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        int sucessor = numero + 1;
        int antecessor = numero - 1;
        System.out.println("Seu antecessor é " + antecessor + " e seu sucessor é " + sucessor);
        sc.close();

    }



}
