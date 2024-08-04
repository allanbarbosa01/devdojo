//6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
package exercicios.lista1.exercicio6;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o salário a ser reajustado: ");
        double salario = sc.nextDouble();
        double reajuste = salario + salario * 0.05;
//        Utilizar o printf para formatar, no exemplo abaixo, casas decimais utilizando %.2f
//        obs: a dupla porcentagem ao lado do 5 é para aparecer no no texto, como se fosse uma string.
        System.out.printf("Com um reajuste de 5%%, seu novo salário será de: R$ %.2f", reajuste);
        sc.close();
    }
}
