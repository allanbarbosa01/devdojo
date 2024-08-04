package exercicios.lista1.exercicio7;

import java.util.Scanner;

public class Exercicio07aa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chovendo;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("Está chovendo? 1 = SIM; 2 = NÃO;");
            chovendo = sc.nextInt();

            if (chovendo == 1 || chovendo == 2) {
                entradaValida = true;
                boolean chuva = verificaChuva(chovendo);

                if (chuva) {
                    System.out.println("Leve o guarda-chuva.");
                } else {
                    System.out.println("Não precisa levar o guarda-chuva.");
                }
            } else {
                System.out.println("Entrada inválida. Digite 1 ou 2.");
            }
        }
        sc.close();
    }

    public static boolean verificaChuva(int chovendo) {
        return chovendo == 1;
    }
}