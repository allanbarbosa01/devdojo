//fazer seminarios vazios e com mais de 1 aluno
//fazer professor ministrar varios seminarios

package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.AAluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ALocal;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.AProfessor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ASeminario;

public class AAlunoTest01 {
    public static void main(String[] args) {
        AAluno aluno = new AAluno("Állan Barbosa", 30);
        AAluno aluno2 = new AAluno("Letícia Castejón", 29);
        AAluno[] alunos = {aluno, aluno2};

        ASeminario seminario1 = new ASeminario("Séries e Filmes");
        ASeminario seminario2 = new ASeminario("Turismo");
        ASeminario seminario3 = new ASeminario("Programação");
        ASeminario seminario4 = new ASeminario("Formando Creators");
        ASeminario seminario5 = new ASeminario("CRUD");
        ASeminario seminario6 = new ASeminario("Alemão");


        ASeminario[] seminarios = {seminario1, seminario2, seminario3, seminario4, seminario5, seminario6};

        AProfessor professor1 = new AProfessor("J.J. Abrahms", "Cinema", "Séries e Filmes");
        AProfessor professor2 = new AProfessor("Carioca No Mundo", "Influenciador de turismo", "Turismo");
        AProfessor professor3 = new AProfessor("Igor Castejón", "Cientista de Dados", "Programação");
        AProfessor professor4 = new AProfessor("Arthur Gonzaga", "Java", "CRUD");
        AProfessor professor5 = new AProfessor("Luide Matos", "Comunicação", "Formando Creators");

        AProfessor[] professores = {professor1, professor2, professor3, professor4, professor5};

        ALocal local1 = new ALocal("Hollywood");
        ALocal local2 = new ALocal("Fernando de Noronha");
        ALocal local3 = new ALocal("Sydle One");
        ALocal local4 = new ALocal("EAD - Youtube");
        ALocal local5 = new ALocal("Rua Alvarenga Peixoto, 1207 - Santo Agostinho - BH/MG");
        ALocal local6 = new ALocal("Rua Maria Macedo, 120 - Nova Suíça - BH/MG");

        aluno.setSeminario(seminario1);
        aluno2.setSeminario(seminario2);

        seminario1.setLocal(local1);
        seminario1.setProfessor(professor1);
        seminario2.setLocal(local2);
        seminario2.setProfessor(professor2);
        seminario3.setLocal(local3);
        seminario3.setProfessor(professor3);
        seminario4.setLocal(local4);
        seminario4.setProfessor(professor5);
        seminario5.setLocal(local5);
        seminario5.setProfessor(professor4);
        seminario6.setProfessor(professor3);
        seminario6.setLocal(local6);

        seminario1.setAlunos(aluno);
        seminario2.setAlunos(aluno2);


        System.out.println("--- Alunos ---");
        aluno.imprime();
        System.out.println(" ");
        aluno2.imprime();
        System.out.println(" ");

        System.out.println("--- Seminarios ---");

        for (ASeminario seminario : seminarios) {
            seminario.imprime();
            System.out.println(" ");
        }

        System.out.println("--- Professores ---");
        for (AProfessor professor : professores) {
            professor.imprime();
            System.out.println(" ");
        }
    }
}