//16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
//
//equilátero(todos), isósceles(2) ou escaleno(1).

package exercicios.lista1.exercicio16.test;

import exercicios.lista1.exercicio16.dominio.Triangulo;

public class Exercicio16 {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(2,3,4);
        System.out.println(triangulo.verificaTriangulo());
    }
}
