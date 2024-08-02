package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Allan da Silva Barbosa");
        funcionario.setIdade(30);
        funcionario.setSalarios(new double[]{2000, 3000, 4000});
        funcionario.imprime();
        funcionario.imprimeMediaSalarial();
    }
}
