package academy.devdojo.maratonajava.javacore.Gassociacao.test2;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio2.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio2.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio2.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio2.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua Maria Macedo, 120 - Nova Suíça, BH/MG");

        Aluno aluno = new Aluno("Állan Barbosa", 30);

        Professor professor = new Professor("Igor Castejon", "Cientista de Dados");
        Aluno[] alunosSeminario = {aluno};
        Seminario seminario = new Seminario("Alemão", alunosSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
