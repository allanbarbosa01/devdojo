package exercicios.lista1.exercicio7;

import java.util.Scanner;

public class Exercicio07a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Está chovendo? 1 = SIM; 2=NÃO;");
        int chovendo = sc.nextInt();
        boolean chuva = verificaChuva(chovendo);

        if (chuva) {
            System.out.println("Leve o guarda-chuva.");
        } else {
            System.out.println("Não precisa levar o guarda-chuva.");
        }
        sc.close();
    }
    private static boolean verificaChuva(int num) {
        return num == 1;
    }
}
