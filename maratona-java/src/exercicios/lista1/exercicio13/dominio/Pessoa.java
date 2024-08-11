package exercicios.lista1.exercicio13.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nSituação: " + verificaIdade();
    }

    private String verificaIdade() {
        if (idade < 18) {
            return "Menor de idade";
        } else {
            return "Maior de idade";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
