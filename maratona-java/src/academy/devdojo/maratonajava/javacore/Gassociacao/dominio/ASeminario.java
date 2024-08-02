package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class ASeminario {
    private String titulo;
    private AAluno[] alunos;
    private ALocal local;
    private AProfessor professor;

    public ASeminario(String titulo) {
        this.titulo = titulo;
    }

    public ASeminario(String titulo, AAluno[] alunos, AProfessor professor) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.professor = professor;
    }

    public void imprime() {

        System.out.println("Título: " + this.titulo);
        if (local != null) {
            System.out.println("Local: " + local.getEndereco());
        }
        if (professor != null) {
            System.out.println("Professor: " + this.professor.getNome());
        }

        if (alunos == null || alunos.length == 0) {
            System.out.println("Nenhum aluno inscrito.");
            return;
        }
        System.out.print("Alunos Participantes: ");
        for (AAluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public AAluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(AAluno alunos) {
        this.alunos = new AAluno[]{alunos};
    }

    public ALocal getLocal() {
        return local;
    }

    public void setLocal(ALocal local) {
        this.local = local;
    }

    public AProfessor getProfessor() {
        return professor;
    }

    public void setProfessor(AProfessor professor) {
        this.professor = professor;
    }
}