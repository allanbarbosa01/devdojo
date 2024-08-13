package exercicios.lista1.exercicio17.test;

import exercicios.lista1.exercicio17.dominio.Temperatura;

import java.util.Scanner;

public class Exercicio17b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        int fahrenheit = sc.nextInt();
        Temperatura temperatura = new Temperatura(fahrenheit);
        System.out.println(temperatura.toString());

        sc.close();
    }
}
