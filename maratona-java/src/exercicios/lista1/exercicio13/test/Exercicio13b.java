package exercicios.lista1.exercicio13.test;

import exercicios.lista1.exercicio13.dominio.Pessoa;

import java.util.Scanner;

public class Exercicio13b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        Pessoa p1 = new Pessoa(nome, idade);
        System.out.println(p1.toString());
        sc.close();
    }
}
