package academy.devdojo.maratonajava.javacore.Npolimorfismo.Test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("POSITIVO",599.99);
        Tomate tomate = new Tomate("Tomate Cereja",7.99);
        Televisao tv = new Televisao("TCL 55'",3999);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("________________");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("________________");
        CalculadoraImposto.calcularImposto(tv);

    }
}
