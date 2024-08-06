/*11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
 se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
*/
package exercicios.lista1.exercicio11.test;

import exercicios.lista1.exercicio11.dominio.Aluno;

public class Exercicio11Test1 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Állan Barbosa",7,7.5,5.5,8);
        Aluno aluno2 = new Aluno("Letícia Castejón",10,10,10,10);
        System.out.println(aluno1);
        boolean situacao1 = aluno1.situacao();
        System.out.println("Situação: "+ (situacao1 ? "Aprovado! :)" : "Reprovado! :("));
        System.out.println("_____________");
        System.out.println(aluno2);
        boolean situacao2 = aluno2.situacao();
        System.out.println("Situação: "+ (situacao2 ? "Aprovado! :)" : "Reprovado! :("));
    }
}
