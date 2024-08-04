//5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários
// mínimos esse usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
package exercicios.lista1.exercicio5;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor do salário mínimo atual:");
        double salarioMinimo = sc.nextDouble();
        System.out.print("Insira seu salário:");
        double salarioUsuario = sc.nextDouble();
        double calculoXSm = salarioUsuario / salarioMinimo;
        System.out.printf("Você ganha aproximadamente %.2f salários mínimos", calculoXSm);
        sc.close();
    }
}
