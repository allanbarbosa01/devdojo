package exercicios.lista1.exercicio11.dominio;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public Aluno(String nome, double nota1, double nota2, double nota3, double nota4) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public double CalculaMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public boolean situacao(){
        return CalculaMedia() >=7;
    }

    @Override
    public String toString() {
        return nome + "\n" + "Nota 1: " + nota1 + "\n" +
                "Nota 2: " + nota2 + "\n" +
                "Nota 3: " + nota3 + "\n" +
                "Nota 4: " + nota4 + "\n" +
                "Media: " + CalculaMedia();



//        return "Aluno{" +
//                "nome='" + nome + '\'' +
//                ", nota1=" + nota1 +
//                ", nota2=" + nota2 +
//                ", nota3=" + nota3 +
//                ", nota4=" + nota4 +
//                "Média Geral: " + CalculaMedia() +
//                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }
}
