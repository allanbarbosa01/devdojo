package exercicios.lista1.exercicio12.dominio;
public class Produto {
    private String nome;
    private double valor;
    private TipoPagamento tipoPagamento;

    public Produto(String nome, double valor, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.valor = valor;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
