package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime() {
        System.out.println("Nome do funcionário: " + this.nome);
        System.out.println("Idade do funcionário: " + this.idade + " Anos");
        if (salarios == null) {
            return;
        }
        System.out.print("Salários do funcionário: ");
        for (double salario : salarios) {
            System.out.print("R$ " + salario + "; ");
        }
    }

    public void imprimeMediaSalarial() {
        if (salarios == null) {
            return;
        }
        media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial do funcionário: R$ " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
