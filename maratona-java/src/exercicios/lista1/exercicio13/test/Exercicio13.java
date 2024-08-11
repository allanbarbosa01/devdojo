//13 - Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

package exercicios.lista1.exercicio13.test;

import exercicios.lista1.exercicio13.dominio.Pessoa;

public class Exercicio13 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Állan Barbosa", 5);
        System.out.println(pessoa1.toString());
    }

}
