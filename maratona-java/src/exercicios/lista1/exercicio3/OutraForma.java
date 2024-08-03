package exercicios.lista1.exercicio3;

import java.util.Scanner;

public class OutraForma {
    public static void main(String[] args) {
        System.out.println("Se A=B, os valores serão somados, caso contrário, multiplicados");

        Scanner sc = new Scanner(System.in);

        int a = lerInteiro("Atribua um número para A: ", sc);
        int b = lerInteiro("Atribua um número para B: ", sc);
        int c;

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }
        System.out.println("O valor de C é: " + c);
        sc.close();
    }

    // Método para ler e validar um número inteiro
    private static int lerInteiro(String mensagem, Scanner sc) {
        System.out.print(mensagem);
        while (!sc.hasNextInt()) {
            System.out.println("Erro: Por favor, insira um número inteiro válido.");
            sc.next(); // Descarta a entrada inválida
            System.out.print(mensagem);
        }
        return sc.nextInt();
    }
}
