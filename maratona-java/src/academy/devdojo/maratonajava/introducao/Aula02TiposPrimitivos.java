package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean (tipos primitivos - guarda em memória um valor simples
        int idade = 10;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = -128;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Goku";

        System.out.println("A idade é "+idade+" anos");
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println("Oi, meu nome é "+nome);
    }
}
