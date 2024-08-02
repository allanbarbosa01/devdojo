package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class ALocal {
    private String endereco;

    public ALocal(String endereco) {
        this.endereco = endereco;

    }
    public void imprime(){
        System.out.println("Local: "+this.endereco);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
