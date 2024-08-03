//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

package exercicios.lista1.exercicio1;

public class OutraForma {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 3;

        int soma = calcularSoma(a, b);
        imprimirValores(a, b, c, soma);
    }

    public static int calcularSoma(int a, int b) {
        return a + b;
    }

    public static void imprimirValores(int a, int b, int c, int soma) {
        System.out.println("A: " + a + "\nB: " + b + "\nC: " + c + "\nSoma: " + soma);

        if (soma < c) {
            System.out.println("A soma de A+B é menor que C.");
        } else if (soma == c) {
            System.out.println("A soma de A+B = C.");
        } else System.out.println("A soma de A+B é maior que C.");
    }
}
