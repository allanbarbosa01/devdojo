//20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

package exercicios.lista1.exercicio20.test;

import exercicios.lista1.exercicio19.dominio.Tabuada;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual tabuada você quer?");
        int numero = sc.nextInt();
        Tabuada tabuada = new Tabuada(numero);
        tabuada.imprimeTabuada();
    }
}
