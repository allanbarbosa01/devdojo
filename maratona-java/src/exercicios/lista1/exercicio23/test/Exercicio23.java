//23 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
// As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS.
// Imprima na tela o salário líquido final.

package exercicios.lista1.exercicio23.test;

import exercicios.lista1.exercicio23.dominio.Professor;

public class Exercicio23 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Laurécio Medina","Geografia",38.25,132);
        Professor professor2 = new Professor("Eurico Donatello","História",38.25,184);
        System.out.println(professor1);
        System.out.println(professor2);
    }
}