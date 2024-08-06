/*11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
 se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
*/
package exercicios.lista1.exercicio11.test;

import exercicios.lista1.exercicio11.dominio.Aluno;

public class Exercicio11Test1 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Állan Barbosa",7,7.5,4,8);
        System.out.println(aluno);
        boolean aprovado = aluno.aprovado();
        System.out.println("Situação: "+ (aprovado ? "Aprovado! :)" : "Reprovado! :("));
    }
}
