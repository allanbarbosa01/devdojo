package exercicios.lista1.exercicio23.test;

import exercicios.lista1.exercicio23.dominio.ProfessorB;
//exemplos usanto getters e setters;

public class Exercicio23b {
    public static void main(String[] args) {
        ProfessorB professor = new ProfessorB("Maria","Português",50,100);
        System.out.println(professor);
        professor.setNome("ANA");
        professor.setDisciplina("Física");
        professor.setValorHoraAula(60);
        professor.setAulasLecionadas(110);
        System.out.println(professor);
        professor.setNome("BRUNO");
        System.out.println(professor);
        // e assim por diante ..........
        String disciplinaBruno = professor.getDisciplina();
        System.out.println(disciplinaBruno);
        // e assim por diante ..........
    }
}
