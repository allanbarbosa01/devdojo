//17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
//
//Fórmula: C = (5 * ( F-32) / 9)

package exercicios.lista1.exercicio17.test;

import exercicios.lista1.exercicio17.dominio.Temperatura;

public class Exercicio17 {
    public static void main(String[] args) {
        Temperatura temperatura = new Temperatura(72);
        System.out.println(temperatura.toString());
    }
}
