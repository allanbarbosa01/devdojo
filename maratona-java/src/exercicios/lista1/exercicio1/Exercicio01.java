package exercicios.lista1.exercicio1;

//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
public class Exercicio01 {

    public static void main(String[] args) {

        int a =     12;
        int b = 2;
        int c = 3;
        int soma = a+b;


        System.out.println("Valores: ");
        System.out.println("A: " + a + "\nB: " + b + "\nC: " + c);
        System.out.println("Soma A+B: ");
        System.out.println(a + b);
        if (soma < c) {
            System.out.println("A soma de A + B não é maior que C");
        } else if (soma == c) {
            System.out.println("A soma de A + B é igual a C");
        } else System.out.println("A soma de A + B é Maior que C");
    }


}

