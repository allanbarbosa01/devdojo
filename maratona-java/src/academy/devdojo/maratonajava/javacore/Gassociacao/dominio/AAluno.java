package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class AAluno {
    private String nome;
    private int idade;
    private ASeminario seminario;

    public AAluno(String nome,int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public void imprime() {
        System.out.println("Nome: " + this.nome+"\nIdade: " + this.idade+" Anos");
        if (this.seminario != null) {
            System.out.println("Seminário: " + this.seminario.getTitulo());
        } else {
            System.out.println("Nenhum seminário associado");
        }
        }

        public String getNome () {
            return nome;
        }

        public void setNome (String nome){
            this.nome = nome;
        }

        public int getIdade () {
            return idade;
        }

        public void setIdade ( int idade){
            this.idade = idade;
        }

        public ASeminario getSeminario () {
            return seminario;
        }

        public void setSeminario (ASeminario seminario){
            this.seminario = seminario;
        }
    }
