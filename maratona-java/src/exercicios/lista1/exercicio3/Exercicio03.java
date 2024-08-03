//3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
//
//caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
//
//imprimir seu valor na tela.
package exercicios.lista1.exercicio3;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        System.out.println("Se A=B, os valores serão somados, caso contrário, multiplicados");
        Scanner sc = new Scanner(System.in);
        System.out.print("Atribua um número para A: ");
        int a = sc.nextInt();
        System.out.print("Atribua um número para B: ");
        int b = sc.nextInt();
        int c;

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }
        System.out.print("O valor de C é: "+c);
        sc.close();
    }
}
