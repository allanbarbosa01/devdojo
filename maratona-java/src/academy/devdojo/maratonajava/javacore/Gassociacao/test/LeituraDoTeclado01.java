package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTeclado01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu nome abaixo:");
        String nome = entrada.nextLine();
        System.out.println("Digite a sua idade:");
        int idade = entrada.nextInt();
        System.out.println("Digite o M ou F para o seu gênero:");
        char sexo = entrada.next().charAt(0);
        System.out.println("-----------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }
}
