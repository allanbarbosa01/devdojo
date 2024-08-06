/*11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
 se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
*/

package exercicios.lista1.exercicio11.test;

import java.util.Scanner;

public class Exercicio11Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota 1 de 4: ");
        double nota1 =  sc.nextDouble();
        System.out.println("Nota 2 de 4: ");
        double nota2 =  sc.nextDouble();
        System.out.println("Nota 3 de 4: ");
        double nota3 =  sc.nextDouble();
        System.out.println("Nota 4 de 4: ");
        double nota4 =  sc.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Media: " + media);
        System.out.println("Situação: ");
        if(media>=7){
            System.out.println("APROVADO.");
        }else{
            System.out.println("REPROVADO.");
        }
        sc.close();

    }
}
