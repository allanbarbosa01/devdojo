//15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
//
//consideração o ano com 365 dias e o mês com 30 dias.
//
//(Ex: 5 anos, 2 meses e 15 dias de vida)


package exercicios.lista1.exercicio15.test;


import exercicios.lista1.exercicio15.dominio.CalculaTempo;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ano em que você nasceu: ");
        int anoNascimento = sc.nextInt();
        System.out.println("Digite o mês em que você nasceu (1 a 12): ");
        int mesNascimento = sc.nextInt();
        System.out.println("Digite o dia em que você nasceu: ");
        int diaNascimento = sc.nextInt();

        System.out.println("Digite o ano atual: ");
        int anoAtual = sc.nextInt();
        System.out.println("Digite o mês atual (1 a 12): ");
        int mesAtual = sc.nextInt();
        System.out.println("Digite o dia atual: ");
        int diaAtual = sc.nextInt();

        CalculaTempo calculaTempo = new CalculaTempo(anoNascimento, mesNascimento, diaNascimento, anoAtual, mesAtual, diaAtual);
        String resultado = calculaTempo.calcularIdade();
        System.out.println(resultado);
        sc.close();
    }
}
